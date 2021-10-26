<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HELLO DOCTOR</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<%@ include file="AdminNavbar.jsp" %>
      <div class="container-fluid">
      </div>
      <div>
      
<!-- form start  -->

<form action="AddHospital" method="post">

  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Hospital Name</label>
      <input type="text" name ="hospitalname" class="form-control" required="required" id="inputEmail4" placeholder="Enter the hospital name">
    </div>
     
    <div class="form-group col-md-5">
      <label for="inputPassword4">Number Of Doctors</label>
      <input type="number" name="noofdoctor" class="form-control"  required="required"id="inputPassword4" placeholder="Enter Number of Doctor availble in hospital">
    </div>
   
  </div>
  
  <div class="form-row">
  <div class="form-group col-md-6">
    <label for="inputAddress">Address</label>
    <input type="text" name="address"  required="required" class="form-control" id="inputAddress" placeholder="Enter the hospital address">
  </div>
  
  
   <div class="form-group col-md-5">
      <label for="inputCity">City</label>
      <input type="text" name="city" required="required" placeholder="Enter the city of hospital" class="form-control" id="inputCity">
    </div>
    <div class="form-group col-md-4">
      <label for="inputState">State</label>
      <select id="inputState" class="form-control" name="state" required="required">
        <option selected>Select State </option>
        <option>Maharashtra</option>
         <option>Delhi</option>
          <option>Up</option>
           <option>Mp</option>
      </select>
      
    </div>
<div class="form-group col-md-5">
    <label for="inputAddress">Zip Code</label>
    <input type="tel" name="zip"  required="required"pattern="^\d{2}\d{2}\d{2}$"  class="form-control" id="inputAddress" placeholder="Enter the zip code">
  </div>
    
  
  <div class="form-group col-md-4">
    <label for="inputAddress">Number of Beds Available</label>
    <input type="number" name="noofbeds"  required="required" class="form-control" id="inputAddress" placeholder="Enter the Number of Beds">
  </div>
   
  <div class="form-group col-md-4">
    <label for="inputAddress">Number of Icu Available</label>
    <input type="number"   name ="nooficu" required="required" class="form-control" id="inputAddress" placeholder="Enter the Number of Icu Available">
  </div>
  
   <div class="form-group col-md-3">
    <label for="inputAddress">Number of OT Available</label>
    <input type="number" name="noofotavi"  required="required" class="form-control" id="inputAddress" placeholder="Enter the Number of ot Available">
  </div>
   <div class="form-group col-md-4">
      <label for="inputState">Emergency</label>
      <select id="inputState" class="form-control" name="Emeregency" required="required" >
        <option selected>Emergency</option>
        <option>Yes</option>
         <option>No</option>
         
      </select>
      
    </div>
  
   <div class="form-group col-md-6">
    <label for="inputAddress">Contact Number</label>
    <input type="tel" name="Contactnumber" class="form-control" id="inputAddress" pattern="^\d{3}\d{3}\d{4}$" placeholder="Enter the Hosptial Phone Number">
  </div>
  </div>
  </div>

 
    

  <button type="submit" class="btn btn-primary">Save</button>
  
</form>

<!-- from end -->


<!-- js -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<!-- js End-->
</body>
</html>