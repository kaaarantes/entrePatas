package com.br.entrePatas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.entrePatas.model.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer> {
	
} 

