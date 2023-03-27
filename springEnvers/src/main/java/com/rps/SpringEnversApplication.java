package com.rps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.rps.entity.SecurityAuditorAware;


@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef="auditorAware")
public class SpringEnversApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEnversApplication.class, args);
	}
	@Bean
	 public AuditorAware<String> auditorAware() {
	  return new SecurityAuditorAware();
	 }
}
