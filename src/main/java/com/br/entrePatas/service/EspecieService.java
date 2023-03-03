package com.br.entrePatas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.entrePatas.model.Especie;
import com.br.entrePatas.model.dtos.EspecieDTO;
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
	
	public Especie create(EspecieDTO objDTO) {
		objDTO.setIdEspecie(null);
		Especie newObj = new Especie(objDTO);
		return repository.save(newObj);
	}
	
	public Especie update(Integer idEspecie, EspecieDTO especie) {
		especie.setIdEspecie(idEspecie);
		Especie oldObj = findById(idEspecie);
		oldObj = new Especie(especie);
		return repository.save(oldObj);
	}
	
	public void delete(Integer idEspecie) {
		repository.deleteById(idEspecie);
	}
	
}