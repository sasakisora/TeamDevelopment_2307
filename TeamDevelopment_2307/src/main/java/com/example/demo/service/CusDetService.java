package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CusDetEntity;
import com.example.demo.repository.CusDetRepository;

/**
 * ユーザー情報 Service
 */
@Service
public class CusDetService {
  /**
   * ユーザー情報 Repository
   */
  @Autowired
  private CusDetRepository cusdetRepository;

  /**
   * ユーザー情報 全検索
   * @return 検索結果
   */
  public List<CusDetEntity> searchAll() {
    return cusdetRepository.findAll();
  }

  /**
   * ユーザー情報 主キー検索
   * @return 検索結果
   */
  public CusDetEntity findById(Long id) {
    return cusdetRepository.findById(id).get();
  }
}