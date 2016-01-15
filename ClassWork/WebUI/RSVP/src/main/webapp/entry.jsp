<%-- 
    Document   : Entry
    Created on : Oct 22, 2015, 1:34:00 PM
    Author     : apprentice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta http-equv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, intital-scale=1">
        <meta name="description" content=" ">
        <meta name="author" content=" ">
        <link rel="shortcut icon" href="http://getbootstrap.com/assets/ico/favicon.ico">
        <title>RSVP</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/starter-template.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <div class="starter-template">
                <h1> I'm having a party and you are invited!!!</h1>
                Can you attend? <br />
                <form action='RSVPServlet' method='POST'>
                    Yes <input type="radio" name="myAnswer" value="Yes" checked />
                    No <input type="radio" name="myAnswer" value="No" checked />
                    
                    Reason (if not attending): <br />
                    <select name="myReason">
                        <option value="Out of town">Out of town</option>
                         <option value="Schedule Conflict">Schedule Conflict</option>
                         <option value="You suck">You suck</option>
                    </select>
                    
                    Notes: <br />
                    <input type="text" name="myNotes"><br />
                    <input type="submit" name="RSVP" />
            </div>
        </div>
    </body>
</html>
