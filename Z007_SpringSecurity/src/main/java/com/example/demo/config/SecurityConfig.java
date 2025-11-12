package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {
	
	  @Bean
	  public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
	
	   @Bean
	   public UserDetailsService userDetailsService(PasswordEncoder encoder) {
	        UserDetails user1 = User
	                .withUsername("admin")
	                .password(encoder.encode("123")) // {noop} means no password encoding
	                .roles("ADMIN")
	                .build();

	        UserDetails user2 = User
	                .withUsername("user")
	                .password(encoder.encode("123"))
	                .roles("USER")
	                .build();

	        return new InMemoryUserDetailsManager(user1, user2);
	    }

	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
		
		httpSecurity.csrf(csrf -> csrf.disable())
		
				.authorizeHttpRequests(auth -> 
				
				 auth.requestMatchers("/public/**").permitAll()
				 .requestMatchers("/admin","/addcategory").hasRole("ADMIN")
                 .requestMatchers("/user").hasAnyRole("USER")
				.anyRequest().authenticated()
				
				)
				.formLogin(Customizer.withDefaults()) // default login page
				.logout(Customizer.withDefaults());
		return httpSecurity.build();
	}
}
