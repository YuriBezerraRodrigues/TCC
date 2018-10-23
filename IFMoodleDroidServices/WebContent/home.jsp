<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>

	<!-- Inicio do topo de paginas -->
	<nav class="navbar navbar-inverse navbar-static-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="home.jsp">Moodle Services</a>
		</div>
		<ul class="nav navbar-nav">
			<li><a href="webAPIconsole.jsp">Web Api Console</a></li>
			<!-- <li><a href="about.jsp">About</a></li> -->
			<li><a href="contactUs.jsp">Contact Us</a></li>
		</ul>
	</div>
	</nav>
	<!-- Fim do topo de paginas -->

	<!-- Inicio do Texto central da pagina, o background-color e para nao aparecer divisao -->
	<div style="background-color: white;" class="jumbotron">
		<h1 align="center">Moodle Services Tutorial</h1>
		<br />
		<p style="text-align: center;">The main objective of this work is
			to develop a webservice the Moodle learning platform. The project is
			allocated at the Federal Institute of Education, Science and
			Technology of Pernambuco, Recife Campus.</p>
	</div>
	<!-- Fim do Texto central da pagina -->

	
	<!-- Inicio Console Api -->
	<div class="col-md-3 col-sm-6">
		<div class="about-content">
			<h3>
				<a href="webAPIconsole.jsp" title="Web API Console">Web API
					Console</a>
			</h3>
			<p>
				Quickly test requests to our Web API, get back live JSON data and
				formatted requests. <a href="webAPIconsole.jsp"
					class="more-link">Read more</a>
			</p>
		</div>
	</div>
	<!-- Fim Console Api -->

	<!-- Inicio About -->
	<!-- <div class="col-md-3 col-sm-6">
		<div class="about-content">
			<h3>
				<a href="about.jsp" title="About">About</a>
			</h3>
			<p>
				Learn a little more of the developers of this project and research
				that have been developed. <a href="about.jsp" class="more-link">Read
					more</a>
			</p>
		</div>
	</div> -->
	<!-- Fim About -->
	
	<!-- Inicio ContactUs -->
	<div class="col-md-3 col-sm-6">
		<div class="about-content">
			<h3>
				<a href="contactUs.jsp" title="contactUs">Contact Us</a>
			</h3>
			<p>
				Send your mensage. <a href="contactUs.jsp" class="more-link">Read
					more</a>
			</p>
		</div>
	</div>
	<!-- Fim ContactUs -->
	
</body>
</html>