<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 7/1/2022
  Time: 9:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <form action="/convert">
    <fieldset>
         <legend> Convert USD </legend> <br>

        <label>USD</label>
        <input type="number" name="usd" required>
        <br><br>
        <label>VNĐ</label>
        <input type="number" name="vnd" required>
        
        <button type="submit">Submit</button>

    </fieldset>

  </form>

  </body>
</html>
