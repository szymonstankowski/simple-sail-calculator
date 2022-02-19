<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
<a href="/newuser">Wroc!</a><br/>
<form:form method="post" action="/newuser" modelAttribute="user">
    Imię:<br/>
    <form:input type="text" path="name"></form:input><br/>
    Nazwisko:<br/>
    <form:input type="text" path="lastName"></form:input><br/>

    Numer telefonu:<br/>
    <form:input type="number" path="phoneNumber"></form:input><br/>
    Email:<br/>
    <form:input type="text" path="email"></form:input><br/>

    <input type="submit" value="Utwóż konto"><br/>
</form:form>


</body>

</html>