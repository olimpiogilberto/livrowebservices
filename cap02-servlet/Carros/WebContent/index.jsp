<html><head>
<title>Inicio</title>
<body>
<!-- http://localhost:8080/Carros/hello2?nome=Gilberto&sobrenome=Olimpio -->
<form method="post" action="<%=request.getContextPath()%>/hello2">
	Nome: 		<input type="text" name="nome"/>		<br/><br/>
	Sobrenome: 	<input type="text" name="sobrenome"/>	<br/>
				<input type="submit" name="Enviar"/>
</form>
</body>
</html>