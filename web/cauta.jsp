<%-- 
    Document   : clienti
    Created on : 09.12.2019, 10:33:11
    Author     : Alexandra
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
    body {
  background-image: url("https://farm66.static.flickr.com/65535/48940152967_b9893e0f70_b.jpg");
  
  
}
table {
  border-collapse: collapse;
  width: 60%;
  
}
 header {
  padding: 20px 0;
  color: white;
}

th, td {
  text-align: left;
   padding: 15px;
}

tr{
    background-color: white;}

th {
  background-color: #3CBC8D;
  color: white;
}
h1{
    color:white;
}
p.ex1 {
  border: 1px solid black;
  outline-style: solid;
  outline-color: #3CBC8D;
  background-color: white;
  width: 10%;
  font-size: 30px;
}

</style>
</head>
<body>
<header class="container">
  
        <h1 class="col-sm-4"> T.A. Library
    </header>  
     
   
<center> <p class="ex1">Carti</p>
   

<form method="post">

<table border="2">
<tr>
<th>Cod carte</th>
<th>Cod editura</th>
<th>Cod autor</th>
<th>Titlu</th>
<th>Categorie</th>
<th>Numar Pagini</th>
</tr>
<%
try
{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/biblioteca?zeroDateTimeBehavior=convertToNull";
String username="root";
String password="";
String query="select codc,code,coda,Titlu,Categorie,NumarPagini from carte where Categorie like'%"+ request.getParameter("cauta")+"%'";
Connection conn=DriverManager.getConnection(url,username,password);
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{

%>
    <tr>
    <td><%=rs.getInt("codc") %></td>
    <td><%=rs.getInt("code") %></td>
    <td><%=rs.getInt("coda") %></td>
    <td><%=rs.getString("Titlu") %></td>
    <td><%=rs.getString("Categorie") %></td>
    <td><%=rs.getInt("NumarPagini")%></td>
    
</tr>
        <%

}
%>
    </table>
    <%
    rs.close();
    stmt.close();
    conn.close();
    }
catch(Exception e)
{
    e.printStackTrace();
    }




%>
</body>
</form>
</html> 