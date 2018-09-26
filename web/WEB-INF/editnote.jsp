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
        <h1>Edit Note</h1>
        <form method="post" action="note">
        Title: 
        <input type="text" name="title" value="${Note.title}">
        </input>
        <br>
        Contents: 
        <br>
<!--        style="height:100px;width:200px;"-->
        <input  type="text" name="contents" value="${Note.contents}">
        </input>
        <br>
        <br>
        
        <input type="submit" value="Save" >
        </form>
    </body>
</html>
