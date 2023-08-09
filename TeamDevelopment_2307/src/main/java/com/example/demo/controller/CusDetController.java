package com.example.demo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;


//import com.example.demo.entity.CusDetEntity;
//import com.example.demo.service.CusDetService;
@SpringBootApplication
@Controller
public class CusDetController {

//	@Autowired
//	private CusDetService cusdetService;
	
	//@GetMapping(value = "housing/{id}",params = "id = 1")
	//@RequestMapping(value = "housing/{id}", method = RequestMethod.GET, params = "id=1")

/*
	@GetMapping("/housing/CustomerDetailsS09")
	public String display(@PathVariable("id") Long id, Model model) {
		CusDetEntity cusentity = cusdetService.findById(id);
		model.addAttribute("cusData", cusentity);
		return "housing/CustomerDetailsS09";
	  }
*/

	
	@GetMapping(value="housing/CustomerDetailsS09/{id}", params="id=1")
	public String test(Model model) {
		return "housing/CustomerDetailsS09";

	}
}

