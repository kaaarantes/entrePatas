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
import com.br.entrePatas.repository.PessoaRepository;
@RestController
@RequestMapping({"/pessoas"})
public class PessoaController {

	@Autowired
	private PessoaRepository repository;
	
	PessoaController(PessoaRepository pessoaRepository) {
		this.repository = pessoaRepository;
	}
	
	@GetMapping
	public List findAll(){
	   return repository.findAll();
	}
	
	@GetMapping(path = {"/{idPessoa}"})
	public ResponseEntity findById(@PathVariable Integer idPessoa){
	   return repository.findById(idPessoa)
	           .map(record -> ResponseEntity.ok().body(record))
	           .orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public Pessoa create(@RequestBody Pessoa pessoa){
	   return repository.save(pessoa);
	}
	
	@PutMapping(value="/{idPessoa}")
	public ResponseEntity update(@PathVariable("idPessoa") Integer idPessoa,
	                                      @RequestBody Pessoa pessoa) {
	   return repository.findById(idPessoa)
	           .map(record -> {
	               record.setNome(pessoa.getNome());
	               record.setCpf(pessoa.getCpf());
	               record.setRg(pessoa.getRg());
	               record.setDt_nascimento(pessoa.getDt_nascimento());
	               record.setEmail(pessoa.getEmail());
	               record.setFlgLarTemporario(pessoa.getFlgLarTemporario());
	               record.setFlgStatus(pessoa.getFlgStatus());

	               Pessoa updated = repository.save(record);
	               return ResponseEntity.ok().body(updated);
	           }).orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping(path ={"/{idPessoa}"})
	public ResponseEntity <?> delete(@PathVariable Integer idPessoa) {
	   return repository.findById(idPessoa)
	           .map(record -> {
	               repository.deleteById(idPessoa);
	               return ResponseEntity.ok().build();
	           }).orElse(ResponseEntity.notFound().build());
	}

}

