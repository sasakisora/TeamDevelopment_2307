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

import com.example.demo.dto.CusregRequest;
import com.example.demo.entity.CusEntity;
import com.example.demo.service.CusregService;


@SpringBootApplication
@Controller
public class CusregController {

    @Autowired
    private CusregService cusregService;


    
    
    /**
     * 顧客一覧情報画面を表示
     * @param model Model
     * @return 顧客情報一覧画面
     */
    @GetMapping(value = "/housing/imaiuser")
    public String display(Model model) {
    	List<CusEntity> imaiuser = cusregService.searchAll();
  	model.addAttribute("imaiuser", imaiuser);
      return "housing/imaiuser";
    }
    
    /**
     * ユーザー新規登録画面を表示
     * @param model Model
     * @return ユーザー情報一覧画面
     */
    @GetMapping(value = "/housing/cusreg")
    public String displayAdd(Model model) {
      model.addAttribute("CusregRequest", new CusregRequest());
      return "housing/cusreg";
    }
    
    
    /**
     * customers新規登録
     * @param Request リクエストデータ
     * @param model Model
     */
    @RequestMapping(value = "/CusEntity/create", method = RequestMethod.POST)
    public String create(@Validated @ModelAttribute CusregRequest cusregRequest, BindingResult result, Model model) {
      if (result.hasErrors()) {
        // 入力チェックエラーの場合
        List<String> errorList = new ArrayList<String>();
        for (ObjectError error : result.getAllErrors()) {
          errorList.add(error.getDefaultMessage());
        }
        model.addAttribute("validationError", errorList);
        model.addAttribute("CusregRequest", cusregRequest);
        return "housing/cusreg";
      }
      // house情報の登録
      cusregService.create(cusregRequest);
      return "redirect:housing/cusreg";
    }

}

