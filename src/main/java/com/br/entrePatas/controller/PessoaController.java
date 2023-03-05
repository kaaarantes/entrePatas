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

import com.br.entrePatas.model.Pessoa;
import com.br.entrePatas.model.dtos.PessoaDTO;
import com.br.entrePatas.service.PessoaService;

@RestController
@RequestMapping({"/pessoas"})
public class PessoaController {

	@Autowired
	private PessoaService service;
	
	@GetMapping(value = "/{idPessoa}")
	public ResponseEntity<PessoaDTO> findById(@PathVariable Integer idPessoa) {
		Pessoa obj = service.findById(idPessoa);
		return ResponseEntity.ok().body(new PessoaDTO (obj));
	}
	
	@GetMapping
	public ResponseEntity<List<PessoaDTO>> findAll() {
		List<Pessoa> list = service.findAll();
		List<PessoaDTO> listDTO = list.stream().map(obj -> new PessoaDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	@PostMapping
	public ResponseEntity<PessoaDTO> create(@RequestBody PessoaDTO pessoa) {
		Pessoa newObj = service.create(pessoa);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idPessoa}").buildAndExpand(newObj.getIdPessoa()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping(value = "/{idPessoa}")
	public ResponseEntity<PessoaDTO> update(@PathVariable Integer idPessoa, @RequestBody PessoaDTO pessoa) {
		Pessoa obj = service.update(idPessoa, pessoa);
		return ResponseEntity.ok().body(new PessoaDTO(obj));
	}

	@DeleteMapping(value = "/{idPessoa}")
	public ResponseEntity<Pessoa> delete(@PathVariable Integer idPessoa) {
		service.delete(idPessoa); 
		return ResponseEntity.noContent().build();
	}

}

