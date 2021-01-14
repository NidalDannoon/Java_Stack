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
			<h1>${myquestion.question}</h1>
		<p>
		Tag: <c:forEach items="${myTags}" var="tag" varStatus="loop">
		<span><c:out value="${tag.subject},"/></span>
		</c:forEach>		
		</p>
				<table>
					<thead>
						<tr><td>Answers</td></tr>
					</thead>
					<tbody>
						<c:forEach items="${answers}" var="answer" varStatus="loop">
						<tr><td>
							<c:out value="${answer.answer}"/>
						</td></tr>
						</c:forEach>
					</tbody>
				</table>
				<h2>Add your answer:</h2>
				<form:form action="/add-answer" method="post" modelAttribute="answer">
					<p>
						<form:label path="answer">Answer:</form:label>
						<form:errors path="answer" />
						<form:textarea path="answer" class="textarea"/>
						<input type="hidden" name="question" value="${myquestion.id}">
					</p><br>
						<input type="submit" value="Answer it"/>
				</form:form>
</body>
</html>