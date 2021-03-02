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
</head>
<body>
<body background="abcbike.jpg"  >
<div class="container">
  <h2>Registration Page</h2>
  <form action="log1">
   <div class="form-group">
      <label for="rollno">Roll Number:</label>
      <input type="rollno" class="form-control" id="rollno" placeholder="Enter Rollno" name="t1" required="required">
    </div>
    <div class="form-group">
      <label for="name">Name:</label>
      <input type="name" class="form-control" id="name" placeholder="Enter Name" name="t2" required="required">
    </div>
    <div class="form-group">
      <label for="address">Address:</label>
      <input type="address" class="form-control" id="address" placeholder="Enter Address" name="t3" required="required">
    </div>
    <div class="form-group">
      <label for="username">Username:</label>
      <input type="usename" class="form-control" id="email" placeholder="Enter Username" name="t4" required="required">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter Password" name="t5" required="required">
    </div>
    
    <div class="form-group">
     <label for="img">Upload Your photo:</label>
 <input type="file" class="form-control" id="img" placeholder="Select the path of your image" name="imge" required="required">
</div>
<br>
     Gender:-male<input type="radio" name="Gender" value="male" checked="checked">
			female<input type="radio" name="Gender" value="female">
<br>
<br>
	City:-<select  name="t6">
		<option value ="Pune"> Pune </option>
		<option value ="Mumbai"> Mumbai </option>
		<option value ="Nashik"> Nashik </option>
    </select>
    <br>
    <button type="submit" class="btn btn-primary">Submit</button> <br>
    

  </form>
</div>
</body>
</html>