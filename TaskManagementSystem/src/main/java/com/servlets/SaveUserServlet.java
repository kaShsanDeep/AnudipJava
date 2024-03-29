package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daoImplement.UserDaoImpl;

public class SaveUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SaveUserServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			// fetching the data from browser using servlet's request.getParameter method

			String name = request.getParameter("name");

			String phone = request.getParameter("phone");
			String pass = request.getParameter("pass");
			String email = request.getParameter("email");

			UserDaoImpl obj = new UserDaoImpl();

			// sending the submitted data to the implemented class trough object
			obj.addUser(name, phone, pass, email);

			response.sendRedirect("task_mgt.jsp");

		} catch (Exception e) {

			System.out.println("some Error in servelet");
		}

	}

}
