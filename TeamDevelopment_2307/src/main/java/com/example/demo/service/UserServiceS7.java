package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.UserEditEntity;
import com.example.demo.form.UserRequestS7;
import com.example.demo.repository.UserRepositoryS7;



/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceS7 {
  /**
   * ユーザー情報 Repository
   */
  @Autowired
  private UserRepositoryS7 userRepositoryS4;

  /**
   * ユーザー情報 全検索
   * @return 検索結果
   */
  public List<UserEditEntity> searchAll() {
   return userRepositoryS4.findAll();
  }

 public UserEditEntity findById(Long id) {
 	   return userRepositoryS4.findById(id).get();
 }

  /**
   * ユーザー情報 新規登録
   * @param user ユーザー情報
   */
  public void update(UserRequestS7 userRequest) {
    Date now = new Date();
    UserEditEntity userEdDelEntity = new UserEditEntity();
    userEdDelEntity.setId(userRequest.getId());
    userEdDelEntity.setUsername(userRequest.getUsername());
    userEdDelEntity.setPassword(userRequest.getPassword());
    userEdDelEntity.setCreatedAt(now);
    userEdDelEntity.setUpdatedAt(now);
    userRepositoryS4.save(userEdDelEntity);
  }
  
  public void delete(Long id) {
	  UserEditEntity userEdDelEntity = findById(id);
	  userRepositoryS4.delete(userEdDelEntity);
  }
  
  
  
  
  
}