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
WELCOME ${update.sname}..!
<center>
<table>
<form  align="center" >
 <tr><td>Email:<input type="text" name="email" value="${update.email}" readonly="readonly"><br></td></tr>
<tr><td>StudentName:<input type="text" name="sname" value="${update.sname}"><br></td></tr>
<tr><td>Mobile: <input type="text" name="mobile" value="${update.mobile}"><br></td></tr>

<input type="hidden" name="password" value="${update.password}">
<h1>Update data successfully</h1>
<tr><td><a href="logout.do">logout</a><br></td></tr>
			
</form>
</table>
</center>
</body>
</html>