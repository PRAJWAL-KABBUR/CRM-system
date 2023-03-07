<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>compose</title>
</head>
<body>
 	<h2> Compose Email</h2>
 	<hr>
 	${message}
 	<form action="sendEmail" method="post">
 	
 	To <input type ="text" name="to" value="${email}">  <br>
 	Subject <input type="text" name="sub">  <br> 
 	<textarea name ="msg" rows="50" cols="50"></textarea>  <br>
 	<input type="submit" value="Send">
 	
 	</form>
 	
</body>
</html>