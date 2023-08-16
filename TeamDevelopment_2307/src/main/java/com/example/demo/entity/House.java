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
@Table(name = "houses")
public class House implements Serializable {
  /**
   * ID
   */
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  /**
   * 物件名
   */
  @Column(name = "name")
  private String name;
  /**
   * 所在地
   */
  @Column(name = "address")
  private String address;
  /**
   * 土地面積
   */
  @Column(name = "land_area")
  private Integer land_area;
  /**
   * 間取り
   */
  @Column(name = "layout")
  private String layout;
  /**
   * 築年数
   */
  @Column(name = "age")
  private Integer age;
  /**
   * 販売価格
   */
  @Column(name = "price")
  private Integer price;
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


