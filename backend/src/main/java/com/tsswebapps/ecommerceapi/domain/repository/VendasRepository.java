package com.tsswebapps.ecommerceapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsswebapps.ecommerceapi.domain.model.Vendas;

public interface VendasRepository extends JpaRepository<Vendas, Long> {

}
