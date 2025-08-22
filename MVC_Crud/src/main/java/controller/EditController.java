package controller;

import java.io.IOException;

import dao.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Emp;

@WebServlet("/edit")
public class EditController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		
		Emp e = new Emp(); 
		e.setId(id);
		e.setName(name);
		e.setEmail(email);
		e.setPhone(phone);
		
		StudentDao dao = new StudentDao();
		int i = dao.updateEmp(e);
		
		if(i>0)
		{
			req.setAttribute("msg", "Update successfully");
			req.getRequestDispatcher("update.jsp").forward(req, resp);
		}
		
	}
}
