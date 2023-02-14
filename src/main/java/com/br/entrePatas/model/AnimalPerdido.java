package com.br.entrePatas.model;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ANIMAL_PERDIDO")
public class AnimalPerdido  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_ANIMAL_PERDIDO")
	private Integer idAnimalPerdido;
	
	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL,optional = true)
	@JoinColumn(name = "ID_PESSOA")
	private Pessoa idPessoa;
	
	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL,optional = true)
	@JoinColumn(name = "ID_ANIMAL")
	private Animal idAnimal;
	
	@Column(name = "ANEXO")
	private String anexo;
	
	@Column(nullable = false, name = "OBSERVACAO")
	private String observacao;
	
	@Column(nullable = false, name = "FLG_STATUS")
	private Integer flgStatus;
	
	public Integer getIdAnimalPerdido() {
		return idAnimalPerdido;
	}
	public void setIdAnimalPerdido(Integer idAnimalPerdido) {
		this.idAnimalPerdido = idAnimalPerdido;
	}
	public Pessoa getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Pessoa idPessoa) {
		this.idPessoa = idPessoa;
	}
	public Animal getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(Animal idAnimal) {
		this.idAnimal = idAnimal;
	}
	public String getAnexo() {
		return anexo;
	}
	public void setAnexo(String anexo) {
		this.anexo = anexo;
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
