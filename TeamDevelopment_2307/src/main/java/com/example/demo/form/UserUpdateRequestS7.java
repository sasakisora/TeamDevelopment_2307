package com.example.demo.form;


import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ユーザー情報更新リクエストデータ
 *
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class UserUpdateRequestS7 extends UserRequestS7 implements Serializable {

  /**
   * ユーザーID
   */
  @NotNull
  private Long id;
}