//package com.example.demo.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.entity.House;
//import com.example.demo.repository.HouseRepository;
//
//
///**
// * ユーザー情報 Service
// */
//@Service
//public class HouseService {
//    /**
//     * ユーザー情報 Repository
//     */
//    @Autowired
//    private HouseRepository houseRepository;
//
//    /**
//     * ユーザー情報 全検索
//     * @return 検索結果
//     */
//    public List<House> searchAll() {
//        return houseRepository.findAll();
//    }
//
//    /**
//     * ユーザー情報 主キー検索
//     * @return 検索結果
//     */
//    public House findById(Long id) {
//        return houseRepository.findById(id).orElse(null);
//    }
//
//    /**
//     * 名前または住所をキーワードとして部分一致検索
//     * @param keyword 検索キーワード
//     * @return 検索結果
//     */
//    public List<House> searchByNameOrAddress(String keyword) {
//        return houseRepository.findByNameContainingIgnoreCaseOrAddressContainingIgnoreCase(keyword, keyword);
//    }
//    
// 
//}