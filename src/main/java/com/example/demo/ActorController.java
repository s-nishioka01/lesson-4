package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActorController {

	@Autowired
	ActorMapper actorMapper;

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("title", "Actor List");

		List<Actor> actorList = actorMapper.findAll();

		model.addAttribute("actorList", actorList);

		return "index";
	}

}
