<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--
  Created by IntelliJ IDEA.
  User: ray_f
  Date: 28/09/2021
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display User</title>
</head>
<body>
    Owner:
        <c:if test="${myHouse.owner == ''}">
            <c:out value = "Owner Unknown?" />
        </c:if>

        <c:if test="${myHouse.owner != ''}">
            <c:out value = "${myHouse.owner}" />
        </c:if>

<br>
Address: <c:if test="${myHouse.address == ''}">
            <c:out value = "Address Unknown" />
        </c:if>

        <c:if test="${myHouse.address != ''}">
            <c:out value = "${myHouse.address}" />
        </c:if>
<br>
Number of Bedrooms: <c:if test="${myHouse.numberOfBedrooms == ''}">
                        <c:out value = "0" />
                    </c:if>

                    <c:if test="${myHouse.numberOfBedrooms != ''}">
                        <c:out value = "${myHouse.numberOfBedrooms}" />
                    </c:if>
</body>
</html>