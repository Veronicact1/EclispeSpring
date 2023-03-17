package com.ejemplo.config;

import java.net.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class Contralador {
	@GetMapping("/Formulario") 
	public String mostrarFormulario() {
	return "formulario-hola";
	}
	
	@PostMapping("/Formulario")
	public String procesarFormulario(HttpRequest request, Model model) {

		String nombre = request.getParameter("nombre");
		String mensaje = (nombre == null) ? "undefined" : nombre.toUpperCase(); 
		System.out.println("El valor enviado por el usuario es " + mensaje); 
		model.addAttribute("mensaje", mensaje);
		return "hola";
	}
	}