<%-- 
    Document   : login
    Created on : Mar 31, 2015, 8:53:03 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8" />
        <title>Login</title>
    </head>
    <body>
        <form action="authenticate.jsp"  method="post" >
            <label for="userid">Username</label>
            <input name="userid" required type="text"/>	<br/><br/>
            <label for="pswd">Password</label>
            <input name="pswd" type="password" required/> <br/><br/>
            <input type="submit" value="LOG IN"/>
            <input type="reset" value="RESET"/>
        </form>
    </body>
</html>
