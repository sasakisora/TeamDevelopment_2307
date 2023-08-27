package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * ユーザー情報 Controller
 */
@Controller
public class menuController {
 
  @RequestMapping(value = "housing/menu", method = RequestMethod.GET)
  public String displayList(Model model) {
    return "housing/menu";
  }
  
}