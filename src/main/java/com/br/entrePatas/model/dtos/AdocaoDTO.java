package com.br.entrePatas.model.dtos;

import java.io.Serializable;
import java.util.Date;

import com.br.entrePatas.model.Adocao;

public class AdocaoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer idAdocao;
	private String apresentacao;
	private Integer pessoa;
	private String nomePessoa;
	private Integer animal;
	private String nomeAnimal;
	private Date dataAdocao;
	private byte[] animalFoto;
	
	public AdocaoDTO() {
		super();
	}
	
	public AdocaoDTO(Adocao obj) {
		super();
		this.idAdocao = obj.getIdAdocao();
		this.apresentacao = obj.getApresentacao();
		this.animal = obj.getAnimal().getIdAnimal();
		this.nomeAnimal = obj.getAnimal().getNome();
		this.dataAdocao = obj.getDataAdocao();
		this.animalFoto = obj.getAnimal().getAnimalFoto();
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

	public Integer getPessoa() {
		return pessoa;
	}

	public void setPessoa(Integer pessoa) {
		this.pessoa = pessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public Integer getAnimal() {
		return animal;
	}

	public void setAnimal(Integer animal) {
		this.animal = animal;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public Date getDataAdocao() {
		return dataAdocao;
	}

	public void setDataAdocao(Date dataAdocao) {
		this.dataAdocao = dataAdocao;
	}

	public byte[] getAnimalFoto() {
		return animalFoto;
	}

	public void setAnimalFoto(byte[] animalFoto) {
		this.animalFoto = animalFoto;
	}


}
