<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css\bootstrap.css" rel="stylesheet" />
  <style type="text/css">
  
  body {

padding:50px;
}


#title{

height:125px;
background-color:;
}

#login {
	padding:20px;
	width:300px;
	height:550px;
	
}
#drop {
	width:150px;
}
#abc{
	width:550px;
	height:550px;
}
  
  
  </style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WELCOME TO LAB MANAGEMENT-LAB BOOKING </title>
<h2 class="jumbotron" id="title">WELCOME TO LAB MANAGEMENT-LAB BOOKING</h2><br><br>
</head>
<body class="container">

<img align = "right"  id= "abc" src="xyz.jpg " > </img>

<div class="jumbotron" id="login"  >

<h4 align= "center"><b>LOGIN</b></h4><br>
<form action="login" method="Post" >
<b>UserName</b>&nbsp;&nbsp;&nbsp;<input type="text"  name="username" id="username"  required ><br><br>

<b>Password</b>&nbsp;&nbsp;&nbsp;<input type="password" name="password" id="password"  required ><br><br>
<input type="Submit" class="btn btn-primary" value="Submit">

</form>
<form action="register" method="Post">
<br>
<h4 align= "center"><b>New User? SignUp</b></h4><br>

<b>UserName</b>&nbsp;&nbsp;&nbsp;<input type="text"  name="user" required ><br><br>

<b>Password</b>&nbsp;&nbsp;&nbsp;<input type="password" name="pass" required ><br><br>

<b>UserId</b>&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="userid" required ><br><br>

<b>Role</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="role" required >
<br><br>
<input type="Submit" class="btn btn-primary" value="Register">
</form>




</div>
</body>
</html>