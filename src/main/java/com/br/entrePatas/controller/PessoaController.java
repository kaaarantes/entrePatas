package com.br.entrePatas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}

