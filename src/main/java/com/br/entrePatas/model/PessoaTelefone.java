package com.br.entrePatas.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PESSOA_TELEFONE")
public class PessoaTelefone  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_PESSOA_TELEFONE")
	private Integer idPessoaTelefone;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PESSOA")
    private Pessoa idPessoa;
	
	@Column(nullable = false, name = "TELEFONE")
	private String telefone;
	
	@Column(nullable = false, name = "CONTATO")
	private String contato;
	
	@Column(name = "OBSERVACAO")
	private String observacao;
	
	@Column(nullable = false, name = "FLG_STATUS")
	private Integer flgStatus;
	
	public Integer getIdPessoaTelefone() {
		return idPessoaTelefone;
	}
	public void setIdPessoaTelefone(Integer idPessoaTelefone) {
		this.idPessoaTelefone = idPessoaTelefone;
	}
	public Pessoa getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Pessoa idPessoa) {
		this.idPessoa = idPessoa;
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
