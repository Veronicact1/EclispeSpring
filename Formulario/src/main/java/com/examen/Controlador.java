package com.examen;
import java.net.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
	public class Controlador {
	
	@GetMapping("/formulario")
	public String mostrarFormulario() { 
	return "formulario-hola";
	}
	
	@PostMapping("/formulario")
	public String procesarFormulario(HttpRequest request, Module model) {
	String nombre = request.getParameter("nombre");
	String mensaje = (nombre == null) ? "undefined" : nombre.toUpperCase(); 
	System.out.println("El valor enviado por el usuario es " + mensaje); 
	model.addAttribute("mensaje", mensaje);
	return "hola";
	}
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@RequestParam("nombre") String nombre, 
	@RequestBody String body, Model model) {
	System.out.println("El cuerpo es " + body);
	String mensaje = (nombre == null) ? "undefined" : nombre.toUpperCase(); 
	System.out.println("El valor enviado por el usuario es " + mensaje); 
	model.addAttribute("mensaje", mensaje);
	return "hola";
	}
	@RequestMapping("/mostrarFormulario")
	public String mostrarFormulario(@RequestHeader("accept-language") String 
	acceptLanguage) {
	System.out.println("El valor de la cabecera accept-language es " + acceptLanguage); 
	return "formulario-hola";
	}
}
