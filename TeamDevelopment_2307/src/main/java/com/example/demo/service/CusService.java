package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.CusEntity;
import com.example.demo.form.CusEditForm;
import com.example.demo.repository.CusRepository;

/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CusService {
 
  @Autowired
  private CusRepository cusRepository;


  public List<CusEntity> searchAll() {
    return cusRepository.findAll();
  }


  public CusEntity findById(Long id) {
    return cusRepository.findById(id).get();
  }
  
  public void delete(Long id) {
	  cusRepository.deleteById(id);
  }
  

  public void update(CusEditForm cusEditForm) {
	    CusEntity cusEntity = findById(cusEditForm.getId());
	    cusEntity.setId(cusEditForm.getId());
	    cusEntity.setAddress(cusEditForm.getAddress());
	    cusEntity.setName(cusEditForm.getName());
	    cusEntity.setPhone(cusEditForm.getPhone());
//	    user.setUpdateDate(new Date());
	    cusRepository.save(cusEntity);
  }

}