package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "houses")
public class House {
   
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "land_area")
    private String land_area;

    @Column(name = "layout")
    private String layout;

    @Column(name = "age")
    private String age;

    @Column(name = "price")
    private String price;

    @Column(name = "address")
    private String address;

}