<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

  <style>
  

nav:hover{

background-color:black;
opacity:0.8;

}

a:hover{
background-color:Gray;
}



  
  </style>

</head>



<body>




	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<a class="navbar-brand" href="task_mgt.jsp">Task Manager</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link"
					href="index.jsp">Home <span class="sr-only">(current)</span></a>
					
				</li>
				
				
				<li class="nav-item"><a class="nav-link" href="add_task.jsp">Add
						Task</a></li>

				<li class="nav-item"><a class="nav-link " href="all_tasks.jsp">Show
						Tasks</a></li>
			</ul>
			
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>








</body>
</html>