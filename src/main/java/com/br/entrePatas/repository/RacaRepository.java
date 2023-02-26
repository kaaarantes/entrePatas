package com.br.entrePatas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.entrePatas.model.Raca;

@Repository
public interface RacaRepository extends JpaRepository<Raca, Integer> {
	
} 

