package com.example.demo.dto;

import java.io.Serializable;

public class CusregRequest implements Serializable {
    // 既存のフィールドはそのまま

    private String name;
	private String address;
	private String phone;

	public String getName() {
        return getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return getAddress();
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return getPhone();
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // コンストラクタ、ゲッター、セッター等の必要なメソッドは省略
}
