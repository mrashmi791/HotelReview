<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link
	href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<link href="css/registration.css" rel="stylesheet" />
</head>
<body>

	<form action="/save-user-details" method="POST" modelAttribute("signUpData") class="form-horizontal form">
		<div class="container">
			<div class="row">

				<!-- Text input-->
				<div class="control-group">
					<label class="control-label" for="full_name">Full Name</label>
					<div class="controls">
						<input id="full_name" name="username" path="username"
							placeholder="Enter your full name" class="input-xlarge"
							type="text">
					</div>
				</div>


				<!-- Text input-->
				<div class="control-group">
					<label class="control-label" for="email">Email</label>
					<div class="controls">
						<input id="email" name="email" path="email" placeholder="Enter Your Email."
							class="input-xlarge" type="text">

					</div>
				</div>

				<!-- Text input-->
				<div class="control-group">
					<label class="control-label" for="mobile">Mobile No.</label>
					<div class="controls">
						<input id="mobile" name="mobile" path="mobile" 
							placeholder="Enter Your Mobile Number" class="input-xlarge"
							type="text">

					</div>
				</div>

				<!-- Appended Input-->
				<div class="control-group">
					<label class="control-label" for="dob">Date of Birth</label>
					<div class="controls">
						<div class="input-append">
							<input id="dob" name="dob" path="dob" class="input-large"
								placeholder="YYYY-MM-DD" type="text"> 
								
						</div>
					</div>
				</div>

				<!-- Multiple Radios (inline) -->
				<div class="control-group">
					<label class="control-label" for="gender">Gender</label>
					<div class="controls">
						<label class="radio inline" for="gender-0"> <input
							name="gender" path="gender" id="gender-0" value="Male" checked="checked"
							type="radio"> Male
						</label> <label class="radio inline" for="gender-1"> <input
							name="gender" path="gender" id="gender-1" value="Female" type="radio">
							Female
						</label>
					</div>
				</div>


				<!-- Textarea -->
				<div class="control-group">
					<label class="control-label" for="Address">Address</label>
					<div class="controls">
						<textarea id="Address" name="Address" path="address" >Address</textarea>
					</div>
				</div>

				<!-- Button -->
				<div class="control-group">
					<label class="control-label" for="submit"></label>
					<div class="controls">
						<button id="submit" name="submit" class="btn btn-primary">Submit</button>
					</div>
				</div>
			</div>
		</div>
	</form>

</body>
</html>