<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AjaxTable</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
 
<!-- Data tables Style and Script -->
<!-- adding css -->
<link rel="stylesheet"
	href="http://cdn.datatables.net/1.11.5/css/jquery.dataTables.min.css">

<!-- Adding JQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>

<!-- Adding datatables cdn -->
<script
	src="http://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
<!-- sweet alert -->
<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>

<!-- BUTTONS -->
<script
 src="https://cdn.datatables.net/buttons/2.2.2/js/dataTables.buttons.min.js"></script>
<script
 src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
<script
 src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js"></script>
<script
 src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js"></script>
<script
 src="https://cdn.datatables.net/buttons/2.2.2/js/buttons.html5.min.js"></script>
<script
 src="https://cdn.datatables.net/buttons/2.2.2/js/buttons.print.min.js"></script>
 
 <!-- sweet alert -->
<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.min.css">

 

<script type="text/javascript">
	/* $(document).on('click', '#getDataBtn', function(){ */
	$(document).ready(function() {
		$.ajax({
			url : "http://localhost:8080/listAllData",
			data : "",
			type : "GET",
			dataType : "json",
			success : function(response) {

				console.log(response);
				//$('#myrenewalview').html(table);
				var table = $('#example').DataTable({
					data : response,
					dom : 'Bfrtip',
					buttons : [ 'copy', 'csv', 'excel', 'pdf', 'print' ],

					columns : [
						{
							title : "S.NO",
							"data" : "id"
						},
					{
						title : "Name",
						"data" : "name"
					}, {
						title : "Phone",
						"data" : "phone"
					}, {
						title : "Address",
						"data" : "address"
					}, {
						title : "Email",
						"data" : "email"
					}, {
						title : "Course",
						"data" : "course"
					}, 
					
						{title : "Action",
						"data" : "",
							"fnCreatedCell":function(data)
							{
                              $(data).html("<input type='button' class='btn btn-warning'  data-toggle='modal' data-target='#exampleModal' value='Edit'> <input type='button' class='btn btn-danger' value='Delete'>")}
					        }
						


					
				
					]
				});
				
				
				$('#example tbody').on('click','.btn-warning', function(){
					
				var id =$(this).closest('tr').find('td:eq(0)').text ();
					var name = $(this).closest('tr').find('td:eq(1)').text();
					 var email =$(this).closest('tr').find('td:eq(4)').text();
					var phone =$(this).closest('tr').find('td:eq(2)').text();
					var address =$(this).closest('tr').find('td:eq(3)').text();
					 
					var Course =$(this).closest('tr').find('td:eq(5)').text ();
					
				document.getElementById("id").value=id;
 				document.getElementById('name').value= name;
					 document.getElementById('email').value= email;
					document.getElementById('phone').value= phone;
					document.getElementById('address').value= address;
					
					document.getElementById("course").value=Course; 
					 
				});
				$('#example tbody').on('click', '.btn-danger', function () {
					 var name = $(this).closest('tr').find('td:eq(0)').text();
					 
					 $(document).ready(function() {
						  
						   swal({
						    title: "Are you sure?",
						    text: "Do you want to Delete this Record?",
						    type: "warning",
						    showCancelButton: true,
						    confirmButtonColor: "#DD6B55",
						    confirmButtonText: "Yes",
						    cancelButtonText: "No",
						    closeOnConfirm: false,
						    closeOnCancel: false
						    },
						    function(isConfirm){
						    if (isConfirm) {

					 $.ajax({
					 url: "http://localhost:8080/delete",
					 data: {"id":name},
					 type: "GET",
					 dataType: "text",
					 success: function(response) {
						 location.reload();
					 
					 },
					 error: function() {
					 alert("error");
					 }
					 });
						    } else {
						        swal("Cancelled");
						        }
					 });
					 });
					 });
				
			},
			
			
			error : function() {
			
				Swal.fire({
					icon : 'error',
					title : 'Oops...',
					text : 'Something went wrong!'
					
				})
				
				}
		});
		});
	
			/* error : function() {
				// alert("error");
				Swal.fire({
					icon : 'error',
					title : 'Oops... Sorry',
					text : 'Something went wrong!',
					footer : '<a href="">Why do I have this issue?</a>'
				})

			} */
		
	

</script>

<style>
table, th, td {
	border: 1px solid;
}

body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
}

body{
 background-image: url("https://images.unsplash.com/photo-1625225233840-695456021cde?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8Y2FsY3VsYXRvcnxlbnwwfHwwfHw%3D&w=1000&q=80");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}

.topnav {
	overflow: hidden;
	 opacity: 0.9;
}
.topnav a {
	float: left;
	color: black;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}

.topnav a.active {
	background-color: MediumSpringGreen;
	color: white;
}
</style>
</head>
<body>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
       
               <br><form action="update" method="POST">
        <center>
        <label for="id">Id No:
         <input type="text" id="id" name="id"  placeholder="Enter the Id"  required="required"></label>
 <br> <br> <br>
  
                  <label for="name">name:
         <input type="text" id="name" name="name"  placeholder="Enter the name"  required="required"></label>
 <br> <br> <br>
 
           <label for="email">Email:
          <input type="email" id="email" name="email"  placeholder="Enter the email"  required="required"></label>
 <br> <br> <br>
 
          <label for="phone">Phone:
          <input type="tel" id="phone" name="phone"   placeholder="Enter the phoneNumber" onkeypress='return event.charCode >= 48 && event.charCode <= 57'  maxlength="10"	 required="required"></label>

  <br> 
 <br> <br> <br>
 
          <label for="address">Address:
          <textarea id="address" name="address" required="required"></textarea ></label>
 <br> <br> <br>
 
          <label for="course">Select a Course:
          <select id="course" name="course" required="required">
            <option value="">Select a Course</option>
            <option value="Java FullStack">Java FullStack</option>
            <option value="Python FullStack">Python FullStack</option>
            <option value="Android Development">Android Development</option>
          </select></label>
  <button type="submit" class="btn btn-primary">Save changes</button>
  
        <br>
        </center>
        </form>
        
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
       
      </div>
    </div>
  </div>
</div>
      
	<div class="topnav">
		<a href="/home">HOME</a> 
		<!-- <a href="/Create">CREATE</a> 
		<a href="/getAlldata">DATATABLES</a> 
	
		<a href="/edit">EDIT</a> -->
		
			<a class="active" href="/getData">RegisterTable</a>
		
	</div>
	<div>
		<table id="example" class="display" style="background-color: white">


		</table>
	</div>
	
</body>
</html>