package com.example.demo.controller;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//import com.example.demo.entity.CusDetEntity;
//import com.example.demo.service.CusDetService;

@SpringBootApplication
@Controller
public class CusDetController {

//	@Autowired
//	private CusDetService cusdetService;
	

	@GetMapping(value="housing/CustomerDetailsS09/{id}", params="id=1")
	public String display(@PathVariable("id") Long id, Model model) {
//		CusDetEntity cusentity = cusdetService.findById(id);
//		model.addAttribute("cusData", cusentity);
		return "housing/CustomerDetailsS09";
	  }

	
	
}

