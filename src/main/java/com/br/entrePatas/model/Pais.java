package com.br.entrePatas.model;

import java.io.Serializable;

import com.br.entrePatas.model.dtos.PaisDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PAIS")
public class Pais  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_PAIS")
	private Integer idPais;
	
	@Column(nullable = false, name = "SIGLA")
	private String sigla;
	
	@Column(nullable = false, name = "DESCRICAO")
	private String descricao;
	
	@Column(nullable = false, name = "NR_BACEN")
	private Integer nrBACEN;
	
	@Column(nullable = false, name = "FLG_STATUS")
	private Integer flgStatus;
	
	public Integer getIdPais() {
		return idPais;
	}
	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getNrBACEN() {
		return nrBACEN;
	}
	public void setNrBACEN(Integer nrBACEN) {
		this.nrBACEN = nrBACEN;
	}
	public Integer getFlgStatus() {
		return flgStatus;
	}
	public void setFlgStatus(Integer flgStatus) {
		this.flgStatus = flgStatus;
	}
	
	public Pais() {
		super();
	}
	
	public Pais(PaisDTO obj) {
		super();
		this.idPais = obj.getIdPais();
		this.sigla = obj.getSigla();
		this.descricao = obj.getDescricao();
		this.nrBACEN = obj.getNrBACEN();
		this.flgStatus = obj.getFlgStatus();
	}
	
}
