package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.HsEntity;
import com.example.demo.repository.HsRepository;

/**
 * ユーザー情報 Service
 */
@Service
public class HsService {
    /**
     * ユーザー情報 Repository
     */
    @Autowired
    private HsRepository hsRepository;

    /**
     * ユーザー情報 全検索
     * @return 検索結果
     */
    public List<HsEntity> searchAll() {
        return hsRepository.findAll();
    }

    /**
     * ユーザー情報 主キー検索
     * @return 検索結果
     */
    public HsEntity findById(Long id) {
        return hsRepository.findById(id).orElse(null);
    }

    /**
     * 名前または住所をキーワードとして部分一致検索
     * @param keyword 検索キーワード
     * @return 検索結果
     */
    public List<HsEntity> searchByNameOrAddress(String keyword) {
        return hsRepository.findByNameContainingIgnoreCaseOrAddressContainingIgnoreCase(keyword, keyword);
    }
    
 
}