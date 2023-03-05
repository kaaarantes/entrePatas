package com.br.entrePatas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.entrePatas.model.Denuncia;
import com.br.entrePatas.model.dtos.DenunciaDTO;
import com.br.entrePatas.repository.DenunciaRepository;
import com.br.entrePatas.service.exception.ObjectnotFoundException;

@Service
public class DenunciaService {
	
	@Autowired
	private DenunciaRepository repository;
	
	public Denuncia findById(Integer idDenuncia) {
		Optional<Denuncia> obj = repository.findById(idDenuncia);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! Id: " + idDenuncia));
	}
	
	public List<Denuncia> findAll() {
		return repository.findAll();
	}
	
	public Denuncia create(DenunciaDTO objDTO) {
		objDTO.setIdDenuncia(null);
		Denuncia newObj = new Denuncia(objDTO);
		return repository.save(newObj);
	}
	
	public Denuncia update(Integer idDenuncia, DenunciaDTO denuncia) {
		denuncia.setIdDenuncia(idDenuncia);
		Denuncia oldObj = findById(idDenuncia);
		oldObj = new Denuncia(denuncia);
		return repository.save(oldObj);
	}
	
	public void delete(Integer idDenuncia) {
		repository.deleteById(idDenuncia);
	}
	
}