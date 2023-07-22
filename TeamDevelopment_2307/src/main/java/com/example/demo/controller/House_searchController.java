package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class House_searchController {
	
	@RequestMapping(value="/")
	public String index() {
		return "House_search";
	}

}