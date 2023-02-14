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

import com.br.entrePatas.model.Cidade;
import com.br.entrePatas.model.Pessoa;
import com.br.entrePatas.model.UF;
import com.br.entrePatas.repository.CidadeRepository;
import com.br.entrePatas.repository.PessoaRepository;
import com.br.entrePatas.repository.UFRepository;
@RestController
@RequestMapping({"/cidades"})
public class CidadeController {

	@Autowired
	private CidadeRepository repository;
	
	CidadeController(CidadeRepository cidadeRepository) {
		this.repository = cidadeRepository;
	}
	
	@GetMapping
	public List findAll(){
	   return repository.findAll();
	}
	
	@GetMapping(path = {"/{idCidade}"})
	public ResponseEntity findById(@PathVariable Integer idCidade){
	   return repository.findById(idCidade)
	           .map(record -> ResponseEntity.ok().body(record))
	           .orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public Cidade create(@RequestBody Cidade cidade){
	   return repository.save(cidade);
	}
	
	@PutMapping(value="/{idCidade}")
	public ResponseEntity update(@PathVariable("idCidade") Integer idCidade,
	                                      @RequestBody Cidade cidade) {
	   return repository.findById(idCidade)
	           .map(record -> {
	               record.setCidade(cidade.getCidade());
	               record.setIdUF(cidade.getIdUF());
	               record.setNrIBGE(cidade.getNrIBGE());
	               record.setFlgStatus(cidade.getFlgStatus());

	               Cidade updated = repository.save(record);
	               return ResponseEntity.ok().body(updated);
	           }).orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping(path ={"/{idCidade}"})
	public ResponseEntity <?> delete(@PathVariable Integer idCidade) {
	   return repository.findById(idCidade)
	           .map(record -> {
	               repository.deleteById(idCidade);
	               return ResponseEntity.ok().build();
	           }).orElse(ResponseEntity.notFound().build());
	}

}

