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

import com.example.demo.dto.CusUpdateRequest;
import com.example.demo.entity.CusEntity;
import com.example.demo.service.CusService;


@SpringBootApplication
/**
 * ユーザー情報 Controller
 */
@Controller
public class CusController {
	
	@Autowired
	private CusService customerService;
	    /**
	     * ユーザー情報一覧画面を表示
	     * @param  model Model
	     * @return  ユーザー情報一覧画面のHTML
	     */
	    @GetMapping("housing/CustomerEdit")
	  	public String displayList(Model model) {

	        List<CusEntity> housingCustomerEdit = customerService.searchAll();
	        model.addAttribute("housingCustomerEdit", housingCustomerEdit);
	        return "housing/CustomerEdit";
	      }	

	
	/**
	   * ユーザー編集画面を表示
	   * @param  id 表示するユーザーID
	   * @param  model Model
	   * @return  ユーザー編集画面
	   */
	  @GetMapping("/housing/{id}/CustomerEdit")
	  public String displayEdit(@PathVariable  Long id, Model model) {
		CusEntity user = customerService.findById(id);
	    CusUpdateRequest cusUpdateRequest = new CusUpdateRequest();
	 //実装5行
	    cusUpdateRequest.setId(user.getId());
	    cusUpdateRequest.setName(user.getName());
	    cusUpdateRequest.setPhone(user.getPhone());
	    cusUpdateRequest.setAddress(user.getAddress());
	    model.addAttribute("userUpdateRequest", cusUpdateRequest);	       
	    return "housing/CustomerEdit";
	  }
	  /**
	   * ユーザー更新
	   * @param  userRequest リクエストデータ
	   * @param  model Model
	   * @return  ユーザー情報詳細画面
	   */
	  @GetMapping("/housing/update")
	  public String update(@Validated  @ModelAttribute  CusUpdateRequest userUpdateRequest, BindingResult result, Model model) {
	    if (result.hasErrors()) {
	      List<String> errorList = new ArrayList<String>();
	      for (ObjectError error : result.getAllErrors()) {
	        errorList.add(error.getDefaultMessage());
	      }
	      model.addAttribute("validationError", errorList);
	      return "housing/CustomerEdit";
	    }
	    // ユーザー情報の更新
	    customerService.update(userUpdateRequest);
	    return String.format("redirect:/housing/%d", userUpdateRequest.getId());
	  }
	  	  
  }