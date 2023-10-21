package br.com.ehmf.AppCalculadora.resource;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class WebController {
	
	public String showForm(Model model) {
		//adicionar uma lista de operações
		model.addAttribute("modelOperacoes",List.of("Soma","Subtracao"));
		return "form";
	}
	
}
