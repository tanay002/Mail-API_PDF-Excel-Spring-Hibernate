<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update detail here</title>
</head>
<body>
WELCOME ${Message.sname}..!
<center>
<table>
<form action="update.do" align="center" method="post">
 <tr><td>Email:<input type="text" name="email" value="${Message.email}" readonly="readonly"><br></td></tr>
<tr><td>StudentName:<input type="text" name="sname" value="${Message.sname}"><br></td></tr>
<tr><td>Mobile: <input type="text" name="mobile" value="${Message.mobile}"><br></td></tr>

<input type="hidden" name="password" value="${Message.password}">

<tr><td><input type="submit" value="update"><br></td></tr>
<tr><td><a href="logout.do">logout</a><br></td></tr>
			
</form>
</table>
</center>
</body>
</html>