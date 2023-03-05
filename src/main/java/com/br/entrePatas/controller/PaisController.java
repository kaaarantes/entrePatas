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

import com.br.entrePatas.model.Pais;
import com.br.entrePatas.model.dtos.PaisDTO;
import com.br.entrePatas.service.PaisService;
@RestController
@RequestMapping({"/paises"})
public class PaisController {

	@Autowired
	private PaisService service;
	
	@GetMapping(value = "/{idPais}")
	public ResponseEntity<PaisDTO> findById(@PathVariable Integer idPais) {
		Pais obj = service.findById(idPais);
		return ResponseEntity.ok().body(new PaisDTO(obj));
	}
	
	@GetMapping
	public ResponseEntity<List<PaisDTO>> findAll() {
		List<Pais> list = service.findAll();
		List<PaisDTO> listDTO = list.stream().map(obj -> new PaisDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	@PostMapping
	public ResponseEntity<PaisDTO> create(@RequestBody PaisDTO pais) {
		Pais newObj = service.create(pais);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idPais}").buildAndExpand(newObj.getIdPais()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping(value = "/{idPais}")
	public ResponseEntity<PaisDTO> update(@PathVariable Integer idPais, @RequestBody PaisDTO pais) {
		Pais obj = service.update(idPais, pais);
		return ResponseEntity.ok().body(new PaisDTO(obj));
	}

	@DeleteMapping(value = "/{idPais}")
	public ResponseEntity<Pais> delete(@PathVariable Integer idPais) {
		service.delete(idPais); 
		return ResponseEntity.noContent().build();
	}

}

