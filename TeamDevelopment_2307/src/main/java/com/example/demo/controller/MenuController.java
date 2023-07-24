package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ユーザー情報 Controller
 */
@Controller
public class MenuController {

	@GetMapping("/")
	public String index() {
		return "housing/Menu";
	}


}


