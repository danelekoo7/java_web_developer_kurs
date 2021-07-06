<%--
  Created by IntelliJ IDEA.
  User: daniel
  Date: 05.04.2020
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="form" action="form" method="post">
    <label>id: </label>
    <input type="number" name="id">
    <br/>
    <label>name: </label>
    <input type="text" name="name">
    <br/>
    <label>price: </label>
    <input type="number" step="0.01" name="price" >
    <br/>
    <label>quantity: </label>
    <input type="number" name="quantity">
    <br/>
    <button>Submit</button>
</form>
<%--<p>Wartość paramName: ${paramName} </p>--%>
<%--<p>Wartość paramDate: ${paramDate} </p>--%>
</body>
</html>