<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contact Us</title>


<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="css/simple-sidebar.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>

	<!-- Inicio do topo de paginas -->
	<nav class="navbar navbar-inverse navbar-static-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="home.jsp">Moodle Services</a>
		</div>
		<ul class="nav navbar-nav">
			<!-- <li class="active"><a href="#">Home</a></li> -->
			<li><a href="webAPIconsole.jsp">Web Api Console</a></li>
			<li><a href="about.jsp">About</a></li>
			<li><a href="contactUs.jsp">Contact Us</a></li>
		</ul>
	</div>
	</nav>
	<!-- Fim do topo de paginas -->

	<div class="container">
		<h2>Send your mensage</h2>
		</br>
		<p>To contact the developer team, please enter your details below
			to submit a request.</p>
		</br>
		<form class="form-horizontal">

			<div class="form-group">
				<label class="control-label col-sm-2" for="name">Name:</label>
				<div class="col-sm-4">
					<input type="name" class="form-control" id="name"
						placeholder="Enter your Name">
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="email">Email:</label>
				<div class="col-sm-4">
					<input type="email" class="form-control" id="email"
						placeholder="Enter your email">
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="text">Text:</label>
				<div class="col-sm-4">
					<textarea class="form-control" placeholder="Enter your text"
						rows="5" id="text"></textarea>
				</div>
			</div>

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Submit</button>
				</div>
			</div>
		</form>
	</div>



</body>
</html>