package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController_jabg0014 {

	@Autowired
	private ServicioJabg0014Interface dao;
	
	@GetMapping("/")
	public String principal() {
		 return "index.html";
	}
	
	@GetMapping("/registro.html")
	public String reg() {
		 return "registro.html";
	}
	
	@GetMapping("/nosotros.html")
	public String nosotros() {
		 return "nosotros.html";
	}
	
	@GetMapping("/servicio.html")
	public String serv() {
		 return "servicio.html";
	}
	
	@GetMapping("/index.html")
	public String principalintde() {
		 return "index.html";
	}

	
	@PostMapping("/login")
	public String logearse(HttpServletRequest req, Model model, HttpServletResponse response) {
		HttpSession sesion = req.getSession();
	    String nombre = req.getParameter("nombre");
	    String pass = req.getParameter("contraseña");
	     
	    Usuario_jabg0014 usuario = new Usuario_jabg0014(nombre, pass);
		
		return "Usuario";
	}
	
	
	
}
