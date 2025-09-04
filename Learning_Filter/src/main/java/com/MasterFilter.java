package com;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/master")
public class MasterFilter extends HttpFilter{
	

	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		
		ServletContext cx = request.getServletContext();
		String um = cx.getInitParameter("underMaintanance");
		if(um.equals("true"))
		{
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		
		chain.doFilter(request, response);
	}
}
