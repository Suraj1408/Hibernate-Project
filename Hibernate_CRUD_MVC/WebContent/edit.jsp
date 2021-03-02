
<%@page import="com.hw.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">


function upd() {
	alert("Update!");
	document.update.action="update";
	document.update.submit();	
}
</script>
</head>
<body>
<body background="updatetime.jpg">
<form name="update">

<br>
<%Student stu=(Student)request.getAttribute("Sdata"); %>
<br>
Rollno:-<input type="text"  value="<%=stu.getRollno() %>" name="t1" required="required">
<br>
Name:-<input type="text" value="<%=stu.getName() %>" name="t2" required="required">
<br>
Address:-<input type="text" value="<%=stu.getAddress() %>" name="t3" required="required">
<br>
<input type="radio" name="rd" value="<%=stu.getUsername() %>" checked="checked">
Gender:-male<input type="radio" name="Gender" value="male">
		female<input type="radio" name="Gender" value="female">

City:-<select  name="t6">
		<option value ="Pune"> Pune </option>
		<option value ="Mumbai"> Mumbai </option>
		<option value ="Nashik"> Nashik </option>

<%-- <a href="update?username=<%=stu.getUsername() %>" >Update</a --%>>
<input type="button" value="Update" onclick="upd()">

</body>
</html>