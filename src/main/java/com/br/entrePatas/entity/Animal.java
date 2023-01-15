package com.br.entrePatas.entity;

import java.util.Date;

public class Animal {
	
	private Integer idAnimal;
	private Raca idRaca;
	private Especie idEspecie;
	private String nome;
	private Date dtNascimento;
	private String porte;
	private String sexo;
	private Integer flgVacinado;
	private Integer flgCastrado;
	private Integer flgStatus;
	
	public Integer getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(Integer idAnimal) {
		this.idAnimal = idAnimal;
	}
	public Raca getIdRaca() {
		return idRaca;
	}
	public void setIdRaca(Raca idRaca) {
		this.idRaca = idRaca;
	}
	public Especie getIdEspecie() {
		return idEspecie;
	}
	public void setIdEspecie(Especie idEspecie) {
		this.idEspecie = idEspecie;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
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
	
}
