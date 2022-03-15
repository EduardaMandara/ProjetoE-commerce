package com.tsswebapps.ecommerceapi.domain.model;

public class Product {

	
    private String idprod;
	
	private String nomeprod;
	
	private float valorprod;
	
	
	public String getId() {
		
	return idprod;	
		
	}

	public String getNomeprod() {
		return nomeprod;
	}

	public void setNomeprod(String nomeprod) {
		this.nomeprod = nomeprod;
	}

	public Float getValorprod() {
		return valorprod;
	}

	public void setValorprod(float valorprod) {
		this.valorprod = valorprod;
	}

	
	@Override
	public String toString() {
		
		return "Produto (IDproduto= " +idprod+ "- nomeprod = " +nomeprod+"- $" +valorprod+ "]";
		
	}
	
}
