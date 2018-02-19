<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h1>Add items to your Todo App</h1>

<form action="/submit" method="post">
    <input type="text" name="listItem"/>
    <input type="submit" value="Submit"/>
</form>
<%--<div>${todoItems1.listItem}</div>--%>
<ul>
    <c:forEach items="${todoItem}" var="element">
        <li><input type="checkbox" checked/>${element.key}</li>
    </c:forEach>
</ul>

<form action="/submit" method="post">
    <button type="submit" name="clearButton" value="Clear completed">Clear completed</button>
</form>

</body>
</html>