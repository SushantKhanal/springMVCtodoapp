<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel='stylesheet' href='<c:url value="/Resources/css/style.css" />' type='text/css' media='all'/>
    <script type="text/javascript" src="/Resources/js/app.js"></script>
</head>

<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<h1>Add items to your Todo App</h1>

<form action="/submit" method="post">
    <div id="mainList"></div>
    <input type="text" name="listItem"/>
    <input type="submit" value="Submit" name="submitted"/>
    <ul>
<%--This forEach is to display the number of items in the list named 'todoItems'--%>
        <c:forEach items="${todoItems}" var="element" varStatus="loop">

            <li><input id="${element}${loop.index}" onClick="check('${loop.index}','${element}')" type="checkbox" value='${element}'
                       name="markedItems"/>
                <input id="${loop.index}${element}" class="changeDefault" name="editedItems" value="${element}"/>
            </li>${loop.index}
<%--the innner forEach is to re-strike the texts that were marked but not deleted--%>
            <c:forEach items="${idOfMarkedItems}" var="checkedElementId">
                <c:set var="element" value="${element}"/>
                <c:set var="checkedElementId" value="${checkedElementId}"/>
                <c:set var="loopIndex" value="${loop.index}"/>
                <c:set var="elementId" value="${loop.index}${element}"/>


                <c:if test="${checkedElementId.equals(elementId)}">

                    <script>
                        var y = '${element}' + '${loop.index}';
                        //var y = '${checkboxIdId}';
                        document.getElementById(y).click();

                    </script>
                </c:if>
            </c:forEach>

        </c:forEach>

    </ul>

    <input type="submit" value="Clear Completed" name="submitted"/>

</form>
</body>
</html>