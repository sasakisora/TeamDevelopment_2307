package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.form.UserRegRequest;
import com.example.demo.entity.UserRegEntity;
import com.example.demo.repository.UserRegRepository;

/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {
	/**
	 * ユーザー情報 Repository
	 */
	@Autowired
	private UserRegRepository userRegRepository;

	/**
	 * ユーザー情報 全検索
	 * @return  検索結果
	 */
	public List<UserRegEntity> searchAll() {
		 return userRegRepository.findAll();
	}
	/**
	 * ユーザー情報 主キー検索
	 * @return  検索結果
	 */
	public UserRegEntity findById(Integer id) {
		//実装1行
	}

	/**
	 * ユーザー情報 新規登録
	 * @param  user ユーザー情報
	 */
	public void create(UserRegRequest userRegRequest) {
		Date now = new Date();
		UserRegEntity user = new UserRegEntity();
		user.setName(userRegRequest.getName());


		user.setCreateDate(now);
		user.setUpdateDate(now);
		userRegRepository.save(user);
                       //保存するメソッド実装1行

	}