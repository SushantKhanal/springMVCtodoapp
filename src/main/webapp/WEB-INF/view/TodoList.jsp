<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel='stylesheet' href='<c:url value="/Resources/css/style.css" />' type='text/css' media='all'/>
    <script type="text/javascript" src="/Resources/js/app.js"></script>
</head>
<body>
<h1>Add items to your Todo App</h1>

<form action="/submit" method="post">
    <input type="text" name="listItem"/>
    <input type="submit" value="Submit" name="submitted"/>
    <ul>

        <c:forEach items="${todoItem}" var="element" varStatus="loop">

            <li><input id="${element}${loop.index}" onClick="check(${loop.index})" type="checkbox" value='${element}'
                       name="lisst"/>
                <input id="${loop.index}" class="changeDefault" name="TTT" value="${element}"/>
            </li>

            <c:forEach items="${lisst}" var="checkedElement">
                <c:set var="element" value="${element}"/>
                <c:set var="checkedElement" value="${checkedElement}"/>
                <c:set var="loopIndex" value="${loop.index}"/>
                <%--element: <c:out value="${element}" />--%>
                <%--checkedElement: <c:out value="${checkedElement}" />--%>

                <c:if test="${checkedElement.equals(element)}">

                    <script>
                        var x = '${element}' + '${loop.index}';
                        //if(document.getElementById(x) != null) {
                        document.getElementById(x).click();
                        //}
                    </script>
                </c:if>
            </c:forEach>

        </c:forEach>

    </ul>

    <input type="submit" value="Clear Completed" name="submitted"/>
    <%--${editedItems}--%>
    <%--${submitted}--%>
    <%--${lisst}--%>
</form>
</body>
</html>