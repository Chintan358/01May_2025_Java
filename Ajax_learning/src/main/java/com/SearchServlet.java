package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String data  =req.getParameter("val");
		PrintWriter pw = resp.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn  =DriverManager.getConnection("jdbc:mysql://localhost:3306/01may_java","root","root");
			
			PreparedStatement ps  =cn.prepareStatement("select * from products where name like ?");
			ps.setString(1, data+"%");
			
			ResultSet rs = ps.executeQuery();
			
			String str = "<ul>";
			while(rs.next())
			{
				str+="<li>"+rs.getString(2)+"</li>";
			}
			str+="</ul>";
			pw.append(str);
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
