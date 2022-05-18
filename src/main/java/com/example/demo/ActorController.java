package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActorController {

	private ActorService actorService;

	@Autowired
	public ActorController(ActorService actorService) {
		this.actorService = actorService;
	}

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("title", "Actor List");

		model.addAttribute("actorList", actorService.getActorList());

		return "index";
	}

}
