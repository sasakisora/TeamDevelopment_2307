package com.example.demo.dto;



import java.io.Serializable;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;



	@Data
	public class CusregRequest implements Serializable {
	  /**
	   * 顧客ID
	   */
	  @Column(name = "id")
	  private Long id;
	
	

	  /**
	   * 顧客名
	   */
	  @NotEmpty(message = "※名前が入力されていません。")
	  @Size(max = 100, message = "名前は100桁以内で入力してください")
	  @Column(name = "name")
	  private String name;
	  
	  
	  /**
	   * 住所
	   */
	  @NotEmpty(message = "※住所が入力されていません。")
	  @Size(max = 255, message = "住所は255桁以内で入力してください")
	  private String address;
	  /**
	   * 電話番号
	   */
	  @Pattern(regexp ="0\\d{1,4}-\\d{1,4}-\\d{4}", message = "※電話番号の形式で入力して下さい。")
	  private String phone;
	  /**
	   * メールアドレス
	   */
	  @NotEmpty(message = "※メールアドレスが入力されていません。")
	  @Column(name = "email")
	  private String email;
	  /**
	   * 作成日時
	   */
	  
	  //@Column(name = "created_at")
	  //private Date createdAt;
	  /**
	   * 更新日時
	   */
	  //@Column(name = "updated_at")
	  //private Date updatedAt;
}