package com.tsswebapps.ecommerceapi.dto;

public class AuthUserDto {
	private String email;
	private String password;
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
		return "AuthUserDto [email=" + email + ", password=" + password + "]";
	}
	
	
}
