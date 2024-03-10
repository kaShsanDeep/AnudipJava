package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.daoImplement.UserDaoImpl;


public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public LogIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		try {
			
			String email = request.getParameter("email");
			String pass = request.getParameter("password");
			
			UserDaoImpl obj = new UserDaoImpl();
			
		 	obj.login(email, pass);
		 	
			boolean flag;
			if(flag) {
			
			response.sendRedirect("index.jsp");
			}
			else {
				
				response.sendRedirect("task_mgt.jsp");
			}
		}catch(Exception e) {
			
			
			System.out.println("error in delete servlet");
		}
	}
		
	}



