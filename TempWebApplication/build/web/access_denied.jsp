<%-- 
    Document   : access_denied
    Created on : 23 May 2024, 18:36:04
    Author     : yolan
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Access Denied Page</title>
    </head>
    <body>
        <h1>Access denied</h1>
        <p style="color:red;">
            You are not allowed to access this page!!!
        </p>
        <p>
            Please click <a href="index.html">here</a> to go back to the menu page or <a href="index.html">here</a> to the main page.
        </p>
        <p>
            Click <a href="LogOutServlet.do">here</a> to logout.
        </p>
    </body>
</html>

