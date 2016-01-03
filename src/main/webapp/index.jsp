
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Text JS<br/>
<% for (String elem: (String[])request.getAttribute("data")){%>
<%=elem%><br/>
<%}%>
</body>
</html>
