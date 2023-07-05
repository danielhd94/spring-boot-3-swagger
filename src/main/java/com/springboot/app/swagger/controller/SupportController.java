package com.springboot.app.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "support", description = "Support Controller")
public class SupportController {

	@GetMapping("/home")
	@Operation(summary = "Página de inicio", description = "Devuelve un saludo de bienvenida")
	public String home() {
		return "Hello world";
	}

	@PostMapping("/resolve")
	@Parameter(name = "name", description = "Descripción del parámetro")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Respuesta exitosa"),
			@ApiResponse(responseCode = "400", description = "Respuesta de error") })
	public String resolve(@RequestBody String name) {
		return name;
	}
}
