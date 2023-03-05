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

import com.br.entrePatas.model.UF;
import com.br.entrePatas.model.dtos.UFDTO;
import com.br.entrePatas.service.UFService;
@RestController
@RequestMapping({"/ufs"})
public class UFController {

	@Autowired
	private UFService service;
	
	@GetMapping(value = "/{idUF}")
	public ResponseEntity<UFDTO> findById(@PathVariable Integer idUF) {
		UF obj = service.findById(idUF);
		return ResponseEntity.ok().body(new UFDTO(obj));
	}
	
	@GetMapping
	public ResponseEntity<List<UFDTO>> findAll() {
		List<UF> list = service.findAll();
		List<UFDTO> listDTO = list.stream().map(obj -> new UFDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	@PostMapping
	public ResponseEntity<UFDTO> create(@RequestBody UFDTO uf) {
		UF newObj = service.create(uf);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idUF}").buildAndExpand(newObj.getIdUF()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping(value = "/{idUF}")
	public ResponseEntity<UFDTO> update(@PathVariable Integer idUF, @RequestBody UFDTO uf) {
		UF obj = service.update(idUF, uf);
		return ResponseEntity.ok().body(new UFDTO(obj));
	}

	@DeleteMapping(value = "/{idUF}")
	public ResponseEntity<UF> delete(@PathVariable Integer idUF) {
		service.delete(idUF); 
		return ResponseEntity.noContent().build();
	}

}

