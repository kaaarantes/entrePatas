package com.br.entrePatas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.entrePatas.model.UF;

@Repository
public interface UFRepository extends JpaRepository<UF, Integer> {
	
} 

