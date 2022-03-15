package com.tsswebapps.ecommerceapi.domain.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.NumberFormat;

@Entity
@Table
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 50)
	private String referencia;
	
	@Column(length = 150)
	private String nomeprod;

	@NumberFormat(pattern = "#,##.00")
	private BigDecimal valorprod;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
	public int hashCode() {
		return Objects.hash(id, nomeprod, referencia, valorprod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id) && Objects.equals(nomeprod, other.nomeprod)
				&& Objects.equals(referencia, other.referencia) && Objects.equals(valorprod, other.valorprod);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", referencia=" + referencia + ", nomeprod=" + nomeprod + ", valorprod="
				+ valorprod + "]";
	}


}
