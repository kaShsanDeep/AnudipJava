<%@page import="org.hibernate.Query"%>
<%@page import="com.Entities.Task"%>
<%@page import="java.util.List"%>
<%@page import="com.hibernate.hibernateUtil"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_js_css.jsp"%>
<%@include file="navbar.jsp"%>

</head>
<body>

	<h1>Tasks pending</h1>



	<div>

		<%
		Session session2 = hibernateUtil.getSessionFactory().openSession();
		Query q = session2.createQuery("from Task");

		List<Task> list = q.list();

		for (Task task : list) {
		%>

		<div class="card mt-3">
			<img class="card-img-top" style="max-width:70px;" src="img/tasks.png" alt="Card image cap">
			<div class="card-body">
				<h5 class="card-title"><%=task.getTitle()%></h5>
				<p class="card-text"><%=task.getDescription()%></p>
				<p class="card-text">submit By : <%=task.getDate()%></p>
				<a href="#" class="btn btn-gray">Update</a>
				<a href="#" class="btn btn-dark">Delete</a>
				
			</div>
		</div>


		<%
		}

		session2.close();
		%>


	</div>





</body>
</html>