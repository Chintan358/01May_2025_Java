package com.example.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class A000BlogappApplication {

	public static void main(String[] args) {
		SpringApplication.run(A000BlogappApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}
	

	
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
	    return new WebMvcConfigurer() {
	        @Override
	        public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Allow all URLs
                        .allowedOrigins("*") // Allow all origins
                        .allowedMethods("*") // GET, POST, PUT, DELETE, etc
                        .allowedHeaders("*") // Allow all headers
                        .allowCredentials(false); // Set to true if needed
            }
	    };
	}
}
