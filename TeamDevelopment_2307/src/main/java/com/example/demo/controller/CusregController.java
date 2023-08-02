package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.CusregRequest;
import com.example.demo.entity.CusEntity;
import com.example.demo.service.CusregService;

@Controller
public class CusregController {

    @Autowired
    CusregService cusregService;

    // 以下のコードをそのまま追加します。
    // 顧客登録フォームを表示するためのGETリクエストを処理します。
    @GetMapping("/housing/cusadd")
    public String displayAdd(Model model) {
        model.addAttribute("cusregRequest", new CusregRequest());
        return "housing/cusadd";
    }

    // 顧客情報を登録するためのPOSTリクエストを処理します。
    @PostMapping("/housing/cuscreate")
    public String createCus(@Validated @ModelAttribute("cusregRequest") CusregRequest cusregRequest, BindingResult bindingResult, Model model) {
        // 入力チェック
        if (bindingResult.hasErrors()) {
            // 入力エラーがある場合は、再度新規登録画面を表示する
            return "housing/cusadd";
        }

        // 顧客情報の登録
        cusregService.createCus(cusregRequest);

        // 登録後、ユーザー一覧画面にリダイレクトする
        return "redirect:/housing/cuslist";
    }

    // 以下のコードをそのまま追加します。
    // 顧客情報一覧画面を表示するためのGETリクエストを処理します。
    @GetMapping("/housing/cuslist")
    public String displayUserList(Model model) {
        // 顧客情報の一覧を取得し、Viewに渡す
        List<CusEntity> cuslist = cusregService.getAllUsers();
        model.addAttribute("cusList", cuslist);
        return "housing/cuslist";
    }
}
