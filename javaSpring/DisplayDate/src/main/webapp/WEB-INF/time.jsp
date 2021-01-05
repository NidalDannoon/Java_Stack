<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<link rel="stylesheet" href="css/style.css">
<script src="js/time.js"></script>
<title>Time</title>
</head>
<body>
		<h1 class="green"><c:out value="${date}"/></h1>
</body>
</html>