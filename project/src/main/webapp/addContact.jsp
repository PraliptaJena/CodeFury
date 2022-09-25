<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script href="js/contact.js"></script>
<style>
#box{
  margin-top: 100px;
  margin-right: 200px;
  padding-left: 20px;
  padding-bottom: 50px;
  margin-bottom: 50px;
}
image
{
    position:fixed;
    bottom:0px;
    left:50%;
}
body{
  background-image: url('C:/Users/mshiv/OneDrive/Desktop/save2.jpg');
  background-repeat: no-repeat;
  background-size: 100% 100%;
  margin-bottom: 0px;
  margin-top: 200px;
}
</style>

</head>
<body>
	<div id="box" style="margin-left: 200px">
		<h1>Add New Contact</h1>
		<form id="frm" onsubmit="event.prevenDefault();">
			<table>
				<tr>
					<td><label for="name">Full Name</label></td>
					<td><input type="text" id="name" name="name"></td>
					<td><span id="ername"></span></td>
				</tr>
				<tr>
					<td><label for="email">Email</label></td>
					<td><input type="text" id="email" name="email"></td>
					<td><span id="eremail"></span></td>
				</tr>
				<tr>
					<td><label for="phone">Phone No</label></td>
					<td><input type="text" id="phone" name="phone"></td>
					<td><span id="erphone"></span></td>
				</tr>
				<tr>

					<td><label for="gender">Gender</label></td>
					<td><input type="radio" id="Male" name="Male" value="Male">Male</td>
					<td><input type="radio" id="Female" name="Female"
						value="Female">Female</td>
					<td><span id="ergender"></span></td>
				</tr>
				<tr>
					<td><label for="dob">Date of Birth</label></td>
					<td><input type="text" id="dob" name="dob"></td>
					<td><span id="erdob"></span></td>
				</tr>
				<tr>
					<td><label for="address">Address</label></td>
					<td><input type="text" id="address" name="address"></td>
					<td><span id="eraddress"></span></td>
				</tr>
				<tr>
					<td><label for="city">City</label></td>
					<td><input type="text" id="city" name="city"></td>
					<td><span id="ercity"></span></td>
				</tr>
				<tr>
					<td><label for="State">State</label></td>
					<td><input type="text" id="state" name="state"></td>
					<td><span id="erState>"></span></td>
				</tr>
				<tr>
					<td><label for="Country">Country</label></td>
					<td><input type="text" id="country" name="country"></td>
					<td><span id="erCountry"></span></td>
				</tr>
				<tr>
					<td><label for="company">Company</label></td>
					<td><input type="text" id="company" name="company"></td>
					<td><span id="ercompany"></span></td>
				</tr>
				<tr>
					<td><label for="img">Select image:</label> <input type="file"
						id="img" name="img" accept="image/*"> <input type="submit"></td>
				</tr>
			</table>
			
			<input type="submit" value="Submit" id="add" onclick="viewContact()">
		</form>
	</div>

</body>
</html>