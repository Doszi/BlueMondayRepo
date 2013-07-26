<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> BlueMonday Server Page </title>
</head>
<body>
<%-- This is a JSP Comment before JSP Scriplet --%>
<%
 
	//Prints out to HTML page
	out.println("<h1>Welcome to BlueMonday Server Page!</h1>");
	
	// Redirect to another page
	
%>

	
    <form action="GreetingServlet" method="POST">
   	 	<table>
			<tr>
				<td>Login</td>
				<td><input name="Login" size="25"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input name="Password" size="25"/></td>
			</tr>
		</table>
    	<input type="submit" value="Submit">
    </form>
    
    <br>
	<a href="HelloWorldMapping">Go to server</a>
	<br>
	<a href="jsp/help.jsp">Help</a>
	
	<br>
	
</body>
</html>