package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.HousingRequest14;
import com.example.demo.entity.HousingtnEtity14;
import com.example.demo.repository.UserRepository;

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
	private UserRepository userRepository;

	/**
	 * ユーザー情報 全検索
	 * @return  検索結果
	 */
	public List<UserEntity> searchAll() {
		//課題①で作成済み
	}
	/**
	 * ユーザー情報 主キー検索
	 * @return  検索結果
	 */
	public UserEntity findById(Integer id) {
		//実装1行
	}

	/**
	 * ユーザー情報 新規登録
	 * @param  user ユーザー情報
	 */
	public void create(UserRequest userRequest) {
		Date now = new Date();
		UserEntity user = new UserEntity();
                        //実装2行


		user.setPhone(userRequest.getPhone());
		user.setCreateDate(now);
		user.setUpdateDate(now);
                       //保存するメソッド実装1行

	}