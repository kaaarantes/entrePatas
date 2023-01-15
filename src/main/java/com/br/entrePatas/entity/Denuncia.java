package com.br.entrePatas.entity;

public class Denuncia {
	
	private Integer idDenuncia;
	private String denuncia;
	private String anexo;
	private String observacao;
	private Integer flgStatus;
	
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
