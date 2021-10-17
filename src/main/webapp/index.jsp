<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Assignment 2</title>
</head>
<body>
<h1><%= "Please enter the house details"%>
</h1>
<br/>
<form method="post" action="ShowHouseServlet">
    <table>
        <tr>
            <td>Owner: </td>
            <td><input type="text" name = "owner"></td>
        </tr>

        <tr>
            <td>Address: </td>
            <td><input type="text" name = "address"></td>
        </tr>

        <tr>
            <td>Number of Bedrooms: </td>
            <td><input type="text" name = "numberOfBedrooms"></td>
        </tr>

        <tr>
            <td> <input type="submit" name = "Submit" value="Show this House"></td>
            <td> <input type="submit" name = "Submit" value="Add new House to DB and display with all houses" formaction="CreateHouseServlet" method="POST"></td>
        </tr>
    </table>
</form>

<form method="post" action="ListHouseServlet">
    <table>
        <tr>
            <td> <input type="submit" name = "Get House List" value="Get House List"></td>
        </tr>
    </table>
</form>
</body>
</html>