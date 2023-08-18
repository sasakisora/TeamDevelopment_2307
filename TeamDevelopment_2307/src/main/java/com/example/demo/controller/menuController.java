package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * ユーザー情報 Controller
 */
@Controller
public class menuController {

	//メイン画面//	
	
	@GetMapping("housing/menu")
	public String gomenu() {
		return "housing/menu";
	}

	//ログイン画面//	
	
	@GetMapping("housing/logout.html")
	public String gologout() {
		return "housing/logout.html";
	}
	
	//顧客一覧画面//	
	
	@GetMapping("housing/cus.html")
	public String gocus() {
		return "housing/cus.html";
	}
	
	//住宅一覧画面//	
	
	@GetMapping("housing/hs1.html")
	public String gohs1() {
		return "housing/hs1.html";
	}
	
	//住宅登録画面//	
	
	@GetMapping("housing/hs2.html")
	public String gohs2t() {
		return "housing/hs2.html";
	}
	
	//my account//	
	
	@GetMapping("housing/my.html")
	public String gomy() {
		return "housing/my.html";
	}
  
}
