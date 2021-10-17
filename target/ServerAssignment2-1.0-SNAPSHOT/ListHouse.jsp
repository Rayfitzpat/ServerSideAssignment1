<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--
  Created by IntelliJ IDEA.
  User: Ray
  Date: 17/10/2021
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of Houses</title>
</head>
<body>
<table>
    <tr>
        <th>
            Owner
        </th>

        <th>
            Address
        </th>

        <th>
            Number of Bedrooms
        </th>
    </tr>

    <c:forEach items = "${myHouseList}" var = "house">

        <tr>
            <td><c:if test="${house.owner == ''}">
                     <c:out value = "Owner Unknown" />
                </c:if>
                <c:if test="${house.owner != ''}">
                    <c:out value = "${house.owner}" />
                </c:if>
            </td>

            <td><c:if test="${house.address == ''}">
                    <c:out value = "Address Unknown" />
                 </c:if>
                <c:if test="${house.address != ''}">
                    <c:out value = "${house.address}" />
                </c:if>
            </td>

            <td><c:if test="${house.numberOfBedrooms == ''}">
                     <c:out value = "0" />
                 </c:if>
                <c:if test="${house.numberOfBedrooms != ''}">
                    <c:out value = "${house.numberOfBedrooms}" />
                </c:if>
            </td>
        </tr>

    </c:forEach>


</table>
</body>
</html>
