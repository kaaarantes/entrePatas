package com.br.entrePatas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.entrePatas.model.Especie;
import com.br.entrePatas.repository.EspecieRepository;
import com.br.entrePatas.service.exception.ObjectnotFoundException;

@Service
public class EspecieService {
	
	@Autowired
	private EspecieRepository repository;
	
	public Especie findById(Integer idEspecie) {
		Optional<Especie> obj = repository.findById(idEspecie);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! Id: " + idEspecie));
	}
	
	public List<Especie> findAll() {
		return repository.findAll();
	}
	
	public Especie create(Especie especie) {
		return repository.save(especie);
	}
	
	public Especie update(Integer idEspecie, Especie especie) {
		especie.setIdEspecie(idEspecie);
		Especie oldObj = findById(idEspecie);
		oldObj = new Especie();
		return repository.save(oldObj);
	}
	
	public void delete(Integer idEspecie) {

		repository.deleteById(idEspecie);
	}
	
}