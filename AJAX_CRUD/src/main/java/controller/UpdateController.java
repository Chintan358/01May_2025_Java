package controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;

import dao.RegDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Reg;

@WebServlet("/update")
public class UpdateController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int uid = Integer.parseInt(req.getParameter("uid"));
		String action = req.getParameter("action");
		
		PrintWriter pw = resp.getWriter();
		
		RegDao dao = new RegDao();
		if(action.equals("update"))
		{
			Reg reg = dao.userById(uid);
			Gson json = new Gson();
			pw.append(json.toJson(reg));
		}
		else if(action.equals("delete"))
		{
			int i = dao.deleteUser(uid);
			if(i>0)
			{
				pw.append("Deleted !!!!");
			}
		}
		
		
	}
}
