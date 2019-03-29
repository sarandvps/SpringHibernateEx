<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"
    %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
Update Details

 <form:form action = "updateEmployee" method="post" modelAttribute="employee">
  <table>
        
			<!-- <tr>
				<td>Id</td>
				<td><form:input path="id"/></td>
			</tr> -->
			<input type = "hidden" name = "id" value = "${employee.id}"/>
			<tr>
				<td>Name</td>
				<td><form:input path="sName" value="${employee.sName}"/></td>
			</tr>


			<tr>
				<td>Age</td>
				<td><form:input path="age" value="${employee.age}"/></td>
			</tr>
			
			<tr>
				<td>Gender</td>
				<td><form:input path="gender" value="${employee.gender}"/></td>
            </tr>

			<tr>
			
				<td>Mentor</td>
				<td><form:input path="dept" value="${employee.dept}"/></td>
            </tr>

			<tr>
				<td><input type="submit" value="Update"></td>
			</tr>
    </table>
  </form:form>
</center>
</body>
</html>