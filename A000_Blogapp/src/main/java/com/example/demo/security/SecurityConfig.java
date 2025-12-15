package com.example.demo.security;

import java.net.http.HttpRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

	CustomeAuthenticationEntryPoint authenticationEntryPoint;
	jwtAuthenticationFilter authenticationFilter;
	
	
	
	public SecurityConfig(CustomeAuthenticationEntryPoint authenticationEntryPoint,
			jwtAuthenticationFilter authenticationFilter) {
		super();
		this.authenticationEntryPoint = authenticationEntryPoint;
		this.authenticationFilter = authenticationFilter;
	}

	@Bean
	public PasswordEncoder encoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationManager authnManager(AuthenticationConfiguration configuration) throws Exception 
	{
		return configuration.getAuthenticationManager();
	}
	
//	@Bean
//	public UserDetailsManager detailsManager()
//	{
//		
//		UserDetails adminUser = 
//				User.withUsername("admin")
//				.password(encoder().encode("admin"))
//				.roles("ADMIN").build();
//		
//		UserDetails publicUser = 
//				User.withUsername("user")
//				.password(encoder().encode("user"))
//				.roles("USER").build();
//		
//		
//		InMemoryUserDetailsManager detailsManager = 
//				new InMemoryUserDetailsManager(adminUser,publicUser);
//		return detailsManager;
//	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
	{
		 http
	        .csrf(csrf -> csrf.disable())

	        .authorizeHttpRequests(auth -> auth

	            // --------------------- PUBLIC ROUTES ---------------------
	            .requestMatchers("/auth/**").permitAll()
	            .requestMatchers(HttpMethod.POST, "/users/**").permitAll()
	            .requestMatchers(HttpMethod.GET, "/users","/reviews/**","/blogs/**").permitAll()
	           
	            // --------------------- USER ROUTES -----------------------
	            .requestMatchers(HttpMethod.PUT, "/users/**").hasRole("USER")
	            .requestMatchers(HttpMethod.DELETE, "/users/**").hasRole("USER")
	            .requestMatchers(HttpMethod.GET, "/users/**").hasRole("USER")

	            .requestMatchers("/blogcategories/**","/blogs/**","/reviews/**").authenticated()
	            // --------------------- ADMIN ROUTES -----------------------
	         
	            // --------------------- OTHER ROUTES -----------------------
	            .anyRequest().authenticated()
	        )

	        // Exception handling
	        .exceptionHandling(ex -> ex.authenticationEntryPoint(authenticationEntryPoint))

	        // Stateless session
	        .sessionManagement(sess -> sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS))

	        // JWT / Custom filter before UsernamePasswordAuthenticationFilter
	        .addFilterBefore(authenticationFilter, UsernamePasswordAuthenticationFilter.class);

	    return http.build();
	}

}
