<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>

<body>

<h3>podgląd wszystkich kategorii</h3>

<table border='1' style='border-collapse:collapse'>
    <th>id</th>
    <th>nazwa</th>
    <th>opis</th>
    <tbody>
    <c:forEach items="${categories}" var="category">
        <tr>
            <td><c:out value="${category.id}"/></td>
<%--            <td><c:out value="${category.name}"/></td>--%>
            <td><a href="<c:url value="article/showFromCategory/${category.id}"/>">${category.name}</a></td>
            <td><c:out value="${category.description}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>






<h2><a href="<c:url value="/article/show"/>">Wszystkie artykuły</a></h2>

<h3>podgląd ostatnich artykułów</h3>

<table border='1' style='border-collapse:collapse'>
    <th>tytuł</th>
    <th>data utworzenia</th>
    <th>początek artykułu</th>
    <tbody>
    <c:forEach items="${articles}" var="article">
        <tr>
            <td><c:out value="${article.title}"/></td>
            <td><c:out value="${article.created}"/></td>
            <td><c:out value="${fn:substring(article.content, 0, 200)}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>