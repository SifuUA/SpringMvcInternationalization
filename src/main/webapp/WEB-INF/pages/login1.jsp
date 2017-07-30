<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page session="false"%>
<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 30.07.2017
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><spring:message code="title"/></title>
</head>
<body>
    <div style="text-align: right;padding: 5px;margin: 5px 0px;background: #ccc;">
        <a href="${pageContext.request.contextPath}/login1?lang=en">Login (English)</a>
            &nbsp; &nbsp;

        <a href="${pageContext.request.contextPath}/login1?lang=ru">Login (Russian)</a>
            &nbsp; &nbsp;

        <a href="${pageContext.request.contextPath}/login1?lang=ua">Login (Ukraine)</a>
    </div>

<form method="post" action="">
    <table>
        <tr>
            <td>
                <strong>
                    <spring:message code="userName"/>
                </strong>
            </td>
            <td>
                <input name="userName">
            </td>
        </tr>
        <tr>
            <td>
                <strong>
                    <spring:message code="password"/>
                </strong>
            </td>
            <td>
                <input name="password">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <spring:message code="submit" var="Submit"></spring:message>
                <input type="submit" value="${Submit}">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
