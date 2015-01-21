<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script type="text/javascript">
	function clear5(){
		document.getElementById('restResponses').value = '';
	}
	function getHello(path){
		if(window.XMLHttpRequest) {
		    peticion_http = new XMLHttpRequest();
		}
		else if(window.ActiveXObject) {
			peticion_http = new ActiveXObject("Microsoft.XMLHTTP");
		}

		peticion_http.onreadystatechange = muestraContenido;
 
		// Realizar peticion HTTP
		peticion_http.open('GET', path, true);
		peticion_http.send(null);
	}
		function muestraContenido() {
	      if(peticion_http.readyState == 4) {
	      	if(peticion_http.status == 200) {
	      		document.getElementById('restResponses').value = peticion_http.responseText;
	      	}
    	  }
  		}
		
	

	</script>
<title>¡Bienvenido a RESTafar I!</title>
</head>
<body>
	<div id="header">
		<p id="title">RESTafar I!</p>
	</div>
	<div id="body">
		<div id="container-left">
			<div class="linkToResource"><a href="index.jsp">HOME</a></div>
		</div>
		<div id="container-center">
			<div id="login-container">
				<form action="rest/auth" method="post">
					<input type="text" name="user"/>
					<input type="password" name="pass"/>
					<input type="submit"/>
					<a href="formRegister.jsp">don't have account?</a><a href="formRegister.jsp">Register</a>
				</form>
			</div>
		</div>
		<div id="container-right">Monkey D. Luffy - Ivuch D. Kong</div>
	</div>
	<div id="footer">FOOTER</div>
</body>
</html>