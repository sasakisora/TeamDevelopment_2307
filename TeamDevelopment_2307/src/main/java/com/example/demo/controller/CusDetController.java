package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.CusDetEntity;
import com.example.demo.service.CusDetService;

@SpringBootApplication
@Controller
public class CusDetController {

	@Autowired
	private CusDetService cusdetService;
	
	@GetMapping("housing/CustomerDetailsS09/{id}")
	public String displayView(@PathVariable Long id, Model model) {
		CusDetEntity cusEntity = cusdetService.findById(id);
		model.addAttribute("userData", cusEntity);
		return "housing/CustomerDetailsS09";
	}
	
	
	
	
	
	

}