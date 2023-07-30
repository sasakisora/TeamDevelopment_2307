package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.CusEntity;
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
	     * ユーザー情報一覧画面を表示
	     * @param  model Model
	     * @return  ユーザー情報一覧画面のHTML
	     */
	    @GetMapping("housing/CustomerEdit")
	  	public String displayList(Model model) {

	        List<CusEntity> housingCustomerEdit = cusService.searchAll();
	        model.addAttribute("housingCustomerEdit", housingCustomerEdit);
	        return "housing/CustomerEdit";
	      }	
	    
		/**
		   * ユーザー編集画面を表示
		   * @param  id 表示するユーザーID
		   * @param  model Model
		   * @return  ユーザー編集画面
		   */
		  @GetMapping("housing/CustomerEdit/{id}/edit")
		  public String displayEdit(@PathVariable  Integer id, Model model) {
			CusEntity user = cusService.findById(id);
		    CusUpdateRequest userUpdateRequest = new UserUpdateRequest();
		 //実装5行

		    return "user/edit";
		  }
	    
	    
	    
		  /**
		   * ユーザー更新
		   * @param  userRequest リクエストデータ
		   * @param  model Model
		   * @return  ユーザー情報詳細画面
		   */
		  @RequestMapping("/user/update")
		  public String update(@Validated  @ModelAttribute  UserUpdateRequest userUpdateRequest, BindingResult result, Model model) {
		    if (result.hasErrors()) {
		      List<String> errorList = new ArrayList<String>();
		      for (ObjectError error : result.getAllErrors()) {
		        errorList.add(error.getDefaultMessage());
		      }
		      model.addAttribute("validationError", errorList);
		      return "user/edit";
		    }
	    
	    
		    // ユーザー情報の更新
		    userService.update.ここに追加
		    return String.format("redirect:/user/%d", userUpdateRequest.getId());
		  }
	    
	    
	    
	

	  	  
  }