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

import com.example.demo.dto.HouseAdd14Request;
import com.example.demo.entity.House;
import com.example.demo.service.HouseAdd14Service;

@SpringBootApplication
/**
 * hause情報 Controller
 */
@Controller
public class HouseAdd14Controller {

  /**
   * hause情報 Service
   */
  @Autowired
  private HouseAdd14Service houseAdd14Service;

  /**
   * hause情報一覧画面を表示
   * @param model Model
   * @return hause情報一覧画面
   */
  @GetMapping(value = "/housing/list")
  public String displayList(Model model) {
	List<House> houselist = houseAdd14Service.searchAll();
    model.addAttribute("houselist", houselist);
    return "housing/list";
  }

  /**
   * hause新規登録画面を表示
   * @param model Model
   * @return hause情報一覧画面
   */
  @GetMapping(value = "/housing/houseAdd14")
  public String displayAdd(Model model) {
	model.addAttribute("HouseAdd14Request", new HouseAdd14Request());
    return "housing/houseAdd14";
  }

  /**
   * hause新規登録
   * @param Request リクエストデータ
   * @param model Model
   * @return hause情報一覧画面
   */
  @RequestMapping(value = "/house/create", method = RequestMethod.POST)
  public String create(@Validated @ModelAttribute HouseAdd14Request houseAdd14Request, BindingResult result, Model model) {

    if (result.hasErrors()) {
      // 入力チェックエラーの場合
      List<String> errorList = new ArrayList<String>();
      for (ObjectError error : result.getAllErrors()) {
        errorList.add(error.getDefaultMessage());
      }
      model.addAttribute("validationError", errorList);
      model.addAttribute("HouseAdd14Request", houseAdd14Request);
      return "housing/houseAdd14";
    }
    // ユーザー情報の登録
    houseAdd14Service.create(houseAdd14Request);
    return "redirect:/housing/houseAdd14";
  }

  /**
   * ユーザー情報詳細画面を表示
   * @param id 表示するユーザーID
   * @param model Model
   * @return ユーザー情報詳細画面
//   */
//  @GetMapping("/user/{id}")
//  public String displayView(@PathVariable Long id, Model model) {
//    return "user/view";
//  }
}