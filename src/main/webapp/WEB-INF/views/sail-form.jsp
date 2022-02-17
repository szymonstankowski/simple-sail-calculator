<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<a href="/newSail">Wroc!</a><br/>
<form:form method="post" action="/calculateNewSail" modelAttribute="sail">
    Imię:
    <input type="text" name="name"/><br/>
    Nazwisko:
    <input type="text" name="lastName"/><br/>
    Nr telefonu:
    <input type="text" name="phoneNumber"/><br/>
    Email:
    <input type="text" name="email"/><br/>

    <br/><hr>
    Parametry zagla:
    <input type= "number" name="luffLength" value="Długość liku przedniego"/><br/>
    <input type= "number" name="boomLength" value="Długość liku dolnego"/><br/>
    TYP:
    <input type= "checkbox" name="regularSail" value= "Rekreacyjny"><br/>
    <input type= "checkbox" name="racingSail" value= "Regatowy"><br/>

    Osprzęt:
    <input type= "radio" name="slides" value="Pełzacze"><br/>
    <input type= "radio" name="luffLine" value="Liklina"><br/>
    <input type="submit" value="Oblicz"><br/>
    <hr>

</form:form>
<a href="/index">Up!</a><br/>

</body>

</html>