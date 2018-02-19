<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h1>Add items to your Todo App</h1>

<form action="/submit" method="post">
    <input type="text" name="listItem"/>
    <input type="submit" value="Submit"/>
<ul>

    <c:forEach items="${todoItem}" var="element">
        <%--<c:if request.getParameter(${element})>checked="checked"</c:if>--%>
        <li><input type="checkbox" value=${element} name="lisst"/>${element} </li>
        <div></div>
    </c:forEach>

</ul>

    <input type="submit" value="Clear Completed"/>
</form>

</body>
</html>