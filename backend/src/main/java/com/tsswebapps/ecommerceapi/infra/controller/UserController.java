package com.tsswebapps.ecommerceapi.infra.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsswebapps.ecommerceapi.domain.model.Usuario;
import com.tsswebapps.ecommerceapi.dto.AuthUserDto;
import com.tsswebapps.ecommerceapi.dto.UserDto;
import com.tsswebapps.ecommerceapi.infra.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/auth")
	public ResponseEntity<String> auth(@RequestBody AuthUserDto userAuth) {
		boolean auth = userService.userAuth(userAuth);

		return (auth) ? new ResponseEntity<String>("OK", HttpStatus.OK)
				: new ResponseEntity<String>("INVALIDO", HttpStatus.UNAUTHORIZED);
	}

	@PostMapping
	public ResponseEntity<UserDto> saveUser(@RequestBody UserDto userDto) {
		try {
			Optional<Usuario> userRetorned = userService.finByEmail(userDto.getEmail());
			if(userRetorned.isPresent()) {
				return new ResponseEntity<UserDto>(HttpStatus.CONFLICT);
			}
			
			UserDto saved = userService.save(userDto);
			return new ResponseEntity<UserDto>(saved, HttpStatus.CREATED);			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
