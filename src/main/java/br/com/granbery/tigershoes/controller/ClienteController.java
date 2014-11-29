package br.com.granbery.tigershoes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClienteController {
	
	@RequestMapping("/cadastrarCliente")
	public String cadastrarCliente() {		
		return "cadastrarCliente";
	}
	
	@RequestMapping("/salvarCliente")
	public ModelAndView salvarCliente() {
		String message = "Cliente Cadastrado com Sucesso!";
		ModelAndView mv = new ModelAndView("sucesso");
		mv.addObject("message", message);
		return mv;
	}
}
