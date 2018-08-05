<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ARTICLE</title>
</head>
<body>
<div id="article">
	<h1>ARTICLE</h1>
	<select id="idoption" name="option">
		<option value="none">검색조건</option>
		<option value="memid">ID</option>
		<option value="teamid">팀명</option>
		<option value="name">이름</option>
	</select>
		&nbsp;&nbsp;
		<input type="text" id="word"></input>
		&nbsp;&nbsp;
		<input type="button" id="searchBtn" value="SEARCH"></input>
	<table>
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>나이</th>
			<th>성별</th>
			<th>역할</th>
			<th>팀명</th>
		</tr>
		<c:forEach var="member" items="${list}">
		<tr>
			<td>${member.memId}</td>
			<td>${member.name}</td>
			<td>${member.age}</td>
			<td>${member.gender}</td>
			<td>${member.roll}</td>
			<td>${member.teamId}</td>
		</tr>
		</c:forEach>
	</table>
</div>
</body>