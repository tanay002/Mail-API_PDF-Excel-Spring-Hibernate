
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

 

<head>
    <title>Spring MVC Hello World</title>
</head>
 
<body>
    <h2>All Employees in System</h2>
 
    <table border="1">
        <tr>
                <th>UserId</th>       
            <th>UserName</th>
            <th>Email</th>
            <th>Password</th>
        </tr>
        <c:forEach items="${Message}" var="msg">
            <tr>
            <td>${msg.uid}</td>
                <td>${msg.uname}</td>
                <td>${msg.email}</td>
                <td>${msg.pass }</td>
            </tr>
        </c:forEach>
    </table>
 






</body>
</html>



<%-- 

<html>
<head>
    <title>Home</title>
    <style>
.error {
    color: #ff0000;
}

.errorblock {
    color: #000;
    background-color: #ffEEEE;
    border: 3px solid #ff0000;
    padding: 8px;
    margin: 16px;
}
</style>
</head>
<body>
<h2>Spring's form textbox example</h2>

    <form:form method="POST" action="/customer" commandName="customer">
        <form:errors path="*" cssClass="errorblock" element="div" />
        <table>
            <tr>
                <td>Username :</td>
                <td><form:input path="userName" />
                </td>
                <td><form:errors path="userName" cssClass="error" />
                </td>
            </tr>
            <tr>
                <td colspan="3"><input type="submit" />
                </td>
            </tr>
        </table>
    </form:form>

</html> --%>