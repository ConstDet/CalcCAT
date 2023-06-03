package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	//методом тыка нашел, как принимать несколько параметров
	public String greeting(@RequestParam(name="nameCompany", required=false, defaultValue="World") String nameCompany,
						   @RequestParam(name="nameObject", required=false, defaultValue="World") String nameObject,
						   Model model) {
		model.addAttribute("nameCompany", nameCompany);
		model.addAttribute("nameObject", nameObject);
		return "greeting";
	}
}
