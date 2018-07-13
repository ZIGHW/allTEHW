<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <c:url value="/css/site.css" var="cssHref" />
    <link rel="stylesheet" href="${cssHref}">
</head>
	<%@include file="common/header.jspf"%>
	
	<c:url var="formAction" value="/login/submit" />
	<section>
		<form:form  method="POST" action="${formAction}" modelAttribute="login">
			<div class="formInputGroup">
		        <label for="email"> Email: </label> 
		        <form:input path="email" />
		        <form:errors path="email" cssClass="email"/>
		    </div>
		    
		    <div class="formInputGroup">
		        <label for="password"> Password: </label> 
		        <form:input path="password" />
		        <form:errors path="password" cssClass="error"/>
		    </div>
		     <input type="submit" value="Goin in!"/>
		</form:form>
	</section>
	<%@include file="common/footer.jspf"%>
	