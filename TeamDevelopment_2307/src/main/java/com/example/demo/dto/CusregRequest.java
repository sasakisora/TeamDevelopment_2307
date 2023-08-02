package com.example.demo.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CusregRequest implements Serializable {
    /**
     * 顧客名
     */
    @NotEmpty(message = "顧客名を入力してください。")
    @Size(max = 100, message = "顧客名は100文字以内で入力してください")
    private String name;

    /**
     * 住所
     */
    @Size(max = 255, message = "住所は255桁以内で入力してください。")
    private String address;

    /**
     * 電話番号
     */
    @Pattern(regexp = "^0\\d{1,4}-\\d{1,4}-\\d{4}$", message = "電話番号は正しい形式で入力してください。")
    private String phone;

    /**
     * メールアドレス
     */
    @Pattern(regexp = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$", message = "メールアドレスが正しい形式で入力されていません。")
    private String email;

    // コンストラクタ、ゲッター、セッター等の必要なメソッドは省略
}
