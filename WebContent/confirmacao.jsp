<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="pt_br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>PAIF</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<section class="container">
		<h2>Confirmação</h2>
		<c:forEach var="t" items="${treino}">
			<p>Nome do treinamento: ${t.nome}</p>
			<p>Descrição do treinamento: ${t.descricao}</p>
			<p>Data do treinamento: ${t.dataTreinamento}</p>
			<p>Local do treinamento: ${t.local}</p>
			<p>Número de vagas do treinamento: ${t.numVagas}</p>
		</c:forEach>

		<p>${mensagem}</p>

		<a href="index.jsp" class="right"> &larr; Voltar para home</a>
	</section>
</body>
</html>