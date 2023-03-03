package com.br.entrePatas.model.dtos;

import java.io.Serializable;

import com.br.entrePatas.model.Especie;

public class EspecieDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	protected Integer idEspecie;
	protected String especie;
	protected Integer flgStatus;
	
	public EspecieDTO() {
		super();
	}
	
	public EspecieDTO(Especie obj) {
		super();
		this.idEspecie = obj.getIdEspecie();
		this.especie = obj.getEspecie();
		this.flgStatus = obj.getFlgStatus();
	}

	public Integer getIdEspecie() {
		return idEspecie;
	}
	public void setIdEspecie(Integer idEspecie) {
		this.idEspecie = idEspecie;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Integer getFlgStatus() {
		return flgStatus;
	}
	public void setFlgStatus(Integer flgStatus) {
		this.flgStatus = flgStatus;
	}
	
}
