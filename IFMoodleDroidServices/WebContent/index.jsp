<%-- 
    Document   : index
    Created on : 29/08/2012, 03:34:16
    Author     : Felipe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pagina Teste</title>
</head>
<body>
	<h1>Seja Bem Vindo ao Services do Moodle Droid!</h1>
	
	<p>Noticias:</p>
	<form method="post"
		action="http://localhost:8080/IFMoodleDroidServices/rest/listener/retornaNoticias">
		<p>login:</p><input type="text" name="login" /><br /> 
		<p>Senha:</p><input type="text" name="senha" /><br /> 
		<p>flag de decriptação(0 - off, 1 - on):</p><input type="text" name="flagDecriptacao" title="aaaa" />
		<br /> 
		<input type="submit" value="Enviar" />
	</form>
	<hr>
	<p>Verificar Cursos de um determinado aluno:</p>
	<form method="post"
		action="http://localhost:8080/IFMoodleDroidServices/rest/listener/verificarCursos">
		<p>login:</p><input type="text" name="login" /><br /> 
		<p>Senha:</p><input type="text" name="senha" /><br /> 
		<p>flag de decriptação(0 - off, 1 - on):</p><input type="text" name="flagDecriptacao" title="aaaa" />
		<br /> 
		<input type="submit" value="Enviar" />
	</form>
	<hr>
		<p>Listar Forums de um curso:</p>
	<form method="post"
		action="http://localhost:8080/IFMoodleDroidServices/rest/listener/retornaForumsCurso">
		<p>login:</p><input type="text" name="login" /><br /> 
		<p>Senha:</p><input type="text" name="senha" /><br /> 
		<p>flag de decriptação(0 - off, 1 - on):</p><input type="text" name="flagDecriptacao" title="aaaa" />
		<br /> 
		<p>Id_curso:</p><input type="text" name="cursoId" /><br />
		<input type="submit" value="Enviar" />
	</form>
	<hr>
	<p>Listar topicos de um forum:</p>
	<form method="post"
		action="http://localhost:8080/IFMoodleDroidServices/rest/listener/retornaTopicosForum">
		<p>login:</p><input type="text" name="login" /><br /> 
		<p>Senha:</p><input type="text" name="senha" /><br /> 
		<p>flag de decriptação(0 - off, 1 - on):</p><input type="text" name="flagDecriptacao" title="aaaa" />
		<br /> 
		<p>forumId:</p><input type="text" name="forumId" /><br />
		<input type="submit" value="Enviar" />
	</form>
	<hr>
		<p>Listar mensagens de um topico:</p>
	<form method="post"
		action="http://localhost:8080/IFMoodleDroidServices/rest/listener/retornaMensagensTopico">
		<p>login:</p><input type="text" name="login" /><br /> 
		<p>Senha:</p><input type="text" name="senha" /><br /> 
		<p>flag de decriptação(0 - off, 1 - on):</p><input type="text" name="flagDecriptacao" title="aaaa" />
		<br /> 
		<p>Id_topico:</p><input type="text" name="topicoId" /><br />
		<input type="submit" value="Enviar" />
	</form>

	<hr>
	<p>Procurar uma pessoa por nome:</p>
	<form method="post"
		action="http://localhost:8080/IFMoodleDroidServices/rest/listener/consultaUsuariosNome">
		<p>login:</p><input type="text" name="login" /><br /> 
		<p>Senha:</p><input type="text" name="senha" /><br /> 
		<p>Nome:</p><input type="text" name="nome" /><br />
		<p>flag de decriptação(0 - off, 1 - on):</p><input type="text" name="flagDecriptacao" title="aaaa" />
		<br /> 
		<input type="submit" value="Enviar" />
	</form>
	<hr>
		<p>Meus contatos:</p>
	<form method="post"
		action="http://localhost:8080/IFMoodleDroidServices/rest/listener/meusContatos">
		<p>login:</p><input type="text" name="login" /><br /> 
		<p>Senha:</p><input type="text" name="senha" /><br /> 
		<p>flag de decriptação(0 - off, 1 - on):</p><input type="text" name="flagDecriptacao" title="aaaa" />
		<br /> 
		<input type="submit" value="Enviar" />
	</form>
	<br>
	<hr>
		<p>Mensagens Enviadas e nao Lidas </p>
	<form method="post"
		action="http://localhost:8080/IFMoodleDroidServices/rest/listener/mensagensEnviadasNaoLidas">
		<p>login:</p><input type="text" name="login" /><br /> 
		<p>Senha:</p><input type="text" name="senha" /><br /> 
		<p>flag de decriptação(0 - off, 1 - on):</p><input type="text" name="flagDecriptacao" title="aaaa" />
		<br /> 
		<input type="submit" value="Enviar" />
	</form>
	<br>
	<hr>
	
			<p>Mensagens Enviadas e Lidas </p>
	<form method="post"
		action="http://localhost:8080/IFMoodleDroidServices/rest/listener/mensagensEnviadasLidas">
		<p>login:</p><input type="text" name="login" /><br /> 
		<p>Senha:</p><input type="text" name="senha" /><br /> 
		<p>flag de decriptação(0 - off, 1 - on):</p><input type="text" name="flagDecriptacao" title="aaaa" />
		<br /> 
		<input type="submit" value="Enviar" />
	</form>
	<br>
	<hr>
	
				<p>Enviar uma mensagem</p>
	<form method="post"
		action="http://localhost:8080/IFMoodleDroidServices/rest/listener/enviarMensagem">
		<p>login:</p><input type="text" name="login" /><br /> 
		<p>Senha:</p><input type="text" name="senha" /><br /> 
		<p>flag de decriptação(0 - off, 1 - on):</p><input type="text" name="flagDecriptacao" title="aaaa" />
		<p>Id:</p><input type="text" name="id" /><br />
		<p>Mensagem:</p><input type="text" name="message" /><br /> 
		<p>Id do contato:</p><input type="text" name="userIdTo" /><br /> 
		<br /> 
		<input type="submit" value="Enviar" />
	</form>
	<br>
	<hr>
	
			<p>bloquear ou desbloquear um contato:</p>
	<form method="post"
		action="http://localhost:8080/IFMoodleDroidServices/rest/listener/bloquearOUDesbloquearContato">
		<p>login:</p><input type="text" name="login" /><br /> 
		<p>Senha:</p><input type="text" name="senha" /><br /> 
		<p>flag de decriptação(0 - off, 1 - on):</p><input type="text" name="flagDecriptacao" title="aaaa" />
		<p>Id_contato:</p><input type="text" name="contatoId" /><br /> 
		<p>flag Bloqueio Ou Desbloqueio(0 - desblq, 1 - bloq):</p><input type="text" name="flagBloqueioOuDesbloqueio" /><br /> 
		<br /> 
		<input type="submit" value="Enviar" />
	</form>
	<hr>
	
		<hr>
	
			<p>desbloquear um contato:</p>
	<form method="post"
		action="http://localhost:8080/IFMoodleDroidServices/rest/listener/desbloquearContato">
		<p>login:</p><input type="text" name="login" /><br /> 
		<p>Senha:</p><input type="text" name="senha" /><br /> 
		<p>flag de decriptação(0 - off, 1 - on):</p><input type="text" name="flagDecriptacao" title="aaaa" />
		<p>Id_contato:</p><input type="text" name="contatoId" /><br /> 
		<p>Desbloqueio(Digite 0):</p><input type="text" name="flagDesbloqueio" /><br /> 
		<br /> 
		<input type="submit" value="Enviar" />
	</form>
	<hr>
	
		<p>acrescentar um contato:</p>
	<form method="post"
		action="http://localhost:8080/IFMoodleDroidServices/rest/listener/acrescentarUmContato">
		<p>login:</p><input type="text" name="login" /><br /> 
		<p>Senha:</p><input type="text" name="senha" /><br /> 
		<p>flag de decriptação(0 - off, 1 - on):</p><input type="text" name="flagDecriptacao" title="aaaa" />
		<p>Id_contato:</p><input type="text" name="contatoId" /><br /> 
		
		<br /> 
		<input type="submit" value="Enviar" />
	</form>
	<hr>
	<p>eliminar um contato:</p>
	<form method="post"
		action="http://localhost:8080/IFMoodleDroidServices/rest/listener/excluirContato">
		<p>login:</p><input type="text" name="login" /><br /> 
		<p>Senha:</p><input type="text" name="senha" /><br /> 
		<p>flag de decriptação(0 - off, 1 - on):</p><input type="text" name="flagDecriptacao" title="aaaa" />
		<p>Id_contato:</p><input type="text" name="contatoId" /><br /> 
		
		<br /> 
		<input type="submit" value="Enviar" />
	</form>
		<hr>
	<p>buscar semanas:</p>
	<form method="post"
		action="http://localhost:8080/IFMoodleDroidServices/rest/listener/verificarSemanas">
		<p>login:</p><input type="text" name="login" /><br /> 
		<p>Senha:</p><input type="text" name="senha" /><br /> 
		<p>flag de decriptação(0 - off, 1 - on):</p><input type="text" name="flagDecriptacao" title="aaaa" />
		<p>Id curso:</p><input type="text" name="idCurso" /><br /> 
		
		<br /> 
		<input type="submit" value="Enviar" />
	</form>
		<hr>
	<p>buscar links:</p>
	<form method="post"
		action="http://localhost:8080/IFMoodleDroidServices/rest/listener/verificarLinksSemana">
		<p>login:</p><input type="text" name="login" /><br /> 
		<p>Senha:</p><input type="text" name="senha" /><br /> 
		<p>flag de decriptação(0 - off, 1 - on):</p><input type="text" name="flagDecriptacao" title="aaaa" />
		<p>Id Section:</p><input type="text" name="idSection" /><br /> 
		
		<br /> 
		<input type="submit" value="Enviar" />
	</form>
	<hr>
		<p>Listar Foruns de uma Semana:</p>
	<form method="post"
		action="http://localhost:8080/IFMoodleDroidServices/rest/listener/retornaForunsSemanas">
		<p>login:</p><input type="text" name="login" /><br /> 
		<p>Senha:</p><input type="text" name="senha" /><br /> 
		<p>flag de decriptação(0 - off, 1 - on):</p><input type="text" name="flagDecriptacao" title="aaaa" />
		<br /> 
		<p>ID Semana:</p><input type="text" name="semanaId" /><br />
		<input type="submit" value="Enviar" />
	</form>
	<hr>
	
	
	<br />
	<br />
	<hr>

</body>
</html>
