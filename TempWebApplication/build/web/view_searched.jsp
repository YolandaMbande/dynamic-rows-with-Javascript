<%-- 
    Document   : view_searched
    Created on : 22 May 2024, 22:29:18
    Author     : yolan
--%>

<%@page import="java.util.Base64"%>
<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entity.Temp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Searched Values Page</title>
    </head>
    <body>
        <h1>Searched Values, innit?</h1>
        
        <%
            List<Temp> ttemp = (List<Temp>)request.getAttribute("ttemp");
            
        %>
        
        <p>
            Below is a list of all students who have registered more than one module.
        </p>
        
        <table>
            <%
                for(int m = 0; m < ttemp.size(); m++)
                {
            %>
            <tr>
                <td>Name :</td>
                <td><% ttemp.get(m).getName(); %></td>
            </tr>
            <tr>
                <td>Name :</td>
                <td><img src="data:image/jpeg;base64, <% Base64.getEncoder().encodeToString(ttemp.get(m).getImage());%>"></td>
            </tr>
            <%
                }
            %>
        </table>
        
        <p>
            When done uploading ----> <a href="index.html">GO BACK!</a>
        </p>
    </body>
</html>
