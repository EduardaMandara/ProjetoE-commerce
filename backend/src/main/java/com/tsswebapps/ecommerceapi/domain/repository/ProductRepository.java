package com.tsswebapps.ecommerceapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsswebapps.ecommerceapi.domain.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
