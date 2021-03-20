<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Read Detail here</title>
</head>
<body>

<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>SName</th>
	<th>Email</th>
	<th>mobile</th>
	<th>update</th>
	<th>delete</th>
	</tr>
<c:forEach items="${read}" var="reads">
						<tr>
 <td><input type="text" name="email" value="${reads.email}" readonly="readonly"><br></td>
<td><input type="text" name="sname" value="${reads.sname}"><br></td>
<td><input type="text" name="mobile" value="${reads.mobile}"><br></td>
 			<td><a href="editDetail.do">Update</a> </td>
			
			<td><a href="deletepage.do">Delete</a></td>
				
				</tr>
			</c:forEach>

	</table>
	
		<a href="logout.do">logout</a>
</body>
</html>