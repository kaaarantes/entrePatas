package com.br.entrePatas.model.dtos;

import java.io.Serializable;
import java.util.Date;

import com.br.entrePatas.model.Pessoa;

public class PessoaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer idPessoa;
	private String nome;
	private Date nascimento;
	private String cpf;
	private String rg;
	private String telefone;
	private String email;
	private String senha;
	private Integer idCidade;
	private String nomeCidade;
	private Integer idPais;
	private String nomePais;
	private String logradouro;
	private String bairro;
	private String numero;
	private String complemento;
	private Integer cep;
	private Integer flgLarTemporario;
	private Integer flgStatus;
	
	public PessoaDTO() {
		super();
	}
	
	public PessoaDTO(Pessoa obj) {
		super();
		this.idPessoa = obj.getIdPessoa();
		this.nome = obj.getNome();
		this.nascimento = obj.getNascimento();
		this.cpf = obj.getCpf();
		this.rg = obj.getRg();
		this.telefone = obj.getTelefone();
		this.email = obj.getEmail();
		this.senha = obj.getSenha();
		this.idCidade = obj.getCidade().getIdCidade();
		this.nomeCidade = obj.getCidade().getCidade();
		this.idPais = obj.getPais().getIdPais();
		this.nomePais = obj.getPais().getDescricao();
		this.logradouro = obj.getLogradouro();
		this.bairro = obj.getBairro();
		this.numero = obj.getNumero();
		this.complemento = obj.getComplemento();
		this.cep = obj.getCep();
		this.flgLarTemporario = obj.getFlgLarTemporario();
		this.flgStatus = obj.getFlgStatus();
	}

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
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Integer getIdCidade() {
		return idCidade;
	}
	public void setIdCidade(Integer idCidade) {
		this.idCidade = idCidade;
	}
	public String getNomeCidade() {
		return nomeCidade;
	}
	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	public Integer getIdPais() {
		return idPais;
	}
	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}
	public String getNomePais() {
		return nomePais;
	}
	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
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
