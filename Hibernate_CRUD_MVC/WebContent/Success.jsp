<%@page import="java.util.List"%>
<%@page import="com.hw.model.Student" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function del()
{
	alert("Delete!");
	document.edit.action="delete";
	document.edit.submit();
}

function sedit() {
	alert("Edit!");
	document.edit.action="editdata";
	document.edit.submit();
	
}
function sadd() {
	alert("ADD!");
	document.edit.action="register.jsp";
	document.edit.submit();
	
}
</script>
</head>
<body>
<body background="images.jpg">
Login Successful !
<form name ="edit">

 <table border="1" style ="width:100%">
<tr>
<th>Select</th>
<th>Rollno</th>
<th>Name</th>
<th>Address</th>
<th>Username</th>
<th>Password</th>
<th>Gender</th>
<th>City</th>
</tr>
<%-- <%
 List<Student> list=(List<Student>)request.getAttribute("admin");
 	for(Student s:list)
 	{	
 %><tr align="center">
 
 <td>	<%= s.getRollno()%></td>
 <td>	<%=s.getName() %> </td>
 <td>	<%= s.getAddress()%></td>
 <td>	<%=s.getUsername() %></td>
 <td> 	<%=s.getPassword() %></td>
 <td> 	<%=s.getGender() %></td>
 <td> 	<%s.getImage() %></td>
 </tr>
 	<% }%> --%>
<c:forEach items="${admin}" var="s">
<tr>
<td><input type="radio" name="rd" value="${s.username }" checked="checked"></td>
<td><c:out value="${s.rollno }"> </c:out></td>
<td><c:out value="${s.name}"></c:out> </td>
<td><c:out value="${s.address }"></c:out></td>
<td><c:out value="${s.username }"></c:out></td>
<td><c:out value="${s.password }"></c:out></td>
<td><c:out value="${s.gender }"></c:out></td>
<td><c:out value="${s.city }"></c:out></td>
<td><c:out value="${s.image }"></c:out></td>
</tr>
</c:forEach>
</table> 
<br>
<input type="button" value="Delete" onclick="del()">
<input type="button" value="Edit" onclick="sedit()">
<input type="button" value="Add" onclick="sadd()">
</form>
</form>
</body>
</html>