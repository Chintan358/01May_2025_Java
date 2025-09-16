package com;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String pass  =req.getParameter("pass");
		
		ServletContext cx  =req.getServletContext();
		
		Random r = new Random();
		int otp = r.nextInt(100000,999999);
		cx.setAttribute("g_otp", otp+"");
		GmailSender.sendmail(email, "OTP verification", "Your OTP is : "+otp);
		
		req.getRequestDispatcher("otp.jsp").forward(req, resp);
	}
}
