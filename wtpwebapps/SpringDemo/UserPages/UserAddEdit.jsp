<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/header.jsp" %>
<form method="post" name="userForm" id="userForm" action="${pageContext.request.contextPath}/SaveUserDetails">
	<table class="flatTable">
		<tr>
			<td>Name : <input type="text" id="userName" name="userName" value=""></td>
		</tr>
		<tr>
			<td>Phone Number : <input type="text" id="phoneNumber" name="phoneNumber" value=""></td>
		</tr>
		<tr>
			<td>
				<input type="submit" id="saveUser" class="saveUser" value="Submit">
			</td>
		</tr>
	</table>
</form>
<%@ include file="/footer.jsp" %>