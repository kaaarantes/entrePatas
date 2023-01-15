package com.br.entrePatas.entity;

public class LarTemporario {
	
	private Integer idLarTemporario;
	private Pessoa idPessoa;
	private Animal idAnimal;
	private String observacao;
	private Integer flgStatus;
	
	public Integer getIdLarTemporario() {
		return idLarTemporario;
	}
	public void setIdLarTemporario(Integer idLarTemporario) {
		this.idLarTemporario = idLarTemporario;
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
