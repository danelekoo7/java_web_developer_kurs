<%--
  Created by IntelliJ IDEA.
  User: daniel
  Date: 14.04.2020
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>allCookies</title>
</head>
<body>
<c:forEach items="${allCookies}" var="element">
    <p>${element.getName()} ${element.getValue()}</p>
</c:forEach>
</body>
</html>
