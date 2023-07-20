package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.config.HousingRequest14;
import com.example.demo.service.HousingService14;



/**
 * ユーザー情報 Controller
 */
@Controller
public class HousingController14 {

	/**
	 * ユーザー情報 Service
	 */
	@Autowired
	HousingService14 housingService14;

	/**
	 * 住宅登録管理画面
	 * @param  HousingRequest14 リクエストデータ
	 * @param  model Model
	 * @return  住宅登録管理画面
	 */
	@RequestMapping("/housing/houseRegistration14")
	public String create(@Validated HousingRequest14 housingRequest14, BindingResult bindingResult, Model model) {
		//入力判定入れること
		if (bindingResult.hasErrors()) {
	        // エラーメッセージをModelにセット
	        model.addAttribute("errors",bindingResult.getAllErrors());
            return "housing/houseRegistration14"; //同一ページでエラー表示
		}
		// ユーザー情報の登録2行実装
        model.addAttribute("housingRequest14", housingRequest14);
        return "housing/houseRegistration14"; // 成功ページに遷移（現ページにとどまる）
     }
}
