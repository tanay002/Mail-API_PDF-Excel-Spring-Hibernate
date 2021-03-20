<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>SID</th>
		<th>SName</th>
	<th>Email</th>
	<th>mobile</th>
	</tr>
 
		<tr>
		<td>${reads.id}</td>
		
		<td>${reads.sname}</td>
		<td>${reads.email}</td>
        <td>${reads.mobile}</td>
        
        </tr>

	</table>
</body>
</html>