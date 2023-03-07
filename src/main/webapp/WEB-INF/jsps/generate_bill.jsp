<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill Info</title>
</head>
<body>
	<h2>Bill Information</h2>
	<!-- Tomcat server is installed to interact with jsps-->
	<form action="saveBill" method="post">
	   <table>
	   <tr> 
	      <td>First Name</td>       <!-- To pre-populate data, value has ben added -->
	      <td><input type="text" name="firstName" value="${contact.firstName}"></td>
	   </tr>
	  <tr> 
	      <td>Last Name</td>
	      <td><input type="text" name="lastName" value="${contact.lastName}"></td>
	   </tr>
	   <tr> 
	      <td>Email</td>
	      <td><input type="text" name="email" value="${contact.email}"></td>
	   </tr>
	   <tr> 
	      <td>Mobile</td>
	      <td><input type="text" name="mobile" value="${contact.mobile}"></td>
	   </tr>
	   <tr> 
	      <td>Product Name</td>     <!-- No pre-population of data -->
	      <td><input type="text" name="product"></td>
	   </tr> 
	   <tr> 
	      <td>Quantity</td>
	      <td><input type="text" name="quantity"></td>
	   </tr>
	   <tr> 
	      <td>Amount</td>
	      <td><input type="text" name="amount"></td>
	   </tr>
	     <tr> 
	      <td><input type="submit" value="Generate"></td>
	   </tr>      
	      </table>
	</form>
</body>
</html>