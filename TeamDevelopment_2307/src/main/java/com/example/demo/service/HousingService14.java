package com.example.demo.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.config.HousingRequest14;
import com.example.demo.entity.HousingEntity14;
import com.example.demo.repository.HousingRepository14;

/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class HousingService14 {
	/**
	 * ユーザー情報 Repository
	 */
	@Autowired
	private HousingRepository14 housingRepository14;


	/**
	 * ユーザー情報 新規登録
	 * @param  user ユーザー情報
	 */
	public void create(HousingRequest14 housingRequest14) {
		Date now = new Date();
		HousingEntity14 he14 = new HousingEntity14();
                        //実装2行

		he14.setName(housingRequest14.getName());
	    he14.setAddress(housingRequest14.getAddress());
	    he14.setLand_area(housingRequest14.getLand_area());
	    he14.setLayout(housingRequest14.getLayout());
	    he14.setAge(housingRequest14.getAge());
	    he14.setPrice(housingRequest14.getPrice());
		he14.setCreateDate(now);
		he14.setUpdateDate(now);
                       //保存するメソッド実装1行

	}
}