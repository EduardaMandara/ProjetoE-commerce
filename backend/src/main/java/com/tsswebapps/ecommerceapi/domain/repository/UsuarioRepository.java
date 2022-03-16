package com.tsswebapps.ecommerceapi.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tsswebapps.ecommerceapi.domain.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Optional<Usuario> findByEmail(String email);
	Optional<Usuario> findByEmailAndSenha(String email, String senha);
}
