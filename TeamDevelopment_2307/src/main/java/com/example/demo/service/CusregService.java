package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.CusregRequest;
import com.example.demo.entity.CusEntity;
import com.example.demo.repository.CusregRepository;

/**
 * 顧客情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CusregService {
    /**
     * 顧客情報 Repository
     */
    @Autowired
    private CusregRepository cusregRepository;

    public List<CusEntity> searchAll(){
    	return cusregRepository.findAll();
    }

    public void create(CusregRequest cusregRequest) {
    	Date now = new Date();
        CusEntity customers = new CusEntity();
        customers.setName(cusregRequest.getName());
        customers.setAddress(cusregRequest.getAddress());
        customers.setPhone(cusregRequest.getPhone());
        customers.setEmail(cusregRequest.getEmail());
        customers.setCreatedAt(now);
        customers.setUpdatedAt(now);
        cusregRepository.save(customers);
    }





}


