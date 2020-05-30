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
    <title>wszyscy autorzy</title>
</head>
<body>
<table border='1' style='border-collapse:collapse'>
    <h2><a href="<c:url value="/author/add"/>">Dodaj nowego autora</a><br>
        <a href="<c:url value="/article/show"/>">Wszystkie artykuły</a>
    </h2>
    <tbody>
    <th>firstName</th>
    <th>lastName</th>

    <c:forEach items="${authors}" var="author">
        <tr>
            <td><c:out value="${author.firstName}"/></td>
            <td><c:out value="${author.lastName}"/></td>
            <td><a href="<c:url value="/author/edit/${author.id}"/>">Edytuj</a></td>
            <td><a href="<c:url value = "/author/delete/${author.id}"/>">Usun</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
