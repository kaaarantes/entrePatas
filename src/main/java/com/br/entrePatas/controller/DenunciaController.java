package com.br.entrePatas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.entrePatas.model.Cidade;
import com.br.entrePatas.model.Denuncia;
import com.br.entrePatas.repository.DenunciaRepository;
@RestController
@RequestMapping({"/denuncias"})
public class DenunciaController {

	@Autowired
	private DenunciaRepository repository;
	
	DenunciaController(DenunciaRepository denunciaRepository) {
		this.repository = denunciaRepository;
	}
	
	@GetMapping
	public List findAll(){
	   return repository.findAll();
	}
	
	@GetMapping(path = {"/{idDenuncia}"})
	public ResponseEntity findById(@PathVariable Integer idDenuncia){
	   return repository.findById(idDenuncia)
	           .map(record -> ResponseEntity.ok().body(record))
	           .orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public Denuncia create(@RequestBody Denuncia denuncia){
	   return repository.save(denuncia);
	}
	
	@PutMapping(value="/{idDenuncia}")
	public ResponseEntity update(@PathVariable("idDenuncia") Integer idDenuncia,
	                                      @RequestBody Denuncia denuncia) {
	   return repository.findById(idDenuncia)
	           .map(record -> {
	               record.setDenuncia(denuncia.getDenuncia());
	               record.setObservacao(denuncia.getObservacao());
	               record.setFlgStatus(denuncia.getFlgStatus());

	               Denuncia updated = repository.save(record);
	               return ResponseEntity.ok().body(updated);
	           }).orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping(path ={"/{idDenuncia}"})
	public ResponseEntity <?> delete(@PathVariable Integer idDenuncia) {
	   return repository.findById(idDenuncia)
	           .map(record -> {
	               repository.deleteById(idDenuncia);
	               return ResponseEntity.ok().build();
	           }).orElse(ResponseEntity.notFound().build());
	}

}

