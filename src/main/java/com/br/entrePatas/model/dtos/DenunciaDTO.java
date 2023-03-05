package com.br.entrePatas.model.dtos;

import java.io.Serializable;

import com.br.entrePatas.model.Denuncia;

public class DenunciaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer idDenuncia;
	private String denuncia;
	private String observacao;
	private String anexo;
	private Integer flgStatus;
	
	public DenunciaDTO() {
		super();
	}

	public DenunciaDTO(Denuncia obj) {
		super();
		this.idDenuncia = obj.getIdDenuncia();
		this.denuncia = obj.getDenuncia();
		this.observacao = obj.getObservacao();
		this.anexo = obj.getAnexo();
		this.flgStatus = obj.getFlgStatus();
	}

	public Integer getIdDenuncia() {
		return idDenuncia;
	}

	public void setIdDenuncia(Integer idDenuncia) {
		this.idDenuncia = idDenuncia;
	}

	public String getDenuncia() {
		return denuncia;
	}

	public void setDenuncia(String denuncia) {
		this.denuncia = denuncia;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getAnexo() {
		return anexo;
	}

	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}

	public Integer getFlgStatus() {
		return flgStatus;
	}

	public void setFlgStatus(Integer flgStatus) {
		this.flgStatus = flgStatus;
	}
	
}
