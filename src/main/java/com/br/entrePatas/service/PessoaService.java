package com.br.entrePatas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.br.entrePatas.model.Pessoa;
import com.br.entrePatas.repository.PessoaRepository;
import com.br.entrePatas.service.exception.ObjectnotFoundException;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	//@Autowired
	//private BCryptPasswordEncoder encoder;

	public Pessoa findById(Integer idPessoa) {
		Optional<Pessoa> obj = pessoaRepository.findById(idPessoa);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! Id: " + idPessoa));
	}

	public List<Pessoa> findAll() {
		return pessoaRepository.findAll();
	}

	public Pessoa create(Pessoa pessoa) {
		pessoa.setIdPessoa(null);
	//	pessoa.setSenha(encoder.encode(pessoa.getSenha()));
		validaPorCpfEEmail(pessoa);
		Pessoa newObj = new Pessoa();
		return pessoaRepository.save(newObj);
	}

	public Pessoa update(Integer idPessoa, Pessoa pessoa) {
		pessoa.setIdPessoa(idPessoa);
		Pessoa oldObj = findById(idPessoa);
		
		//if(!pessoa.getSenha().equals(pessoa.getSenha())) 
		//	pessoa.setSenha(encoder.encode(pessoa.getSenha()));
		
		validaPorCpfEEmail(pessoa);
		oldObj = new Pessoa();
		return pessoaRepository.save(pessoa);
	}

	public void delete(Integer idPessoa) {
		Pessoa obj = findById(idPessoa);
		pessoaRepository.deleteById(idPessoa);
	}

	private void validaPorCpfEEmail(Pessoa pessoa) {
		Optional<Pessoa> obj = pessoaRepository.findByCpf(pessoa.getCpf());
		if (obj.isPresent() && obj.get().getIdPessoa() != pessoa.getIdPessoa()) {
			throw new DataIntegrityViolationException("CPF já cadastrado no sistema!");
		}

		obj = pessoaRepository.findByEmail(pessoa.getEmail());
		if (obj.isPresent() && obj.get().getIdPessoa() != pessoa.getIdPessoa()) {
			throw new DataIntegrityViolationException("E-mail já cadastrado no sistema!");
		}
	}

}
