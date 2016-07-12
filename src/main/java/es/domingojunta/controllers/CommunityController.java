package es.domingojunta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import es.domingojunta.entities.Community;
import es.domingojunta.services.CommunityService;

@Controller
public class CommunityController {

	@Autowired
	private CommunityService communityService;
	
	@RequestMapping("/communities")
	public String communityies(Model model){
		
		model.addAttribute("communities",communityService.findAll());
		return("communities");
	}
	
	@RequestMapping(value="/community/{id}")
	public String communityDetail(Model model, @PathVariable int id){
		
		Community community = communityService.findOne(id);
		model.addAttribute("community", community);
		model.addAttribute("buildings",community.getBuildings());
		return "communityDetail";
	}

}
