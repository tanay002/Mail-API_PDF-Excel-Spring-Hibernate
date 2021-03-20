<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>MVC Model & View</h1>
${Message}

</body>
</html> --%>



<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>UID</th>
		<th>UName</th>
	</tr>
	<c:forEach var="obj" items="${Message}">
		<tr>
	<%-- 		<td>${obj}</td> --%>

		  <td>${obj.uid}</td>  
   <td>${obj.uname}</td>  
  
		</tr>
	</c:forEach> 
	
	
	<c:forEach var="obj" items="${Message1}">
		<tr>
			<%-- <td>${obj}</td> --%>

		  <td>${obj.uid}</td>  
   <td>${obj.uname}</td>  
  
		</tr>
	</c:forEach> 
	
	<c:forEach var="obj" items="${Message2}">
		<tr>
			<%-- <td>${obj}</td>
 --%>
		  <td>${obj.uid}</td>  
   <td>${obj.uname}</td>  
  
		</tr>
	</c:forEach> 
	
	
	
	
	
	
	
	
	
	
	<%-- <tr><td>${Message.uid}</td> 
	<td>${Message.uname}</td>
	</tr>
	<tr>
	<td>${Message1.uid}</td> 
	<td>${Message1.uname}</td>
	</tr>
	<tr><td>${Message2.uid}</td> 
	<td>${Message2.uname}</td>
	</tr>
	 --%>
</table>
