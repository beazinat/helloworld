package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {
	
	@GetMapping
	public String objetivos() {
		return "• Aprender a usar o Framework Spring Boot\n"
				+ "• Começar a desenvolver o meu projeto pessoal para o protfólio\n"
				+ "• Revisar o conteúdo de MySQL e colocar no Notion\n"
				+ "• Fazer um curso de UI design";
	}
}