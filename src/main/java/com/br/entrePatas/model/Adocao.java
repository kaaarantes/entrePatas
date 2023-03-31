package com.br.entrePatas.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ADOCAO")
public class Adocao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_ADOCAO")
	private Integer idAdocao;
	
	@Column(name = "APRESENTACAO")
	private String apresentacao;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PESSOA")
	private Pessoa pessoa;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ANIMAL")
	private Animal animal;
	
	@Column(name = "DATA_ADOCAO")
	private Date dataAdocao;

	public Adocao() {
		super();
	}

	public Adocao(Integer idAdocao, String apresentacao, Pessoa pessoa, Animal animal, Date dataAdocao) {
		super();
		this.idAdocao = idAdocao;
		this.apresentacao = apresentacao;
		this.pessoa = pessoa;
		this.animal = animal;
		this.dataAdocao = dataAdocao;
	}

	public Integer getIdAdocao() {
		return idAdocao;
	}

	public void setIdAdocao(Integer idAdocao) {
		this.idAdocao = idAdocao;
	}

	public String getApresentacao() {
		return apresentacao;
	}

	public void setApresentacao(String apresentacao) {
		this.apresentacao = apresentacao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Date getDataAdocao() {
		return dataAdocao;
	}

	public void setDataAdocao(Date dataAdocao) {
		this.dataAdocao = dataAdocao;
	}
}
