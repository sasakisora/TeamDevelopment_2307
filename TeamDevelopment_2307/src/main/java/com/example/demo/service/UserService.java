package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.form.UserRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

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
	private UserRepository userRepository;

	/**
	 * ユーザー情報 全検索
	 * @return  検索結果
	 */
	public List<User> searchAll() {
		//課題①で作成済み
	}
	/**
	 * ユーザー情報 主キー検索
	 * @return  検索結果
	 */
	public User findById(Integer id) {
		//実装1行
	}

	/**
	 * ユーザー情報 新規登録
	 * @param  user ユーザー情報
	 */
	public void create(UserRequest userRequest) {
		Date now = new Date();
		User user = new User();
                        //実装2行


		user.setCreateDate(now);
		user.setUpdateDate(now);
                       //保存するメソッド実装1行

	}