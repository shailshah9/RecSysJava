<%-- 
    Document   : register
    Created on : 1 Feb, 2015, 4:54:57 PM
    Author     : bsnl
--%>
<jsp:include page="/RecSysJava/sql"/>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.security.MessageDigest"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>    
        
        <%! PreparedStatement ps;
        Connection con;
        boolean t;
        byte[] pswd;
        String fname,lname,email,pass,date,num,userid,query;%>
        <% 
            try{
            con=(Connection)request.getAttribute("con");
            fname=request.getParameter("fname");
            lname=request.getParameter("lname");
            email=request.getParameter("email");
            pass=request.getParameter("pass");
            date=request.getParameter("date");
            num=request.getParameter("phno");
            userid=email.split("@")[0];
            MessageDigest d=MessageDigest.getInstance("SHA-1");
            d.reset();
            d.update(pass.getBytes("UTF-8"));
            pswd=d.digest();
            t=true;
            query = "insert into user values(?,?,?,?,?,?,?,?)";
            ps=con.prepareStatement(query);
            ps.setString(1,userid);
            ps.setString(2,fname);
            ps.setString(3,lname);
            ps.setString(4,email);
            ps.setBytes(5,pswd);
            ps.setString(6,num);
            ps.setString(7,date);
            ps.setBoolean(8,t);
            ps.executeUpdate();
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
        Registered.
    </body>
</html>
