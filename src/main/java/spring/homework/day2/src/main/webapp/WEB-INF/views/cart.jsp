<%--
  Created by IntelliJ IDEA.
  User: daniel
  Date: 13.04.2020
  Time: 09:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../../style.css">
    <title>cart</title>
</head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>price</td>
        <td>quantity</td>
        <td>quantity +1</td>
        <td>quantity -1</td>
        <td>remove position</td>
    </tr>
    <c:forEach begin="0" items="${cart}" var="item">
        <tr>
            <td>${item.getProduct().getId()}</td>
            <td>${item.getProduct().getName()}</td>
            <td>${item.getProduct().getPrice()}</td>
            <td>${item.getQuantity()}</td>
            <td><a href="http://localhost:8080/increase/${item.getProduct().getId()}">+</a></td>
            <td><a href="http://localhost:8080/decrease/${item.getProduct().getId()}">-</a></td>
            <td><a href="http://localhost:8080/remove/${item.getProduct().getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
