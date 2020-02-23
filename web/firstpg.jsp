<%-- 
    Document   : firstpg
    Created on : 08.12.2019, 23:25:57
    Author     : Alexandra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
	<title>Biblioteca</title>
	
        <style type="text/css">
            
            body {
	height: 100%;
	margin: 0;
	text-align: center;
	width: 100%;
}

h1 {
	font-size: 32px;
  font-family: Palatino, 'Palatino Linotype', serif;
  color: rgb(121,149,117);
}

h2 {
	font-size: 56px;
}


.hero {
	padding: 250px 0;
	margin: 30px;
  font-family: 'Trebuchet MS', Helvetica, sans-serif;
  background-image: url("https://www.qualtrics.com/m/assets/blog/wp-content/uploads/2018/08/shutterstock_1068141515.jpg");
  background-size: cover;
  color: #ffffff;
}


p {
  font-size: 2rem;
}

.hero a {
	color: #00FFAA;
	font-size: 1.25em;
	text-decoration: none;
}

#footer {
  font-size: 0.75rem;
}
input {
  width: 10%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: none;
  background-color: #3CBC8D;
  color: white;
}

        </style>
</head>
<body>
	<h1>Biblioteca locala</h1>
	<div class="hero">
		<h2>T.A. Library</h2>
		<p>by Turtoi Alexandra</p>
                
        <section class="submission">
          <!--Add your code below-->
          <form action="menu.jsp" method="post">
          <input type="submit" value="Exploreaza">
       
                   </form> </section>
	</div>
	<p id="footer">&copy; ACIEE</p>
</body>
</html>
