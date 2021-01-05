<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Current Visit Count</title>
</head>
<body>
	<h1>You have visited <a href="/">http://localhost:8080/</a> <c:out value="${counter}"/> times.</h1>
	<h1><a href="/">Test another visit?</a></h1>
</body>
</html>