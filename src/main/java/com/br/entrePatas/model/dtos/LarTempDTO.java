package com.br.entrePatas.model.dtos;

import java.io.Serializable;
import java.util.Date;

import com.br.entrePatas.model.LarTemporario;

public class LarTempDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer idLarTemporario;
	private Integer pessoa;
	private String nomePessoa;
	private Integer animal;
	private String nomeAnimal;
	private Date dataEntrada;
	private Date dataSaida;
	private String observacao;
	private Integer flgStatus;
	
	public LarTempDTO() {
		super();
	}
	
	public LarTempDTO(LarTemporario obj) {
		super();
		this.idLarTemporario = obj.getIdLarTemporario();
		this.pessoa = obj.getPessoa().getIdPessoa();
		this.nomePessoa = obj.getPessoa().getNome();
		this.animal = obj.getAnimal().getIdAnimal();
		this.nomeAnimal = obj.getAnimal().getNome();
		this.dataEntrada = obj.getDataEntrada();
		this.dataSaida = obj.getDataSaida();
		this.observacao = obj.getObservacao();
		this.flgStatus = obj.getFlgStatus();
	}

	public Integer getIdLarTemporario() {
		return idLarTemporario;
	}

	public void setIdLarTemporario(Integer idLarTemporario) {
		this.idLarTemporario = idLarTemporario;
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

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
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
