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

import com.br.entrePatas.model.Animal;
import com.br.entrePatas.repository.AnimalRepository;



@RestController
@RequestMapping({"/animais"})
public class AnimalController {

	@Autowired
	private AnimalRepository repository;
	
	AnimalController(AnimalRepository animalRepository) {
		this.repository = animalRepository;
	}
	
	@GetMapping
	public List findAll(){
	   return repository.findAll();
	}
	
	@GetMapping(path = {"/{idAnimal}"})
	public ResponseEntity findById(@PathVariable Integer idAnimal){
	   return repository.findById(idAnimal)
	           .map(record -> ResponseEntity.ok().body(record))
	           .orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public Animal create(@RequestBody Animal animal){
	   return repository.save(animal);
	}
	
	@PutMapping(value="/{idAnimal}")
	public ResponseEntity update(@PathVariable("idAnimal") Integer idAnimal,
	                                      @RequestBody Animal animal) {
	   return repository.findById(idAnimal)
	           .map(record -> {
	               record.setNome(animal.getNome());
	               record.setNascimento(animal.getNascimento());
	               record.setPorte(animal.getPorte());
	               record.setSexo(animal.getSexo());
	               record.setEspecie(animal.getEspecie());
	               record.setRaca(animal.getRaca());
	               record.setFlgCastrado(animal.getFlgCastrado());
	               record.setFlgVacinado(animal.getFlgVacinado());
	               record.setFlgStatus(animal.getFlgStatus());

	               Animal updated = repository.save(record);
	               return ResponseEntity.ok().body(updated);
	           }).orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping(path ={"/{idAnimal}"})
	public ResponseEntity <?> delete(@PathVariable Integer idAnimal) {
	   return repository.findById(idAnimal)
	           .map(record -> {
	               repository.deleteById(idAnimal);
	               return ResponseEntity.ok().build();
	           }).orElse(ResponseEntity.notFound().build());
	}

}

