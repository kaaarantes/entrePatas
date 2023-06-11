package com.br.entrePatas.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "LAR_TEMPORARIO")
public class LarTemporario  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_LAR_TEMPORARIO")
	private Integer idLarTemporario;
	
	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL,optional = true)
	@JoinColumn(name = "ID_PESSOA")
	private Pessoa pessoa;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "ID_ANIMAL")
	private Animal animal;
	
	@Column(name = "OBSERVACAO")
	private String observacao;
	
	@Column(name = "DATA_ENTRADA")
	private Date dataEntrada;
	
	@Column(name = "DATA_SAIDA")
	private Date dataSaida;
	
	@Column(nullable = false, name = "FLG_STATUS")
	private Integer flgStatus;
	
	public LarTemporario() {
		super();
	}

	public LarTemporario(Integer idLarTemporario, Pessoa pessoa, Animal animal, String observacao, Date dataEntrada,
			Date dataSaida, Integer flgStatus) {
		super();
		this.idLarTemporario = idLarTemporario;
		this.pessoa = pessoa;
		this.animal = animal;
		this.observacao = observacao;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.flgStatus = flgStatus;
	}
	/*------------------------------------------------*/
	/*                  GETTERS E SETTERS             */
	/*------------------------------------------------*/
	
	public Integer getIdLarTemporario() {
		return idLarTemporario;
	}
	public void setIdLarTemporario(Integer idLarTemporario) {
		this.idLarTemporario = idLarTemporario;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
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
