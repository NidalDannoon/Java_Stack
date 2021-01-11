package com.nidal.dojoninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nidal.dojoninjas.models.Ninja;
import com.nidal.dojoninjas.services.DojoService;
import com.nidal.dojoninjas.services.NinjaService;

@Controller
public class NinjaController {
	private final DojoService dojoService;
	private final NinjaService ninjaService;
	public NinjaController(NinjaService ninjaService,DojoService dojoService) {
		this.ninjaService = ninjaService;
		this.dojoService = dojoService;
	}

	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja Ninja, Model model) {
		model.addAttribute("dojos", dojoService.getAllDojos());
		return "newninja.jsp";
	}
	
	@PostMapping("/add-ninja")
	public String addNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "newninja.jsp";
		}
		else {
			ninjaService.addNinja(ninja);
			return "redirect:/dojos/" + ninja.getDojo().getId() ;
		}
	}
}
	
