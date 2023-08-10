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
public class UserAdd03 implements Serializable {
  /**
   * ID
   */
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  /**
   * ユーザーネーム
   */
  @Column(name = "username")
  private String username;
  /**
   * 所在地
   */
  @Column(name = "password")
  private String password;
  
  /**
   * 更新日時
   */
  @Column(name = "update_date")
  private Date updateDate;
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
}


