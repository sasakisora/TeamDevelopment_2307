package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.UserAdd03Request;
import com.example.demo.entity.UserAdd03;
import com.example.demo.repository.UserAdd03Repository;

/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserAdd03Service {
  /**
   * ユーザー情報 Repository
   */
  @Autowired
  private UserAdd03Repository userAdd03Repository;

  /**
   * ユーザー情報 全検索t 
   * @return 検索結果
   */
  public List<UserAdd03> searchAll() {
    return userAdd03Repository.findAll();
  }

  /**
   * ユーザー情報 新規登録
   * @param user ユーザー情報
   */
  public void create(UserAdd03Request userAdd03request) {
    Date now = new Date();
    UserAdd03 userAdd03 = new UserAdd03();
    
	userAdd03.setUsername(userAdd03request.getUsername());
    userAdd03.setPassword(userAdd03request.getPassword());
    userAdd03.setCreateDate(now);
    userAdd03.setUpdateDate(now);
    userAdd03Repository.save(userAdd03);
  }
}