package com.br.entrePatas.model.dtos;

import java.io.Serializable;
import java.util.Date;

import com.br.entrePatas.model.Animal;

public class AnimalDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer idAnimal;
	private String nome;
	private Date nascimento;
	private String porte;
	private String sexo;
	private Integer flgVacinado;
	private Integer flgCastrado;
	private Integer flgStatus;
	private Integer raca;
	private Integer especie;
	private String nomeRaca;
	private String nomeEspecie;
	private byte[] animalFoto;	
	
	public AnimalDTO() {
		super();
	}
	
	public AnimalDTO(Animal obj) {
		super();
		this.idAnimal = obj.getIdAnimal();
		this.nome = obj.getNome();
		this.nascimento = obj.getNascimento();
		this.porte = obj.getPorte();
		this.sexo = obj.getSexo();
		this.flgVacinado = obj.getFlgVacinado();
		this.flgCastrado = obj.getFlgCastrado();
		this.flgStatus = obj.getFlgStatus();
		this.raca = obj.getRaca().getIdRaca();
		this.especie = obj.getEspecie().getIdEspecie();
		this.nomeRaca = obj.getRaca().getRaca();
		this.nomeEspecie = obj.getEspecie().getEspecie();
		this.animalFoto = obj.getAnimalFoto();
	}


	public Integer getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(Integer idAnimal) {
		this.idAnimal = idAnimal;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Integer getFlgVacinado() {
		return flgVacinado;
	}
	public void setFlgVacinado(Integer flgVacinado) {
		this.flgVacinado = flgVacinado;
	}
	public Integer getFlgCastrado() {
		return flgCastrado;
	}
	public void setFlgCastrado(Integer flgCastrado) {
		this.flgCastrado = flgCastrado;
	}
	public Integer getFlgStatus() {
		return flgStatus;
	}
	public void setFlgStatus(Integer flgStatus) {
		this.flgStatus = flgStatus;
	}
	public Integer getRaca() {
		return raca;
	}
	public void setRaca(Integer raca) {
		this.raca = raca;
	}
	public Integer getEspecie() {
		return especie;
	}
	public void setEspecie(Integer especie) {
		this.especie = especie;
	}
	public String getNomeRaca() {
		return nomeRaca;
	}
	public void setNomeRaca(String nomeRaca) {
		this.nomeRaca = nomeRaca;
	}
	public String getNomeEspecie() {
		return nomeEspecie;
	}
	public void setNomeEspecie(String nomeEspecie) {
		this.nomeEspecie = nomeEspecie;
	}
	public byte[] getAnimalFoto() {
		return animalFoto;
	}
	public void setAnimalFoto(byte[] animalFoto) {
		this.animalFoto = animalFoto;
	}

}
