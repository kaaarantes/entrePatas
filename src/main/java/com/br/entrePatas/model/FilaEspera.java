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
@Table(name = "FILA_ESPERA")
public class FilaEspera  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_FILA_ESPERA")
	private Integer idFilaEspera;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PESSOA")
    private Pessoa idPessoa;
    
    @Column(name = "OBSERVACAO")
	private String observacao;
	
    @Column(nullable = false, name = "FLG_STATUS")
	private Integer flgStatus;
	
	public Integer getIdFilaEspera() {
		return idFilaEspera;
	}
	public Pessoa getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Pessoa idPessoa) {
		this.idPessoa = idPessoa;
	}
	public void setIdFilaEspera(Integer idFilaEspera) {
		this.idFilaEspera = idFilaEspera;
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
