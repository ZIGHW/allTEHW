<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Present</title>
	</head>
	<body>
	<h1>Your Fave Things:</h1>
		<h3>Favorite Color:  <c:out value="${faves.color}" /> </h3>
		<h3>Favorite Food:  <c:out value="${faves.food}" /> </h3>
		<h3>Favorite Season:  <c:out value="${faves.season}" /> </h3>
	</body>
</html>