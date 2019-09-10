<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</head>
<body>

	<div class="container">
		<div class="row">
	    <c:if test="${not empty hotelList}">

      		<c:forEach var="hotel" items="${hotelList}">
		      <div class="col-md-6" >
		         <div class="card text-white bg-primary flex-md-row mb-4 shadow-sm h-md-250">
		            <div class="card-body d-flex flex-column align-items-start">
		               <strong class="d-inline-block mb-2 text-white">${hotel.hotelName}</strong>
		               <h6 class="mb-0">
		                  <a class="text-white" href="#">40 Percent of People Can’t Afford Basics</a>
		               </h6>
		               <div class="mb-1 text-white-50 small">${hotel.address}</div>
		               <p class="card-text mb-auto">This is a wider card with supporting text below as a natural lead-in to additional content.</p>
		               <a class="btn btn-outline-light btn-sm" role="button" target="_blank" href="${hotel.hotelWebsite}">${hotel.hotelWebsite}</a>
		            </div>
		            <img class="card-img-right flex-auto d-none d-lg-block" alt="Thumbnail [200x250]" src="//placeimg.com/250/250/arch" style="width: 200px; height: 250px;">
		         </div>
		      </div>
   			 </c:forEach>
    	</c:if>
   
   </div>
	</div>
</body>
</html>