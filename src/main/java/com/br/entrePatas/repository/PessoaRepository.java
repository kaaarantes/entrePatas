package com.br.entrePatas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.br.entrePatas.model.Pessoa;

@Transactional(readOnly = true)
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
	
} 

