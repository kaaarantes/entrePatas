package com.br.entrePatas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.br.entrePatas.model.Cidade;
import com.br.entrePatas.model.Pais;
import com.br.entrePatas.model.Pessoa;
import com.br.entrePatas.model.dtos.PessoaDTO;
import com.br.entrePatas.repository.PessoaRepository;
import com.br.entrePatas.service.exception.ObjectnotFoundException;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	@Autowired
	private CidadeService cidadeService;
	@Autowired
	private PaisService paisService;
	
	//private BCryptPasswordEncoder encoder;

	public Pessoa findById(Integer idPessoa) {
		Optional<Pessoa> obj = pessoaRepository.findById(idPessoa);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! Id: " + idPessoa));
	}

	public List<Pessoa> findAll() {
		return pessoaRepository.findAll();
	}

	public Pessoa create(PessoaDTO pessoa) {
		pessoa.setIdPessoa(null);
		//pessoa.setSenha(encoder.encode(pessoa.getSenha()));
		return pessoaRepository.save(newPessoa(pessoa));
	}

	public Pessoa update(Integer idPessoa, PessoaDTO pessoa) {
		pessoa.setIdPessoa(idPessoa);
		Pessoa oldObj = findById(idPessoa);
		oldObj = newPessoa(pessoa);
		return pessoaRepository.save(oldObj);
	}

	public void delete(Integer idPessoa) {
		Pessoa obj = findById(idPessoa);
		pessoaRepository.deleteById(idPessoa);
	}
	
	private Pessoa newPessoa(PessoaDTO obj) {
		Cidade cidade = cidadeService.findById(obj.getIdCidade());
		Pais pais = paisService.findById(obj.getIdPais());
		
		Pessoa pessoa = new Pessoa();
		if(obj.getIdCidade() != null) {
			pessoa.setIdPessoa(obj.getIdPessoa());
		}
		
		pessoa.setCidade(cidade);
		pessoa.setPais(pais);
		pessoa.setNome(obj.getNome());
		pessoa.setNascimento(obj.getNascimento());
		pessoa.setCpf(obj.getCpf());
		pessoa.setRg(obj.getRg());
		pessoa.setTelefone(obj.getTelefone());
		pessoa.setEmail(obj.getEmail());
		pessoa.setSenha(obj.getSenha());
		pessoa.setLogradouro(obj.getLogradouro());
		pessoa.setBairro(obj.getBairro());
		pessoa.setNumero(obj.getNumero());
		pessoa.setComplemento(obj.getComplemento());
		pessoa.setCep(obj.getCep());
		pessoa.setFlgLarTemporario(obj.getFlgLarTemporario());
		pessoa.setFlgStatus(obj.getFlgStatus());
		return pessoa;
	}

}
