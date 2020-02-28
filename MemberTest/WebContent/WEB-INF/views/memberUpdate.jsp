<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버정보수정</title>
</head>
<body>
	${member}
	<form action="/memberUpdate.do" method="post">
		<table border="1">
			<tr>
				<td><label for="id">아이디</label></td>
				<td><input type="text" readonly="readonly" value="${member.id}" name="id" id="id"></td>
			</tr>
			<tr>
				<td><label for="nickName">닉네임</label></td>
				<td><input type="text" value="${member.nickName}" name="nickName" id="nickName"></td>
			</tr>
			<tr>
				<td><label for="cartCount">장바구니 개수</label></td>
				<td><input type="text" value="${member.cartCount}" name="cartCount" id="cartCount"></td>
			</tr>
			<tr>
				<td><label for="addr">주소</label></td>
				<td><input type="text" value="${member.addr}" name="addr" id="addr"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="update"></td>
			</tr>
		</table>
	</form>
</body>
</html>










