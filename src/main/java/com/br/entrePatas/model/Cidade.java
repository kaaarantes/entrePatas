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
@Table(name = "CIDADE")
public class Cidade  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/*------------------------------------------------*/
	/*                  ATRIBUTOS                     */
	/*------------------------------------------------*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_CIDADE")
	private Integer idCidade;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_UF")
	private UF idUF;
	
	@Column(nullable = false, name = "CIDADE")
	private String cidade;
	
	@Column(nullable = false, name = "NR_IBGE")
	private Integer nrIBGE;
	
	@Column(nullable = false, name = "FLG_STATUS")
	private Integer flgStatus;
	
	
	/*------------------------------------------------*/
	/*                  GETTERS E SETTERS             */
	/*------------------------------------------------*/	
	
	public Integer getIdCidade() {
		return idCidade;
	}
	public void setIdCidade(Integer idCidade) {
		this.idCidade = idCidade;
	}
	
	public UF getIdUF() {
		return idUF;
	}
	public void setIdUF(UF idUF) {
		this.idUF = idUF;
	}
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
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
