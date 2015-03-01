<%-- 
    Document   : register.jsp
    Created on : Feb 28, 2015, 1:38:32 AM
    Author     : Shail Shah
--%>

<%@page import="Connect.UserDao"%>  
<jsp:useBean id="obj" class="GetterSetter.GS_Reg">  
</jsp:useBean>  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
int i=UserDao.register(obj);
out.print(obj.getFname());
out.print(i+"\n");
if(i>0)  
out.print("You are successfully registered");  
  
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
