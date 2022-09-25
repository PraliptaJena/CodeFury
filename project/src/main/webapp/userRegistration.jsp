<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<script>
	</script>
</head>
<body>
	<div class="container">
		<h1>Register User</h1>
		<p>Please fill in this form to create an account.</p>
		<hr>
		<form name="form1" action="userRegistration" method="post">
			<label for="Full Name"><b>Full Name</b></label><br> 
			<input
				type="text" placeholder="Enter Full Name" name="username"
				id="Full Name" required><br> 
				
			<label for="Gender"><b>Gender</b></label>
			<input type="radio" name="gender" value="male"> Male <input
				type="radio" name="gender" value="female" required> Female <br></br>

			<label for="phone no"><b>Phone no</b></label><br> <input
				type="number" placeholder="Enter Phone no" name="phone" id="phone"
				required><br> <label for="email"><b>Email</b></label><br>
			<input type="text" placeholder="Enter Email" name="email" id="email"
				required><br> <label for="User Name"><b>User
					Name</b></label><br> <input type="text" placeholder="Enter User Name"
				name="User Name" id="User Name" required><br> <label
				for="psw"><b>Password</b></label><br> <input type="password"
				placeholder="Enter Password" name="psw" id="psw" required><br>

			<label for="psw-repeat"><b>Repeat Password</b></label><br> <input
				type="password" placeholder="Repeat Password" name="psw-repeat"
				id="psw-repeat" required><br> <label for="Company"><b>Company</b></label><br>
			<input type="text" placeholder="Enter Company" name="company"
				id="Company" required><br> 
				
				<label for="Adress"><b>Enter
					Adress</b></label><br> 
					<input type="text" placeholder="City" name="Adress"
				id="Adress" required><br> <input type="text"
				placeholder="State" name="State" id="Adress" required><br>
			<input type="text" placeholder="Country" name="Country" id="Adress"
				required><br> <label for="Date of Birth"><b>Date
					of Birth</b></label> <input type="date" id="birthday" name="birthday" required>
			<label class="upload_profile_image" for="upload profile image"><b>Upload
					profile image</b></label> <input type="file" name="upload_profile_image"
				id="file" required>

			<div id="imagePreview"></div>
			<hr>

			<p>
				By creating an account you agree to our <a href="#">Terms &
					Privacy</a>.
			</p>
			<button class="registerbtn" onclick="doValidate()">Register</button>
	</div>

	<div class="signin">
		<p>
			Already have an account? <a href="#">Sign in</a>.
		</p>
	</div>
	</form>

</body>
</html>