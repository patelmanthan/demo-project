<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/registration-css.css" rel="stylesheet">
</head>
<body>
 <div class="container">
    <h1 class="well" id="header">Change Password?</h1>
	<div class="col-lg-12 well" id="header">
		<label class="basicinfo"></label>
		<div class="row">
			<form action="password">
				<div class="col-sm-12">
					<div class="form-group">
						<label for="inputPassword" class="control-label">Old Password</label>
						<input type="password" minlength="6" pattern="^[_A-z0-9]{1,}$"  maxlength="50"class="form-control" id="inputPassword" placeholder="Enter Password"name="oldpass" required>
						<div class="help-block">Minimum of 6 characters</div>			
						<div class="form-group">
							<label>New Password :
	  							<input  id="password"  minlength="6" pattern="^[_A-z0-9]{1,}$" maxlength="50"  type="password"class="form-control" onkeyup='check();'  placeholder="Enter Password"  name=" name="renewpass"" required/>
							</label>
							<div class="help-block">Minimum of 6 characters</div>
						</div>
						<div class="form-group">
							<label>confirm password:
	  							<input type="password"  class="form-control" id="confirm_password"  onkeyup='check();' placeholder="Confirm Password" name="newpass" required /> 
	  							<span id='message'></span>
							</label> 
						</div>
					</div>
				</div>
				<div class="row">	
					<div class="col-xs-6 col-sm-6 col-md-6">
                        <input type="submit" class="btn btn-lg btn-success btn-block" id="sub" value="Reset">
					</div>
				</div>	
			</form>	 
        </div>	
	</div>						
</div>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
<script type='text/javascript' src='js/login-js.js'></script>
</body>
</html>