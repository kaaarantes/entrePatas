package com.br.entrePatas.model.dtos;

import java.io.Serializable;

import com.br.entrePatas.model.Pais;

public class PaisDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer idPais;
	private String sigla;
	private String descricao;
	private Integer nrBACEN;
	private Integer flgStatus;
	
	public PaisDTO() {
		super();
	}
	
	public PaisDTO(Pais obj) {
		super();
		this.idPais = obj.getIdPais();
		this.sigla = obj.getSigla();
		this.descricao = obj.getDescricao();
		this.nrBACEN = obj.getNrBACEN();
		this.flgStatus = obj.getFlgStatus();
	}

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
