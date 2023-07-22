package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "houses")
public class HousingEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType. IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "land_area")
	private Integer land_area;
	
	@Column(name = "layout")
	private String layout;
	
	@Column(name = "age")
	private Integer age;
	
	@Column(name = "price")
	private Integer price;
	
	@Column(name = "update_date")
	private Date updateDate;
	
	@Column(name = "create_date")
	private Date createDate;
			

}