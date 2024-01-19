package com.generation.Loja_Game.model;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long Id;
	
	
	@NotNull (message = "O tema do produto é obrigatório")
	@Size (min = 5, max = 50, message = " O tema  do produto deve conter no minimo 5 caracteres e no maximo 50")
	private String tema;
	
	
	@NotNull(message = "A quantidade de horas do produto é obrigatório")
	@Size (min = 5, max = 10, message = " A quantidade de horas do produto deve conter no minimo 5 caracteres e no maximo 10")
	private String quantidadedehoras;
	
	@NotNull(message = "A classificação do produto é obrigatório")
	@Size (min = 5, max = 10, message = " A classificação de idade do produto deve conter no minimo 5 caracteres e no maximo 10")
	private String classificacao;
	
	
	@Size (min = 5, max = 20, message = " O estilo de jogo produto deve conter no minimo 5 caracteres e no maximo 20")
	private String estilodejogo;
	
	@Size (min = 5, max = 1000, message = " O link da foto do produto deve conter no minimo 5 caracteres e no maximo 1000 caracteres")
	private String foto;

	
	@OneToMany (fetch =  FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties ("categoria")
	private List<Produto> produto;
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getQuantidadedehoras() {
		return quantidadedehoras;
	}

	public void setQuantidadedehoras(String quantidadedehoras) {
		this.quantidadedehoras = quantidadedehoras;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getEstilodejogo() {
		return estilodejogo;
	}

	public void setEstilodejogo(String estilodejogo) {
		this.estilodejogo = estilodejogo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	
	}

	
	


