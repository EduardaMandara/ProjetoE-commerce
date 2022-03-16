package com.tsswebapps.ecommerceapi.infra.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tsswebapps.ecommerceapi.domain.model.Usuario;
import com.tsswebapps.ecommerceapi.domain.repository.UsuarioRepository;
import com.tsswebapps.ecommerceapi.dto.AuthUserDto;
import com.tsswebapps.ecommerceapi.dto.UserDto;

@Service
public class UserService {

	private UsuarioRepository repository;

	public boolean userAuth(AuthUserDto userAuth) {
		Optional<Usuario> usuarioEncontrado = repository.findByEmailAndSenha(userAuth.getEmail(),
				userAuth.getPassword());
		
		return usuarioEncontrado.isPresent();
	}
	
	public UserDto save(UserDto userDto) {
		repository.save(userDto.toUsuario());
		return userDto;
	}
}
