package com.br.entrePatas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.entrePatas.model.Animal;


@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
	
} 

