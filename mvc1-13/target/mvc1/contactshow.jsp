<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap.min.css" rel="stylesheet">
</head>
<body>

<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
<thead>
	<tr>
		<th> id </th>
		<th> name </th>
		<th> emailid </th>
		<th> message </th>
	</tr>
</thead>
<tbody>
	<c:forEach items="${sessionScope.List}" var="datashow"> 
		<tr>
			<th><c:out value="${datashow.id}"/> </th> 
			<th><c:out value="${datashow.name}"/> </th>
			<th><c:out value=" ${datashow.emailid}"/> </th>
			<th><c:out value="${datashow.message}"/> </th>	
		</tr>
	</c:forEach>
</tbody>
</table>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script type='text/javascript' src='js/table.js'></script>
</body>
</html>