<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/login-css.css" rel="stylesheet">
</head>
<body>
<div class="container">
	<div class="row" style="margin-top:50px">
    	<div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
    		<h3>DEMO PROJECT </h3>
			<address>
				<strong>Address:</strong>INEXTURE COMPANY<br>
				<strong>Phone:</strong> +91-8469860840 
			</address>
			<form action="contact">
				<fieldset>
					<h2>Contact Form</h2>
					<hr class="colorgraph">
						<div class="form-group">
							<label>Name</label>
	                    	<input type="text" name="name" id="name" class="form-control input-lg" placeholder="Enter Name">
						</div>
						<div class="form-group">
							<label>Email Id</label>
	                    	<input type="email" name="emailid" id="emailid" class="form-control input-lg" placeholder="Enter Email Id">
						</div>
						<div class="form-group">
							<label>Message</label>
	                   		<textarea rows="2" cols="80" name="message" id="message" class="form-control input-lg" placeholder="Message"></textarea>
						</div>
						<div class="row">
							<div class="col-xs-6 col-sm-6 col-md-6">
	                        	<input type="submit" class="btn btn-lg btn-success btn-block" value="Submit">
							</div>
						</div>
				</fieldset>
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