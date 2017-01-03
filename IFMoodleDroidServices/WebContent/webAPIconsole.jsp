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
				<li><a href="about.jsp">About</a></li>
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
				<li><a class="page-scroll" href="#portfolio">Portfolio</a></li>
				<li><a class="page-scroll" href="#about">About</a></li>
				<li><a class="page-scroll" href="#team">Team</a></li>
				<li><a class="page-scroll" href="#contact">Contact</a></li>
			</ul>
		</div>
		<!-- /#sidebar-wrapper -->


		<section id="news">
			<div id="page-content-wrapper">
				<div class="container-fluid">
					<div class="row">
						<div class="col-lg-12">
							<h1>News</h1>
							<div class="col-sm-9">
								<div class="panel panel-default">
									<table class="table">
										<tr>
											<td class="text-right col-sm-3 col-xs-5"><strong>Description</strong></td>
											<td class="col-sm-9 col-xs-7">Get several news from user</td>
										</tr>
										<tr>
											<td class="text-right"><strong>HTTP Method</strong></td>
											<td class="http-method">POST</td>
										</tr>
										<tr>
											<td class="text-right"><strong>Authentication</strong></td>
											<td>Required</td>
										</tr>
									</table>
								</div>


								<form method="post"
									action="http://localhost:8080/IFMoodleDroidServices/rest/listener/retornaNoticias">
									
									<table class="table">
										<tr>
											<td class="text-right col-sm-3 col-xs-5"><strong>Login</strong></td>
											<td class="col-sm-9 col-xs-7"><input type="text" name="login" /></td>
										</tr>
										<tr>
											<td class="text-right"><strong>Senha</strong></td>
											<td class="http-method"><input type="text" name="senha" /></td>
										</tr>
										<tr>
											<td class="text-right"><strong>Flag de decriptação(0 - off, 1 - on)</strong></td>
											<td><input type="text" name="flagDecriptacao" title="aaaa" /></td>
										</tr>
									</table>
									
									<button type="submit" value="Enviar" >Enviar</button>
									
										<!-- <p>Login:</p>
										<input type="text" name="login" /><br />
										<p>Senha:</p>
										<input type="text" name="senha" /><br />
										<p>flag de decriptação(0 - off, 1 - on):</p>
										<input type="text" name="flagDecriptacao" title="aaaa" /> <br />
										<input type="submit" value="Enviar" /> -->
								</form>

							</div>


						</div>
					</div>
				</div>
			</div>
		</section>
		<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />
		<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />
		<br /> <br /> <br /> <br />


	</div>
	<!-- /#wrapper -->

</body>

</html>
