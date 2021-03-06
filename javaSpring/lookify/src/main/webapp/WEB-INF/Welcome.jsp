<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Abood
  Date: 1/10/2021
  Time: 12:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lookify</title>
</head>
<body>
<a href="/songs/new">Add New</a><a href="/search/top10">Top Songs</a>

<form action="/search" method="post">
    <p>
        <input type="text" name="artist"/>
    </p>
    <input type="submit" value="Search Artists"/>
</form>
<table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Rating</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${songs}" var="song">
        <tr>
            <td><a href="/songs/${song.id}"><c:out value="${song.title}"/></a></td>
            <td><c:out value="${song.rating}"/></td>
            <td><a href="/delete/${song.id}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
