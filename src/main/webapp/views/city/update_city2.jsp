<%@ page import="Example.model.City" %><%--
  Created by IntelliJ IDEA.
  User: Mirzabek
  Date: 11.01.2024
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% City city = (City) request.getAttribute("city");%>
<html>
<head>
    <%@include file="../css.jsp"%>
</head>
<body>
    <%@include file="../navbar.jsp"%>
    <form id="myForm" action="<%= request.getContextPath()%>/update_cit/<%= city.getId()%>">
        <div class="mb-3">
            <label for="name" class="form-label">Name: </label>
            <input type="text"  id="name" name="name" value="<%= city.getName()%>" required>
        </div>
        <div class="mb-3">
            <label for="country_id" class="form-label">Price: </label>
            <input type="number"  id="country_id" name="country_id" value="<%=city.getCountry_id()%>" required>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
    <a href="${pageContext.request.contextPath}/select_city" class="btn btn-dark">Back to Products</a>
<%@include file="../js.jsp"%>
</body>
</html>
