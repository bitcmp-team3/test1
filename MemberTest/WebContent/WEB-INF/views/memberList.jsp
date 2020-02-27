<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
</head>
<body>
<h1>멤버목록</h1>
<table border="1">
	<thead>
		<tr>
		 <th>번호</th><th>아이디</th><th>닉네임</th><th>장바구니 개수</th><th>주소</th>
		 
		</tr>
	</thead>
	<tbody>
	
	<c:forEach items="${memberList }" var="member" varStatus="stat">
		<c:url var="memberUpdate" value="/memberUpdate.do">
		 <c:param name="id" value="${member.id }"/>
		</c:url>
		<tr>
			<td>${stat.count }</td><td><a href="${memberUpdate}">${member.id }</td><td>${member.nickName }</td><td>${member.cartCount }</td><td>${member.addr }</td>
		
		</a>	
		</tr>
		
	</c:forEach>
	</tbody>
</table>
</body>
</html>