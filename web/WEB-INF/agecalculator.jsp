<%-- 
    Document   : agecalculator
    Created on : 21-Sep-2022, 8:23:07 AM
    Author     : Hanin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="AgeCalculator">
            Enter your age:<input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday"><br>
            <p> ${massage}</p>
            <a href="ArithmeticCalculator" class="arithmeticLink">Arithmetic Calculator</a>
        </form>
    </body>
</html>
