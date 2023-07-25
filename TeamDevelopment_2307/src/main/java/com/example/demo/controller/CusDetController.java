package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.CusDetEntity;
import com.example.demo.service.CusDetService;

@Controller

public class CusDetController {
		
	@RequestMapping(value="/housing")
	public String display(Model model){
		model.addAttribute("");
		return "CustomerDetailsS09";
	}

}
