<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/registration-css.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1 class="well" id="header">Log In</h1>
	<div class="col-lg-12 well" id="header">
		<label class="basicinfo">Basic Information</label>
		<div class="row">
			<form action="filter">
				<div class="col-sm-12">
					<div class="form-group">
						<label for="inputEmail" class="control-label">Email Id</label>
    					<input type="email" class="form-control" id="inputEmail" placeholder="Enter Emailid" data-error="Bruh, that email address is invalid" name="login_emailid" required>
					</div>
					<div class="form-group">
						<label for="inputPassword" class="control-label">Password</label>
						<input type="password" minlength="6" class="form-control" pattern="^[_A-z0-9]{1,}$" maxlength="50" id="inputPassword" placeholder="Enter Password"  name="login_password" required>
						<div class="help-block">Minimum of 6 characters</div>
					</div>
					<input type="checkbox" name="remember_me" id="remember_me" checked="checked" class="hidden">
					<a href="forgotpass.jsp" class="btn btn-link pull-right">Forgot Password?</a>
                </div> 
		</div>
	</div>
	<div class="row">
		<div class="col-xs-6 col-sm-6 col-md-6">
         	<input type="submit" class="btn btn-lg btn-success btn-block" value="Sign In">
		</div>
		<div class="col-xs-6 col-sm-6 col-md-6">
			<a href="registration.jsp" class="btn btn-lg btn-primary btn-block">Register</a>
		</div>
	</div>	
	</form>	
</div>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
<script type='text/javascript' src='js/login-js.js'></script>
</body>
</html>