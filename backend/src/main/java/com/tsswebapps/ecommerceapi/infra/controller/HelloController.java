package com.tsswebapps.ecommerceapi.infra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String sayHello() {
		System.out.println("teste");
		return "Hello! Você está consumindo a API.";
	}
	
	@GetMapping("/auth")
	public String sayHelloAuth() {
		return "Hello! Você está consumindo a API.";
	}
}
