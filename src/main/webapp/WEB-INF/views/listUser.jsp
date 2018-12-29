<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>name</td>
        <td>password</td>
    </tr>
    <c:forEach items="${users}" var="s" varStatus="st">
        <tr>
            <td>${s.name}</td>
            <td>${s.password}</td>
        </tr>
    </c:forEach>
</table>