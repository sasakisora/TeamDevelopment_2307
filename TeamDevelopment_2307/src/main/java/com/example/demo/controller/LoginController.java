
package com.example.demo.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
@RequestMapping("/housing/login")
public class LoginController{
    
  @Configuration
  public class SecurityConfig extends WebSecurityConfigurerAdapter {

      @Override
      protected void configure(HttpSecurity security) throws Exception {
          security.formLogin().disable();
      }
  }
    

    
    @GetMapping
  public String view() {   
    return "housing/login";
  }

    
    
}








//package com.example.demo.controller;
//
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.secu/rity.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.example.demo.form.LoginForm;
//
//
//
//@SpringBootApplication
//
//
///**
// * ユーザー情報 Controller
// */
//@Controller
//@RequestMapping("/login")public class LoginController {
//
//    
//    
//    
//      @Configuration
//        public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//            @Override
//            protected void configure(HttpSecurity security) throws Exception {
//                security.formLogin().disable();
//            }
//        }
//      
////  Modelクラス→controllerからhtmlにデータを受け渡す機能。これを使うことで値をつめて渡せるため、ログインではmodel.addAttributeは必要なし。
//      
//         @GetMapping
//          public String view(Model model, LoginForm form) {   
//            return "login";
//          }
//
//          
//  }