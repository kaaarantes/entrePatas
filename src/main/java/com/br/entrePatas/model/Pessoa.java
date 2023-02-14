package com.br.entrePatas.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@jakarta.persistence.Entity
@Table(name = "PESSOA")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_PESSOA")
	private Integer idPessoa;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PessoaEndereco> pessoaEndereco;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PessoaTelefone> pessoaTelefone;
	
	@Column(nullable = false, name = "NOME")
	private String nome;
	
	@Column(nullable = true, name = "NASCIMENTO")
	private Date nascimento;
	
	@Column(nullable = true, name = "CPF")
	private String cpf;
	
	@Column(nullable = true, name = "RG")
	private String rg;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(nullable = true, name = "FLG_LAR_TEMPORARIO")
	private Integer flgLarTemporario;
	
	@Column(nullable = true, name = "FLG_STATUS")
	private Integer flgStatus;
	

	public Integer getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}
	public List<PessoaEndereco> getPessoaEndereco() {
		return pessoaEndereco;
	}
	
	public List<PessoaTelefone> getPessoaTelefone() {
		return pessoaTelefone;
	}

	public void setPessoaTelefone(List<PessoaTelefone> pessoaTelefone) {
		this.pessoaTelefone = pessoaTelefone;
	}

	public void setPessoaEndereco(List<PessoaEndereco> pessoaEndereco) {
		this.pessoaEndereco = pessoaEndereco;
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
