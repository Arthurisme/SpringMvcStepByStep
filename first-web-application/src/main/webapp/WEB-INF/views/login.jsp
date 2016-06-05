<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Yahoo!!!!!!! From JSP</title>
</head>
<body>



<form action="/login.do" method="post" >
<p>${ErrorMessage}</p>
Your name <input type="text" name = "name"/> 
Your Password <input type="password" name = "password"/>
<input type="submit" value="Login"/>

</form>
</body>
</html>