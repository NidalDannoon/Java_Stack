<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@page import="java.util.ArrayList"%>
	<%@page import="java.util.Collections"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<title>Home page</title>
</head>
<body>
<center>
<h2>Your Gold: <c:out value="${gold}"/> - <a href="/reset">Reset</a></h2>
<div class="row">
<form action="/processing" method="post">
<h2>Farm</h2>
<h3>Earn 10-20 golds</h3>
<input type="hidden" name="building" value="farm">
<button type="submit">Find Gold</button>
</form>
</div>
<div class="row">
<form action="/processing" method="post">
<h2>Cave</h2>
<h3>Earn 5-10 golds</h3>
<input type="hidden" name="building" value="cave">
<button type="submit">Find Gold</button>
</form>
</div>
<div class="row">
<form action="/processing" method="post">
<h2>House</h2>
<h3>Earn 2-5 golds</h3>
<input type="hidden" name="building" value="house">
<button type="submit">Find Gold</button>
</form>
</div>
<div class="row">
<form action="/processing" method="post">
<h2>Casino</h2>
<h3>Earn/Take 0-50 golds</h3>
<input type="hidden" name="building" value="casino">
<button type="submit">Find Gold</button>
</form>
</div>
<div>
<ul>
		        <% if(session.getAttribute("activities") != null){ %>
       			<% ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities"); %>
       			<% for(int i = 0; i < activities.size(); i++) { %>
       				<li><%= activities.get(i) %></li>
       			<% } %>
       			<% } %>
        	</ul>
</div>
</center>
</body>
</html>