package com.nt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import com.nt.service.IStudentService;
import com.nt.service.StudentsData;
import com.nt.service.StudentsDataImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/controller")
public class StudentsController extends HttpServlet {
	private IStudentService stud;
		@Override
		public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doGet(req, resp);
		}
		@Override
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
				res.setContentType("text/html");
				PrintWriter ps = res.getWriter();
				String name = req.getParameter("Sname");
				try {
					List<StudentsData> list = stud.getData(name);
					if(list.size()==0) {
						req.getRequestDispatcher("NoStudent.jsp").forward(req, res);
					}
//					HttpSession se = req.getSession();
					req.setAttribute("list",list);
					req.getRequestDispatcher("FinalResult.jsp").forward(req, res);
				} catch (SQLException e) {
					System.out.println("II "+e.getLocalizedMessage());
					req.getRequestDispatcher("Error.jsp").forward(req, res);
				}catch (Exception e) {
					System.out.println("sd "+e.getLocalizedMessage());
					req.getRequestDispatcher("Error.jsp").forward(req, res);
				}
		}
		public StudentsController() {
			System.out.println("StudentsController:: 0-param contructor");
			stud = new StudentsDataImpl();
		}
}
