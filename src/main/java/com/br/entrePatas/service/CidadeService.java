package com.br.entrePatas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.entrePatas.model.Cidade;
import com.br.entrePatas.repository.CidadeRepository;
import com.br.entrePatas.service.exception.ObjectnotFoundException;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository repository;
	
	public Cidade findById(Integer idCidade) {
		Optional<Cidade> obj = repository.findById(idCidade);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! Id: " + idCidade));
	}
	
	public List<Cidade> findAll() {
		return repository.findAll();
	}
	
	public Cidade create(Cidade cidade) {
		return repository.save(cidade);
	}
	
	public Cidade update(Integer idCidade, Cidade cidade) {
		cidade.setIdCidade(idCidade);
		Cidade oldObj = findById(idCidade);
		oldObj = new Cidade();
		return repository.save(oldObj);
	}
	
	public void delete(Integer idCidade) {
		repository.deleteById(idCidade);
	}
	
}