package com.br.entrePatas.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "RACA")
public class Raca  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_RACA")
	private Integer idRaca;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Animal> animal;
	
	@Column(nullable = false, name = "RACA")
	private String raca;
	
	@Column(name = "OBSERVACAO")
	private String observacao;
	
	@Column(nullable = false, name = "FLG_STATUS")
	private Integer flgStatus;
	
	public Integer getIdRaca() {
		return idRaca;
	}
	public void setIdRaca(Integer idRaca) {
		this.idRaca = idRaca;
	}
	public List<Animal> getAnimal() {
		return animal;
	}
	public void setAnimal(List<Animal> animal) {
		this.animal = animal;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
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
