package com;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/verify")
public class Verify extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String otp = req.getParameter("otp");
		
		
		ServletContext cx  =req.getServletContext();
		String g_otp = (String)cx.getAttribute("g_otp");
		
		if(otp.equals(g_otp)) {
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}
		else
		{
			req.setAttribute("err", "Invalid otp");
			req.getRequestDispatcher("otp.jsp").forward(req, resp);
		}
	}
}
