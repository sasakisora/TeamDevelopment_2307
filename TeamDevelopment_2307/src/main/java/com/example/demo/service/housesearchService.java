package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.housesearchEntity;
import com.example.demo.repository.housesearchRepository;
/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class housesearchService {
  /**
   * ユーザー情報 Repository
   */
  @Autowired
  private housesearchRepository housesearchRepository;
  /**
   * ユーザー情報 全検索
   * @return 検索結果
   */
  public List<housesearchEntity> searchAll() {
    return housesearchRepository.findAll();
  }
  /**
   * ユーザー情報 新規登録
   * @param user ユーザー情報
   */
  public void create(com.example.demo.repository.housesearchRepository housesearchRequest) {
    Date now = new Date();
    housesearchEntity user = new housesearchEntity();
    user.setId11(((housesearchEntity) housesearchRequest).getId11());
    user.setName(((housesearchEntity) housesearchRequest).getName());
    user.setLand_area(((housesearchEntity) housesearchRequest).getLand_area());
    user.setLayout(((housesearchEntity) housesearchRequest).getLayout());
    user.setAge(((housesearchEntity) housesearchRequest).getAge());
    user.setPrice(((housesearchEntity) housesearchRequest).getPrice());
    user.setAddress(((housesearchEntity) housesearchRequest).getAddress());
    user.setUpdateDate((java.sql.Date) now);
    user.setCreateDate((java.sql.Date) now);
    housesearchRepository.save(user);
  }
}