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
    <label>paramName: </label>
    <input type="text" name="paramName">
    <br/>
    <label>paramDate: </label>
    <input type="text" name="paramDate">
    <br/>
    <button>Submit</button>
</form>
<p>Wartość paramName: ${paramName} </p>
<p>Wartość paramDate: ${paramDate} </p>
</body>
</html>