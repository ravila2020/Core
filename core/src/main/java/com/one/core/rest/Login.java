package com.one.core.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class Login {

	@GetMapping
	public String Inicio(){
		String Saludo = "{\"Mensaje\":\"Hola\"}";
		return Saludo;
	}
}
