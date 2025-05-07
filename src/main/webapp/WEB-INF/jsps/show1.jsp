<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<title>Leads Management</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
.id{
background-image:url('sample1.jpg');
background-color:#3498db;
}

</style>

</head>
<body>
<div class="container mt-5">
    <h2>Leads CRUD</h2>
<div id="1">
    <!-- Create Lead Form -->
    <form action="savedata" id="leadForm" method="post" >
        <div class="form-group">
            <label>First_Name</label>
            <input type="text" id="fname" name="fname" class="form-control" required />
        </div>
        <div class="form-group">
            <label>Last_Name</label>
            <input type="text" id="lname" name="lname" class="form-control" required />
        </div>
        <div class="form-group">
            <label>Email</label>
            <input type="email" id="email" name="email"class="form-control" required />
        </div>
        <div class="form-group">
            <label>Phone</label>
            <input type="text" id="phone" name="mobile"  class="form-control" required />
        </div>
        <button type="submit" class="btn btn-primary">Add Lead</button>
    </form>

    <hr />
   </div> 
  </div>
  </body>
  </html>
  