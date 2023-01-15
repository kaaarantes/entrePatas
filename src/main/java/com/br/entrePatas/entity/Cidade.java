package com.br.entrePatas.entity;

public class Cidade {
	
	private Integer idCidade;
	private UF idUF;
	private String cidade;
	private Integer nrIBGE;
	private Integer flgStatus;
	
	public Integer getIdCidade() {
		return idCidade;
	}
	public void setIdCidade(Integer idCidade) {
		this.idCidade = idCidade;
	}
	public UF getIdUF() {
		return idUF;
	}
	public void setIdUF(UF idUF) {
		this.idUF = idUF;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Integer getNrIBGE() {
		return nrIBGE;
	}
	public void setNrIBGE(Integer nrIBGE) {
		this.nrIBGE = nrIBGE;
	}
	public Integer getFlgStatus() {
		return flgStatus;
	}
	public void setFlgStatus(Integer flgStatus) {
		this.flgStatus = flgStatus;
	}

}
