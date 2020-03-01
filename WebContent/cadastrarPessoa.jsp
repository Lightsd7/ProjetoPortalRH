<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt_br">
<head>
<meta charset="UTF-8">
<title>PAIF</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<section class="container">
		<h2>Confirmação</h2>
		<c:forEach var="t" items="${dao}">
			<p>Nome do treinamento: ${t.nome}</p>
			<p>Descrição do treinamento: ${t.descricao}</p>
			<p>Data do treinamento: ${t.dataTreinamento}</p>
			<p>Local do treinamento: ${t.local}</p>
		</c:forEach>
		<p>${mensagem}</p>

		<a href="index.jsp" class="right"> &larr; Voltar para home</a>
	</section>
</body>
</html>