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
public class HouseeditupdateRequest extends HouseeditForm implements Serializable {

  /**
   * ユーザーID
   */
  @NotNull
  private Long id;
}