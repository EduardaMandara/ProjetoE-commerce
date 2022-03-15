package com.tsswebapps.ecommerceapi.domain.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table
public class Perfil implements GrantedAuthority {
<<<<<<< HEAD
	
	
	
=======

>>>>>>> ff2f057cdf5dfb6e3f01fb34a95732a23d838084
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Perfil [id=" + id + ", descricao=" + descricao + "]";
	}

	@Override
	public String getAuthority() {
		
		return this.descricao;
	}
	
	
}
