<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/header.jsp" %>
<%@ page import="java.util.List" %>
<%@ page import="com.springdemo.models.UserDetails" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<b><h3>${message}</h3></b>
	<table class="flatTable">
		<tr class="titleTr">
			<td><b>user_id</b></td>
			<td>&nbsp;</td>
			<td><b>user_name</b></td>
			<td>&nbsp;</td>
			<td><b>phone_number</b></td>
		</tr>
		<c:forEach var="user" items="${userDetails}">
		    <tr>
			    <td><c:out value="${user.getUserId()}"/></td>
				<td>&nbsp;</td>
				<td><c:out value="${user.getUserName()}"/></td>
				<td>&nbsp;</td>
				<td><c:out value="${user.getPhoneNumber()}"/></td>
			</tr>
		</c:forEach>
	</table>
<%@ include file="/footer.jsp" %>