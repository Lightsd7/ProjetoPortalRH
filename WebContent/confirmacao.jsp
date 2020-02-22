<section class="container">
	<h2>Confirmação</h2>
	<c:if test="${not empty treinamento}">
		<p>Nome do treinamento: ${treinamento.nome}</p>
		<p>Descrição do treinamento: ${treinamento.descricao}</p>
		<p>Data do treinamento: ${treinamento.data}</p>
		<p>Local do treinamento: ${treinamento.local}</p>
	</c:if>
	<p>${mensagem}</p>

	<a href="index.jsp" class="right"> &larr; Voltar para home</a>
</section>