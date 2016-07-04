package es.domingojunta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value={"/","/home"})
	public String home(Model model) {
		
		
		return "home";
		
	}
	@RequestMapping(value="/news")
	public String news() {
		
		
		return "news";
		
	}
	
	@RequestMapping(value="/services")
	public String services() {
		
		
		return "services";
		
	}
	@RequestMapping(value="/contact")
	public String contact() {
		
		
		return "contact";
		
	}
	@RequestMapping(value="/links")
	public String links() {
		
		
		return "links";
		
	}
	@RequestMapping(value="/users")
	public String users() {
		
		
		return "users";
		
	}
	@RequestMapping(value="/budged")
	public String budged() {
		
		
		return "budged";
		
	}
}
