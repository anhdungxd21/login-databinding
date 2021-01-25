<%--
  Created by IntelliJ IDEA.
  User: Faceless
  Date: 1/25/2021
  Time: 9:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h3>Home</h3>
    <form:form action="login" method="post" modelAttribute="login">
        <fieldset>
            <Legend>Login</Legend>
            <table>
                <tr>
                    <td><form:label path="account">Account</form:label></td>
                    <td><form:input path="account"></form:input></td>
                </tr>
                <tr>
                    <td><form:label path="password">Password</form:label></td>
                    <td><form:input path="password"></form:input></td>
                </tr>
                <tr>
                    <td></td>
                    <td><form:button>Login</form:button></td>
                </tr>
            </table>
        </fieldset>
    </form:form>
</body>
</html>
