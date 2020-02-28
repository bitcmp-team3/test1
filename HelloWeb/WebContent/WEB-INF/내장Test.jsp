<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
내장명령어연습<br>
	현재 클래스에서만 사용할 수 있는 크림은 : <%=config.getInitParameter("cream") %>
		<br>
		모든 서블릿 클래스에서 사용할 크림은? : <%=application.getInitParameter("cream")  %>
		
	\${55+55}==>${55+55 } </br>
	${'4'-'0' }
</body>
</html>