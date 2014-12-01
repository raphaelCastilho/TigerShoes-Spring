package br.com.granbery.tigershoes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.granbery.tigershoes.dao.ClienteDAO;
import br.com.granbery.tigershoes.model.Cliente;
import br.com.granbery.tigershoes.model.Endereco;

@Controller
public class ClienteController {
	
	@RequestMapping("/cadastrarCliente")
	public String cadastrarCliente() {		
		return "cadastrarCliente";
	}
	
	@RequestMapping("/salvarCliente")
	public ModelAndView salvarCliente(Cliente cliente, Endereco endereco) {
		String message = "Cliente Cadastrado com Sucesso!";
		ModelAndView mv = new ModelAndView("sucesso");
	
		cliente.setEndereco(endereco);
		endereco.setCliente(cliente);
		ClienteDAO.getInstace().persistCliente(cliente);
		
		mv.addObject("message", message);
		mv.addObject("nome", cliente.getNome());
		return mv;
	}
}
