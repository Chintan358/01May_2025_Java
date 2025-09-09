package controller;

import java.io.IOException;
import java.io.PrintWriter;

import dao.RegDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Reg;

@WebServlet("/reg")
public class reg_controller  extends HttpServlet
{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw  =resp.getWriter();
		
		String uname=req.getParameter("uname");
		String email=req.getParameter("email");
		String password=req.getParameter("pass");
		
		Reg r1=new Reg();
		r1.setId(1);
		r1.setUname(uname);
		r1.setEmail(email);
		r1.setPassword(password);
		
		
		RegDao dao=new RegDao();
		int i = dao.addreg(r1);
		
		if(i>0)
		{
			pw.append("Registration success");
		}
		else
		{
			pw.append("Something went wrong !!!");
		}
	}

}
