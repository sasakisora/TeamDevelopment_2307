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

import com.example.demo.dto.HousngRequest14;
import com.example.demo.entity.HousingEntity14;
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
	 * ユーザー情報一覧画面を表示
	 * @param  model Model
	 * @return  ユーザー情報一覧画面のHTML
	 */
	//前回作成したものを使用する

//	/**
//	 * ユーザー新規登録画面を表示
//	 * @param  model Model
//	 * @return  ユーザー情報一覧画面
//	 */
//	@RequestMapping("/user/add")
//	public String displayAdd(Model model) {
//		//一行追加
//
//		return "user/add";
//	}

	/**
	 * ユーザー新規登録
	 * @param  userRequest リクエストデータ
	 * @param  model Model
	 * @return  ユーザー情報一覧画面
	 */
	@RequestMapping("/housing/create")
	public String create(//ここに追加 Model model) {
		//入力判定入れること
			model.addAttribute("validationError", errorList);

			// 入力チェックエラーの場合3行実装
			
　　　　　　　　//エラー判定後の画面遷移2行実装

		}
		// ユーザー情報の登録2行実装

			}
	/**
	 * ユーザー情報詳細画面を表示
	 * @param  id 表示するユーザーID
	 * @param  model Model
	 * @return  ユーザー情報詳細画面
	 */
	@GetMapping("/user/{id}")
	public String displayView(@PathVariable  Integer id, Model model) {
		return "user/view";

	}