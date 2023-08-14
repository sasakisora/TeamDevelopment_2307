package com.example.demo.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * ユーザー情報 リクエストデータ
 */
@Data
public class HouseAdd14Request implements Serializable {
  /**
   * 物件名
   */
  @NotEmpty(message = "物件名は必ず入力してください")
  @Size(max = 100, message = "物件名は100桁以内で入力してください")
  private String name;
  /**
   * 所在地
   */
  @Size(max = 255, message = "所在地は255桁以内で入力してください")
  private String address;
  /**
   * 土地面積
   */
  @Max(value = 10000, message = "土地面積は5桁以内で入力してください")
  private Integer land_area;
  /**
   * 間取り
   */
  @Size(max = 100, message = "間取りは100文字以内で入力してください")
  private String layout;
  /**
   * 築年数
   */
  @Max(value = 300, message = "築年数は3桁以内で入力してください")
  private Integer age;
  /**
   * 販売価格
   */
  @Max(value = 10000, message = "販売価格は5桁以内で入力してください")
  private Integer price;
 
}