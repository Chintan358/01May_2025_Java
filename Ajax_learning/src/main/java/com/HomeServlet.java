package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String data = req.getParameter("data");
		
		
		PrintWriter pw = resp.getWriter();
		
		if(data.equals("sports"))
		{
			pw.append("<ul><li>Bat</li><li>Ball</li><li>Hockey</li></ul>");
		}
		else if(data.equals("electric"))
		{
			pw.append("<ul><li>Fan</li><li>TV</li><li>AC</li></ul>");
		
		}
		else if(data.equals("cosmetic"))
		{
			pw.append("<ul><li>Lipstic</li><li>suncream</li><li>facewash</li></ul>");
		}
		
		
	}
}
