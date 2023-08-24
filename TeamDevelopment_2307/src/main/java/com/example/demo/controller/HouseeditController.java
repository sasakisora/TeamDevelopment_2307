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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.HouseEntity;
import com.example.demo.form.HouseeditForm;
import com.example.demo.service.HouseeditService;

@SpringBootApplication

@Controller
public class HouseeditController {
  
    @Autowired
    private HouseeditService houseeditService;

    @GetMapping(value = "/housing/houseEdit/{id}")
    public String displayEdit(@PathVariable Long id, Model model) {
        HouseEntity houseEntity = houseeditService.findById(id);
        HouseeditForm houseeditForm = new HouseeditForm();
        houseeditForm.setName(houseEntity.getName());
        houseeditForm.setAddress(houseEntity.getAddress());
        houseeditForm.setLand_area(houseEntity.getLand_area());
        houseeditForm.setLayout(houseEntity.getLayout());
        houseeditForm.setAge(houseEntity.getAge());
        houseeditForm.setPrice(houseEntity.getPrice());
        model.addAttribute("HouseeditForm", houseeditForm);
        return "housing/houseEdit"; // houseEdit.htmlを表示
    }

    @RequestMapping(value = "/houseEdit/update",method = RequestMethod.POST)
    public String update(@Validated @ModelAttribute HouseeditForm houseeditForm, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<String> errorList = new ArrayList<String>();
            for (ObjectError error : result.getAllErrors()) {
                errorList.add(error.getDefaultMessage());
            }
            model.addAttribute("validationError", errorList);
            model.addAttribute("HouseeditForm", houseeditForm);
            return "housing/houseEdit"; // エラーがある場合は編集画面に戻る
        }

        houseeditService.update(houseeditForm);
        return "redirect:/housing/hsabiru"; // 成功時は一覧画面にリダイレクト
    }

    @GetMapping("/housing/{id}/delete")
    public String delete(@PathVariable Long id, Model model) {
        houseeditService.delete(id);
        return "redirect:/housing/hsabiru"; // リダイレクトすることをおすすめします
    }
}