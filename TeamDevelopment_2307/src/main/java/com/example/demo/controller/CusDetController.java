package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.CusDetEntity;
import com.example.demo.service.CusDetService;

@Controller

public class CusDetController {

	@Autowired
	private CusDetService cusdetService;
	
	  @GetMapping("/housing/{id}")
	  public String displayView(@PathVariable Long id, Model model) {
	    CusDetEntity user = cusdetService.findById(id);
	    model.addAttribute("userData", user);
	    return "housing/CustomerDetailsS09";

	  }
}
