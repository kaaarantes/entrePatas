package com.br.entrePatas.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "PESSOA")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_PESSOA")
	private Integer idPessoa;
	
	@OneToMany(mappedBy="pessoa", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private PessoaEndereco idPessoaEndereco;
	
	@OneToMany(mappedBy="pessoa", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private PessoaTelefone idPessoaTelefone;
	
	@Column(nullable = false, name = "NOME")
	private String nome;
	
	@Column(nullable = false, name = "NASCIMENTO")
	private Date nascimento;
	
	@Column(nullable = false, name = "CPF")
	private String cpf;
	
	@Column(nullable = false, name = "RG")
	private String rg;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(nullable = false, name = "FLG_LAR_TEMPORARIO")
	private Integer flgLarTemporario;
	
	@Column(nullable = false, name = "FLG_STATUS")
	private Integer flgStatus;
	
	public Integer getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}
	public PessoaEndereco getIdPessoaEndereco() {
		return idPessoaEndereco;
	}
	public void setIdPessoaEndereco(PessoaEndereco idPessoaEndereco) {
		this.idPessoaEndereco = idPessoaEndereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDt_nascimento() {
		return nascimento;
	}
	public void setDt_nascimento(Date dt_nascimento) {
		this.nascimento = dt_nascimento;
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
