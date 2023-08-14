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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.CusEntity;
import com.example.demo.form.CusEditForm;
import com.example.demo.service.CusService;


@SpringBootApplication
/**
 * ユーザー情報 Controller
 */
@Controller
public class CusController {
	
	@Autowired
	private CusService cusService;


	
	
	
	
	    
		/**
		   * ユーザー編集画面を表示
		   * @param  id 表示するユーザーID
		   * @param  model Model
		   * @return  ユーザー編集画面
		   */
		  @GetMapping("/housing/CustomerEdit/{id}")
		  public String displayEdit(@PathVariable  Long id, Model model) {
			CusEntity cusEntitiy = cusService.findById(id);
			CusEditForm cusEditForm = new CusEditForm();
			cusEditForm.setId(cusEntitiy.getId());
			cusEditForm.setName(cusEntitiy.getName());
			cusEditForm.setAddress(cusEntitiy.getAddress());
			cusEditForm.setPhone(cusEntitiy.getPhone());
			cusEditForm.setEmail(cusEntitiy.getEmail());
		    model.addAttribute("CusEditForm", cusEditForm);		    
		    return "housing/CustomerEdit";
		  }
	    
	    
		  
		  

		  @RequestMapping(value = "/CustomerEdit/update", method = RequestMethod.POST) 
		  public String update(@Validated  @ModelAttribute CusEditForm cusEditForm , BindingResult result ,Model model) {
		  if (result.hasErrors()) {
	            List<String> errorList = new ArrayList<String>();
	            for (ObjectError error : result.getAllErrors()) {
	                errorList.add(error.getDefaultMessage());
	            }
	            model.addAttribute("validationError", errorList);
	            model.addAttribute("CusEditForm", cusEditForm);
			  return "/housing/CustomerEdit";			  
		  }
		  
		  cusService.update(cusEditForm);
		  return "/housing/CustomerDetailsS09";
		  
		  }
		 

		  
		  @GetMapping("/housing/{id}/delete")
		  public String delete(@PathVariable Long id, Model model) {
		    // ユーザー情報の削除
		    cusService.delete(id);
		    return "/housing/CustomerDetailsS09";
		  }
	
		  
     
		  
		  
		  
		  
		  
		  

	    
	    
	    
	

	  	  
  }