package com.br.entrePatas.controller;

import java.net.URI;
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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.br.entrePatas.model.Especie;
import com.br.entrePatas.service.EspecieService;

@RestController
@RequestMapping({"/especies"})
public class EspecieController {

	@Autowired
	private EspecieService service;
	
	@GetMapping(value = "/{idEspecie}")
	public ResponseEntity<Especie> findById(@PathVariable Integer idEspecie) {
		Especie obj = service.findById(idEspecie);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping
	public ResponseEntity<List<Especie>> findAll() {
		List<Especie> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<Especie> create(@RequestBody Especie especie) {
		Especie newObj = service.create(especie);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idEspecie}").buildAndExpand(newObj.getIdEspecie()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping(value = "/{idEspecie}")
	public ResponseEntity<Especie> update(@PathVariable Integer idEspecie, @RequestBody Especie especie) {
		Especie obj = service.update(idEspecie, especie);
		return ResponseEntity.ok().body(obj);
	}

	@DeleteMapping(value = "/{idEspecie}")
	public ResponseEntity<Especie> delete(@PathVariable Integer idEspecie) {
		service.delete(idEspecie); 
		return ResponseEntity.noContent().build();
	}

}

