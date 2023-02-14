package com.br.entrePatas.controller;

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

import com.br.entrePatas.model.Pessoa;
import com.br.entrePatas.model.UF;
import com.br.entrePatas.repository.PessoaRepository;
import com.br.entrePatas.repository.UFRepository;
@RestController
@RequestMapping({"/ufs"})
public class UFController {

	@Autowired
	private UFRepository repository;
	
	UFController(UFRepository ufRepository) {
		this.repository = ufRepository;
	}
	
	@GetMapping
	public List findAll(){
	   return repository.findAll();
	}
	
	@GetMapping(path = {"/{idUF}"})
	public ResponseEntity findById(@PathVariable Integer idUF){
	   return repository.findById(idUF)
	           .map(record -> ResponseEntity.ok().body(record))
	           .orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public UF create(@RequestBody UF uf){
	   return repository.save(uf);
	}
	
	@PutMapping(value="/{idUF}")
	public ResponseEntity update(@PathVariable("idUF") Integer idUF,
	                                      @RequestBody UF uf) {
	   return repository.findById(idUF)
	           .map(record -> {
	               record.setDescricao(uf.getDescricao());
	               record.setUf(uf.getUf());
	               record.setNrIBGE(uf.getNrIBGE());
	               record.setFlgStatus(uf.getFlgStatus());

	               UF updated = repository.save(record);
	               return ResponseEntity.ok().body(updated);
	           }).orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping(path ={"/{idUF}"})
	public ResponseEntity <?> delete(@PathVariable Integer idUF) {
	   return repository.findById(idUF)
	           .map(record -> {
	               repository.deleteById(idUF);
	               return ResponseEntity.ok().build();
	           }).orElse(ResponseEntity.notFound().build());
	}

}

