<html>
<head>
<title>Failed</title>
</head>
<body bgcolor="black" style="align-content:center; color:#bdbdbd;">
<h2>Failed to register</h2>
<%
String name = (String) httpSession.getAttribute("name");
%>
<h2> Hey <%= name %>!!! You Failed to register</h2>
</body>
</html>