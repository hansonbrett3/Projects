<%-- 
    Document   : response
    Created on : Oct 22, 2015, 2:48:30 PM
    Author     : apprentice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Response</h1>
        <a href="RSVPServlet">Home</a><br />
        Your answer was ${param.myAnswer}.<br />
        ${message}
    </body>
</html>
