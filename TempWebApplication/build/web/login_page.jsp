<%-- 
    Document   : login_page
    Created on : 22 May 2024, 23:18:59
    Author     : yolan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login Page, innit?</h1>
        
        <p>
            Please enter your log in details to perform any action.
        </p>
        
        <form action="j_security_check" method="POST">
            <table>
                <tr>
                    <td>Name : </td>
                    <td><input type="text" name="j_username" required></td>
                </tr>
                <tr>
                    <td>Password : </td>
                    <td><input type="password" name="j_password" required></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="LOGIN"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
