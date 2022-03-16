package com.tsswebapps.ecommerceapi.dto;

import java.math.BigDecimal;

import com.tsswebapps.ecommerceapi.domain.model.Product;

public class ProductDto {
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private String referencia;
	
	private String nomeprod;

	private BigDecimal valorprod;

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getNomeprod() {
		return nomeprod;
	}

	public void setNomeprod(String nomeprod) {
		this.nomeprod = nomeprod;
	}

	public BigDecimal getValorprod() {
		return valorprod;
	}

	public void setValorprod(BigDecimal valorprod) {
		this.valorprod = valorprod;
	}

	@Override
	public String toString() {
		return "ProductDto [id=" + id + ", referencia=" + referencia + ", nomeprod=" + nomeprod + ", valorprod="
				+ valorprod + "]";
	}
	
	public Product toProduct() {
		Product product = new Product();
		product.setId(this.id);
		product.setNomeprod(this.nomeprod);
		product.setReferencia(this.referencia);
		product.setValorprod(this.valorprod);
		
		return product;
	}
}
