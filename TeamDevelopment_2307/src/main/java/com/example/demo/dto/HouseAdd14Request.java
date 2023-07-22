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
  @NotEmpty(message = "名前を入力してください")
  @Size(max = 100, message = "名前は100桁以内で入力してください")
  private String name;
  /**
   * 所在地
   */
  @Size(max = 255, message = "住所は255桁以内で入力してください")
  private String address;
  /**
   * 土地面積
   */
  @Max(value = 100000, message = "土地面積")
  private Integer land_area;
  /**
   * 間取り
   */
  @Size(max = 20, message = "間取りは20以内で入力してください")
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