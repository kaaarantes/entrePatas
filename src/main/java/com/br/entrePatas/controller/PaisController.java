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

import com.br.entrePatas.model.Pais;
import com.br.entrePatas.repository.PaisRepository;
@RestController
@RequestMapping({"/paises"})
public class PaisController {

	@Autowired
	private PaisRepository repository;
	
	PaisController(PaisRepository paisRepository) {
		this.repository = paisRepository;
	}
	
	@GetMapping
	public List findAll(){
	   return repository.findAll();
	}
	
	@GetMapping(path = {"/{idPais}"})
	public ResponseEntity findById(@PathVariable Integer idPais){
	   return repository.findById(idPais)
	           .map(record -> ResponseEntity.ok().body(record))
	           .orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public Pais create(@RequestBody Pais pais){
	   return repository.save(pais);
	}
	
	@PutMapping(value="/{idPais}")
	public ResponseEntity update(@PathVariable("idPais") Integer idPais,
	                                      @RequestBody Pais pais) {
	   return repository.findById(idPais)
	           .map(record -> {
	               record.setDescricao(pais.getDescricao());
	               record.setSigla(pais.getSigla());
	               record.setNrBACEN(pais.getNrBACEN());
	               record.setFlgStatus(pais.getFlgStatus());

	               Pais updated = repository.save(record);
	               return ResponseEntity.ok().body(updated);
	           }).orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping(path ={"/{idPais}"})
	public ResponseEntity <?> delete(@PathVariable Integer idPais) {
	   return repository.findById(idPais)
	           .map(record -> {
	               repository.deleteById(idPais);
	               return ResponseEntity.ok().build();
	           }).orElse(ResponseEntity.notFound().build());
	}

}

