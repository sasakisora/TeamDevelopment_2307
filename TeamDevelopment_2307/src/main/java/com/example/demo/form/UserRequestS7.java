package com.example.demo.form;


import java.io.Serializable;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserRequestS7 implements Serializable {
	  /**
	   * 顧客ID
	   */
	  @Column(name = "id")
	  private Long id;

  /**
   * 名前
   */
  @NotEmpty(message = "名前を入力してください")
  @Size(max = 100, message = "名前は100桁以内で入力してください")
  private String username;
  /**
   * パスワード
   */
  @NotEmpty(message = "パスワードを入力してください")
  @Size(max = 255, message = "パスワードを入力してください")
  private String password;

}