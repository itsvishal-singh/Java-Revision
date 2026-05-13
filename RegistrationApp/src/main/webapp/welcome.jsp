<%@ page language="java"
         contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>
<html>
<head>
<title>JSP Web App</title>
</head>
<body bgcolor="black"
      style="align-content:center; color:#bdbdbd;">
<h2>JSP Web App to generate Dynamic Response</h2>
<%!
    int age = 18;
%>
<%
    String uname = request.getParameter("uname");
    String ucity = request.getParameter("ucity");
    Date date = new Date();
%>
<h1>Hello : <%= uname %></h1>
<h1>You are from : <%= ucity %></h1>
<h1>Current Date : <%= date %></h1>
<h1>Age : <%= age %></h1>
</body>
</html>