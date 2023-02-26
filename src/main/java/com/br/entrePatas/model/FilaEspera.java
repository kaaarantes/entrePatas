package com.br.entrePatas.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "FILA_ESPERA")
public class FilaEspera  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_FILA_ESPERA")
	private Integer idFilaEspera;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Pessoa> pessoa;
    
    @Column(name = "OBSERVACAO")
	private String observacao;
	
    @Column(nullable = false, name = "FLG_STATUS")
	private Integer flgStatus;
	
    
	/*------------------------------------------------*/
	/*                  GETTERS E SETTERS             */
	/*------------------------------------------------*/
    
	public Integer getIdFilaEspera() {
		return idFilaEspera;
	}
	public void setIdFilaEspera(Integer idFilaEspera) {
		this.idFilaEspera = idFilaEspera;
	}

	public List<Pessoa> getPessoa() {
		return pessoa;
	}
	public void setPessoa(List<Pessoa> pessoa) {
		this.pessoa = pessoa;
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
