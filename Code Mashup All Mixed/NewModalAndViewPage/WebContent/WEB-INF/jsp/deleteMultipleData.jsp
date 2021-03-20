
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete detail here</title>
</head>
<body>
WELCOME ${Message.sname}..!
<center>
<table>
<form action="deleteMultiple.do" align="center" method="post">

<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>SName</th>
	<th>Email</th>
	<th>mobile</th>
	<th>delete</th>
	</tr>
<c:forEach items="${deleteMultipleData}" var="dm">
						<tr>
 <td><input type="text" name="email" value="${dm.email}" readonly="readonly"><br></td>
<td><input type="text" name="sname" value="${dm.sname}"><br></td>
<td><input type="text" name="mobile" value="${dm.mobile}"><br></td>
<td><input type="hidden" name="password" value="${dm.password}"><br></td>
 <td><input type="checkbox" name="check" value="${dm.email}" ><br></td>
 
<tr><td><input type="submit" value="delete"><br></td></tr>
 			
				</tr>
			</c:forEach>
		
	</table>
<tr><td><a href="logout.do">logout</a><br></td></tr>
			
</form>

</table>
</center>
</body>
</html>







