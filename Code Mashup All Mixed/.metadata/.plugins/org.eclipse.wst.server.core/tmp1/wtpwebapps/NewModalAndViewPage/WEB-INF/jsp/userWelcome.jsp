<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <%@page import="StudentDetail.StudentRegistrationDto"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WELCOME STUDENT HERE</title>
</head>
<body>
<%
StudentRegistrationDto s=(StudentRegistrationDto)session.getAttribute("stDetail"); 
%> 
Welcome<%= s.getSname() %>   

<a href="editDetail.do">CLICK FOR update</a>
<a href="read.do">CLICK FOR read</a>
<a href="changePassword.do">CLICK FOR changepassword</a>
<a href="logout.do">CLICK FOR logout</a>
<a href="deletepage.do">CLICK FOR delete</a>

</body>
</html>
