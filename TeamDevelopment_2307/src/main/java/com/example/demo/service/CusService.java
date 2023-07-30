package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.CusEntity;
import com.example.demo.repository.CusRepository;

/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CusService {
  /**
   * ユーザー情報 Repository
   */
  @Autowired
  private CusRepository cusRepository;

  /**
   * ユーザー情報 全検索
   * @return 検索結果
   */
  public List<CusEntity> searchAll() {
    return cusRepository.findAll();
  }

  /**
   * ユーザー情報 主キー検索
   * @return 検索結果
   */
  public CusEntity findById(Long id) {
    return cusRepository.findById(id).get();
  }
  
  public void delete(Long id) {
	  cusRepository.deleteById(id);
  }
  

  /**
   * ユーザー情報 更新
   * @param user ユーザー情報
   */
//  public void update(CusUpdateRequest userUpdateRequest) {
//	  
//	CusEntity user = findById(userUpdateRequest.getId());
//    user.setAddress(userUpdateRequest.getAddress());
//    user.setName(userUpdateRequest.getName());
//    user.setPhone(userUpdateRequest.getPhone());
//    user.setUpdatedAt(new Date(0));
//    userRepository.save(user);
//  }
}