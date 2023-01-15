package com.br.entrePatas.entity;

public class Pais {
	
	private Integer idPais;
	private String sigla;
	private String descricao;
	private Integer nrBACEN;
	private Integer flgStatus;
	
	public Integer getIdPais() {
		return idPais;
	}
	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getNrBACEN() {
		return nrBACEN;
	}
	public void setNrBACEN(Integer nrBACEN) {
		this.nrBACEN = nrBACEN;
	}
	public Integer getFlgStatus() {
		return flgStatus;
	}
	public void setFlgStatus(Integer flgStatus) {
		this.flgStatus = flgStatus;
	}

}
