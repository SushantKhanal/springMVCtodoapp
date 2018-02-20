<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel='stylesheet' href='<c:url value="/Resources/css/style.css" />' type='text/css' media='all' />
    <script type="text/javascript" src="/Resources/js/app.js"></script>
</head>
<body>
<h1>Add items to your Todo App</h1>

<form action="/submit" method="post">
    <input type="text" name="listItem"/>
    <input type="submit" value="Submit"/>
<ul>

    <c:forEach items="${todoItem}" var="element" varStatus="loop">
        <%--<c:if request.getParameter(${element})>checked="checked"</c:if>--%>
        <li><input onClick="check(${loop.index})" type="checkbox" value=${element} name="lisst"/>
            <input id="${loop.index}" class="changeDefault" name="TTT" value="${element}"/>
        </li>

        <div></div>
    </c:forEach>

</ul>

    <input type="submit" value="Clear Completed"/>
${lisst}
</form>
</body>
</html>