<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Tasks</title>

<%@include file="all_js_css.jsp"%>
<%@include file="navbar.jsp"%>

</head>



<body>





	<br>

	<h1>Provide The Task Details</h1>

	<form action="SaveTaskServlet" method="post">

		<div class="form-group">
			<label for="title">Task Title</label> <input name="title" type="text"
				class="form-control" id="title" aria-describedby="emailHelp"
				placeholder="Enter Task">

		</div>


		<div class="form-group">
			<label for="Contant">Task Description</label> <input name="content"
				required type="text" class="form-control" id="Contant"
				placeholder="Task Details">
		</div>


		<div class="form-group">
			<label for="Submision-Date">Submit By:</label> <input name="date"
				required type="date" id="Submision-Date" name="date">
		</div>


		<div class="container text-center">
			<button type="submit" class="btn btn-dark">Submit</button>


		</div>


	</form>



</body>
</html>