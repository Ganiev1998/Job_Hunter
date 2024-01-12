<%@ page import="java.util.List" %>
<%@ page import="Example.model.Country" %><%--
  Created by IntelliJ IDEA.
  User: Mirzabek
  Date: 10.01.2024
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% List<Country> list = (List<Country>) request.getAttribute("country"); %>
<html>
<head>
  <%@include file="../navbar.jsp"%>
  <%@include file="../css.jsp"%>
</head>
<body>
<table class="table-bordered" style="width: 700px">

  <tr style="border: 1px solid black; background-color: #a6c3ca; text-space: 25px">
    <th>id</th>
    <th>nomi</th>
    <th></th>
  </tr>
    <% for (Country country:list) {%>
  <tr style="border: 1px solid black; background-color: #a6c3ca">
    <td><%=country.getId()%></td>
    <td><%=country.getName()%></td>
    <td> <a href="<%=request.getContextPath()%>/update_country2/<%=country.getId()%>">update</a></td>
  </tr>
    <%}%>
  <%@include file="../js.jsp"%>
</body>
</html>
