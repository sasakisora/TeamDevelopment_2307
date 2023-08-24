package com.example.demo.form;



import java.io.Serializable;

import javax.persistence.Column;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;



	@Data
	public class HouseeditForm implements Serializable {
		
		
	   @Column(name = "id")
	   private Long id;

	  /**
	   * 物件名
	   */
	  @NotEmpty(message = "※物件名が入力されていません")
	  @Size(max = 100, message = "物件名は100桁以内で入力してください")
	  @Column(name = "name")
	  private String name;
	  
	  
	  /**
	   * 所在地
	   */
	  @NotEmpty(message = "※所在地が入力されていません")
	  @Size(max = 255, message = "所在地は255桁以内で入力してください")
	  private String address;
	  
	  /**
	   * 土地面積
	   */
	  @NotEmpty(message = "※土地面積が入力されていません")
	  @Max(value = 10000, message = "※土地面積は5桁以内で入力してください")
	  private Integer land_area;
	  
	  /**
	   * 間取り
	   */
	  @NotEmpty(message = "※間取りが入力されていません")
	  @Size(max = 100, message = "※間取りは100文字以内で入力してください")
	  private String layout;
	  
	  /**
	   * 築年数
	   */
	  @NotEmpty(message = "※築年数が入力されていません")
	  @Max(value = 300, message = "築年数は3桁以内で入力してください")
	  private Integer age;
	  
	  /**
	   * 販売価格
	   */
	  @NotEmpty(message = "※販売価格が入力されていません")
	  @Max(value = 10000, message = "販売価格は5桁以内で入力してください")
	  private Integer price;
	  
}