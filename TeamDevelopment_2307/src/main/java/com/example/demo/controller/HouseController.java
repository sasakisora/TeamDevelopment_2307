package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.House;
import com.example.demo.repository.HouseRepository;

@Controller
public class HouseController {
    @Autowired
    private HouseRepository houseRepository;

    @GetMapping("/hs")
    public String getAllHouses(Model model) {
        List<House> houses = houseRepository.findAll();
        model.addAttribute("houses", houses);
        return "hs";
    }

    @GetMapping("/search")
    public String searchHouses(@RequestParam("keyword") String keyword, Model model) {
        List<House> searchResults = houseRepository.findByKeyword(keyword);
        model.addAttribute("searchResults", searchResults);
        return "hs";
    }
}
