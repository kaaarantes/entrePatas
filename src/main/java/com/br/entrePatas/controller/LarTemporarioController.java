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

import com.br.entrePatas.model.LarTemporario;
import com.br.entrePatas.model.dtos.LarTempDTO;
import com.br.entrePatas.service.LarTemporarioService;


@RestController
@RequestMapping({"/laresTemporario"})
public class LarTemporarioController {

	@Autowired
	private LarTemporarioService service;
	
	@GetMapping(value = "/{idLarTemporario}")
	public ResponseEntity<LarTempDTO> findById(@PathVariable Integer idLarTemporario) {
		LarTemporario obj = service.findById(idLarTemporario);
		return ResponseEntity.ok().body(new LarTempDTO (obj));
	}
	
	@GetMapping
	public ResponseEntity<List<LarTempDTO>> findAll() {
		List<LarTemporario> list = service.findAll();
		List<LarTempDTO> listDTO = list.stream().map(obj -> new LarTempDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	@PostMapping
	public ResponseEntity<LarTempDTO> create(@RequestBody LarTempDTO larTemporario) {
		LarTemporario newObj = service.create(larTemporario);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idLarTemporario}").buildAndExpand(newObj.getIdLarTemporario()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping(value = "/{idLarTemporario}")
	public ResponseEntity<LarTempDTO> update(@PathVariable Integer idLarTemporario, @RequestBody LarTempDTO larTemporario) {
		LarTemporario obj = service.update(idLarTemporario, larTemporario);
		return ResponseEntity.ok().body(new LarTempDTO(obj));
	}

	@DeleteMapping(value = "/{idLarTemporario}")
	public ResponseEntity<LarTemporario> delete(@PathVariable Integer idLarTemporario) {
		service.delete(idLarTemporario); 
		return ResponseEntity.noContent().build();
	}
}

