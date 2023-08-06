package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.HouseEntity;
import com.example.demo.repository.HouseeditRepository;

/**
 * ユーザー情報 Service
 */
@Service
public class HouseeditService {

    /**
     * ユーザー情報 Repository
     */
    @Autowired
    HouseeditRepository houseeditRepository;

    public List<HouseEntity> searchAll() {
        // ユーザーTBLの内容を全検索
        return houseeditRepository.findAll();
    }
}