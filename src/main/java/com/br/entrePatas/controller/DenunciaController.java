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

import com.br.entrePatas.model.Denuncia;
import com.br.entrePatas.model.dtos.DenunciaDTO;
import com.br.entrePatas.service.DenunciaService;

@RestController
@RequestMapping({"/denuncias"})
public class DenunciaController {

	@Autowired
	private DenunciaService service;
	
	@GetMapping(value = "/{idDenuncia}")
	public ResponseEntity<DenunciaDTO> findById(@PathVariable Integer idDenuncia) {
		Denuncia obj = service.findById(idDenuncia);
		return ResponseEntity.ok().body(new DenunciaDTO(obj));
	}
	
	@GetMapping
	public ResponseEntity<List<DenunciaDTO>> findAll() {
		List<Denuncia> list = service.findAll();
		List<DenunciaDTO> listDTO = list.stream().map(obj -> new DenunciaDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	@PostMapping
	public ResponseEntity<DenunciaDTO> create(@RequestBody DenunciaDTO denuncia) {
		Denuncia newObj = service.create(denuncia);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idDenuncia}").buildAndExpand(newObj.getIdDenuncia()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping(value = "/{idDenuncia}")
	public ResponseEntity<DenunciaDTO> update(@PathVariable Integer idDenuncia, @RequestBody DenunciaDTO denuncia) {
		Denuncia obj = service.update(idDenuncia, denuncia);
		return ResponseEntity.ok().body(new DenunciaDTO(obj));
	}

	@DeleteMapping(value = "/{idDenuncia}")
	public ResponseEntity<Denuncia> delete(@PathVariable Integer idDenuncia) {
		service.delete(idDenuncia); 
		return ResponseEntity.noContent().build();
	}

}

