<%@ page import="Example.model.Company" %><%--
  Created by IntelliJ IDEA.
  User: Mirzabek
  Date: 11.01.2024
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Company company = (Company) request.getAttribute("company");%>
<html>
<head>
    <%@include file="../css.jsp"%>
</head>
<body>
<%@include file="../navbar.jsp"%>
<form id="myForm" action="<%= request.getContextPath()%>/update_comp/<%= company.getId()%>">
    <div class="mb-3">
        <label for="name" class="form-label">Name: </label>
        <input type="text"  id="name" name="name" value="<%= company.getName()%>" required>
    </div>
    <div class="mb-3">
        <label for="city_id" class="form-label">Price: </label>
        <input type="number"  id="city_id" name="city_id" value="<%=company.getCity_id()%>" required>
    </div>
    <div class="mb-3">
        <label for="name" class="form-label">Name: </label>
        <input type="text"  id="description" name="description" value="<%= company.getDescription()%>" required>
    </div>
    </div>
    <div class="mb-3">
        <label for="name" class="form-label">Name: </label>
        <input type="text"  id="telNumber" name="telNumber" value="<%= company.getTelNumber()%>" required>
    </div>
    </div>
    <div class="mb-3">
        <label for="name" class="form-label">Name: </label>
        <input type="text"  id="webSite" name="webSite" value="<%= company.getWebSite()%>" required>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<a href="${pageContext.request.contextPath}/select_company" class="btn btn-dark">Back to Products</a>
<%@include file="../js.jsp"%>
</body>
</html>
