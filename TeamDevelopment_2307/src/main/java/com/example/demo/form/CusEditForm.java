package com.example.demo.form;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import lombok.Data;


@Data
public class CusEditForm{

	  /**
	   * 顧客名
	   */
	  @NotEmpty(message = "※タスクが入力されていません。")
	  @Column(name = "name")
	  private String name;
	  
	  /**
	   * 生年月日
	   */
	  @NotEmpty(message = "※生年月日が入力されていません。")
	  @Column(name = "dob")
	  private Date dob;
	  
	  /**
	   * 住所
	   */
	  @NotEmpty(message = "※住所が入力されていません。")
	  @Column(name = "address")
	  private String address;
	  /**
	   * 電話番号
	   */
	  @NotEmpty(message = "※電話番号が入力されていません。")
	  @Column(name = "phone")
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
	  @NotEmpty(message = "日にちが入力されていません")
	  @Column(name = "created_at")
	  private Date createdAt;
	  /**
	   * 更新日時
	   */
	  @Column(name = "updated_at")
	  private Date updatedAt;
}