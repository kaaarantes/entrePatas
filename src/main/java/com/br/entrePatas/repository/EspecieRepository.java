package com.br.entrePatas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.entrePatas.model.Especie;

@Repository
public interface EspecieRepository extends JpaRepository<Especie, Integer> {
	
} 

