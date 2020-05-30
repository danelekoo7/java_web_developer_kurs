<%--
  Created by IntelliJ IDEA.
  User: daniel
  Date: 09.05.2020
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>wszystkie szkice</title>
</head>
<body>
<table border='1' style='border-collapse:collapse'>
    <h2><a href="<c:url value="/draft/add"/>">Dodaj nowy szkic</a><br>
        <a href="<c:url value="/article/show"/>">Wszystkie artykuły</a></h2>
    <tbody>
    <th>title</th>
    <th>author</th>
    <th>categories</th>
    <th>content</th>
    <th>created</th>
    <th>updated</th>
    <th>draft</th>


    <c:forEach items="${drafts}" var="draft">
        <tr>
            <td><c:out value="${draft.title}"/></td>
            <td><c:out value="${draft.author.firstName} ${draft.author.lastName}"/></td>
            <td>
                <c:forEach items="${draft.categories}" var="category">
                    <c:out value="${category.name}"/>
                </c:forEach>
            <td><c:out value="${draft.content}"/></td>
            <td><c:out value="${draft.created}"/></td>
            <td><c:out value="${draft.updated}"/></td>
            <td><c:out value="${draft.draft}"/></td>
            <td><a href="<c:url value="/draft/edit/${draft.id}"/>">Edytuj</a><br>
                <a href="<c:url value = "/draft/delete/${draft.id}"/>">Usun</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
