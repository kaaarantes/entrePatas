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

import com.br.entrePatas.model.Adocao;
import com.br.entrePatas.model.dtos.AdocaoDTO;
import com.br.entrePatas.service.AdocaoService;


@RestController
@RequestMapping({"/adocoes"})
public class AdocaoController {

	@Autowired
	private AdocaoService service;
	
	@GetMapping(value = "/{idAdocao}")
	public ResponseEntity<AdocaoDTO> findById(@PathVariable Integer idAdocao) {
		Adocao obj = service.findById(idAdocao);
		return ResponseEntity.ok().body(new AdocaoDTO (obj));
	}
	
	@GetMapping
	public ResponseEntity<List<AdocaoDTO>> findAll() {
		List<Adocao> list = service.findAll();
		List<AdocaoDTO> listDTO = list.stream().map(obj -> new AdocaoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	@PostMapping
	public ResponseEntity<AdocaoDTO> create(@RequestBody AdocaoDTO adocao) {
		Adocao newObj = service.create(adocao);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idAdocao}").buildAndExpand(newObj.getIdAdocao()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping(value = "/{idAdocao}")
	public ResponseEntity<AdocaoDTO> update(@PathVariable Integer idAdocao, @RequestBody AdocaoDTO adocao) {
		Adocao obj = service.update(idAdocao, adocao);
		return ResponseEntity.ok().body(new AdocaoDTO(obj));
	}
	
	@PostMapping(value = "/{idAdocao}")
	public ResponseEntity<AdocaoDTO> adotar(@PathVariable Integer idAdocao, @RequestBody AdocaoDTO adocao) {
		Adocao obj = service.adotar(idAdocao, adocao);
		return ResponseEntity.ok().body(new AdocaoDTO(obj));
	}

	@DeleteMapping(value = "/{idAdocao}")
	public ResponseEntity<Adocao> delete(@PathVariable Integer idAdocao) {
		service.delete(idAdocao); 
		return ResponseEntity.noContent().build();
	}

}

