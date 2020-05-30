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
    <title>wszystkie kategorie</title>
</head>
<body>
<table border='1' style='border-collapse:collapse'>
    <h2><a href="<c:url value="/category/add"/>">Dodaj nowa kategorie</a><br>
        <a href="<c:url value="/article/show"/>">Wszystkie artykuły</a></h2>
    <tbody>
    <th>name</th>
    <th>description</th>

    <c:forEach items="${categories}" var="category">
        <tr>
            <td><c:out value="${category.name}"/></td>
            <td><c:out value="${category.description}"/></td>
            <td><a href="<c:url value="/category/edit/${category.id}"/>">Edytuj</a></td>
            <td><a href="<c:url value = "/category/delete/${category.id}"/>">Usun</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
