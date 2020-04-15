<%--
  Created by IntelliJ IDEA.
  User: daniel
  Date: 05.04.2020
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>multiply</title>
</head>
<body>
<table>
    <c:forEach var="a" begin="1" end="${rows}">
        <tr>
            <c:forEach var="b" begin="1" end="${cols}">
                <td> ${a*b} </td>
            </c:forEach>
        </tr>
    </c:forEach>
</table>


<%--<c:set var="tabSize" value="${empty size ? 10 : size}" />--%>
<%--<table>--%>
<%--    <c:forEach begin="1" end="${tabSize}" varStatus="i">--%>
<%--        <tr>--%>
<%--            <c:forEach begin="1" end="${tabSize}" varStatus="j">--%>
<%--                <td> ${i.index*j.index} </td>--%>
<%--            </c:forEach>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>

</body>
</html>