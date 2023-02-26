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
@Table(name = "ANIMAL_FOTO")
public class AnimalFoto  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "ID_ANIMAL_FOTO")
	private Integer idAnimalFoto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ANIMAL")
	private Animal animal;
	
	@Column(length = 15, name = "IMAGEM")
	private byte[] imagem;

	@Column(name = "TIPO_IMAGEM")
	private String tipoImagem;
	
	@Column(name = "OBSERVACAO")
    private String observacao;
    
	@Column(nullable = false, name = "FLG_STATUS")
    private Integer flgStatus;
    
	
	/*------------------------------------------------*/
	/*                  GETTERS E SETTERS             */
	/*------------------------------------------------*/
	
	public Integer getIdAnimalFoto() {
		return idAnimalFoto;
	}
	public void setIdAnimalFoto(Integer idAnimalFoto) {
		this.idAnimalFoto = idAnimalFoto;
	}
	
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public byte[] getImagem() {
		return imagem;
	}
	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}
	
	public String getTipoImagem() {
		return tipoImagem;
	}
	public void setTipoImagem(String tipoImagem) {
		this.tipoImagem = tipoImagem;
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
