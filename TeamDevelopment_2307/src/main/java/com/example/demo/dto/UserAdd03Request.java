package com.example.demo.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * ユーザー情報 リクエストデータ
 */
@Data
public class UserAdd03Request implements Serializable {
  /**
   * ユーザーネーム
   */
  @NotBlank(message = "名前を入力してください")
  @Size(max = 10, message = "名前は10桁以内で入力してください")
  private String username;
  /**
   * パスワード
   */
  @NotBlank(message = "パスワードを入力してください")
  @Size(max = 10, message = "パスワードは10桁以内で入力してください。")
  @Size(min = 4, message = "パスワードは4桁以上で入力してください。")
  private String password;
}