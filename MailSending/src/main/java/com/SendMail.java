package com;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/send")
public class SendMail extends HttpServlet {
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			String email = req.getParameter("email");
			String subject = req.getParameter("subject");
			String message = req.getParameter("message");
			
			String msg =  GmailSender.sendmail(email, subject, message);
		
			req.setAttribute(message, msg);
			req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
