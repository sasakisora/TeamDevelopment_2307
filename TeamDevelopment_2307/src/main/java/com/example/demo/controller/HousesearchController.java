package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class housesearchController {

	    	 @GetMapping("")
		  	public String displayList(Model model) {
		        return "housing/housesearch";
		      }	

}