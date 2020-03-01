<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt_br">
<head>
	<meta charset="UTF-8">
	<title>PAIF</title>

</head>
<body>
<section class="container">
	<h2>Cadastro de Treinamento</h2>
	<div class="box-form">
		<form action="cadastro-treinamento" method="POST">
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