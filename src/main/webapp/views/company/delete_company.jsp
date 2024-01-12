<%@ page import="java.util.List" %>
<%@ page import="Example.model.Company" %><%--
  Created by IntelliJ IDEA.
  User: Mirzabek
  Date: 10.01.2024
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% List<Company> list = (List<Company>) request.getAttribute("company"); %>
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
        <th>city id</th>
        <th>description</th>
        <th>telNumber</th>
        <th>webSite</th>
    </tr>
        <% for (Company company:list) {%>
    <tr style="border: 1px solid black; background-color: #a6c3ca">
        <td><%=company.getId()%></td>
        <td><%=company.getName()%></td>
        <td><%=company.getCity_id()%></td>
        <td><%=company.getDescription()%></td>
        <td><%=company.getTelNumber()%></td>
        <td><%=company.getWebSite()%></td>
        <td> <a href="<%=request.getContextPath()%>/delete_comp/<%=company.getId()%>">delete</a></td>
    </tr>
        <%}%>
</table>
    <%@include file="../js.jsp"%>
</body>
</html>


