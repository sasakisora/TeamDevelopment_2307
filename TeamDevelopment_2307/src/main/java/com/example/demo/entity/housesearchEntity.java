package com.example.demo.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="house")

public class housesearchEntity implements Serializable {
	
@Id
@Column(name="id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id1;	
	
/**
 * 住宅ID
 */
@Column(name = "id")
private Integer id11;
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
/**
 *//**
 *作成日時
 */
@Column(name = "create_date")
private Date createDate;
/**
 *//**
 *更新日時
 */
@Column(name =  "update_date")
private Date updateDate;

}
