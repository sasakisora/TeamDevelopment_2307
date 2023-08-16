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
  private UserServiceS7 userServiceS7;
  
  
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
  @GetMapping("/housing/UserEdit/{id}")
  public String displayEdit(@PathVariable  Long id, Model model) {
	UserEditEntity userEdDelEntity = userServiceS7.findById(id);
	UserRequestS7 userRequestS7= new UserRequestS7();
	userRequestS7.setId(userEdDelEntity.getId());
    userRequestS7.setUsername(userEdDelEntity.getUsername());
    userRequestS7.setPassword(userEdDelEntity.getPassword());
    model.addAttribute("UserRequestS7", userRequestS7);

    return "housing/UserEdit";
    
  }
  
  @RequestMapping(value = "/UserEdit/update", method = RequestMethod.POST) 
  public String update(@Validated  @ModelAttribute UserRequestS7 userRequestS7 , BindingResult result ,Model model) {
  if (result.hasErrors()) {
        List<String> errorList = new ArrayList<String>();
        for (ObjectError error : result.getAllErrors()) {
            errorList.add(error.getDefaultMessage());
        }
        model.addAttribute("validationError", errorList);
        model.addAttribute("UserRequestS7", userRequestS7);
	  return "/housing/UserEdit";			  
  }
  
  userServiceS7.update(userRequestS7);
//  return "/housing/test";
  return "/housing/menu";
  
  }
  

  @GetMapping("/UserEdit/{id}/delete")
  public String delete(@PathVariable Long id, Model model)  {
	  userServiceS7.delete(id);
      return "/housing/menu";
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

  

	  