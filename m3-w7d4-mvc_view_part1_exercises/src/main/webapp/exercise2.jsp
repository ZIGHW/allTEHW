<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
				<c:set var = "numb1" value = "1" />
 				<c:set var="numb2" value="0"/>
 				<c:set var="holder" value = "0"/>
				<c:forEach begin= "1" end = "25" var = "i">
					<c:set var = "holder" value = "${numb1 + numb2}" />
					<li> "${holder}" </li>
					<c:set var = "numb2" value = "${numb1}" />
					<c:set var = "numb1" value = "${holder}" />
				</c:forEach>
				
		</ul>
	</body>
</html>