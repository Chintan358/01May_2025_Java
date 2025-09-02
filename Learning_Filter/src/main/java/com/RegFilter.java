package com;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/reg")
public class RegFilter extends HttpFilter {
	
	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		String ip =  req.getRemoteAddr();
		System.out.println(ip);
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		
		RequestDispatcher rd = req.getRequestDispatcher("reg.jsp");
		
		if(name==""|| name==null)
		{
			req.setAttribute("unameErr", "user is required !!!!");
			rd.forward(req, resp);
		}
		
		
		if(email==""|| email==null)
		{
			req.setAttribute("emailErr", "email is required !!!!");
			rd.forward(req, resp);
		}
		
		if(phone==""|| phone==null)
		{
			req.setAttribute("phoneErr", "phone is required !!!!");
			rd.forward(req, resp);
		}
		
		
		chain.doFilter(req, resp);
	}
}
