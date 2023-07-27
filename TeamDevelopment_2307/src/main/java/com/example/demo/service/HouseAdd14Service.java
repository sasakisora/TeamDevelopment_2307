package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.HouseAdd14Request;
import com.example.demo.entity.House;
import com.example.demo.repository.HouseAdd14Repository;

/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class HouseAdd14Service {
  /**
   * ユーザー情報 Repository
   */
  @Autowired
  private HouseAdd14Repository houseAdd14Repository;

  /**
   * ユーザー情報 全検索
   * @return 検索結果
   */
  public List<House> searchAll() {
    return houseAdd14Repository.findAll();
  }

  /**
   * ユーザー情報 新規登録
   * @param user ユーザー情報
   */
  public void create(HouseAdd14Request Request) {
    Date now = new Date();
    House house = new House();
    house.setName(Request.getName());
    house.setAddress(Request.getAddress());
    house.setLand_area(Request.getLand_area());
    house.setLayout(Request.getLayout());
    house.setAge(Request.getAge());
    house.setPrice(Request.getPrice());
    house.setCreateDate(now);
    house.setUpdateDate(now);
    houseAdd14Repository.save(house);
  }
}