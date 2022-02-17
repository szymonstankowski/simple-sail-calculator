<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
<a href="/newSail">Wroc!</a><br/>
<form:form method="post" action="" modelAttribute="sail">
    Lik przedni:
    <form:input type="number" path="luffLength"></form:input><br/>
    Lik dolny:
    <form:input type="number" path="boomLength"></form:input><br/>

    <form:radiobuttons items="${sailTypes}" path="sailType" itemLabel="name" itemValue="id"></form:radiobuttons><br/>
    <form:radiobuttons items="${mountingTypes}" path="sailMountingSystem" itemLabel="name" itemValue="id"></form:radiobuttons><br/>

    <input type="submit" value="SAVE SAIL"><br/>
</form:form>


</body>

</html>