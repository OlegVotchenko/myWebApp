<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Pets list</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>KIND</th>
        <th>NAME</th>
        <th>AGE</th>
    </tr>
    <c:forEach items="${petList}" var="pet">
        <jsp:useBean id="pet" type="org.itstep.mywebapp.model.Pet"/>
        <tr>
            <td>
                <%=pet.getId()%>
            </td>
            <td>
                <%=pet.getKind()%>
            </td>
            <td>
                <%=pet.getName()%>
            </td>
            <td>
                <%=pet.getAge()%>
            </td>
            <td>
                <a href="pets?action=delete&id=${pet.id}">Delete</a>
            </td>


        </tr>


    </c:forEach>
</table>

</body>
</html>
