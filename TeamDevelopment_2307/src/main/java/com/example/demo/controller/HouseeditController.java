package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.config.HouseeditRequest;
import com.example.demo.service.HouseeditService;



/**
 * ユーザー情報 Controller
 */
@Controller
public class HouseeditController {

	/**
	 * ユーザー情報 Service
	 */
	@Autowired
	HouseeditService houseeditService;

	/**
	 * 住宅登録管理画面
	 * @param  HouseeditRequest リクエストデータ
	 * @param  model Model
	 * @return  住宅登録管理画面
	 */
	@RequestMapping("/housing/houseeditResistration")
	public String create(@Validated HouseeditRequest houseeditRequest, BindingResult bindingResult, Model model) {
		//入力判定入れること
		if (bindingResult.hasErrors()) {
            // バリデーションエラーがある場合の処理
		     // エラーメッセージを取得
	        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
	        // エラーメッセージをModelにセット
	        model.addAttribute("errors", fieldErrors);
            return "houseeditRequest"; // エラー表示
		}
		// ユーザー情報の登録2行実装
        model.addAttribute("houseeditRequest", houseeditRequest);
        return "houseeditResistration"; // 成功ページに遷移（現ページにとどまる）
     }
}