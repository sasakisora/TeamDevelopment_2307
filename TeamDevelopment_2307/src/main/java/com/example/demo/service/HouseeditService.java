package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.HouseEntity;
import com.example.demo.form.HouseeditForm;
import com.example.demo.repository.HouseeditRepository;

/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class HouseeditService {
 
  @Autowired
  private HouseeditRepository houseeditRepository;


  public List<HouseEntity> searchAll() {
    return houseeditRepository.findAll();
  }


  public HouseEntity findById(Long id) {
    return houseeditRepository.findById(id).get();
  }


  public void update(HouseeditForm houseeditForm) {
	    Date now = new Date();
	    HouseEntity houseEntity = findById(houseeditForm.getId());
	    houseEntity.setId(houseeditForm.getId());
	    houseEntity.setName(houseeditForm.getName());
	    houseEntity.setAddress(houseeditForm.getAddress());
	    houseEntity.setLand_area(houseeditForm.getLand_area());
	    houseEntity.setLayout(houseeditForm.getLayout());
	    houseEntity.setAge(houseeditForm.getAge());
	    houseEntity.setPrice(houseeditForm.getPrice());
	    houseEntity.setCreateDate(now);
	    houseEntity.setUpdateDate(now);
	    
	    houseeditRepository.save(houseEntity);
  }
  
  public void delete(Long id) {
	  HouseEntity houseEntity = findById(id);
	  houseeditRepository.delete(houseEntity);
  }
  
  

}