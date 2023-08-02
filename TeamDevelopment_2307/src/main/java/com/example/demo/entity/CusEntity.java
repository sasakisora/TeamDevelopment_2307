package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * ユーザー情報 Entity
 */

@Entity
@Data
@Table(name = "customers")
public class CusEntity {
	/**
	 * ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	/**
	 * 名前
	 */
	@Column(name = "name")
	private String name;

	/**
	 * 住所
	 */
	@Column(name = "address")
	private String address;

	/**
	 * 電話番号
	 */
	@Column(name = "phone")
	private String phone;
	
	/**
	 * メールアドレス
	 */
	@Column(name = "email")
	private String email;

    /**
	 * 登録日時
	 */
	@Column(name = "create_date")
	private Date createDate;
	  
	/**
	 * 削除日時
	 */
	@Column(name = "delete_date")
	private Date deleteDate;
	  
	/**
	 * 更新日時
	 */
	@Column(name = "update_date")
	private Date updateDate;

	} 
	  
