<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Long num1 = Long.parseLong(request.getParameter("numb1"));
Long num2 = Long.parseLong(request.getParameter("numb2"));
Long num3 = Long.parseLong(request.getParameter("numb3"));
%>
subtract of <%= num1 %> and <%= num2 %> and <%= num3 %> is <%= num1 - num2 - num3 %>
</body>
</html>