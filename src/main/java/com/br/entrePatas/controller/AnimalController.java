package com.br.entrePatas.controller;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.br.entrePatas.model.Animal;
import com.br.entrePatas.model.dtos.AnimalDTO;
import com.br.entrePatas.service.AnimalService;


@RestController
@RequestMapping({"/animais"})
public class AnimalController {

	@Autowired
	private AnimalService service;
	
	@GetMapping(value = "/{idAnimal}")
	public ResponseEntity<AnimalDTO> findById(@PathVariable Integer idAnimal) {
		Animal obj = service.findById(idAnimal);
		return ResponseEntity.ok().body(new AnimalDTO (obj));
	}
	
	@GetMapping
	public ResponseEntity<List<AnimalDTO>> findAll() {
		List<Animal> list = service.findAll();
		List<AnimalDTO> listDTO = list.stream().map(obj -> new AnimalDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	@PostMapping
	public ResponseEntity<AnimalDTO> create(@RequestBody AnimalDTO animal) {
		Animal newObj = service.create(animal);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idAnimal}").buildAndExpand(newObj.getIdAnimal()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping(value = "/{idAnimal}")
	public ResponseEntity<AnimalDTO> update(@PathVariable Integer idAnimal, @RequestBody AnimalDTO animal) {
		Animal obj = service.update(idAnimal, animal);
		return ResponseEntity.ok().body(new AnimalDTO(obj));
	}

	@DeleteMapping(value = "/{idAnimal}")
	public ResponseEntity<Animal> delete(@PathVariable Integer idAnimal) {
		service.delete(idAnimal); 
		return ResponseEntity.noContent().build();
	}

}

