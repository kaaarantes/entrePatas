package com.br.entrePatas.entity;

public class AnimalPerdido {
	
	private Integer idAnimalPerdido;
	private Pessoa idPessoa;
	private Animal idAnimal;
	private String anexo;
	private String observacao;
	private Integer flgStatus;
	
	public Integer getIdAnimalPerdido() {
		return idAnimalPerdido;
	}
	public void setIdAnimalPerdido(Integer idAnimalPerdido) {
		this.idAnimalPerdido = idAnimalPerdido;
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
	public String getAnexo() {
		return anexo;
	}
	public void setAnexo(String anexo) {
		this.anexo = anexo;
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
