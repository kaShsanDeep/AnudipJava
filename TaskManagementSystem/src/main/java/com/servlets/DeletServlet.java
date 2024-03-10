package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daoImplement.TaskDaoImpl;

/**
 * Servlet implementation class DeletServlet
 */
public class DeletServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		
		try {
			
			
			int taskId =Integer.parseInt(request.getParameter("task_id").trim());
			
			TaskDaoImpl dl = new TaskDaoImpl();
			dl.deleteTask(taskId);
			
			 
			response.sendRedirect("all_tasks.jsp");
			
		}catch(Exception e) {
			
			
			System.out.println("error in delete servlet");
		}
	}


}
