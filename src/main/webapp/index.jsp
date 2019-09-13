<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="css/index.css" rel="stylesheet" />
<title>Insert title here</title>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
	
	<header>
	<div class="topnav" id="myTopnav">
		<a href="#home" class="active">Home</a> 
		<a href="/get-hotel-list">Hotel List</a> 
		<a href="/booking">About</a>
		<a href="/registration">Register</a>
			
		<%if(session.getAttribute("userRole") != null && session.getAttribute("userRole").equals("ADMIN_ROLE")){ %>
			<a href="${pageContext.request.contextPath}/hotel">AddHotel</a>
		<%} %>
		<span class="right-nav-menu">
		 	<% if(session.getAttribute("userRole") == null || session.getAttribute("userRole").equals("")){ %>
				<a href="${pageContext.request.contextPath}/signUp"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a>
				<a href="${pageContext.request.contextPath}/signIn"><span
						class="glyphicon glyphicon-log-in"></span> Login</a>
				<%} else { %>
				<a href="${pageContext.request.contextPath}/index"><span
						class="glyphicon glyphicon-user"></span> <%out.println(session.getAttribute("userName")); %></a>

				<a href="${pageContext.request.contextPath}/logout"><span
						class="glyphicon glyphicon-log-out"></span> Logout</a>
				<%} %>
		</span>
		
	</div>
	</header>
	<div class="container my-5">
		<div class="row justify-content-center">
			<div class="col-12 col-md-10 col-lg-8">
				<form class="card card-sm">
					<div class="card-body row no-gutters align-items-center">
						<div class="col-auto">
							<i class="fas fa-search h4 text-body"></i>
						</div>
						<!--end of col-->
						<div class="col">
							<input
								class="form-control form-control-lg form-control-borderless"
								type="search" placeholder="Search topics or keywords">
						</div>
						<!--end of col-->
						<div class="col-auto">
							<button class="btn btn-lg btn-success" type="submit">Search</button>
						</div>
						<!--end of col-->
					</div>
				</form>
			</div>
			<!--end of col-->
		</div>
	</div>





</body>
</html>