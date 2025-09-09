package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.google.gson.Gson;

import dao.RegDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Reg;

@WebServlet("/display")
public class DisplayController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RegDao dao = new RegDao();
		List<Reg> alldata = dao.viewAllData();
		
		PrintWriter pw  =resp.getWriter();
		
		Gson json = new Gson();
		pw.append(json.toJson(alldata));
		
	}
}
