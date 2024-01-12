<%@ page import="Example.model.City" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Mirzabek
  Date: 10.01.2024
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% List<City> list = (List<City>) request.getAttribute("city"); %>
<html>
<head>
  <%@include file="../navbar.jsp"%>
  <%@include file="../css.jsp"%>
</head>
<body>
<table class="table-bordered" style="width: 700px">

  <tr style="border: 1px solid black; text-space: 25px; background-color: #a6c3ca">
    <th>id</th>
    <th>nomi</th>
    <th>country id</th>
    <th></th>
  </tr>
    <% for (City city:list) {%>
  <tr style="border: 1px solid black; background-color: #a6c3ca">
    <td><%=city.getId()%></td>
    <td><%=city.getName()%></td>
    <td><%=city.getCountry_id()%></td>
    <td> <a href="<%=request.getContextPath()%>/delete_cit/<%=city.getId()%>">delete</a></td>
  </tr>
    <%}%>
  <%@include file="../js.jsp"%>
</body>
</html>

