<!doctype html>
<%@page import="com.Entities.User"%>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">



<title>Home page</title>

<%@include file="all_js_css.jsp"%>
<%@include file="navbar.jsp"%>
<link href="css/AddTask.css" rel="stylesheet">

<Style>
body {
	background-image:
		url("https://images.pexels.com/photos/3704611/pexels-photo-3704611.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
}
</Style>
</head>
<body class="body">





	<h1>Homepage</h1>


	<form   action="Login" method="get">
		<div class="form-group">
			<label for="exampleInputEmail1">Email address</label> <input name="email" required
				type="email" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" placeholder="Enter email">

		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Password</label> <input name="password" required
				type="password" class="form-control" id="exampleInputPassword1"
				placeholder="Password">
		</div>

		<div class="container text-center">
			<button type="submit" class="btn btn-dark">Log In</button>
		</div>
	</form>
	
	    <div class="container ml-15">
		<a class="container2 " href="registeration.jsp"><button type="submit"
				class="btn btn-light">Register your self </button></a>
</div>

</body>
</html>