<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, shrink-to-fit=no, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Web Api Moodle Services</title>

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
				<li><a href="webAPIconsole.jsp">Web Api Console</a></li>
				<!-- <li><a href="about.jsp">About</a></li> -->
				<li><a href="contactUs.jsp">Contact Us</a></li>
			</ul>
		</div>
	</nav>
	<div id="wrapper">

		<!-- Sidebar -->
		<div id="sidebar-wrapper">
			<ul class="sidebar-nav">
				<li class="sidebar-brand"><a href="webAPIconsole.jsp"> Web
						API Console </a></li>
				<li><a class="page-scroll" href="#news">News</a></li>
				<li><a class="page-scroll" href="#cursos">List Courses</a></li>
				<li><a class="page-scroll" href="#foruns">List a Course
						Forums</a></li>
				<li><a class="page-scroll" href="#topicForuns">List Topics
						in a Forum</a></li>
				<li><a class="page-scroll" href="#personName">User by name</a></li>

			</ul>
		</div>
		<!-- /#sidebar-wrapper -->


		<section id="news">
			<div id="page-content-wrapper">
				<div class="container-fluid">
					<div class="row">
						<div class="col-lg-12">
							<h1>Teste</h1>
							<div class="col-sm-9">
								
								<form method="post"
									action="http://localhost:8080/IFMoodleDroidServices/rest/listener/verificarCursos">
									<div class="form-group row">
										<div class="col-xs-2">
											<label for="ex1">col-xs-2</label> <input class="form-control"
												id="ex1" type="text">
										</div>
									</div>

									<table class="table">
									<tr>
									<div class="form-group row">
										<div class="col-xs-2">
											<label for="ex1">col-xs-2</label> <input class="form-control"
												id="ex1" type="text">
										</div>
									</div>
									</tr>
										<tr>
										<div class="form-group row">
										<div class="col-xs-2">
											<td class="text-right col-sm-3 col-xs-5"><strong>Login</strong></td>
											<td class="col-sm-9 col-xs-7"><input type="text" 
												class="form-control input-normal" 
												placeholder="Login" name="login" />
											</td>
											</div>
											</div>
										</tr>
										<tr>
											<td class="text-right"><strong>Password</strong></td>
											<td class="http-method"><input type="password"
												name="senha" /></td>
										</tr>
										<tr>
											<td class="text-right"><strong>Encryption
													Flag(0 - off, 1 - on)</strong></td>
											<td><input type="text" name="flagDecriptacao"
												title="aaaa" /></td>
										</tr>

									</table>
									<button type="submit" class="btn btn-default" value="Enviar">Try
										it</button>
								</form>

							</div>


						</div>
					</div>
				</div>
			</div>
			<hr style="border-width: 4px;">
		</section>
		<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />

	</div>
	<!-- /#wrapper -->

</body>

</html>
