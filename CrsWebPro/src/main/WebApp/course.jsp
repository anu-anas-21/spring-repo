<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Course Page</title>
</head>
<body>
    <h1>Welcome to the Course Page</h1>
    <%
        String courseName = request.getParameter("courseName");
        if (courseName != null && !courseName.isEmpty()) {
    %>
        <p>Course Name: <strong><%= courseName %></strong></p>
    <%
        } else {
    %>
        <p>No course selected.</p>
    <%
        }
    %>
</body>
</html>