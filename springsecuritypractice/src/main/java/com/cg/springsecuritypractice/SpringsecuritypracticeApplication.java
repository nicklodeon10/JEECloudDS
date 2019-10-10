package com.cg.springsecuritypractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cg.springsecuritypractice.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringsecuritypracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecuritypracticeApplication.class, args);
	}

}
