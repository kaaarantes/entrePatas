package com.br.entrePatas.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DENUNCIA")
public class Denuncia  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_DENUNCIA")
	private Integer idDenuncia;
	
	@Column(nullable = false, name = "DENUNCIA")
	private String denuncia;
	
	@Column(name = "ANEXO")
	private String anexo;
	
	@Column(name = "OBSERVACAO")
	private String observacao;
	
	@Column(nullable = false, name = "FLG_STATUS")
	private Integer flgStatus;
	
	public Integer getIdDenuncia() {
		return idDenuncia;
	}
	public void setIdDenuncia(Integer idDenuncia) {
		this.idDenuncia = idDenuncia;
	}
	public String getDenuncia() {
		return denuncia;
	}
	public void setDenuncia(String denuncia) {
		this.denuncia = denuncia;
	}
	public String getAnexo() {
		return anexo;
	}
	public void setAnexo(String anexo) {
		this.anexo = anexo;
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
