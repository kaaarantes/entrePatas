package com.br.entrePatas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.br.entrePatas.model.Pessoa;
import com.br.entrePatas.repository.PessoaRepository;
import com.br.entrePatas.service.exception.ObjectnotFoundException;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository;
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public Pessoa findById(Integer idPessoa) {
		Optional<Pessoa> obj = repository.findById(idPessoa);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! Id: " + idPessoa));
	}
	
	public List<Pessoa> findAll() {
		return repository.findAll();
	}
	
	public Pessoa create(Pessoa pessoa) {
		pessoa.setIdPessoa(null);
		pessoa.setSenha(encoder.encode(pessoa.getSenha()));
		return repository.save(pessoa);
	}
	
	public Pessoa update(Integer idPessoa, Pessoa pessoa) {
		pessoa.setIdPessoa(idPessoa);
		Pessoa oldObj = findById(idPessoa);
		oldObj = new Pessoa();
		return repository.save(oldObj);
	}
	
	public void delete(Integer idPessoa) {
		repository.deleteById(idPessoa);
	}
	
}