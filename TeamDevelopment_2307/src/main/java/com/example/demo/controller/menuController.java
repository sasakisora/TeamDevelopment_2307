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
  /**
   * ユーザー情報 Service
   */
  /**
   * ユーザー情報一覧画面を表示
   * @param model Model
   * @return ユーザー情報一覧画面のHTML
   */
  @RequestMapping(value = "housing/menu", method = RequestMethod.GET)
  public String displayList(Model model) {
    return "housing/menu";
  }
}
