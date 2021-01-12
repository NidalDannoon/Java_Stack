<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><c:out value="${product.name}"/></title>
</head>
<body>
			<h1><c:out value="${product.name}"/></h1>
			<h2>Categories:</h2>
			<c:forEach items="${product.categories}" var="category">
				<h3>-<c:out value="${category.name}"/></h3>
			</c:forEach>
			<form:form action="/attach-category" method="post" modelAttribute="productCategory">
			        <form:label path="category">Add Category:</form:label>
   			    	<form:select path="category">
   			    		<c:forEach items="${categories}" var="category">
   			    			<form:option value="${category.id}"><c:out value="${category.name}"/></form:option>
		    			</c:forEach>
 			    	</form:select>
			    <form:hidden path="product" value="${product.id}" />
			    <input id="btn" type="submit" value="Create"/>	 
			</form:form>
</body>
</html>