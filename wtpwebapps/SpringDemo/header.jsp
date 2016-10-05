<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link href='/SampleWebApp/Css/Theme.css' rel='stylesheet' type='text/css'>
		<link rel="stylesheet" type="text/css" href="/SampleWebApp/Css/TemplateStyles.css">
		<script src="/SampleWebApp/Js/jquery.min.js"></script>
		<script type="text/javascript" src="/SampleWebApp/Js/Template.js" ></script>
		<script type="text/javascript" src="/SampleWebApp/Js/App.js" ></script>
		<title>Spring Web Application</title>
	</head>
	<body>
		<table class="flatTable">
			<tr class="headerTr">
				<td class="titleTd">Spring Web Application</td>
			</tr>
			<tr class="headerTr">
				<td><a href="${pageContext.request.contextPath}/index.jsp" >Home</a> &nbsp; &nbsp; <a href="${pageContext.request.contextPath}/UserList" >List Users</a> &nbsp; &nbsp; <a href="${pageContext.request.contextPath}/UserAdd" >Add User</a></td>
			</tr>
		</table>
		<div class="page-wrap">