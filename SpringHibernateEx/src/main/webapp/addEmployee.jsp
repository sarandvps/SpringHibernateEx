<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
Fill the Employee Details

 <form:form action = "registerSuccess" method="post" modelAttribute="employee">
  <table>

        
			<!-- <tr>
				<td>Id</td>
				<td><form:input path="id"/></td>
			</tr> -->
			
			<tr>
				<td>Name</td>
				<td><form:input path="sName"/></td>
			</tr>


			<tr>
				<td>age</td>
				<td><form:input path="age"/></td>
			</tr>
			
			<tr>
				<td>Gender</td>
				<td><form:input path="gender"/></td>
            </tr>

			<tr>
			
				<td>Mentor</td>
				<td><form:input path="dept"/></td>
            </tr>

			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
    </table>
  </form:form>
</center>
</body>
</html>