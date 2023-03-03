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

import com.br.entrePatas.model.Raca;
import com.br.entrePatas.model.dtos.AnimalDTO;
import com.br.entrePatas.model.dtos.RacaDTO;
import com.br.entrePatas.service.RacaService;

@RestController
@RequestMapping({"/racas"})
public class RacaController {

	@Autowired
	private RacaService service;
	
	@GetMapping(value = "/{idRaca}")
	public ResponseEntity<RacaDTO> findById(@PathVariable Integer idRaca) {
		Raca obj = service.findById(idRaca);
		return ResponseEntity.ok().body(new RacaDTO(obj));
	}
	
	@GetMapping
	public ResponseEntity<List<RacaDTO>> findAll() {
		List<Raca> list = service.findAll();
		List<RacaDTO> listDTO = list.stream().map(obj -> new RacaDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	@PostMapping
	public ResponseEntity<RacaDTO> create(@RequestBody RacaDTO raca) {
		Raca newObj = service.create(raca);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idRaca}").buildAndExpand(newObj.getIdRaca()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping(value = "/{idRaca}")
	public ResponseEntity<RacaDTO> update(@PathVariable Integer idRaca, @RequestBody RacaDTO raca) {
		Raca obj = service.update(idRaca, raca);
		return ResponseEntity.ok().body(new RacaDTO(obj));
	}

	@DeleteMapping(value = "/{idRaca}")
	public ResponseEntity<RacaDTO> delete(@PathVariable Integer idRaca) {
		service.delete(idRaca); 
		return ResponseEntity.noContent().build();
	}

}

