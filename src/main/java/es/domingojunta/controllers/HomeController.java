package es.domingojunta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value={"/","/home"})
	public String home(Model model) {
		
		model.addAttribute("message", "Hola desde el controller");
		return "home";
		
	}
	
}
