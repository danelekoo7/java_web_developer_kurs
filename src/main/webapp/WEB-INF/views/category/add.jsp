<%--
  Created by IntelliJ IDEA.
  User: daniel
  Date: 09.05.2020
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>dodawanie kategorii</title>
</head>
<body>
<form:form method="POST" modelAttribute="category">
    name: <form:input path="name"/>
    <form:errors path="name"/>
    description: <form:input path="description"/>
    <form:errors path="description"/>

    <input type="submit">
</form:form>
</body>
</html>
