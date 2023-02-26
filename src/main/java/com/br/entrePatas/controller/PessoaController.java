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

import com.br.entrePatas.model.Pessoa;
import com.br.entrePatas.service.PessoaService;

@RestController
@RequestMapping({"/pessoas"})
public class PessoaController {

	@Autowired
	private PessoaService service;
	
	@GetMapping(value = "/{idPessoa}")
	public ResponseEntity<Pessoa> findById(@PathVariable Integer idPessoa) {
		Pessoa obj = service.findById(idPessoa);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping
	public ResponseEntity<List<Pessoa>> findAll() {
		List<Pessoa> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<Pessoa> create(@RequestBody Pessoa pessoa) {
		Pessoa newObj = service.create(pessoa);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idPessoa}").buildAndExpand(newObj.getIdPessoa()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping(value = "/{idPessoa}")
	public ResponseEntity<Pessoa> update(@PathVariable Integer idPessoa, @RequestBody Pessoa pessoa) {
		Pessoa obj = service.update(idPessoa, pessoa);
		return ResponseEntity.ok().body(obj);
	}

	@DeleteMapping(value = "/{idPessoa}")
	public ResponseEntity<Pessoa> delete(@PathVariable Integer idPessoa) {
		service.delete(idPessoa); 
		return ResponseEntity.noContent().build();
	}

}

