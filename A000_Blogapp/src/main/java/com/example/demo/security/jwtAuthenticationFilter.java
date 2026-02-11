package com.example.demo.security;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;


import com.example.demo.service.UserService;
import com.example.demo.serviceimpl.JwtService;
import com.example.demo.serviceimpl.UserAuthService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Component
public class jwtAuthenticationFilter extends OncePerRequestFilter {

	JwtService jwtService;
	UserAuthService service;
	
	
	
	public jwtAuthenticationFilter(JwtService jwtService, UserAuthService service) {
		super();
		this.jwtService = jwtService;
		this.service = service;
	}



	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		String path = request.getServletPath();

	    if (path.startsWith("/swagger-ui")
	            || path.startsWith("/v3/api-docs")) {
	        filterChain.doFilter(request, response);
	        return;
	    }
		
		String authHeader = request.getHeader("Authorization");
		if(authHeader != null && authHeader.startsWith("Bearer ") )
		{
			
			String token = authHeader.substring(7);
			
			if(jwtService.validateToken(token))
			{
				System.out.println("authenticated...");
				String username = jwtService.getUsernamefromToken(token);
				UserDetails details =  service.loadUserByUsername(username);
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				if(SecurityContextHolder.getContext().getAuthentication()==null)
				{
					
					UsernamePasswordAuthenticationToken authentication = 
							new UsernamePasswordAuthenticationToken(username, null, details.getAuthorities());
					SecurityContextHolder.getContext().setAuthentication(authentication);
					
					
				}
				filterChain.doFilter(request, response);
			}
			
			
		}
		filterChain.doFilter(request, response);
		
		
		
	}

}
