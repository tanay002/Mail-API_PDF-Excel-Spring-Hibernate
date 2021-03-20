<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>



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
