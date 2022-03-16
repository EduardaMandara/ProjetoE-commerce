package com.tsswebapps.ecommerceapi.infra.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsswebapps.ecommerceapi.domain.model.Product;
import com.tsswebapps.ecommerceapi.domain.repository.ProductRepository;
import com.tsswebapps.ecommerceapi.dto.ProductDto;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public ProductDto findByReferencia(String ref) {
		Optional<Product> byReferencia = repository.findByReferencia(ref);
		if (byReferencia.isEmpty()) {
			return null;
		}
		
		return byReferencia.get().toProductDto();
	} 
	
	public Product findOneById(Long id) {
		Optional<Product> optional = repository.findById(id);
		return optional.orElse(null);
	}
	
	public ProductDto save(ProductDto product) {
		repository.save(product.toProduct());
		return product;
	}
	
	public void deleteproduct(Product product) {
		repository.delete(product);
	}
	
	public List<ProductDto> findAll(){		
		return repository.findAll()
				.stream()
				.map(Product::toProductDto).collect(Collectors.toUnmodifiableList());
	}
}
