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

import com.br.entrePatas.model.Especie;
import com.br.entrePatas.repository.EspecieRepository;


@RestController
@RequestMapping({"/especies"})
public class EspecieController {

	@Autowired
	private EspecieRepository repository;
	
	EspecieController(EspecieRepository especieRepository) {
		this.repository = especieRepository;
	}
	
	@GetMapping
	public List findAll(){
	   return repository.findAll();
	}
	
	@GetMapping(path = {"/{idEspecie}"})
	public ResponseEntity findById(@PathVariable Integer idEspecie){
	   return repository.findById(idEspecie)
	           .map(record -> ResponseEntity.ok().body(record))
	           .orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public Especie create(@RequestBody Especie especie){
	   return repository.save(especie);
	}
	
	@PutMapping(value="/{idEspecie}")
	public ResponseEntity update(@PathVariable("idEspecie") Integer idEspecie,
	                                      @RequestBody Especie especie) {
	   return repository.findById(idEspecie)
	           .map(record -> {
	               record.setEspecie(especie.getEspecie());
	               record.setFlgStatus(especie.getFlgStatus());

	               Especie updated = repository.save(record);
	               return ResponseEntity.ok().body(updated);
	           }).orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping(path ={"/{idEspecie}"})
	public ResponseEntity <?> delete(@PathVariable Integer idEspecie) {
	   return repository.findById(idEspecie)
	           .map(record -> {
	               repository.deleteById(idEspecie);
	               return ResponseEntity.ok().build();
	           }).orElse(ResponseEntity.notFound().build());
	}

}

