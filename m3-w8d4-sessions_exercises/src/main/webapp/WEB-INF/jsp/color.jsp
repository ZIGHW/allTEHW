<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Color</title>
	</head>
	<body>
		<c:url var="formAction" value="/food" />
		<form method="POST" action="${formAction}">
	
	<div class="formInputGroup">
        <label for="color"> What's yo fave color?</label> 
        <input type="text" name="color" id="color" />
    </div>
    <input class="formSubmitButton" id="colorButton" type="submit" value="Enter" />
</form>
	</body>
</html>