<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <center>
<h1>Employee List</h1>  
<form action = "updateOrDelete" method = "post">
<table border="5" cellpadding= '8' >  
<tr>
<th>Select</th>
<th>Id</th>
<th>Name</th>
<th>Age</th>
<th>Gender</th>
<th>Mentor</th>
</tr>  
   <c:forEach var="emp" items="${list}">   
   <tr> 
    
   
   <td><input type = "radio" name = "key" value = "${emp.id}" ></td>
   <td>${emp.id}</td>  
   <td>${emp.sName}</td>  
   <td>${emp.age}</td>  
   <td>${emp.gender}</td>  
   <td>${emp.dept}</td>
   
   </tr>  
   </c:forEach>  
   </table>
      <input type = "submit" name = "action" value = "update"> 
      <input type = "submit" name = "action" value = "delete"> 
   <br/>  
   <!-- <form action = "updateStudent">
   <input type = "submit" value = "update">
    <form action = "deleteStudent">
   <input type = "submit" value = "delete"> -->
   
   <a href="RegisterStudent">Add New Employee</a> 
   
   </center>