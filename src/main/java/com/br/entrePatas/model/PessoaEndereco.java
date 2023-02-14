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
@Table(name = "PESSOA_ENDERECO")
public class PessoaEndereco implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_PESSOA_ENDERECO")
	private Integer idPessoaEndereco;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PESSOA")
    private Pessoa idPessoa;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CIDADE")
	private Cidade cidade;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PAIS")
	private Pais idPais;
	
	@Column(nullable = false, name = "LOGRADOURO")
	private String logradouro;
	
	@Column(nullable = false, name = "BAIRRO")
	private String bairro;
	
	@Column(nullable = false, name = "NUMERO")
	private String numero;
	
	@Column(name = "COMPLEMENTO")
	private String complemento;
	
	@Column(nullable = false, name = "CEP")
	private Integer cep;
	
	@Column(name = "OBSERVACAO")
	private String observacao;
	
	@Column(nullable = false, name = "FLG_STATUS")
	private Integer flgStatus;
	
	public Integer getIdPessoaEndereco() {
		return idPessoaEndereco;
	}
	public void setIdPessoaEndereco(Integer idPessoaEndereco) {
		this.idPessoaEndereco = idPessoaEndereco;
	}
	public Pessoa getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Pessoa idPessoa) {
		this.idPessoa = idPessoa;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setIdCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public Pais getIdPais() {
		return idPais;
	}
	public void setIdPais(Pais idPais) {
		this.idPais = idPais;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
		this.cep = cep;
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
