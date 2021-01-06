<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
<center>
<h2><c:out value="${error}"/></h2>
	<h1>What is the code?</h1>
	<form action="/code" method="post">
		<p><input type="text" name="code"></p>
		<p><input type="submit" value="Try Code"></p>
	</form>
	</center>
</body>
</html>