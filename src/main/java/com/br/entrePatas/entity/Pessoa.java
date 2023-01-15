package com.br.entrePatas.entity;

import java.util.Date;

public class Pessoa {
	
	private Integer idPessoa;
	//private PessoaEndereco idPessoaEndereco;
	private String nome;
	private Date dt_nascimento;
	private String cpf;
	private String rg;
	private String email;
	private Integer flgLarTemporario;
	private Integer flgStatus;
	
	public Integer getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getFlgLarTemporario() {
		return flgLarTemporario;
	}
	public void setFlgLarTemporario(Integer flgLarTemporario) {
		this.flgLarTemporario = flgLarTemporario;
	}
	public Integer getFlgStatus() {
		return flgStatus;
	}
	public void setFlgStatus(Integer flgStatus) {
		this.flgStatus = flgStatus;
	}

}
