<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form method="" action="">

<table border="1" align="center" width="400" bgcolor="SkyBlue" >

<caption>Registration form</caption>

<tr>

<th>First Name</th>

<td><input type="text" name="fn" id="fn1" maxlength="10" title="enter your first name" placeholder="enter your first name" required/></td>

</tr>

<tr>

<th>Last Name</th>

<td><input type="text"/></td>

</tr>

<tr>

<th>Password</th>

<td><input type="password"/></td>

</tr>

<tr>

<th>ReEnter your password</th>

<td><input type="password"/></td>

</tr>

<tr>

<th>Email</th>

<td><input type="email"/></td>

</tr>

<tr>

<th>Mobile</th>

<td><input type="number"/></td>

</tr>

<tr>

<th>Address</th>

<td><textarea rows="8" cols="20"></textarea></td>

</tr>

<tr>

<th>Select your gender</th>

<td>

Male<input type="radio" name="g" value="m"/>
Female<input type="radio" name="g" value="f"/>
Other<input type="radio" name="g" value="f"/>

</td>

</tr>

<tr>

<th>Select your hobbies</th>

<td>

Cricket<input type="checkbox" name="x[]" value="h"/>
Basket Ball<input type="checkbox" name="x[]" value="h2"/>
Table Tennise<input type="checkbox" name="x[]" value="h3"/>
Dance<input type="checkbox" name="x[]" value="h3"/>
Singing<input type="checkbox" name="x[]" value="h3"/>
Bat Minton<input type="checkbox" name="x[]" value="h3"/>
Foot Ball<input type="checkbox" name="x[]" value="h3"/>

</td>

</tr>

<tr>

<th>Select your DOB</th>

<td><input type="date"/></td>

</tr>

<tr>

<th>Select your Country</th>

<td align = "right">Country</td>
               <td>
                  <select name = "Country">
                     <option value = "-1" selected>[choose yours]</option>
                     <option value = "1">USA</option>
                     <option value = "2">UK</option>
                     <option value = "3">INDIA</option>
                  </select>
               </td>
 
</tr>

<tr>

<th>Upload your pic</th>

<td><input type="file"/></td>

</tr>

<tr>

<td colspan="2" align="center"><input type="submit" value="Save My Data"/>

<input type="reset" value="Reset Data"/>

</td>

</tr>

</table>

</form>




</body>
</html>