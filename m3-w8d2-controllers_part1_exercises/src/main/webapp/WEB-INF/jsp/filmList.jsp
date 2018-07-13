<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Films List"/>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Find that Film</title>
    <link rel="stylesheet" href="css/site.css">
</head>

<body>
<%@include file="common/header.jspf"%>
<section>
<c:url var="formAction" value="/filmListResults" />
<form method="GET" action="${formAction}">

	<div class="formInputGroup">
        <label for="minLen">Minimum Length </label> 
        <input type="text" name="minLen" id="minLen" />
    </div>
    
    <div class="formInputGroup">
        <label for="maxLen"> Max Length :</label> 
        <input type="text" name="maxLen" id="maxLen" />
    </div>
    
	<div class="formInputGroup">
		<label for="genre"> Choose a Genre: </label> 
		<select name="genre" id="genre">
			<option value="Action"> Action </option>
			<option value="Animation"> Animation </option>
			<option value="Children"> Children </option>
			<option value="Classics"> Classics </option>
			<option value="Comedy"> Comedy </option>
			<option value="Documentary"> Documentary </option>
			<option value="Drama"> Drama  </option>
			<option value="Family"> Family </option>
			<option value="Foreign"> Foreign </option>
			<option value="Games"> Games </option>
			<option value="Horror"> Horror </option>
			<option value="Music"> Music </option>
			<option value="New"> New </option>
			<option value="Sci-Fi"> Sci-Fi </option>
			<option value="Sports"> Sports </option>
		</select>
	</div>
    <input class="formSubmitButton" id="filmButton" type="submit" value="Find Dat Film" />
</form>
<table>
		<tr> 
	    	<td><h3>Title</h3> </td>
	    	<td><h3>Description</h3> </td>
	    	<td><h3>Release Year</h3> </td>
	    	<td><h3>Length</h3> </td>
	    	<td><h3>Rating</h3> </td>
    	</tr>
   	<c:forEach var = "film" items="${films}" varStatus="status">
    	
    	<tr>
    		<td><h6>${film.title}</h6> </td>
	    	<td><p>${film.description }</p> </td>
	    	<td><h6>${film.releaseYear}</h6> </td>
	    	<td><h6>${film.length}</h6> </td>
	    	<td><h6>${film.rating}</h6> </td>
    	
    	
    	
    	</tr>
    	
    </c:forEach>
</table>
</section>
<%@include file="common/footer.jspf"%>
</body>