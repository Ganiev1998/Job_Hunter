<%@ page import="Example.model.Country" %><%--
  Created by IntelliJ IDEA.
  User: Mirzabek
  Date: 11.01.2024
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Country country = (Country) request.getAttribute("country");%>
<html>
<head>
    <%@include file="../css.jsp"%>
</head>
<body>
<%@include file="../navbar.jsp"%>
<form id="myForm" action="<%= request.getContextPath()%>/update_count/<%= country.getId()%>">
    <div class="mb-3">
        <label for="name" class="form-label">Name: </label>
        <input type="text"  id="name" name="name" value="<%= country.getName()%>" required>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<a href="${pageContext.request.contextPath}/select_country" class="btn btn-dark">Back to Products</a>
<%@include file="../js.jsp"%>
</body>
</html>