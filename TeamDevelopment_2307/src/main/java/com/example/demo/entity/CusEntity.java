package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//public class CustomersEntity {
//
//}

/**
 * ユーザー情報 Entity
 */

@Entity
@Data
@Table(name = "customers")

public class CusEntity implements Serializable {
	
	  /**
	   * 顧客ID
	  */
	  @Id
	  @Column(name = "id")
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  /**
	   * 顧客名
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
	   * 作成日時
	   */
	  @Column(name = "created_at")
	  private Date createdAt;
	  /**
	   * 更新日時
	   */
	  @Column(name = "updated_at")
	  private Date updatedAt;
	
}