package com.br.entrePatas.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.br.entrePatas.model.dtos.EspecieDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ESPECIE")
public class Especie  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_ESPECIE")
	private Integer idEspecie;
	
	@Column(nullable = false, name = "ESPECIE")
	private String especie;
	
	@Column(nullable = false, name = "FLG_STATUS")
	private Integer flgStatus;
	
	@JsonIgnore
	@OneToMany(mappedBy = "especie")
	private List<Animal> animais = new ArrayList<>();
	
	public Especie() {
		super();
	}

	public Especie(Integer idEspecie, String especie, Integer flgStatus, List<Animal> animais) {
		super();
		this.idEspecie = idEspecie;
		this.especie = especie;
		this.flgStatus = flgStatus;
		this.animais = animais;
	}

	public Especie(EspecieDTO obj) {
		super();
		this.idEspecie = obj.getIdEspecie();
		this.especie = obj.getEspecie();
		this.flgStatus = obj.getFlgStatus();
	}
	
	public Integer getIdEspecie() {
		return idEspecie;
	}
	public void setIdEspecie(Integer idEspecie) {
		this.idEspecie = idEspecie;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Integer getFlgStatus() {
		return flgStatus;
	}
	public void setFlgStatus(Integer flgStatus) {
		this.flgStatus = flgStatus;
	}
	public List<Animal> getAnimais() {
		return animais;
	}
	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

}
