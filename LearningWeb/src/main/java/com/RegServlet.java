package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		
		String username =  req.getParameter("username");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		//System.out.println(username+" "+email+" "+pass);
		
		pw.write("<h1>Username : "+username+" </h1>");
		pw.write("<h2>Email : "+email+"</h2>");
	}
}
