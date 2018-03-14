<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration form</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/registration-css.css" rel="stylesheet">
</head> 
<body>
<div class="container">
    <h1 class="well" id="header">Registration Form</h1>
	<div class="col-lg-12 well" id="header">
	<label class="basicinfo">Basic Information</label>
		<div class="row">
			<form action="updateform" method="get">
				<div class="col-sm-12">
					<div class="row">
						<div class="col-sm-4 form-group">
							<!-- <label>First Name</label> -->
							 <label for="inputName" class="control-label">Frist Name</label>
							  <input type="text" class="form-control" id="inputName" placeholder="Enter First Name Here.." name="fname" required>
							<!-- <input type="text" placeholder="Enter First Name Here.." class="form-control" name="fname" id="firstname">
							<p id="fnameval" style="color: red"></p> -->
						</div>
						<div class="col-sm-4 form-group">
						<label for="inputName" class="control-label">Middle Name</label>
							  <input type="text" class="form-control" id="inputName" placeholder="Enter Middle Name Here.." name="mname" required>
							<!-- <label>Middle Name</label>
							<input type="text" placeholder="Enter Middle Name Here.." class="form-control" name="mname"> -->
						</div>
						<div class="col-sm-4 form-group">
						<label for="inputName" class="control-label">Last Name</label>
							  <input type="text" class="form-control" id="inputName" placeholder="Enter Last Name Here.." name="lname" required>
							<!-- <label>Last Name</label>
							<input type="text" placeholder="Enter Last Name Here.." class="form-control" name="lname"> -->
						</div>
					</div>
					<div class="form-group">
					<label for="inputEmail" class="control-label">Email Id</label>
    				<input type="email" class="form-control" id="inputEmail" placeholder="Enter Emailid" data-error="Bruh, that email address is invalid" name="emailid" required>
    				<div class="help-block with-errors"></div>
						<!-- <label>Email Id</label>
						<input type="text" placeholder="Enter Email Id Here.." rows="3" class="form-control" name="emailid"> -->
					</div>
					<div class="form-group">
					<label for="inputPassword" class="control-label">Password</label>
					<input type="password" minlength="6" pattern="^[_A-z0-9]{1,}$" maxlength="50"class="form-control" id="inputPassword" placeholder="Enter Password"  name="password" required>
        			<div class="help-block">Minimum of 6 characters</div>
						<!-- <label>Password</label>
						<input type="password" placeholder="Enter Password Here.." rows="3" class="form-control" name="password"> -->
					</div>
					<div class="form-group">
					<label for="inputGender" class="control-label">Gender</label>
							  
							<!-- <label>Gender</label> -->
					<div class="radio">
				<label>	<input type="radio"  id="inputName" name="gender" required>Male</label>
      					<!-- <label><input type="radio" name="gender">Male</label> -->
    				</div>
    				<div class="radio">
      					<label>	<input type="radio"  id="inputName" name="gender" required>Female</label>
    				</div>
    				</div>
    			<label for="inputName" class="control-label">Language</label>
    				<div class="form-group">
    				
						<select name="language" id="inputLanguage" required>
							<option>English </option>
							<option>Hindi</option>
							<option>Gujarati</option>
						</select>	
						
					</div>
					<div class="form-group">
						<label>Date-of-birth</label>
						<input type="date" placeholder="Enter Email Id Here.." class="form-control" name="dob"  id="inputLanguage" required>
					</div>					
					<div class="form-group">
						<label>Phone Number</label>
						 <input type="text" pattern="^[_0-9]{1,}$" maxlength="10" class="form-control" id="inputTwitter" placeholder="Enter Phonenumber" name="phonenumber" required>
						<!-- <input type="text" placeholder="Enter Phone Number Here.." class="form-control" name="phonenumber"> -->
					</div>
					<label class="basicinfo">Residential Information</label>
            <div class="input-group control-group after-add-more">
             <label for="inputAddress" class="control-label">Address</label>
          		<!-- <label>Address</label>  -->                                	
                <textarea rows="3" cols="80" class="form-control"  rows="3" placeholder="Enter Address" name="address" id="inputAddress" required></textarea>
                
                <div class="row">
								<div class="col-sm-4 form-group">
								<label for="inputCity" class="control-label">City</label>
							  <input type="text" class="form-control" id="inputCity" placeholder="Enter City" name="city" required>
									<!-- <label>City</label>
									<input type="text" placeholder="Enter City" class="form-control"  name="city" id="addsize"> -->
								</div>
									
								<div class="col-sm-4 form-group">
								<label for="inputState" class="control-label">State</label>
							  <input type="text" class="form-control" id="inputState" placeholder="Enter State" name="state" required>
									<!-- <label>State</label>
									<input type="text" placeholder="Enter State" class="form-control" name="state" id="addsize"> -->
								</div>	
								<div class="col-sm-4 form-group">
								<label for="inputCountry" class="control-label">Country</label>
							  <input type="text" class="form-control" id="inputCountry" placeholder="Enter Country" name="country" required>
									<!-- <label>country</label>
									<input type="text" placeholder="Enter country" class="form-control" name="country" id="addsize"> -->
								</div>
			  	<!--  <input type="text" name="addmore[]" class="form-control" placeholder="Enter Name Here"> -->	  
				<div class="input-group-btn"> 
					<button class="btn btn-success add-more" type="button" id="del"><i class="glyphicon glyphicon-plus"></i> Add</button>
				</div>
				</div>
			</div>
			<div class="copy-fields hide">
          		<div class="control-group input-group" style="margin-top:10px">
          			<label>Address</label> 
          			<textarea rows="3" cols="80" class="form-control"  rows="3" placeholder="Enter Address" name="address"></textarea>
          			 <div class="row">
								<div class="col-sm-3 form-group">
									<label>City</label>
									<input type="text" placeholder="Enter City" class="form-control"  name="city" id="addsize">
								</div>
									
								<div class="col-sm-3 form-group">
									<label>State</label>
									<input type="text" placeholder="Enter State" class="form-control" name="state" id="addsize">
								</div>	
								<div class="col-sm-3 form-group">
									<label>country</label>
									<input type="text" placeholder="Enter country" class="form-control" name="country" id="addsize">
								</div>
								<div class="col-sm-3 form-group">
									<label>Zip</label>
									<input type="text" placeholder="Enter Zip Code" class="form-control" name="zip" id="addsize">
								</div>		
							
          			<!--   <input type="text" name="addmore[]" class="form-control" placeholder="Enter Name Here"> -->
            		<div class="input-group-btn"> 
              			<button class="btn btn-danger remove" type="button" id="del"><i class="glyphicon glyphicon-remove"></i> Remove</button>
            		</div>
            		</div>
          		</div>
        	</div>		
				<div class="form-group">
					<label>Upload Image</label>
					<input type="file" name="image">
				</div>
				<input type="submit" name="Submit" class="btn btn-lg btn-info" onclick="validation()">
				<input type="reset" name="Reset" class="btn btn-lg btn-info" id="set">
				<!-- <input type="submit" name="delete" class="btn btn-lg btn-info" id="set"> -->
				<button class="btn btn-lg btn-info" id="set">Search  <a href="select.jsp"></button>			
			</div>
		</form>	
	</div>
</div>
</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
<script type='text/javascript' src='js/registration-js.js'></script>
</body>
</html>