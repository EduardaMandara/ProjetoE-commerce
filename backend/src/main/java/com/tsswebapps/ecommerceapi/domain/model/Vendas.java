package com.tsswebapps.ecommerceapi.domain.model;

public class Vendas {

	
	private int qtdestoque;
	private int qtdvendido;
	private float valorvenda;
	
	
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
		
		return "Venda (quantidade em estoque= " +qtdestoque+ "- quantidade vendida= " +qtdvendido+"- valor da venda" +valorvenda+ "]";
		
	
}
	}
