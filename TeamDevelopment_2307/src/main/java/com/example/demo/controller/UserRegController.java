package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.UserRegRequest;
import com.example.demo.service.UserService;



/**
 * ユーザー情報 Controller
 */
@Controller
public class UserRegController {

	/**
	 * ユーザー情報 Service
	 */
	@Autowired
	UserService userService;

	/**
	 * ユーザー新規登録画面を表示
	 * @param  model Model
	 * @return  ユーザー情報一覧画面
	 */
	@RequestMapping("/user/add")
	public String displayAdd(Model model) {
		model.addAttribute("userRequest", new UserRegRequest());

		return "user/add";
	}

	/**
	 * ユーザー新規登録
	 * @param  userRequest リクエストデータ
	 * @param  model Model
	 * @return  ユーザー情報一覧画面
	 */
	@RequestMapping("/user/create")
	public String create(@Validated @ModelAttribute UserRegRequest userRequest, BindingResult result, Model model) {
		 List<String> errorList = new ArrayList<String>();
	      for (ObjectError error : result.getAllErrors()) {
	        errorList.add(error.getDefaultMessage());
		}
		// ユーザー情報の登録
	      model.addAttribute("validationError", errorList);
	      return "user/add";

			}
	
	}