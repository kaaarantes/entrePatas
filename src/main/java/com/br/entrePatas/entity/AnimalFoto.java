package com.br.entrePatas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ANIMAL_FOTO")
public class AnimalFoto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_ANIMAL_FOTO")
	private Integer idAnimalFoto;
	
	@Column(name = "OBSERVACAO")
    private String observacao;
    
	@Column(nullable = false, name = "FLG_STATUS")
    private Integer flgStatus;
    
	public Integer getIdAnimalFoto() {
		return idAnimalFoto;
	}
	public void setIdAnimalFoto(Integer idAnimalFoto) {
		this.idAnimalFoto = idAnimalFoto;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Integer getFlgStatus() {
		return flgStatus;
	}
	public void setFlgStatus(Integer flgStatus) {
		this.flgStatus = flgStatus;
	}
    
}
