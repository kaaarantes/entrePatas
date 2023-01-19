package com.br.entrePatas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UF")
public class UF {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_UF")
	private Integer idUF;
	
	@Column(nullable = false, name = "DESCRICAO")
	private String descricao;
	
	@Column(nullable = false, name = "UF")
	private String uf;
	
	@Column(nullable = false, name = "NR_IBGE")
	private Integer nrIBGE;
	
	@Column(nullable = false, name = "FLG_STATUS")
	private Integer flgStatus;
	
	public Integer getIdUF() {
		return idUF;
	}
	public void setIdUF(Integer idUF) {
		this.idUF = idUF;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public Integer getNrIBGE() {
		return nrIBGE;
	}
	public void setNrIBGE(Integer nrIBGE) {
		this.nrIBGE = nrIBGE;
	}
	public Integer getFlgStatus() {
		return flgStatus;
	}
	public void setFlgStatus(Integer flgStatus) {
		this.flgStatus = flgStatus;
	}

}
