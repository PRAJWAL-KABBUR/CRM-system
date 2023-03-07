<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<body>
	<h2>Lead Information</h2>
	<hr>
	     First Name => ${leads.firstName}
	<br> Last Name => ${leads.lastName}
	<br> Email => ${leads.email}
	<br> Mobile => ${leads.mobile}
	<br> Source => ${leads.source}
	<br>

	<form action="composeEmail" method="post">
		<input type="hidden" name="email"> 
		<input type="submit" value="Email">
	</form>

	<form action="convertLead" method="post">
		<input type="hidden" name="id" value="${leads.id}"> 
		<input type="submit" value="Convert">
	</form>

</body>
</html>