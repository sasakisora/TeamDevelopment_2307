package com.example.demo.config;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class HousingRequest14 implements Serializable {
	
	@NotEmpty(message = "入力してください")
	@Size(max = 100, message = "100文字以内で入力してください")
	private String name;
	@Size(max = 255, message = "所在地は255文字以内で入力してください")
	private String address;
	@Size(max = 5, message = "土地面積は数値で入力してください")
	private Integer land;
	@Size(max = 5, message = "間取りは単位まで入力してください（例：１DK）")
	private String layout;
	@Size(max = 3, message = "築年数は数値で入力してください")
	private Integer yearsd;
	@Size(max = 5, message = "販売価格は数値で入力してください")
	private Integer price;
}
