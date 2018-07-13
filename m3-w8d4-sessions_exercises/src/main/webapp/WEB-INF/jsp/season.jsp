<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Season</title>
	</head>
	<body>
		<c:url var="formAction" value="/present" />
		<form method="POST" action="${formAction}">
        <label for=""> What's yo fave season?</label> 
        <input type="radio" name="season" value="Spring"> Spring<br>
  		<input type="radio" name="season" value="Autumn"> Autumn<br>
  		<input type="radio" name="season" value="Summer"> Summer <br>
  		<input type="radio" name="season" value="Winter"> Winter <br>
    <input class="formSubmitButton" id="foodButton" type="submit" value="Enter" />
</form>
	</body>
</html>