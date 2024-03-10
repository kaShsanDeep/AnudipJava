
<%@page import="org.hibernate.Query"%>
<%@page import="java.util.List"%>
<%@ page import='com.hibernate.hibernateUtil'%>
<%@ page import='org.hibernate.Session'%>
<%@ page import='com.Entities.*'%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Tasks</title>
<%@include file="all_js_css.jsp"%>
<%@include file="navbar.jsp"%>
</head>
<body>

	<div class="container">

		<h1>All Pending tasks</h1>

		<%
		Session session2 = hibernateUtil.getSessionFactory().openSession();
		Query q = session2.createQuery("from Task");

		List<Task> list = q.list();
		for (Task task : list) {
		%>


		<div class="card mt-3" style="width: 50rem;">
			<img class="card-img-top" style="max-width: 100px"
				src="img/tasks.png" alt="Card image cap">
			<div class="card-body">
				<h5 class="card-title"><%=task.getTitle()%></h5>
				<p class="card-text"><%=task.getDescription()%></p>
				<div class="container text-center">
					<a href="edit.jsp?task_id=<%=task.getId()%>>"
						class="btn btn-primary">update</a> 
						<a href="DeletServlet?task_id=<%=task.getId()%>" class="btn btn-dark">Delete</a>
				</div>
			</div>
		</div>



		<%
		}

		session2.close();
		%>









	</div>





</body>
</html>