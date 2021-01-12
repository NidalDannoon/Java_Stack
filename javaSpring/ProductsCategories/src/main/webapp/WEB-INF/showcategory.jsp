<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><c:out value="${category.name}"/></title>
</head>
<body>
			<h1><c:out value="${category.name}"/></h1>
			<h2>Products:</h2>
			<c:forEach items="${category.products}" var="product">
				<h3>-<c:out value="${product.name}"/></h3>
			</c:forEach>
			<form:form action="/attach-product" method="post" modelAttribute="productCategory">
			        <form:label path="product">Add Product:</form:label>
   			    	<form:select path="product">
   			    		<c:forEach items="${products}" var="product">
   			    			<form:option value="${product.id}"><c:out value="${product.name}"/></form:option>
		    			</c:forEach>
 			    	</form:select>
			    <form:hidden path="category" value="${category.id}" />
			    <input id="btn" type="submit" value="Create"/>	 
			</form:form>	
</body>
</html>