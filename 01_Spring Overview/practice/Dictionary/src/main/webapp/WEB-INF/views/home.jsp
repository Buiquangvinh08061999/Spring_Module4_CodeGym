
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="main">
    <table>
        <form action="/home" method="post">
            <tr>
                <th colspan="2">
                    <h1>DICTIONARY PROGRAM</h1>
                </th>
            </tr>

            <tr>
                <th><input type="text" placeholder="Input your word" id="input1" name="inputWord" value="${oldValue}"> </th>
                <th><input type="text" readonly placeholder="Result" value="${newValue}" ></th>
            </tr>
            <tr>
                <th colspan="2">
                    <button type="submit">SEARCH</button>
                </th>
            </tr>

        </form>
    </table>

</div>
</body>
</html>
