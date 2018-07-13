<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Customers List"/>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Find those Customers</title>
    <link rel="stylesheet" href="css/site.css">
</head>

<body>
<%@include file="common/header.jspf"%>
<section>
<c:url var="formAction" value="/customerListResults" />
<form method="GET" action="${formAction}">
    
    <div class="formInputGroup">
        <label for="search"> Customer Name :</label> 
        <input type="text" name="search" id="search" />
    </div>
    
	<div class="formInputGroup">
		<label for="sort"> Choose a sort method: </label> 
		<select name="sort" id="sort">
			<option value="last_name"> Last Name </option>
			<option value="email"> Email </option>
			<option value="activebool"> Active </option>
		</select>
	</div>
    <input class="formSubmitButton" id="sortButton" type="submit" value="Find those Customers!" />
</form>
<table id = "custTable">
		<tr> 
	    	<td><h3>Name</h3> </td>
	    	<td><h3>Email</h3> </td>
	    	<td><h3>Active</h3> </td>
    	</tr>
   	<c:forEach var = "customer" items="${customers}" varStatus="status">
    	
    	<tr>
    		<td><h6>${customer.firstName} ${customer.lastName }</h6> </td>
	    	<td><p>${customer.email}</p> </td>
	    	<td><h6>${customer.active}</h6> </td>
    	</tr>
    	
    </c:forEach>
</table>
</section>
<%@include file="common/footer.jspf"%>
</body>