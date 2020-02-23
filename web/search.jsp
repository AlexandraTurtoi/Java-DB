<%@page import="java.util.List"%>
<%@ page import="testbiblioteca.Client" %>
<%@ page import="testbiblioteca.Interogari" %>




<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
<head>

<title>Rezultatul cautarii</title>
</head>
<body>


 
 <%
   
     List ls=null;
     Interogari i = new Interogari();
     ls=testbiblioteca.Interogari.getClienti();
 
	
	
 %>
 
Pagina va afisa <B>  </B>

<BR>
<%=ls%>
<BR>



</body>
</html>