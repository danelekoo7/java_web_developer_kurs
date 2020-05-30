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
    <title>dodawanie artykułu</title>
</head>
<body>
<form:form method="POST" modelAttribute="article">
    title: <form:input path="title"/>
    <form:errors path="title"/>
    <br>

    author: <form:select path="author" itemLabel="firstName" itemValue="id" items="${authors}"/>
    <form:errors path="author"/>
    <br>
    categories: <form:select path="categories" itemLabel="name" itemValue="id" multiple="true" items="${categories}"/>
    <form:errors path="categories"/>
    <br>
    content: <form:input  path="content"/>
    <form:errors path="content"/>

    <br>
    created: <form:input type="date" path="created"/>
    <form:errors path="created"/>
    <br>
    updated: <form:input type="date" path="updated"/>
    <form:errors path="updated"/>
    <br>
    <input type="submit">
</form:form>
</body>
</html>
