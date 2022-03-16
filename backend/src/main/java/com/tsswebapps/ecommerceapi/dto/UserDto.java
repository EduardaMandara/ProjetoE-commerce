package com.tsswebapps.ecommerceapi.dto;

import com.tsswebapps.ecommerceapi.domain.model.Usuario;

public class UserDto {

	private String nome;
	private String email;
	private String password;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDto [nome=" + nome + ", email=" + email + ", password=" + password + "]";
	}
	
	public Usuario toUsuario() {
		Usuario usuario = new Usuario();
		usuario.setNome(this.nome);
		usuario.setEmail(this.email);
		usuario.setSenha(this.password);
		return usuario;
	}
	
	
}
