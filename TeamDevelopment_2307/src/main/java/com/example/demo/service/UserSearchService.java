package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserSearchEntity;
import com.example.demo.repository.UserSearchRepository;

/**
 * ユーザー情報 Service
 */
@Service
public class UserSearchService {
    /**
     * ユーザー情報 Repository
     */
    @Autowired
    private UserSearchRepository userRepository;

    /**
     * ユーザー情報 全検索
     * @return 検索結果
     */
    public List<UserSearchEntity> searchAll() {
        return userRepository.findAll();
    }

    /**
     * ユーザー情報 主キー検索
     * @return 検索結果
     */
    public UserSearchEntity findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    /**
     * 名前または住所をキーワードとして部分一致検索
     * @param keyword 検索キーワード
     * @return 検索結果
     */
    public List<UserSearchEntity> searchByNameOrAddress(String keyword) {
        return userRepository.findByNameContainingIgnoreCaseOrAddressContainingIgnoreCase(keyword, keyword);
    }
}