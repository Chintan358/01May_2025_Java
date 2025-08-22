package controller;

import java.io.IOException;

import dao.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Emp;

@WebServlet("/update")
public class Updatecontroller  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String action = req.getParameter("action");
		int id = Integer.parseInt(req.getParameter("id"));
		
		StudentDao dao = new StudentDao();
		
		if(action.equals("delete"))
		{
			int i = dao.deleteEmp(id);
			if(i>0)
			{
				req.getRequestDispatcher("display").forward(req, resp);
			}
					
		}
		else if(action.equals("update"))
		{
			Emp e = dao.empById(id);
			req.setAttribute("data", e);
			req.getRequestDispatcher("update.jsp").forward(req, resp);
		}
		
		
	}
}
