package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
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
	@RequestMapping("/housing/houseResistration14")
	public String create(@Validated HousingRequest14 housingRequest14, BindingResult bindingResult, Model model) {
		//入力判定入れること
		if (bindingResult.hasErrors()) {
            // バリデーションエラーがある場合の処理
		     // エラーメッセージを取得
	        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
	        // エラーメッセージをModelにセット
	        model.addAttribute("errors", fieldErrors);
            return "housingRequest14"; // エラー表示
		}
		// ユーザー情報の登録2行実装
        model.addAttribute("housingRequest14", housingRequest14);
        return "houseResistration14"; // 成功ページに遷移（現ページにとどまる）
     }
}
