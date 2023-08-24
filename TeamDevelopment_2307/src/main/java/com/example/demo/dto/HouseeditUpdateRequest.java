package com.example.demo.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.example.demo.form.HouseeditForm;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ユーザー情報更新リクエストデータ
 *
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class HouseeditUpdateRequest extends HouseeditForm implements Serializable {

  /**
   * ユーザーID
   */
  @NotNull
  private Long id;
}