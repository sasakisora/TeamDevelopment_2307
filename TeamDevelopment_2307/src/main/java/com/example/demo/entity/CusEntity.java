package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

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
	  @NotEmpty(message =  "顧客名が入力されていません。")
	  @Column(name = "name")
	  private String name;
	  /**
	   * 住所
	   */
	  @NotEmpty(message =  "住所が入力されていません。")
	  @Column(name = "address")
	  private String address;
	  /**
	   * 電話番号
	   */
	  @NotEmpty(message =  "電話番号が入力されていません。")
	  @Column(name = "phone")
	  private String phone;
	  /**
	   * メールアドレス
	   */
	  @NotEmpty(message =  "メールアドレスが入力されていません。")
	  @Column(name = "email")
	  private String email;
	
}