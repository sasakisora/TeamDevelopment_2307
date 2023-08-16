package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.UserSearchEntity;
import com.example.demo.form.UserSearchForm;
import com.example.demo.service.UserSearchService;

@Controller
public class UserSearchController {

    @Autowired
    UserSearchService userService;

    @GetMapping(value = "/housing/imaiuser/list")
    public String displayList(Model model) {
        List<UserSearchEntity> userlist = userService.searchAll();
        model.addAttribute("userlist", userlist);
        return "housing/imaiuser";
    }

    @GetMapping(value = "/housing/imaiuser")
    public String displayListPage(@ModelAttribute("searchForm") UserSearchForm userSearchForm, Model model) {
        String keyword = userSearchForm.getKeyword();
        List<UserSearchEntity> userlist;
        if (keyword != null && !keyword.isEmpty()) {
            userlist = userService.searchByNameOrAddress(keyword);
        } else {
            userlist = userService.searchAll();
        }
        model.addAttribute("userlist", userlist);
        return "housing/imaiuser";
    }


    @PostMapping(value = "/housing/imaiuser/search")
public String performSearch(@ModelAttribute("searchForm") UserSearchForm userSearchForm, Model model) {
    String keyword = userSearchForm.getKeyword();
    List<UserSearchEntity> userlist;
    if (keyword != null && !keyword.isEmpty()) {
        userlist = userService.searchByNameOrAddress(keyword);
    } else {
        userlist = userService.searchAll();
    }
    model.addAttribute("userlist", userlist);
    return "housing/imaiuser";
}
}