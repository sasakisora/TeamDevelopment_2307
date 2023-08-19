package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.HsEntity;
import com.example.demo.form.HsForm;
import com.example.demo.service.HsService;

@Controller
public class HsController {

	@Autowired
	HsService hsService;

	@GetMapping(value = "/housing/hsabiru")
	public String displayHouseList(Model model) {
		List<HsEntity> houselist = hsService.searchAll();
		model.addAttribute("houselist", houselist);
		return "housing/hsabiru";
	}

	@GetMapping(value = "/housing/hsabiru-page")
	public String displayHouseListPage(@ModelAttribute("searchForm") HsForm houseSearchForm, Model model) {
	    String keyword = houseSearchForm.getKeyword();
	    // 検索処理や結果の取得
	    List<HsEntity> houselist;
	    if (keyword != null && !keyword.isEmpty()) {
	        houselist = hsService.searchByNameOrAddress(keyword);
	    } else {
	        houselist = hsService.searchAll();
	    }
	    model.addAttribute("houselist", houselist);
	    return "housing/hsabiru";
	    }

	@PostMapping(value = "/housing/hsabiru-search")
	public String performHouseSearch(@ModelAttribute("searchForm") HsForm houseSearchForm, Model model) {
	    String keyword = houseSearchForm.getKeyword();
	    List<HsEntity> houselist;
	    if (keyword != null && !keyword.isEmpty()) {
	        houselist = hsService.searchByNameOrAddress(keyword);
	    } else {
	        houselist = hsService.searchAll();
	    }
	    model.addAttribute("houselist", houselist);
	    return "housing/hsabiru";  
	}

	

}