<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!doctype html>
<html lang="en">
<head>


<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">



<title>Registration</title>


<%@include file="all_js_css.jsp"%>
<%@include file="navbar.jsp"%>


<Style>
body {
	background-image:
		url("https://images.pexels.com/photos/3728084/pexels-photo-3728084.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
}
</Style>
</head>
<body>





	<h1>Registration</h1>


	<form action="SaveUserServlet" method="post">

		<div class="form-group">
			<label for="name"> Name</label> <input name="name" required
				type="text" class="form-control" id="name" placeholder="Enter Name">

		</div>

		<div class="form-group">
			<label for="phone">Phone</label> <input name="phone" required
				type="tel" class="form-control" id="phone"
				placeholder="Enter Phone no ">

		</div>


		<div class="form-group">
			<label for="exampleInputEmail1">Email address</label> <input
				name="email" required type="email" class="form-control"
				id="exampleInputEmail1" aria-describedby="emailHelp"
				placeholder="Enter email">

		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Password</label> <input
				name="pass" required type="password" class="form-control"
				id="exampleInputPassword1" placeholder="Password">
		</div>

		<div class="container text-center">
			<button type="submit" class="btn btn-dark">Sign up</button>

		</div>

	</form>


</body>
</html>