package com.generation.Loja_Game.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@NotBlank (message = "O nome do produto é obrigatório")
	@Size (min = 5, max = 50, message = " O nome do produto deve conter no minimo 5 caracteres e no maximo 50")
	private String nome;
	
	@Size (min = 5, max = 20, message = " O tipo do produto deve conter no minimo 5 caracteres e no maximo 20")
	private String tipo;
	
	@NotNull(message = "O preço do produto é obrigatório")
	@PositiveOrZero (message = " O preço deve ser maior do que zero ou zero!")
	private BigDecimal preco;
	
	@NotNull(message = "O Atributo Descrição é obrigatório")
	private String descricao;
	
	@Size (min = 5, max = 20, message = " A plataforma do produto deve conter no minimo 5 caracteres e no maximo 20")
	private String plataforma;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	

}
