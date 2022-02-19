<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<html>
<body>

<c:forEach items="${sails}" var="sail">

        SAIL ${sail.id}: ${sail}  </br>
        </br>
</c:forEach>
<a href="/user">Moje żagle</a><br/>


</body>

</html>