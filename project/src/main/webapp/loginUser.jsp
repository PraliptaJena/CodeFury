<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function submition(){
	var name = document.getElementById("username");
	var password = document.getElementById("password");
	

	  var xhttp = new XMLHttpRequest();
	  xhttp.open("POST", "userRegistration", true);
	  xhttp.setRequestHeader("Content-Type", "application/json");
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	      console.log("done")
	    }
	  };
	  
	  var data = {username:name , password: password };
	  
	  xhttp.send(JSON.stringify(data));

}


function callJqueryAjax(e){
	e.preventDefault();
	var name = $('#username').val();
	var password = $('#password').val();
	$.ajax({
	url     : 'userRegistration',
	method     : 'POST',
	data     : {name : name, password:password},
	success    : function(resultText){
	console.log(resultText)
	},
	error : function(jqXHR, exception){
	console.log('Error occured!!');
	}
	});
	}

</script>

</head>
<body>
	<form id="frm" name="reg" action="UserLoginServlet" method="post">
		Username : <input type ="text" value="" name ="username" id="username"><br>
		password : <input type ="text" value="" name ="password" id="password">
		<input type="submit" value="Submit" onclick="callJqueryAjax(e)">
	</form>
	
</body>
</html>