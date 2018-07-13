<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Food</title>
	</head>
	<body>
		<c:url var="formAction" value="/season" />
		<form method="POST" action="${formAction}">
	
	<div class="formInputGroup">
        <label for="food"> What's yo fave food?</label> 
        <input type="text" name="food" id="food" />
    </div>
    <input class="formSubmitButton" id="foodButton" type="submit" value="Enter" />
</form>
	</body>
</html>