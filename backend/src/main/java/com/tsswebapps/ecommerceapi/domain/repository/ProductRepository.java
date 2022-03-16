package com.tsswebapps.ecommerceapi.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsswebapps.ecommerceapi.domain.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	Optional<Product> findByReferencia(String referencia);
}
