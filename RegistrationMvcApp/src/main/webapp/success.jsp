<html>
<head>
<title>Success</title>
</head>
<body bgcolor="black" style="align-content:center; color:#bdbdbd;">
<h2>registration Successful </h2>
<%
String name = (String) session.getAttribute("name");
%>
<h2> Hey <%= name %>!!! You have registered Successfully</h2>
</body>
</html>