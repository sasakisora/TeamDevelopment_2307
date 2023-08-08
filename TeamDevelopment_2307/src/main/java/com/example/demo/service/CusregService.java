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

    public CusEntity findById(Long id) {
        return cusregRepository.findById(id).orElse(null);
    }

    public void createCus(CusregRequest cusregRequest) {
        CusEntity customers = new CusEntity();
        customers.setName(cusregRequest.getName());
        customers.setAddress(cusregRequest.getAddress());
        customers.setPhone(cusregRequest.getPhone());
        cusregRepository.save(customers);
    }

    public List<CusEntity> getAllCustomers() {
        return cusregRepository.findAll();
    }

    /**
     * 顧客情報 主キー検索
     * @return  検索結果
     */
    public CusEntity getCustomerById(Long id) {
        return cusregRepository.findById(id).orElse(null);
    }
    
    /**
     * 顧客情報 新規登録
     * @param  cusregRequest 顧客情報
     */
    public void create(CusregRequest cusregRequest) {
        Date now = new Date();
        CusEntity customers = new CusEntity();
        customers.setName(cusregRequest.getName());
        customers.setAddress(cusregRequest.getAddress());
        customers.setPhone(cusregRequest.getPhone());
        customers.setCreateDate(now);
        cusregRepository.save(customers);
    }
}


