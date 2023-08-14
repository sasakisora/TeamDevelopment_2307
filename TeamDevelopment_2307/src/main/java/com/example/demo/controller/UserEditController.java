package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.UserEditEntity;
import com.example.demo.form.UserRequestS7;
import com.example.demo.service.UserServiceS7;

/**
 * ユーザー情報 Controller
 */
@Controller
public class UserEditController {
  /**
   * ユーザー情報 Service
   */
  @Autowired
  private UserServiceS7 userServiceS4;
  
  
//  他のページへ遷移
//  @GetMapping(value = "/housing/test")
//  public String displayAdd(Model model) {
//    return "housing/test";
//  }
  
	/**
   * ユーザー編集画面を表示
   * @param  id 表示するユーザーID
   * @param  model Model
   * @return  ユーザー編集画面
   */
  @GetMapping("/housing/UserEdDelS4/{id}")
  public String displayEdit(@PathVariable  Long id, Model model) {
	UserEditEntity userEdDelEntity = userServiceS4.findById(id);
	UserRequestS7 userRequestS4 = new UserRequestS7();
	userRequestS4.setId(userEdDelEntity.getId());
    userRequestS4.setUsername(userEdDelEntity.getUsername());
    userRequestS4.setPassword(userEdDelEntity.getPassword());
    model.addAttribute("UserRequestS4", userRequestS4);

    return "housing/UserEdDelS4";
    
  }
  
  @RequestMapping(value = "/UserEdDelS4/update", method = RequestMethod.POST) 
  public String update(@Validated  @ModelAttribute UserRequestS7 userRequestS4 , BindingResult result ,Model model) {
  if (result.hasErrors()) {
        List<String> errorList = new ArrayList<String>();
        for (ObjectError error : result.getAllErrors()) {
            errorList.add(error.getDefaultMessage());
        }
        model.addAttribute("validationError", errorList);
        model.addAttribute("UserRequestS4", userRequestS4);
	  return "/housing/UserEdDelS4";			  
  }
  
  userServiceS4.update(userRequestS4);
//  return "/housing/test";
  return "/housing/menu";
  
  }
  

  @GetMapping("/UserEdDelS4/{id}/delete")
  public String delete(@PathVariable Long id, Model model)  {
	  userServiceS4.delete(id);
      return "/housing/menu";
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

  

	  