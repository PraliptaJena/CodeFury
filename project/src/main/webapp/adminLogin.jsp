<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet" href="css/normalize.css">
  <link rel="stylesheet" href="css/main.css">
  <link rel="stylesheet" href="css/cont-log.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
    integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
  <link
    href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400;600;700;800&family=Roboto:wght@100;400;500;700&display=swap"
    rel="stylesheet">

</head>
<body>
  <div class="outer-div">
    <div class="container">
      <div class="log">
        <center>
          <img src="contact/user-4-128.png" class="img-1" alt="">
        </center>
        <h1 class="text-center">LOGIN</h1>
        <center>
          <!-- username -->
          <input type="email" class="form-control inp-1" name="email" id="email" placeholder="Enter Your Email......">

          <!-- password -->
          <label id="alert2"></label>
          <input type="password" class="form-control inp-2" name="pass" id="pass"
            placeholder="Enter Your Password......">
          <!-- remember me and submit button -->
          <div class=" mar-1">
            <div class="form-check check-1">
              <input class="form-check-input" type="checkbox" value="" id="defaultCheck1">
              <label class="form-check-label" for="defaultCheck1">
                Remember me
              </label>
            </div>
            <!-- forget password -->
            <a href="#" class="forget">Forget Password?</a>
          </div>
          <!-- login button -->
          <button class="login-btn">Login</button>
        </center>

      </div>
    </div>
  </div>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
    integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous">
  </script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
    integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous">
  </script>

</body>
</html>