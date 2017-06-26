<%--
  Created by IntelliJ IDEA.
  User: Tipok
  Date: 26.06.2017
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit drink</title>
</head>
<body>

    <jsp:useBean id="drink" type="org.itstep.mywebapp.model.Drink" scope="request"/>

    <form method="post" action="drinks">
        <input type="hidden" name="id" value="${drink.id}">

        <dl>
            <dt>Name:</dt>
            <dd><input type="text" value="${drink.name}" size=40 name="name"></dd>
        </dl>
        <dl>
            <dt>Capacity:</dt>
            <dd><input type="text" value="${drink.capacity}" size=40 name="capacity"></dd>
        </dl>

        <button type="submit">Save</button>


    </form>

</body>
</html>
