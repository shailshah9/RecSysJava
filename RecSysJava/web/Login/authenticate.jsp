<%-- 
    Document   : authenticate
    Created on : Mar 31, 2015, 8:53:19 PM
    Author     : Hp
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.security.MessageDigest"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Authentication</title>
    </head>
    <body>    
        
        <%! PreparedStatement ps;
        Connection con;
        String dbuid,dbpswd;%>
        <% 
            RequestDispatcher dis=getServletContext().getRequestDispatcher("/sql");
            dis.include(request,response);
            try{
            dbuid=request.getParameter("userid");
            dbpswd=request.getParameter("pswd");
            System.out.println(dbuid+"\n"+ dbpswd);
            
          
            
            con=(Connection)request.getAttribute("con");
            String query="Select * from user where userid=? and pswd=?";
            ps=con.prepareStatement(query);
            ps.setString(1,dbuid);
            ps.setString(2,dbpswd);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next())
            {
                System.out.println("Correct username and password.");       
            }
            else
            {
                PrintWriter pw=response.getWriter();
                pw.print("Try again.");
                RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/Login/login.jsp");
                dispatcher.include(request,response);        
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            ps.close();
            con.close();
        }
        %>
       
    </body>
</html>