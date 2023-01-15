package com.br.entrePatas.entity;

public class PessoaTelefone {
	
	private Integer idPessoaTelefone;
	private String telefone;
	private String contato;
	private String observacao;
	private Integer flgStatus;
	
	public Integer getIdPessoaTelefone() {
		return idPessoaTelefone;
	}
	public void setIdPessoaTelefone(Integer idPessoaTelefone) {
		this.idPessoaTelefone = idPessoaTelefone;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
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
