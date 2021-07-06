<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: daniel
  Date: 26.01.2020
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <c:forEach items="${ksiazki}" var="ksiazka">
        <tr>
            <td>${ksiazka.title}</td>
            <td>${ksiazka.author}</td>
            <td>${ksiazka.isbn}</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
