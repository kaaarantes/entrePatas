package com.br.entrePatas.model;

import java.io.Serializable;

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
@Table(name = "LAR_TEMPORARIO")
public class LarTemporario  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_LAR_TEMPORARIO")
	private Integer idLarTemporario;
	
	/*@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PESSOA")
	private Pessoa idPessoa;
	
	@OneToMany(mappedBy="larTemporario", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private Animal idAnimal;*/
	
	@Column(name = "OBSERVACAO")
	private String observacao;
	
	@Column(nullable = false, name = "FLG_STATUS")
	private Integer flgStatus;
	
	public Integer getIdLarTemporario() {
		return idLarTemporario;
	}
	public void setIdLarTemporario(Integer idLarTemporario) {
		this.idLarTemporario = idLarTemporario;
	}
	/*public Pessoa getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Pessoa idPessoa) {
		this.idPessoa = idPessoa;
	}
	public Animal getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(Animal idAnimal) {
		this.idAnimal = idAnimal;
	}*/
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
