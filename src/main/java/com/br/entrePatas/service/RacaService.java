package com.br.entrePatas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.entrePatas.model.Raca;
import com.br.entrePatas.model.dtos.RacaDTO;
import com.br.entrePatas.repository.RacaRepository;
import com.br.entrePatas.service.exception.ObjectnotFoundException;

@Service
public class RacaService {
	
	@Autowired
	private RacaRepository repository;
	
	public Raca findById(Integer idRaca) {
		Optional<Raca> obj = repository.findById(idRaca);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! Id: " + idRaca));
	}
	
	public List<Raca> findAll() {
		return repository.findAll();
	}
	
	public Raca create(RacaDTO objDTO) {
		objDTO.setIdRaca(null);
		Raca newObj = new Raca(objDTO);
		return repository.save(newObj);
	}
	
	public Raca update(Integer idRaca, RacaDTO raca) {
		raca.setIdRaca(idRaca);
		Raca oldObj = findById(idRaca);
		oldObj = new Raca(raca);
		return repository.save(oldObj);
	}
	
	public void delete(Integer idRaca) {
		repository.deleteById(idRaca);
	}
	
}