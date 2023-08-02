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
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.housesearchEntity;
import com.example.demo.repository.housesearchRepository;
import com.example.demo.service.housesearchService;


@Controller

public class housesearchController {
	
	/**
	 * ユーザー情報 Service
	 */
	@Autowired
	 private housesearchService housesearchService;
	
	@GetMapping(value ="")
	public String displayList(Model model) {
	  List<housesearchEntity> housinghousesearch =housesearchService.searchAll();
	    model.addAttribute("housinghousesearch", housinghousesearch);
	    return "housing/housesearch";}

	 @PostMapping("housing/housesearch")
	  public String create(@Validated @ModelAttribute housesearchRepository housesearchRequest, BindingResult result, Model model) {

	if (result.hasErrors()) {
		      // 入力チェックエラーの場合
		      List<String> errorList = new ArrayList<String>();
		      for (ObjectError error : result.getAllErrors()) {
		        errorList.add(error.getDefaultMessage());
		      }
		      model.addAttribute("validationError", errorList);
		      model.addAttribute("housesearchRequest", housesearchRequest);
		      return "housing/housesearch";
		    }
	return null;

	}}