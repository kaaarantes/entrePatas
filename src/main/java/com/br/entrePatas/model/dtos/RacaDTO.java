package com.br.entrePatas.model.dtos;

import java.io.Serializable;

import com.br.entrePatas.model.Raca;

public class RacaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	protected Integer idRaca;
	protected String raca;
	protected String observacao;
	protected Integer flgStatus;
	
	public RacaDTO() {
		super();
	}

	public RacaDTO(Raca obj) {
		super();
		this.idRaca = obj.getIdRaca();
		this.raca = obj.getRaca();
		this.observacao = obj.getObservacao();
		this.flgStatus = obj.getFlgStatus();
	}

	public Integer getIdRaca() {
		return idRaca;
	}

	public void setIdRaca(Integer idRaca) {
		this.idRaca = idRaca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
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
