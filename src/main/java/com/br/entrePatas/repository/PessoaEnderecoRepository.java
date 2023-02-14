package com.br.entrePatas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.entrePatas.model.PessoaEndereco;

@Repository
public interface PessoaEnderecoRepository extends JpaRepository<PessoaEndereco, Integer> {
	
} 

