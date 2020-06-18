package com.sai.mrb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.sai")
@EnableJpaRepositories("com.sai.mrb.repo")
@EntityScan("com.sai.mrb.model")
public class MrbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MrbApplication.class, args);
	}

}
