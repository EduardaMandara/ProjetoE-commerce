package com.tsswebapps.ecommerceapi.domain.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Vendas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int qtdestoque;

	private int qtdvendido;

	private float valorvenda;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Product> products = new ArrayList<Product>();

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	
	public float getValorvenda() {
		return valorvenda;
	}

	public void setValorvenda(float valorvenda) {
		this.valorvenda = valorvenda;
	}

	public int getQtdestoque() {
		return qtdestoque;
	}

	public void setQtdestoque(int qtdestoque) {
		this.qtdestoque = qtdestoque;
	}

	public int getQtdvendido() {
		return qtdvendido;
	}

	public void setQtdvendido(int qtdvendido) {
		this.qtdvendido = qtdvendido;
	}

	@Override
	public String toString() {
		return "Vendas [id=" + id + ", qtdestoque=" + qtdestoque + ", qtdvendido=" + qtdvendido + ", valorvenda="
				+ valorvenda + ", products=" + products + "]";
	}
}
