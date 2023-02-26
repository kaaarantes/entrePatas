package com.br.entrePatas.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "RACA")
public class Raca  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_RACA")
	private Integer idRaca;
	
	@Column(nullable = false, name = "RACA")
	private String raca;
	
	@Column(name = "OBSERVACAO")
	private String observacao;
	
	@Column(nullable = false, name = "FLG_STATUS")
	private Integer flgStatus;
	
	public Raca() {
		super();
	}
	
	public Raca(Integer idRaca, String raca, String observacao, Integer flgStatus) {
		super();
		this.idRaca = idRaca;
		this.raca = raca;
		this.observacao = observacao;
		this.flgStatus = flgStatus;
	}

	public Integer getIdRaca() {
		return idRaca;
	}
	public void setIdRaca(Integer idRaca) {
		this.idRaca = idRaca;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
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
