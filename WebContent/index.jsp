<%@include file="header.jsp"%>
<form action="logar" method="POST" name="formulario">
	<h1>Entre com o seu código</h1>
	<input type="password" name="codigo" class="input input2"
		placeholder="&#xf007; Código" required />
	<c:choose>
		<c:when test="${not empty erroId}">
			<p class="invalid-user">Código inválido!</p>
		</c:when>
	</c:choose>
	<button class="botao">Login</button>
</form>
<%@include file="footer.jsp"%>

<form action="cadastrarPessoa" method="post">
	<button class="botao" name="teste">Teste dos Treinamentos</button>
</form>