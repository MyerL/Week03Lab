<%-- 
    Document   : viewnote
    Created on : Sep 24, 2018, 8:25:53 AM
    Author     : 738409
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        
        
        <h1>View Note</h1>
        Title: ${Note.title}
        <br>
        Contents: ${Note.contents}
        <br>
        <br>
        <a href="note?edit">edit</a>
    </body>
</html>
