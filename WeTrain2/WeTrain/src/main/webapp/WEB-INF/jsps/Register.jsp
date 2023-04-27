
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
  <meta charset="UTF-8">
    <title> Registration Page</title>
    <link rel="stylesheet" href="style.css">
    <style>
div.container {
  text-align: center;
}

class.model-body {
  display: inline-block;
  text-align: left;
}
</style>
  <style>
body {
  background-color: transparent;
  background-image: url("https://cdn.pixabay.com/photo/2016/06/02/02/33/triangles-1430105_960_720.png");
   background-size: cover;
}

    <br></style> 
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<script type="text/javascript">
function save(){
	var uname = document.getElementById("name").value;
	var Email = document.getElementById("email").value;
	var Phone = document.getElementById("phone").value;
	var Address = document.getElementById("address").value;
	var Course = document.getElementById("course").value;
	var File = document.getElementById("file").value;
	
	 if (uname == "" || Phone == "" || Email == "" || Address == "" || Course == ""|| File=="") {
		    alert("All fields are required");
		    return false;
		  }
	
	alert(uname)

	$(document).ready(function(){
	       $.ajax({
	    	   url:"http://localhost:8080/save",
	           data :{
	        	      "name":uname,
	        	      "email":Email,
	        	      "phone":Phone, 
	        	      "address":Address,
	        	       "course":Course,
	        	       "file":File
	        	   },
	           dataType :"text",
	           type:"POST",  
	        	   success:function(response)
	        	   {
	        		   
	        		   if(response){
	        			   location.reload();
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
    
    /* Reset styles */
* {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}

/* Global styles */
body {
  font-family: Arial, sans-serif;
  font-size: 16px;
  line-height: 1.5;
  align-content:center;
  color: #333;
}

a {
  color: #333;
  text-decoration: none;
}

ul {
  list-style: none;
}

/* Header styles */
header {
  background-color:#bf00ff;
  #f4f4f4
  padding: 1rem;
}

nav ul {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

nav li {
  margin-right: 1rem;
}

/* Register section styles */
.register {
  max-width: 800px;
  margin: -3rem auto;
  padding: 1rem;
  background-color: #9b9b9b6b;
  border-radius: 5px;
}

form {
  display: grid;
  grid-template-columns: 1fr 1fr;
  grid-gap: 1rem;
  margin-top: 1rem;
}

label {
  display: block;
  font-weight: bold;
  margin-bottom: 0.5rem;
}
* {
    box-sizing: unset;
    margin: 0;
    padding: 0;
    width: -22px;
}
input,
textarea,
select {
  padding: 0.5rem;
  border-radius: 5px;
  border: none;
}

button {
  padding: 0.5rem 1rem;
  border-radius: 5px;
  border: none;
  background-color: #007bff;
    
    
    
    </style>
  </head>
  <body>
    <header>
      <nav>
        <ul>
          <li><a href="home"> <h2> Home </h2> </a></li>
          <li><a href="home"> <h2> Courses </h2> </a></li>
           <li><a href="login"> <h2> LogOut </h2> </a></li>
           <div class="navbar">
          <div class="dropdown">
    <button class="dropbtn">Contact
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">180 180 0044</a>
      <a href="#">180 118 2334</a>
      <a href="#">180 018 1234</a>
    </div>
      </div> 
      </div>
       
        </ul>
        
      </nav>
      <style>
      
      /* Navbar container */
.navbar {
  overflow: hidden;
  background-color: purple;
  font-family: Arial;
}
pre {
    display: block;
    font-family: monospace;
    white-space: normal;
    margin: 1rem 0px;
    margin-top: ;
    margin-right: ;
    margin-bottom: ;
    margin-left: ;
}


input, textarea, select {
    padding: 0.5rem;
    border-radius: 23px;
    border: none;
}
/* Links inside the navbar */
.navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* The dropdown container */
.dropdown {
  float: left;
  overflow: hidden;
}

/* Dropdown button */
.dropdown .dropbtn {
  font-size: 16px;
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit; /* Important for vertical align on mobile phones */
  margin: 0; /* Important for vertical align on mobile phones */
}

/* Add a red background color to navbar links on hover */
.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: red;
}

/* Dropdown content (hidden by default) */
.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

/* Links inside the dropdown */
.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

/* Add a grey background color to dropdown links on hover */
.dropdown-content a:hover {
  background-color: #ddd;
}

/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content {
  display: block;
} 
      
      
      
      </style>
    </header>
    <main >
    <br>
     <br>
      <br>
    
 
     <!--  <section class="register">
       <center>
     
        <h2>Register for a Course</h2>
        <br> -->
      
      <!--    <form action="register" method="get"> </form> -->
<!-- <label for="name">Name:
          <input type="text" id="name" name="name"  placeholder="Enter the name"  required="required"></label>
 <br>
 
          <label for="email">Email:
          <input type="email" id="email" name="email"  placeholder="Enter the email"  required="required"></label>
 <br> -->
 
     <br>
      <br>
    
 
      <section class="register">
       <center>
     <div class="container">
        <h2>Register for a Course</h2>
        <br>
        <div class="model-body">
        <pre>
        <center>
      
      <!--    <form action="register" method="get"> </form> -->
       <label for="name">Name:<input type="text" id="name"  name="name"   placeholder="Enter the name"  required="required"></label>
 <br>
 
       <label for="email">Email:<input type="email" id="email" name="email"  placeholder="Enter the email"  required="required"></label>
 <br>
 
       <label for="phone">Phone:<input type="tel" id="phone" name="phone"   placeholder="Enter the phoneNumber" onkeypress='return event.charCode >= 48 && event.charCode <= 57'  maxlength="10"	 required="required"></label>

  <br>
<label for="address">Address:<input type="text" id="address" name="address" required="required"></label>
 </br>
 
 <pre>
<label for="course">Course:<select id="course"   name="course" required="required">
            <option value="">Select a Course</option>
            <option value="Java FullStack">Java FullStack</option>
            <option value="Python FullStack">Python FullStack</option>
            <option value="Android Development">Android Development</option>
          </select></label>
</br>
</pre>
                         <label for="file">File: <input type="file" id="file" name="file"  placeholder="Enter the file"  required="required"></label>
 </br>
  </pre>
 
       </center>
      
        <center><button type="button" onclick ="save()"  class="btn-primary">Register</button> </center>  
          </div>
              </div>
          
      </section>
            </center>
    </main>
    <footer>
      <p>&copy; 2023 Course Selling Application. All rights reserved.</p>
    </footer>
  </body>
</html>
