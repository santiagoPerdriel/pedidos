package ar.com.navent.pedidos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ar.com.navent.pedidos.entity.Pedido;
import ar.com.navent.pedidos.service.PedidoService;

@Controller
public class FrontController {
    
	@Autowired
	PedidoService service;
	
	@GetMapping("/")
	public String mostrarHome() {
		
		return "home";
	}
	
	
	@GetMapping("/front-pedido")
	public String registrarse(Pedido user) {
		return "formRegistroPedido";
	}
	

	@PostMapping("/front-pedido")
	public String guardarRegistro(Pedido pedido, RedirectAttributes attributes) {
		service.createOrUpdatePedido(pedido);
		
		return "redirect:/";
	}

}
