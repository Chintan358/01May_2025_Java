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

@WebServlet("/edit")
public class EditController  extends HttpServlet
{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw  =resp.getWriter();
		
		int id = Integer.parseInt(req.getParameter("uid"));
		String uname=req.getParameter("uname");
		String email=req.getParameter("email");
		String password=req.getParameter("pass");
		
		Reg r1=new Reg();
		r1.setId(id);
		r1.setUname(uname);
		r1.setEmail(email);
		r1.setPassword(password);
		
		
		RegDao dao=new RegDao();
		int i = dao.updatereg(r1);
		
		if(i>0)
		{
			pw.append("update success");
		}
		else
		{
			pw.append("Something went wrong !!!");
		}
	}

}
