<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add new Ninja</title>
</head>
<body>
			<h1>Add new Ninja</h1>
			<form:form action="/add-ninja" method="post" modelAttribute="ninja">
   			        <form:label path="dojo">Dojo:</form:label>
   			        <form:errors path="dojo"/>
   			    	<form:select path="dojo">
   			    		<c:forEach items="${dojos}" var="dojo">
   			    			<form:option value="${dojo}"><c:out value="${dojo.name}"/></form:option>
		    			</c:forEach>
		    			</form:select>
			        <form:label path="firstName">First Name:</form:label>
			        <form:errors path="firstName"/>
			        <form:input path="firstName"/>
			        <form:label path="lastName">Last Name:</form:label>
			        <form:errors path="lastName"/>
			        <form:input path="lastName"/>
			        <form:label path="age">Age:</form:label>
			        <form:errors path="age"/>
			        <form:input path="age"/>
			    <input type="submit" value="Create"/>	 
			</form:form>
</body>
</html>