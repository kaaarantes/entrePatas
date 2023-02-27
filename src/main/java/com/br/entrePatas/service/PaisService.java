package com.br.entrePatas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.entrePatas.model.Pais;
import com.br.entrePatas.repository.PaisRepository;
import com.br.entrePatas.service.exception.ObjectnotFoundException;

@Service
public class PaisService {
	
	@Autowired
	private PaisRepository repository;
	
	public Pais findById(Integer idPais) {
		Optional<Pais> obj = repository.findById(idPais);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! Id: " + idPais));
	}
	
	public List<Pais> findAll() {
		return repository.findAll();
	}
	
	public Pais create(Pais pais) {
		return repository.save(pais);
	}
	
	public Pais update(Integer idPais, Pais pais) {
		pais.setIdPais(idPais);
		Pais oldObj = findById(idPais);
		oldObj = new Pais();
		return repository.save(oldObj);
	}
	
	public void delete(Integer idPais) {
		repository.deleteById(idPais);
	}
	
}