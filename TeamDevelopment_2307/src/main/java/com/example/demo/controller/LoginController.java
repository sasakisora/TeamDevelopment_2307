package com.example.demo.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class LoginController {
    
    @Configuration
    public class SecurityConfig extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity security) throws Exception {
            security.formLogin().disable();
        }
    }
    @GetMapping
    public String index () {
        return "index";
    }

    @GetMapping("/login")
    public String login () {
        return "login";
    }
//    @GetMapping
//    public String login() {
//        return "housing/login";
//        
//    }
//    @PostMapping("/housing/login")
//    public String postLogin() {
//        return "housing/login";
//        
//    }
    /**
     * ログイン成功時に呼び出されるメソッド
     * SecurityContextHolderから認証済みユーザの情報を取得しモデルへ追加する
     * @param model リクエストスコープ上にオブジェクトを載せるためのmap
     * @return helloページのViewName
     */
    @RequestMapping("/sign_in")
    private String init(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        //Principalからログインユーザの情報を取得
        String userName = auth.getName();
        model.addAttribute("userName", userName);
        return "sign_in";

    }

    //ログアウト成功時の画面へ遷移
    @RequestMapping("/afterLogout")
    String afterLogout() {
        return "afterLogout";
    }

} 


//コントローラー綺麗にする、調べる
//HTMLにフォームタグ入れる、チームメンバーに聞く
//HTMLにタイムリーフ入れる、チームメンバーに聞く
//MVCコンフィグ書く、調べたら出てくる〇
//DAOも綺麗にする、なんか色々多い気が、、、
//サービスも違う、ヒント：パスワードエンコーダー
//エンティティ佐々木が書いたものに追加する、調べたら一発
