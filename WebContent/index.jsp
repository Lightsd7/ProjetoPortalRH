<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PAIF</title>
<!-- <link rel="stylesheet" type="text/css" href="styles/reset.css" />
<link rel="stylesheet" type="text/css" href="styles/main.css" /> -->
</head>
<body>
<section class="container">
	<h2>Cadastro de Treinamento</h2>
	<div class="box-form">
		<form action="cadastro-treinamento" method="post">
			<label> Nome:
				<input type="text" name="nome" placeholder="Informe o nome do treinamento" />
			</label>
			<label> Descrição:
				<input type="text" name="descricao" placeholder="Informe a descrição do treinamento" />
			</label>
			<label> Data:
				<input type="date" name="data" placeholder="Informe a data do treinamento" />
			</label>
			<label> Local:
				<input type="text" name="local" placeholder="Informe o local do treinamento" />
			</label>
			<button>Cadastrar</button>
		</form>
	</div>
</section>
</body>
</html>