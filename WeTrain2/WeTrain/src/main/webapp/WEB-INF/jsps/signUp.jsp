
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
  
<meta charset="UTF-8">
    <title>SignUp Page</title>
       <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    
    
    <!-- <link href="https://cdn.jsdelivr.net/npm/@sweetalert2/theme-dark@4/dark.css" rel="stylesheet">
   
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11/dist/sweetalert2.min.js"></script>
 -->
 
 <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.min.css">
<script type="text/javascript">
function signUp(){
alert("uname");
	var uname = document.getElementById("username").value;
	var pasword = document.getElementById("password").value;
	alert(uname)
	$(document).ready(function(){
	       $.ajax({
	    	   url:"http://localhost:8080/newUser",
	           data :{"username":uname,"password":pasword},
	           dataType :"text",
	           type:"POST",
	          
	        	   success:function(response){
	       			alert(response);
	       			if(response=="saved successfully"){
	       				Swal.fire({
	       				      icon: 'SUCCESS',
	       				      title: 'bloody sweet...',
	       				      text: 'GO TO THE SIGN IN',
	       				      footer: '<a href="">successfully you sign up</a>'
	       				     })
	       			}
	       		}
	        	   
	  
	 
	 })
	 
	}) 
	    	
	    } 
	    
</script>
		
		
		
    <style>
    
    body {
  background-color: transparent;
  background-image: url("https://cdn.pixabay.com/photo/2016/06/02/02/33/triangles-1430105_960_720.png");
   background-size: cover;
}

.login-page {
  width: 360px;
  padding: 8% 0 0;
  margin: auto;
  background-color: transparent;
  border-radius: 10px;
  box-shadow: 0px 10px 20px rgba(0, 0, 0, 0.2);
}

.avatar {
  width: 100%;
  text-align: center;
  margin-bottom: 20px;
}

.avatar img {
  width: 60px;
  height: 60px;
  border-radius: 50%;
}

.form {
  position: relative;
  z-index: 1;
  max-width: 360px;
  margin: 0 auto 100px;
  padding: 45px;
  text-align: center;
  background-color: rgba(255, 255, 255, 0.7);
  border-radius: 20px;
}

.form input[type="text"],
.form input[type="password"] {
  font-family: 'Roboto', sans-serif;
  outline: none;
  width: 100%;
  border: 0;
  margin: 0 0 15px;
  padding: 15px;
  box-sizing: border-box;
  font-size: 14px;
  border-radius: 20px;
  background-color: rgba(255, 255, 255, 0.7);
}

.form button {
  font-family: 'Roboto', sans-serif;
  text-transform: uppercase;
  outline: none;
  background-color: #2196F3;
  width: 100%;
  border: 0;
  padding: 15px;
  color: #FFFFFF;
  font-size: 14px;
  -webkit-transition: all 0.3s ease;
  transition: all 0.3s ease;
  cursor: pointer;
  border-radius: 20px;
}

.form button:hover,
.form button:active,
.form button:focus {
  background-color: #1976D2;
}

.form h2 {
  color: #333333;
  font-size: 28px;
  margin: 0 0 30px;
}

.form p.message {
  color: #666666;
  font-size: 14px;
  margin-top: 15px;
}

.form p.message a {
  color: #2196F3;
  text-decoration: none;
}

.form p.message a:hover {
  text-decoration: underline;
}
    </style>
    
  </head>
  <body>
    <div class="login-page">
      <div class="avatar">
        <img src="https://cdn.pixabay.com/photo/2014/04/02/14/10/female-306407_960_720.png" alt="Avatar">
      </div>
      <div class="form">
        <h2>Sign Up</h2>
        <form >
          <input type="text"     id="username"     placeholder="Username" required>
          <input type="text" id="password"  placeholder="Password" required>
          <button type="submit" onclick ="signUp()"> SignUp </button>
          <br>
            <br>
          <a href="login"> <inpt type="text"  name="Already have account">  Already have account </a> 
        </form>

      </div>
    </div>
  </body>
</html>