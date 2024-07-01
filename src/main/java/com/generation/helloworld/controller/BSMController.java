package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BSMController {
	
	@GetMapping
	public String bsm() {
		return "Mentalidades:  Orientação ao Futuro\r\n"
				+ "• Responsabilidade Pessoal\r\n"
				+ "• Persistência\r\n"
				+ "• Mentalidade de Crescimento"
				+ "\nHabilidades: "
				+ "Comunicação\r\n"
				+ "• Proatividade\r\n"
				+ "• Orientação ao detalhe\r\n"
				+ "• Trabalho em equipe";
	}
}