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

import com.br.entrePatas.model.PessoaEndereco;
import com.br.entrePatas.repository.PessoaEnderecoRepository;

@RestController
@RequestMapping({"/enderecos"})
public class PessoaEnderecoController {

	@Autowired
	private PessoaEnderecoRepository repository;
	
	PessoaEnderecoController(PessoaEnderecoRepository pessoaEnderecoRepository) {
		this.repository = pessoaEnderecoRepository;
	}
	
	@GetMapping
	public List findAll(){
	   return repository.findAll();
	}
	
	@GetMapping(path = {"/{idPessoaEndereco}"})
	public ResponseEntity findById(@PathVariable Integer idPessoaEndereco){
	   return repository.findById(idPessoaEndereco)
	           .map(record -> ResponseEntity.ok().body(record))
	           .orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public PessoaEndereco create(@RequestBody PessoaEndereco pessoaEndereco){
	   return repository.save(pessoaEndereco);
	}
	
	@PutMapping(value="/{idPessoaEndereco}")
	public ResponseEntity update(@PathVariable("idPessoaEndereco") Integer idPessoaEndereco,
	                                      @RequestBody PessoaEndereco pessoaEndereco) {
	   return repository.findById(idPessoaEndereco)
	           .map(record -> {
	        	   record.setLogradouro(pessoaEndereco.getLogradouro());
	        	   record.setNumero(pessoaEndereco.getNumero());
	               record.setBairro(pessoaEndereco.getBairro());
	               record.setCep(pessoaEndereco.getCep());
	               record.setComplemento(pessoaEndereco.getComplemento());
	               record.setIdCidade(pessoaEndereco.getCidade());
	               record.setIdPais(pessoaEndereco.getIdPais());
	               record.setIdPessoa(pessoaEndereco.getIdPessoa());
	               record.setObservacao(pessoaEndereco.getObservacao());
	               record.setFlgStatus(pessoaEndereco.getFlgStatus());
	               
	               PessoaEndereco updated = repository.save(record);
	               return ResponseEntity.ok().body(updated);
	           }).orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping(path ={"/{idPessoaEndereco}"})
	public ResponseEntity <?> delete(@PathVariable Integer idPessoaEndereco) {
	   return repository.findById(idPessoaEndereco)
	           .map(record -> {
	               repository.deleteById(idPessoaEndereco);
	               return ResponseEntity.ok().build();
	           }).orElse(ResponseEntity.notFound().build());
	}

}

