
<%@page import="com.hw.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  
  <script type="text/javascript">
function upd() {
	alert("Update!");
	document.update.action="update";
	document.update.submit();	
}
</script>
</head>
<body>

<body background="updatetime.jpg"  >
<div class="container">
  <h2>Registration Page</h2>
  <form name="update">
 
<%Student stu=(Student)request.getAttribute("Sdata"); %>
<br>
   <div class="form-group">
      <label for="rollno">Roll Number:</label>
      <input type="rollno" class="form-control" id="rollno" placeholder="<%=stu.getRollno() %>" name="t1">
    </div>
    <div class="form-group">
      <label for="name">Name:</label>
      <input type="name" class="form-control" id="name" placeholder="<%=stu.getName() %>" name="t2">
    </div>
    <div class="form-group">
      <label for="address">Address:</label>
      <input type="text" class="form-control" id="address" placeholder="<%=stu.getAddress() %>" name="t3">
    </div>
    
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="<%=stu.getPassword() %>" name="t4">
    </div>
    
  
      <label for="username">Update:</label>

    <input type="radio" name="rd" value="<%=stu.getUsername() %>" checked="checked">
    
   
    
    Gender:-male<input type="radio" name="Gender" value="male">
			female<input type="radio" name="Gender" value="female">

	City:-<select  name="t5">
		<option value ="Pune"> Pune </option>
		<option value ="Mumbai"> Mumbai </option>
		<option value ="Nashik"> Nashik </option>
    
   <!--  <button type="submit" class="btn btn-primary">Update</button> <br> -->
    <input type="button" value="Update" class="btn btn-primary" onclick="upd()">

  </form>
</div>
</body>
</html>