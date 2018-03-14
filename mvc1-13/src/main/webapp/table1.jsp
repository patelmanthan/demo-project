<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User update registration form</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<nav class="navbar navbar-default navbar-static-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand js-scroll-trigger">DEMO PROJECT</a>
        </div>
        <div id="navbarCollapse" class="collapse navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
               <form action="logout1">
               		<input type="submit" value="Logout">
              </form>
           </ul>
       	</div>
    </div>
</nav>
<div class="jumbotron">
    <div class="container">
        <h1><center>Welcome User</center></h1>
    </div>
</div>
<div class="jumbotron">
    <div class="container">
     	<p><h4 id="font1"><center> <br>Update user registration form</center></h4>
		<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
			<thead>
				<tr>
					<th> user_id </th>
					<th> fname </th>
					<th> mname </th>
					<th> lname </th>
					<th> emailid </th>
					<th> password </th>
					<th> language </th>
					<th>address_id</th>
					<th> address </th>
					<th> city </th>
					<th> state </th>
					<th> country </th>
					<th> Edit </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${sessionScope.List}" var="data"> 
					<tr>
						<th><c:out value="${data.user_id}"/> </th> 
						<th><c:out value="${data.fname}"/> </th>
						<th><c:out value="${data.mname}"/> </th>
						<th><c:out value="${data.lname}"/> </th>
						<th><c:out value=" ${data.emailid}"/> </th>
						<th><c:out value="${data.password}"/> </th>
						<th><c:out value="${data.language}"/> </th>
						<th><c:out value="${data.address_id}"/> </th> 
						<th><c:out value="${data.address}"/> </th>
						<th><c:out value="${data.city}"/> </th>
						<th><c:out value="${data.state}"/> </th>
						<th><c:out value="${data.country}"/> </th> 
					 	<td><a href="user_edit?user_id=<c:out value='${data.user_id }'/>&address_id=<c:out value='${data.address_id }'/>">edit</a></td> 	
					</tr>
				</c:forEach>
			</tbody>
		</table>
   </div>
</div>
<div class="jumbotron">
    <div class="container">
        <p><h4 id="font1"><center> <br>Change Password</center></h4>
		<a href="resetpass.jsp"><center>
     		<button type="button" class="btn btn-success">Click here</button></center>
     	</a>
    </div>
</div>
<nav class="navbar navbar-default navbar-static-top">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
         <a class="navbar-brand js-scroll-trigger"> <center>Copyright 2018 </center></a></center>  
        </div>
    </div>
</nav>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script type='text/javascript' src='js/table.js'></script>
</body>
</html>

