<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 7/5/2022
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>

    <h1>Calculator</h1>
    <form action="/home" method="post">

        <input type="number" id="firstInput" name="firstInput" value="${firstInput}">
        <input type="number" id="secondInput" name="secondInput" value="${secondInput}"> <br> <br>

        <select name="calculation">
            <option value="Summation">Summation (+)</option>
            <option value="Subtraction">Subtraction (-)</option>
            <option value="Multiplication">Multiplication (*)</option>
            <option value="Division">Division (/)</option>
        </select> <br> <br>

        <button type="submit">START CALCULATE</button>
        <h3>Reuslt Division :${result} </h3>

    </form>

</div>
</body>
</html>
