<%--
  Created by IntelliJ IDEA.
  User: daniel
  Date: 04.02.2020
  Time: 09:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${empty param.author ? "empty" : "Wybrany autor "}
${param.author}
</body>
</html>
