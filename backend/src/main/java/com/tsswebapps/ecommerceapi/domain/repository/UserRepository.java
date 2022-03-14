package com.tsswebapps.ecommerceapi.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsswebapps.ecommerceapi.domain.model.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> {
	Optional<Usuario> findByEmail(String email);
}
