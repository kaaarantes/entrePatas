package com.br.entrePatas.model;

import java.io.Serializable;
import java.util.Base64;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "ANIMAL_FOTO")
public class AnimalFoto  implements Serializable {
		
	private static final long serialVersionUID = 1L;

		/*------------------------------------------------*/
		/*                  ATRIBUTOS                     */
		/*------------------------------------------------*/
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		@Column(name = "ID_ANIMAL_FOTO")
		private Integer idAnimalFoto;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "ID_ANIMAL")
		private Animal animal;
		
		@Column(length = 15, name = "IMAGEM")
		private byte[] imagem;

		@Column(name = "TIPO_IMAGEM")
		private String tipoImagem;
		
		@Column(name = "NOME_ARQUIVO")
		private String nomeArquivo;
		
		@Column(name = "FLG_PRINCIPAL")
		private Integer flgPrincipal;
		
		@Transient
		private String imagem64;
		
		@Transient
		private String retornoImagem;
		
		@Transient
		private Integer idProduto;
		
		
		/*------------------------------------------------*/
		/*                  CONSTRUTORES                  */
		/*------------------------------------------------*/
		
		public AnimalFoto(){
			
		}

		public AnimalFoto(Integer idAnimalFoto) {
			this.idAnimalFoto = idAnimalFoto;
		}

		/*------------------------------------------------*/
		/*                  GETTERS E SETTERS             */
		/*------------------------------------------------*/	

		public Integer getIdAnimalFoto() {
			return idAnimalFoto;
		}

		public void setIdAnimalFoto(Integer idAnimalFoto) {
			this.idAnimalFoto = idAnimalFoto;
		}
		
		@JsonBackReference(value="animal")
		public Animal getAnimal() {
			return animal;
		}

		public void setAnimal(Animal animal) {
			this.animal = animal;
		}

		@JsonIgnore
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

		public String getNomeArquivo() {
			return nomeArquivo;
		}

		public void setNomeArquivo(String nomeArquivo) {
			this.nomeArquivo = nomeArquivo;
		}

		public Integer getFlgPrincipal() {
			return flgPrincipal;
		}

		public void setFlgPrincipal(Integer flgPrincipal) {
			this.flgPrincipal = flgPrincipal;
		}

		public String getImagem64() {
			return imagem64;
		}

		public void setImagem64(String imagem64) {
			this.imagem64 = imagem64;
		}

		@JsonIgnore
		public String getRetornoImagem() {
			return Base64.getEncoder().encodeToString(this.imagem);
		}

		public void setRetornoImagem(String retornoImagem) {
			this.retornoImagem = retornoImagem;
		}

	}
