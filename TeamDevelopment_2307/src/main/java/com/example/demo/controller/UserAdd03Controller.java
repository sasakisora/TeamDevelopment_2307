package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.UserAdd03Request;
import com.example.demo.entity.UserAdd03;
import com.example.demo.service.UserAdd03Service;

@SpringBootApplication
/**
 * hause情報 Controller
 */
@Controller
public class UserAdd03Controller {

  /**
   * hause情報 Service
   */
  @Autowired
  private UserAdd03Service userAdd03Service;
  
  /**
   * ログイン画面を表示
   * @param model Model
   * @return ログイン画面
   */
  @GetMapping(value = "/housing/list")
  public String displayList(Model model) {
	List<UserAdd03> list = userAdd03Service.searchAll();
    model.addAttribute("list", list);
    return "housing/list";
  }


  /**
   * ユーザー新規登録画面を表示
   * @param model Model
   * @return ユーザー新規登録画面
   */
  @GetMapping(value = "/housing/userAdd03")
  public String displayAdd(Model model) {
	model.addAttribute("UserAdd03Request", new UserAdd03Request());
    return "housing/houseAdd14";
  }

  /**
   * ユーザー新規登録
   * @param Request リクエストデータ
   * @param model Model
   */
  @RequestMapping(value = "/userAdd03/create", method = RequestMethod.POST)
  public String create(@Validated @ModelAttribute UserAdd03Request userAdd03Request, BindingResult result, Model model) {
    if (result.hasErrors()) {
      // 入力チェックエラーの場合
      List<String> errorList = new ArrayList<String>();
      for (ObjectError error : result.getAllErrors()) {
        errorList.add(error.getDefaultMessage());
      }
      model.addAttribute("validationError", errorList);
      model.addAttribute("UserAdd03Request", userAdd03Request);
      return "housing/userAdd03";
    }
    // ユーザー情報の登録
    userAdd03Service.create(userAdd03Request);
    return "redirect:/housing/userAdd03";
  }
  

}