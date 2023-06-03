package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/start")
	//методом тыка нашел, как принимать несколько параметров
	public String start(@RequestParam(name="nameCompany", required=false, defaultValue="World") String nameCompany,
						   @RequestParam(name="nameObject", required=false, defaultValue="World") String nameObject,
						   @RequestParam(name="documentCode", required=false, defaultValue="World") String documentCode,
						   @RequestParam(name="positionHead", required=false, defaultValue="World") String positionHead,
						   @RequestParam(name="surnameHead", required=false, defaultValue="World") String surnameHead,
						   @RequestParam(name="developerPosition", required=false, defaultValue="World") String developerPosition,
						   @RequestParam(name="surnameDeveloper", required=false, defaultValue="World") String surnameDeveloper,
						   Model model) {
		Report report = new Report(
				nameCompany, nameObject, documentCode, positionHead, surnameHead,
				developerPosition, surnameDeveloper);
		model.addAttribute("nameCompany", nameCompany);
		model.addAttribute("nameObject", nameObject);
		model.addAttribute("documentCode", documentCode);
		model.addAttribute("positionHead", positionHead);
		model.addAttribute("surnameHead", surnameHead);
		model.addAttribute("developerPosition", developerPosition);
		model.addAttribute("surnameDeveloper", surnameDeveloper);
		return "start";
	}
}
