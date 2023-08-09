package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("login.app")
@EntityScan("login.app.entity")
@EnableJpaRepositories("login.app.repository")
public class TeamDevelopment2307Application {

	public static void main(String[] args) {
		SpringApplication.run(TeamDevelopment2307Application.class, args);
	}

}
