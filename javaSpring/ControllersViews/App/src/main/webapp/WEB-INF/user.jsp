<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Portal</title>
</head>
<body>
    <h1>User Portal</h1>
        <h2>Register</h2>
        	<form:form method = "POST" action = "/register" modelAttribute = "user">
            <p>
                <form:label path = "firstName">First Name:</form:label>
                <form:errors path = "firstName"/><br>
                <form:input path = "firstName"/>
            </p>
            <p>
                <form:label path = "lastName">Last Name: </form:label>
                <form:errors path = "lastName"/><br>
                <form:input path = "lastName"/>
            </p>
            <p>
                <form:label path = "email">Email:</form:label>
                <form:errors path = "email"/><br>
                <form:input path = "email"/>
            </p>
            <p>
                <form:label path = "password">Password:</form:label>
                <form:errors path = "password"/><br>
                <form:password path = "password"/>
            </p>
            <p>
                <form:label path = "passwordConfirmation">Password Confirmation:</form:label>
                <form:errors path = "passwordConfirmation"/><br>
                <form:password path = "passwordConfirmation"/>
            </p>
            <input type = "submit" value = "Register"/>
        </form:form>
        <h2>Login</h2>
        <p><c:out value = "${error}" /></p>
        <form method = "POST" action = "/login">
            <p>
                <label for = "email">Email</label><br>
                <input type = "text" name = "email"/>
            </p>
            <p>
                <label for = "password">Password</label><br>
                <input type = "password" name = "password"/>
            </p>
            <input type = "submit" value = "Login"/>
        </form>
</body>
</html>