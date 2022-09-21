<%-- 
    Document   : arithmeticcalculator
    Created on : 21-Sep-2022, 10:15:54 AM
    Author     : Hanin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="ArithmeticCalculator">
            First:<input type="text" name="first" value="${first}"><br>
            Second:<input type="text" name="second" value ="${second}"><br>
            <input type="submit" name="button" value="+">
            <input type="submit" name="button" value="-">
            <input type="submit" name="button" value="*">
            <input type="submit" name="button"  value="%">
            <p>Result: ${sms}</p>
            <a href="AgeCalculator" class="AgeCalculator">Age Calculator</a>
        </form>
    </body>
</html>
