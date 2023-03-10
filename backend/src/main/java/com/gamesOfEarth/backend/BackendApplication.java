package com.gamesOfEarth.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/user-login").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("/get-events").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("/create-user").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("/navlinks").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("/getUser").allowedOrigins("http://localhost:3000").allowCredentials(true);
			}
		};
	}
}
