package com.br.entrePatas.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "ANIMAL")
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_ANIMAL")
	private Integer idAnimal;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_RACA")
	private Raca idRaca;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ESPECIE")
	private Especie idEspecie;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "NASCIMENTO")
	private Date nascimento;
	
	@Column(name = "PORTE")
	private String porte;
	
	@Column(name = "SEXO")
	private String sexo;
	
	@Column(name = "FLG_VACINADO")
	private Integer flgVacinado;
	
	@Column(name = "FLG_CASTRADO")
	private Integer flgCastrado;
	
	@Column(nullable = false, name = "FLG_STATUS")
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
	
}
