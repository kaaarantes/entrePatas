package com.br.entrePatas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.entrePatas.model.UF;
import com.br.entrePatas.model.dtos.UFDTO;
import com.br.entrePatas.repository.UFRepository;
import com.br.entrePatas.service.exception.ObjectnotFoundException;

@Service
public class UFService {
	
	@Autowired
	private UFRepository repository;
	
	public UF findById(Integer idUF) {
		Optional<UF> obj = repository.findById(idUF);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! Id: " + idUF));
	}
	
	public List<UF> findAll() {
		return repository.findAll();
	}
	
	public UF create(UFDTO objDTO) {
		objDTO.setIdUF(null);
		UF newObj = new UF(objDTO);
		return repository.save(newObj);
	}
	
	public UF update(Integer idUF, UFDTO uf) {
		uf.setIdUF(idUF);
		UF oldObj = findById(idUF);
		oldObj = new UF(uf);
		return repository.save(oldObj);
	}
	
	public void delete(Integer idUF) {
		repository.deleteById(idUF);
	}
	
}