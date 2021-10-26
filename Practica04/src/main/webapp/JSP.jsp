<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Incripción Escolar</title>
<style><%@include file="css/style.css"%></style>
</head>
<body class="background2">
<br>
<h1>Servlet</h1>
<h2 class="center">Formularios para Servlet que recolectan que información se obtuvo</h2>
<br>
<h3>Form 1</h3>
	<br>
		<form action="MostrarDatos" method="get">
		<b>Nombre(s):</b>
		<input type="text" name="nombre"/>
		<br>
		<br>
		<b>Apellido Paterno:</b>
		<input type="text" name="apellidoP"/>
		<br>
		<br>
		<b>Apellido Materno:</b>
		<input type="text" name="apellidoM"/>
		<br>
		<br>
		<b>Edad:</b>
		<input type="text" name="edad"/>
		<br>
		<br>
		<b>Genero:</b>
		<input type="radio" name="genero" value="H"/> Hombre
		<input type="radio" name="genero" value="M"/> Mujer
		<br>
		<br>
		<b>Número de cuenta:</b>
		<input type="text" name="noCuenta"/>
		<br>
		<br>
		<b> Año en el que te encuentras</b>
		<br>
		<select	name="ano">
			<option value="1er">1er año </option>
			<option value="2do">2do año </option>
			<option value="3er">3er año </option>
		</select><br><br>
		<input type="submit" value="Enviar"/>
		</form>

<h3>Form 2</h3>
	<br>
		<form action="MostrarDatos2" method="post">
		<b>Turno:</b>
		<input type="radio" name="turno" value="Matutino"/> Matutino
		<input type="radio" name="turno" value="Vespertino"/> Vespertino
		<input type="radio" name="turno" value="Vespertino"/> Mixto
		<br>
		<br>
		<b>Promedio:</b>
		<input type="text" name="promedio"/>
		<br>
		<br>
		<b> Facultad en la que estudias</b>
		<br>
		<select	name="fac">
			<option value="conta">Contaduría </option>
			<option value="ciencias">Ciencias </option>
			<option value="inge">Ingeniería </option>
			<option value="medicina">Medicina </option>
			<option value="quimi">Química </option>
		</select><br><br>
		<input type="submit" value="Enviar"/>
		</form>
		<br>
		<br>
		<h1>JSP</h1>
	<%= "Este texto se agregó como código java" %>
	<br>
	<%= "Se instancia un objeto y se imprime" %>
      <%
         Date date = new Date();
         out.print( "<h2 align = \"center\">" +date.toString()+"</h2>");
      %>
      <br>
      	<%= "Se incluyen archivos externos como css para el background azul" %>
      	<br>
      	<%= "Usamos Random para generar un numero aleatoreo" %>
      	<br>
      	<%
			Random rand = new Random();
			int n = rand.nextInt(90000) + 10000;
			out.print( "<h2 align = \"center\">" +n+"</h2>");
			if(n <= 5000){
				out.print( "el número random es menor a 5000");
			}else{
				out.print( "el número random es mayor a 5000");	
			}
		%>
		<br>
		<%= "Ciclo for" %>
		<br>
		<%= "Se genera un número del 1 al 10 y depende de ese número se genera un counting to" %>	
		<br>
		 <%
			Random rand2 = new Random();
			int n2 = rand.nextInt(9) + 1;
			out.print( "<h2 align = \"center\">" +n2+"</h2>");
			for(int i = 1; i<n2;i++){
				out.print( "<p align = \"center\">" +i+"</p>");
			}
		%>
</body>
</html>