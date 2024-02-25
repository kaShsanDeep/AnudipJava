package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Entities.Task;
import com.Entities.TaskDaoImpl;

public class SaveTaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SaveTaskServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			// fetching the data from browser using servlet's request.getParameter method
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			String date = request.getParameter("date");

			TaskDaoImpl obj = new TaskDaoImpl();

			// sending the submitted data to the implemented class trough object
			obj.addTask(title, content, date);

			

			

			// telling the browser that the txt is of htm type
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			// printing response to the browser that task is added
			out.println("<h1 style='text-align:center'>Task added succefully</h1>");

		} catch (Exception e) {

			System.out.println("some Error in servelet");
		}

	}

}
