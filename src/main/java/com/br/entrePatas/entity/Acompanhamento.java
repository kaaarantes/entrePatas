package com.br.entrePatas.entity;

public class Acompanhamento {
	
	private Integer idAcompanhamento;
	private Pessoa idPessoa;
	private Animal idAnimal;
	private String observacao;
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
