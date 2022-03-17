package com.tsswebapps.ecommerceapi.infra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tsswebapps.ecommerceapi.domain.model.Product;
import com.tsswebapps.ecommerceapi.dto.ProductDto;
import com.tsswebapps.ecommerceapi.infra.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/all")
	public List<ProductDto> listarTodos(){
		return productService.findAll();
	}
	
	@GetMapping
	public ResponseEntity<ProductDto> findByRef(@RequestParam(name = "ref") String ref) {
		if(ref.equals(null)) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		System.out.println(ref);
		
		
		ProductDto byReferencia = productService.findByReferencia(ref);
		
		return new ResponseEntity<ProductDto>(byReferencia, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProductDto> findById(@PathVariable Long id) {
		ProductDto byReferencia = productService.findOneById(id).toProductDto();		
		return new ResponseEntity<ProductDto>(byReferencia, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<ProductDto> save(@RequestBody ProductDto productDto){
		try {
			ProductDto saved = productService.save(productDto);
			return new ResponseEntity<ProductDto>(saved, HttpStatus.CREATED);			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping
	public ResponseEntity<ProductDto> update(@RequestBody ProductDto productDto){
		try {
			Product productOld = productService.findOneById(productDto.getId());
			
			if(productOld.equals(null)) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
			
			productOld.copyProductDto(productDto);
			
			ProductDto saved = productService.save(productOld.toProductDto());
			return new ResponseEntity<ProductDto>(saved, HttpStatus.OK);			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void apagar(@PathVariable Long id){		
		productService.deleteproduct(productService.findOneById(id));
		
	}

}
