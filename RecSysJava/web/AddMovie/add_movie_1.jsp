<%-- 
    Document   : add_movie
    Created on : 3 Mar, 2015, 6:41:41 PM
    Author     : bsnl
--%>

<%@page import="Connect.MovieDao"%>  
<jsp:useBean id="obj" class="GetterSetter.GS_Movie">  
</jsp:useBean>  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
int i=MovieDao.add(obj);
out.print(i+"\n");
if(i>0)  
out.print(" Movie added successfully.");  
  
%>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
