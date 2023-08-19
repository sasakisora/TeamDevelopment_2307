package com.example.demo.entity;

import java.io.Serializable;

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
public class HsEntity implements Serializable {
  /**
   * ID
   */
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  /**
   * 
   *//**
   * 住宅名
   */
  @Column(name = "name")
  private String name;
  /**
   *//**
   * 土地面積（平方メートル）
   */
  @Column(name = "Land_area")
  private Integer Land_area;
  /**
   *//**
   * 間取り
   */
  @Column(name = "layout")
  private String layout;
  /**
   *//**
   * 築年数
   */
  @Column(name = "age")
  private Integer age;
  /**
   *//**
   * 価格
   */
  @Column(name = "price")
  private Integer price;
  /**
   *//**
   * 住所
   */
  @Column(name = "address")
  private String address;
  
  public HsEntity() {}

}