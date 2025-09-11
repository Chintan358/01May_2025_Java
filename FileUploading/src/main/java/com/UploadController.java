package com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@MultipartConfig
@WebServlet("/upload")
public class UploadController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String name = req.getParameter("name");
		Part img = req.getPart("file");
		
		String filename = name+"_"+Paths.get(img.getSubmittedFileName()).getFileName().toString();
		
		String path = req.getServletContext().getRealPath("")+File.separator+"img";
		
		File file = new File(path);
		
		if(!file.exists())
		{
			file.mkdir();
		}
		img.write(path+File.separator+filename);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn  =DriverManager.getConnection("jdbc:mysql://localhost:3306/01may_java","root","root");
	
			PreparedStatement ps = cn.prepareStatement("insert into upload values(?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, name);
			ps.setString(3, filename);
			
			int i = ps.executeUpdate();
			
			if(i>0)
			{
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			}
		
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
