<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bean2" type="java.lang.Object" class="pojo.MemberBean"
		scope="page"></jsp:useBean>
	<jsp:setProperty property="addr" name="bean2" />
	<jsp:setProperty property="age" name="bean2" />
	<jsp:setProperty property="birthYear" name="bean2" />
	<jsp:setProperty property="userName" name="bean2" />

	<jsp:getProperty property="addr" name="bean2" />
	<jsp:getProperty property="age" name="bean2" />
	<jsp:getProperty property="birthYear" name="bean2" />
	<jsp:getProperty property="userName" name="bean2" /><br>
	////////////////////////////////////////
	<br>
	<br>
	<jsp:useBean id="bean3" type="java.lang.Object" class="pojo.MemberBean"
		scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="bean3" />

	<jsp:getProperty property="addr" name="bean3" />
	<jsp:getProperty property="age" name="bean3" />
	<jsp:getProperty property="birthYear" name="bean3" />
	<jsp:getProperty property="userName" name="bean3" /><br> ==
	<%=bean3%>,
	<br>${bean3.userName } ==

	<%--  <jsp:useBean id="bean" scope="request" type="pojo.MemberBean"/>
	 <jsp:getProperty property="birthYear" name="bean"/> --%>
</body>
</html>








