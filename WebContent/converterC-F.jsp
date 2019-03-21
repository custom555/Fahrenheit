<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<style>
		h1 {
			color: orange;
			font-size: large;
			font-family: 'Segoe UI';
			font-style: bold;
			font-size: 25px;
		}
		h2 {
			color: black;
			font-size: small;
			font-family: 'serif';
			font-style: italic;
		}
		h3 {
			color: black;
			font-size: small;
			font-family: 'serif';
			font-style: italic;
		}
	
	</style>
	<meta charset="UTF-8">
	
	<title>Celcius to  Fahrenheit converter</title>
</head>

<body>
	<form action="Converter">
		<h1>Celcius to  Fahrenheit converter</h1><br>
		<h2>Select type of conversion</h2>
		<select name="calculation">
			<option value="C-F">Celcius to Fahrenheit</option>
			<option value="F-C">Fahrenheit to Celcius</option>
		</select>
		<br>
		<h3>Type the number to convert</h3>
		<input type="number" step="0.1" name="value1" required>
		<input type= "submit" value="convert">
		<h3>result</h3>
			<%=(Double)request.getAttribute("result")%>
	</form>	
</body>

</html>