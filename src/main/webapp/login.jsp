<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link href="css/login.css" rel="stylesheet"></link>
</head>
<body>

${SPRING_SECURITY_LAST_EXCEPTION.message}


		<div class="container login-container">
            <div class="row">
            	<form action="" method="post">
                <div class="col-md-6 login-form-1">
                    <h3>Login for Customer</h3>
                    
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Username *" name="username"value="" />
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" placeholder="Password *" name="password" value="" />
                        </div>
                        <div class="form-group">
                            <input type="submit" class="btnSubmit" value="Login" />
                             <input type="submit" class="btnSubmit" value="SignUp" />
                        </div>
                        <div class="form-group">
                            <a href="#" class="ForgetPwd">Forget Password?</a>
                        </div>
                   
                </div>
               </form>
               <form action="" method="post">
                <div class="col-md-6 login-form-2">
                    <h3>Login for Admin</h3>
                   
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Username *" name="username" value="" />
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" placeholder="Password *" name="password" value="" />
                        </div>
                        <div class="form-group">
                            <input type="submit" class="btnSubmit" value="Login" />
                             <input type="submit" class="btnSubmit" value="SignUp" />
                        </div>
                        <div class="form-group">

                            <a href="#" class="ForgetPwd" value="Login">Forget Password?</a>
                        </div>
                   
                </div>
            	</form>
            </div>
        </div>
	</form>
</body>
</html>