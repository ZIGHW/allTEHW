<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Submit Review</title>
	</head>
	<body>
		<h1>Hello, Dog. Could you please drop a hot review:</h1>
<section class="whiteback">
	<c:url var="formAction" value="/reviews" />
	<form method="POST" action="${formAction}">
		<div class="formInputGroup">
			<label for="rating"> How much you like dis thing? </label> 
			<select name="rating" id="rating">
				<option value="1"> 1 </option>
				<option value="2"> 2 </option>
				<option value="3"> 3 </option>
				<option value="4"> 4 </option>
				<option value="5"> 5 </option>
			</select>
		</div>
		
		<div class="formInputGroup">
	        <label for="username"> Username</label> 
	        <input type="text" name="username" id="username" />
	    </div>
		
		<div class="formInputGroup">
	        <label for="title"> Subject</label> 
	        <input type="text" name="title" id="title" />
	    </div>
	    <div class="formInputGroup">
	        <label for="">Reviews</label> 
	        <input type="text" name="text" id="text" />
	    </div>
	    <input class="formSubmitButton" id="reviewPost" type="submit" value="Submit Review" />
	</form>
</section>
	</body>
</html>

<%-- Username (required)
Rating (required) [1-5 stars]
Review Title (required)
Review Text (required)

<section class="whiteback">
<c:url var="formAction" value="/alienTravelOutput" />
<form method="GET" action="${formAction}">
	<div class="formInputGroup">
		<label for="planet"> Choose a Planet: </label> 
		<select name="planet" id="planet">
			<option value="mercury"> Mercury </option>
			<option value="venus"> Venus </option>
			<option value="mars"> Mars </option>
			<option value="saturn"> Saturn </option>
			<option value="uranus"> Uranus </option>
			<option value="jupiter"> Jupiter </option>
			<option value="neptune"> Neptune </option>
		</select>
	</div>
	<div class="formInputGroup">
	<label for="mode"> Choose a Mode of Transport: </label> 
	<select name="mode">
		<option value="walking"> Walking </option>
		<option value="car"> Car </option>
		<option value="bullet train"> Bullet Train </option>
		<option value="boeing 747"> Boeing 747</option>
		<option value="concorde"> Concorde </option>
	</select>
	</div>
	
	<div class="formInputGroup">
        <label for="age"> Enter Your Earth Age :</label> 
        <input type="text" name="age" id="age" />
    </div>
    <input class="formSubmitButton" id="ageButton" type="submit" value="Calculate Travel Time" />
</form>
</section> --%>