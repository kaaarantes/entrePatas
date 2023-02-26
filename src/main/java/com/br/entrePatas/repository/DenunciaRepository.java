package com.br.entrePatas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.entrePatas.model.Denuncia;


@Repository
public interface DenunciaRepository extends JpaRepository<Denuncia, Integer> {
	
} 

