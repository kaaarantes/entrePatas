package com.br.entrePatas.model.dtos;

import java.io.Serializable;

import com.br.entrePatas.model.UF;

public class UFDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer idUF;
	private String descricao;
	private String uf;
	private Integer nrIBGE;
	private Integer flgStatus;
	
	public UFDTO() {
		super();
	}
	
	public UFDTO(UF obj) {
		super();
		this.idUF = obj.getIdUF();
		this.descricao = obj.getDescricao();
		this.uf = obj.getUf();
		this.nrIBGE = obj.getNrIBGE();
		this.flgStatus = obj.getFlgStatus();
	}

	public Integer getIdUF() {
		return idUF;
	}
	public void setIdUF(Integer idUF) {
		this.idUF = idUF;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
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
