package com.example.demo.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
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
  @NotEmpty(message = "名前を入力してください")
  @Size(max = 100, message = "名前は100桁以内で入力してください")
  private String username;
  /**
   * パスワード
   */
  @Size(max = 255, message = "正しいパスワードの形で入力してください。")
  private String password;
}