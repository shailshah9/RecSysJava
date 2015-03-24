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
out.print("<h2>Movie added successfully.</h2>"); 

  
%>  
<!DOCTYPE html>

