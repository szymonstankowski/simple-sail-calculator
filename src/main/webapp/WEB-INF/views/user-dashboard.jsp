<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
<a href="/newuser">Wroc!</a><br/>

<c:forEach items="${sails}" var="sail">
    <a href="/addPlant/${plant.id}">Dodaj</a>
    <br/>

    DŁUGOŚĆ LIKU PRZEDNIEGO:
    <u><b>${sail.luffLength}</b></u>
    <br/>
    DŁUGOŚĆ LIKU DOLNEGO:
    </b> ${sail.boomLength}
    <br/>
    POWIERZCHNIA ŻAGLA:
    </b> ${sail.sailArea} dni
    <br/>
    TYP ŻAGLA:
    </b> ${sail.sailType}
    <br/>
    <b>OKRES WEGETACJI:</b> ${plant.vegetationPeriod}
    <br/>
    <b>TYP GLEBY:</b> ${plant.soilType}
    <br/><hr><br/>

</c:forEach>


</body>

</html>