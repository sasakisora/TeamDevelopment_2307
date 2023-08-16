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
/**
 * ユーザー情報 Entity
 */
@Entity
@Data
@Table(name = "users")
public class UserEditEntity implements Serializable {

		
		  /**
		   * 顧客ID
		  */
		  @Id
		  @Column(name = "id")
		  @GeneratedValue(strategy = GenerationType.IDENTITY)
		  private Long id;
		  /**
		   * ユーザー名
		   */
		  @Column(name = "username")
		  private String username;
		  /**
		   * パスワード
		   */
		  @Column(name = "password")
		  private String password;
		 
		  
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