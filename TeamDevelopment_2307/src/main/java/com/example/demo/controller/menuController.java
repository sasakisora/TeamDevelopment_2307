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
	
	@GetMapping(value = "/housing/logout")
	public String gologout() {
		return "housing/logout";
	}
	
	//顧客一覧画面//	
	
	@GetMapping(value ="/housing/customerlist")
	public String gocustomerlist() {
		return "housing/customerlist";
	}
	
	//住宅一覧画面//	
	
	@GetMapping(value="/housing/houseseach")
	public String gohs1() {
		return "housing/houseseach";
	}
	
	//住宅登録画面//	
	
	@GetMapping(value="/housing/housingregistration")
	public String gohs2t() {
		return "housing/housingregistration";
	}
	
	//my account//	
	
	@GetMapping(value="/housing/myaccount")
	public String gomy() {
		return "housing/myaccount";
	}
  
}
