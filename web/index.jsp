<%--
  Created by IntelliJ IDEA.
  User: Marta
  Date: 11.09.2019
  Time: 19:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Strona główna</title>
</head>
<body>
<h2>Przelicznik tekstu</h2>

<form action="/statistics" method="get">
    <textarea placeholder="Tutaj wpisz tekst" name="text" rows="20" cols="80"></textarea></br>
    <input type="submit" value="Wyślij">
</form>
</body>
</html>
