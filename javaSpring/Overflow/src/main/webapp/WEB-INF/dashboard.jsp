<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>Question Dashboard</h1>
		<table>
			<thead>
				<tr>
					<td>Questions</td>
					<td>Tags</td>
				</tr>
			</thead>
			<tbody>
					<c:forEach items="${questions}" var="question" varStatus="loop">
					<tr>	
					<td><a href="/questions/${question.id}"><c:out value="${question.question}"/></a></td>
							<td>
							<c:forEach items="${question.tags}" var="tags">
								${tags.subject}
							</c:forEach>
							</td>
					</tr>
					</c:forEach>
			</tbody>
		</table>
			<a href="/questions/new">New Question</a>
</body>
</html>