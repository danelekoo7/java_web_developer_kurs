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
    <title>wszystkie artykuły</title>
</head>
<body>
<table border='1' style='border-collapse:collapse'>
    <h3><a href="<c:url value="/article/add"/>">Dodaj nowy artykuł</a><br>
        <a href="<c:url value="/draft/show"/>"> wszystkie szkice</a><br>
        <a href="<c:url value="/category/show"/>"> wszystkie kategorie</a><br>
        <a href="<c:url value="/author/show"/>"> wszyscy autorzy</a>
    </h3>
    <tbody>
    <th>title</th>
    <th>author</th>
    <th>categories</th>
    <th>content</th>
    <th>created</th>
    <th>updated</th>
    <th>draft</th>
    <th>option</th>

    <c:forEach items="${articles}" var="article">
        <tr>
            <td><c:out value="${article.title}"/></td>
            <td><c:out value="${article.author.firstName} ${article.author.lastName}"/></td>
            <td>
                <c:forEach items="${article.categories}" var="category">
                    <c:out value="${category.name}"/>
                </c:forEach>
            <td><c:out value="${article.content}"/></td>
            <td><c:out value="${article.created}"/></td>
            <td><c:out value="${article.updated}"/></td>
            <td><c:out value="${article.draft}"/></td>
            <td><a href="<c:url value="/article/edit/${article.id}"/>">Edytuj</a><br>
                <a href="<c:url value = "/article/delete/${article.id}"/>">Usun</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
