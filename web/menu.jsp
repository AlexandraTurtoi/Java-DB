<%-- 
    Document   : menu
    Created on : 08.12.2019, 23:57:00
    Author     : Alexandra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
  <title>Biblioteca-Meniu</title>
  <meta charset="utf-8"/>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
  <link href='https://fonts.googleapis.com/css?family=Roboto:300,400,700' rel='stylesheet' type='text/css'>
  <style type="text/css">
      header {
  padding: 20px 0;
}
body {
  background-image: url("https://farm66.static.flickr.com/65535/48940152967_b9893e0f70_b.jpg");
  
}
header .row,
footer .row {
  display: flex;
  align-items: center;
}

header h1 {
  font-weight: 700;
  margin: 0;
  color: white;
}
input[type=text] {
  width: 20%;
  box-sizing: border-box;
  border: 2px solid #ccc;
  border-radius: 4px;
  font-size: 16px;
  background-color: white;
  background-image: url('searchicon.png');
  background-position: 10px 10px; 
  background-repeat: no-repeat;
  padding: 12px 20px 12px 40px;
}
p{
    color:white;
}
input {
  width: 10%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: none;
  background-color: #3CBC8D;
  color: black;
}
  </style>
</head>
<body>
  <header class="container">
    <div class="row">
        <h1 class="col-sm-4"> T.A. Library</div>
    </header>  
  
    <br>
    <br>
<center> <p>Cauta dupa categorie:</p>
   
<form action="cauta.jsp" method="post" autocomplete="off">
    <center> <input type="text" name="cauta" >
  <br>
  <center> <input type="submit" value="Cauta"> 
      
</form>
    <br>
    <br>
    <br>
    <br>
    <form action="clienti.jsp" method="post">
        <center> <input type="submit" value="Vezi Clienti">
    </form><form action="carti.jsp" method="post">
        <center> <input type="submit" value="Vezi Carti">
    </form>
    <form action="imprumuturi.jsp" method="post">
        <center> <input type="submit" value="Vezi Imprumuturi">
    </form>
    <form action="autori.jsp" method="post">
        <center> <input type="submit" value="Vezi Autori">
    </form>
    <form action="edituri.jsp" method="post">
        <center> <input type="submit" value="Vezi Edituri">
    </form>
  </body>
</html>
