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

import com.br.entrePatas.model.Cidade;
import com.br.entrePatas.model.dtos.CidadeDTO;
import com.br.entrePatas.service.CidadeService;
@RestController
@RequestMapping({"/cidades"})
public class CidadeController {

	@Autowired
	private CidadeService service;
	
	@GetMapping(value = "/{idCidade}")
	public ResponseEntity<CidadeDTO> findById(@PathVariable Integer idCidade) {
		Cidade obj = service.findById(idCidade);
		return ResponseEntity.ok().body(new CidadeDTO (obj));
	}
	
	@GetMapping
	public ResponseEntity<List<CidadeDTO>> findAll() {
		List<Cidade> list = service.findAll();
		List<CidadeDTO> listDTO = list.stream().map(obj -> new CidadeDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	@PostMapping
	public ResponseEntity<CidadeDTO> create(@RequestBody CidadeDTO cidade) {
		Cidade newObj = service.create(cidade);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idCidade}").buildAndExpand(newObj.getIdCidade()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping(value = "/{idCidade}")
	public ResponseEntity<CidadeDTO> update(@PathVariable Integer idCidade, @RequestBody CidadeDTO cidade) {
		Cidade obj = service.update(idCidade, cidade);
		return ResponseEntity.ok().body(new CidadeDTO(obj));
	}

	@DeleteMapping(value = "/{idCidade}")
	public ResponseEntity<Cidade> delete(@PathVariable Integer idCidade) {
		service.delete(idCidade); 
		return ResponseEntity.noContent().build();
	}

}

