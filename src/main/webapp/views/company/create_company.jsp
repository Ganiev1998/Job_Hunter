<%--
  Created by IntelliJ IDEA.
  User: Mirzabek
  Date: 11.01.2024
  Time: 0:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <%@include file="../css.jsp"%>
    <%@include file="../navbar.jsp"%>
</head>
<body>
<form id="myForm" action="<%= request.getContextPath()%>/create_companies">
    <div class="mb-3">
        <label for="name" class="form-label">name: </label>
        <input type="text"  id="name" name="name" required>
    </div>
    <div class="mb-3">
        <label for="name" class="form-label">country id: </label>
        <input type="number" id="city id" name="city id" required>
    </div>
    <div class="mb-3">
        <label for="name" class="form-label">name: </label>
        <input type="text"  id="description" name="description" required>
    </div>
    <div class="mb-3">
        <label for="name" class="form-label">name: </label>
        <input type="text"  id="telNumber" name="telNumber" required>
    </div>
    <div class="mb-3">
        <label for="name" class="form-label">name: </label>
        <input type="text"  id="webSite" name="webSite" required>
    </div>
    <button type="submit" class="btn btn-success">Submit</button>
</form>
<%@include file="../js.jsp"%>
</body>
</html>