<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.format.FormatStyle" %>
<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: Tipok
  Date: 18.06.2017
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
    <title>Drink List</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>capacity</th>
        <th>dateTime</th>
        <th>userId</th>
    </tr>
    <%!DateTimeFormatter fmt =DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM); %>
    <c:forEach var="drink" items="${drinkList}">
        <jsp:useBean id="drink" type="org.itstep.mywebapp.model.Drink"/>
        <tr>
            <td><%=drink.getId()%></td>
            <td><%=drink.getName()%></td>
            <td><%=drink.getCapacity()%></td>
            <td><%=fmt.format(drink.getDateTime())%></td>
            <td><%=drink.getUserId()%></td>
            <td><a href="drinks?action=update&id=${drink.id}">UPDATE</a></td>
            <td><a href="drinks?action=delete&id=${drink.id}">DELETE</a></td>
        </tr>
    </c:forEach>
</table>
<a href="drinks?action=create">ADD</a>
</body>
</html>
