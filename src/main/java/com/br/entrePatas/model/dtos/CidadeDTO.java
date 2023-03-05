package com.br.entrePatas.model.dtos;

import java.io.Serializable;

import com.br.entrePatas.model.Cidade;

public class CidadeDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer idCidade;
	private Integer idUF;
	private String cidade;
	private Integer nrIBGE;
	private Integer flgStatus;
	
	public CidadeDTO() {
		super();
	}
	
	public CidadeDTO(Cidade obj) {
		super();
		this.idCidade = obj.getIdCidade();
		this.idUF = obj.getIdUF().getIdUF();
		this.cidade = obj.getCidade();
		this.nrIBGE = obj.getNrIBGE();
		this.flgStatus = obj.getFlgStatus();
	}

	public Integer getIdCidade() {
		return idCidade;
	}
	public void setIdCidade(Integer idCidade) {
		this.idCidade = idCidade;
	}
	public Integer getIdUF() {
		return idUF;
	}
	public void setIdUF(Integer idUF) {
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
