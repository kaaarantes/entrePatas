package com.br.entrePatas.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ACOMPANHAMENTO")
public class Acompanhamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_ACOMPANHAMENTO")
	private Integer idAcompanhamento;
	
	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL,optional = true)
	@JoinColumn(name = "ID_PESSOA")
	private Pessoa idPessoa;
	
	@OneToMany(mappedBy="acompanhamento", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private Animal idAnimal;
	
	@Column(name = "OBSERVACAO")
	private String observacao;
	
	@Column(nullable = false, name = "FLG_STATUS")
	private Integer flgStatus;
	
	public Integer getIdAcompanhamento() {
		return idAcompanhamento;
	}
	public void setIdAcompanhamento(Integer idAcompanhamento) {
		this.idAcompanhamento = idAcompanhamento;
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
