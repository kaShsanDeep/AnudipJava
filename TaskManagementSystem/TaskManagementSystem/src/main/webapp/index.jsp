<!doctype html>
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
		url("https://images.unsplash.com/photo-1544411047-c491e34a24e0?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
}


</Style>
</head>
<body class="body">





	<h1>Homepage</h1>


	<form >
		<div class="form-group">
			<label for="exampleInputEmail1">Email address</label> <input required
				type="email" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" placeholder="Enter email">

		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Password</label> <input required
				type="password" class="form-control" id="exampleInputPassword1"
				placeholder="Password">
		</div>

		<div class="container text-center">
			<button type="submit" class="btn btn-dark">Log In</button>
			<button type="submit" class="btn btn-light">Register</button>
		</div>

	</form>




</body>
</html>