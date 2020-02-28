<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
t3t3t3<br>
<%=request.getAttribute("today2")%><br>
${today2 }
<br>
		모든 서블릿 클래스에서 사용할 크림은? : <%=application.getInitParameter("cream")  %>
</body>
</html>