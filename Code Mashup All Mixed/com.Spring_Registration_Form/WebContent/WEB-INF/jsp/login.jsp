<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <%@page import="java.util.ArrayList"%> 
 --%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>JSP Session Scope Example</title>

</head>
<body>
           <%-- <c:out value="${sessionScope.register.uid}" />
                <c:out value="${sessionScope.register.uname}" />
                <c:out value="${sessionScope.register.email}" />
                <c:out value="${sessionScope.register.pass}" />
  --%>
 
 
 <c:out value="${register.uid}" />
<c:out value="${register.uname}" />
<c:out value="${register.email}" />
<c:out value="${register.pass}" />

 
         
       <%--    <%   
              String uid=(String)session.getAttribute("${register.uid}");  
              out.print("uid= "+uid);  
                
              String uname=(String)session.getAttribute("${register.uname}");  
              out.print("  uname= "+uname);  
              
              String email=(String)session.getAttribute("${register.email}");  
              out.print("   email= "+email);  
              
              String password=(String)session.getAttribute("${register.pass}");  
              out.print("   password= "+password);  
              
              %>
             --%>
           <%--   <% 
             String uid=(String)session.getAttribute("register.uid");  
             out.print("uid= "+uid);  
            
             String uname=(String)session.getAttribute("register.uname");  
             out.print("  uname= "+uname);  
             
             String email=(String)session.getAttribute("register.email");  
             out.print("   email= "+email);  
             
             String password=(String)session.getAttribute("register.pass");  
             out.print("   password= "+password);  
             %>
            --%>   
            
            
           <%--  
            uid <%=session.getAttribute("register.uid") %>
            uname <%=session.getAttribute("register.uname") %>
              email<%=session.getAttribute("register.email") %>
             pass  <%=session.getAttribute("register.pass") %>
 --%>
 
 
 
 
 
 
 
 
 
  </body>