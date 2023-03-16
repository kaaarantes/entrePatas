package com.br.entrePatas.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "ADOCAO")
public class Adocao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_ADOCAO")
	private Integer idAdocao;
	
	@Column(name = "APRESENTACAO")
	private String apresentacao;
	
	@Column(name = "ID_PESSOA")
	private Pessoa adotante;
	
	@Column(name = "ID_ANIMAL")
	private Animal animal;
	
	@Column(name = "DATA_ADOCAO")
	private Date dataAdocao;

	public Adocao() {
		super();
	}

	public Adocao(Integer idAdocao, String apresentacao, Pessoa adotante, Animal animal, Date dataAdocao) {
		super();
		this.idAdocao = idAdocao;
		this.apresentacao = apresentacao;
		this.adotante = adotante;
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

	public Pessoa getAdotante() {
		return adotante;
	}

	public void setAdotante(Pessoa adotante) {
		this.adotante = adotante;
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
