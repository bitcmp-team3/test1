<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>
	<form action="Login.do" method = "post">
		<label for="userName" >아이디</label>
		<input type="text" name="username" id="username" ><br> 
	<label for="passWord" >암호</label>
		<input type="password" name="pw" id="pw" "><br> 
		<input type = "submit" value = "login">
	</form>
</body>
</html>





