<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    

<%@include file="common/header.jspf"%>
<section id="main-content"  class="centeredPanel">
<c:url value="/registration/submit" var="registrationListSignUpUrl" />
         <div><p>Please enter your information to join our email list.</p></div>

<form:form action="${registrationListSignUpUrl}" method="POST" modelAttribute="registration">
        <div>
        		<label for="fName">First Name</label>
        		<form:input path="fName"/>
        		<form:errors path="fName" cssClass="error"/>
        		
        </div>
        
        <div>
        		<label for="lName">Last Name</label>
        		<form:input path="lName"/>
        		<form:errors path="lName" cssClass="error"/>
        		
        </div>
        <div>
            <label for="email">Email</label>
			<form:input path="email" />            
        		<form:errors path="email" cssClass="error"/>
        		<form:errors path="emailMatching" cssClass="error"/>
        </div>
        <div>
            <label for="verifyEmail">Verify Email</label>
            <form:input path="verifyEmail" />
            <form:errors path="verifyEmail" cssClass="error"/>
            
        </div>
        
        <div>
            <label for="password">Password</label>
            <form:input path="password" />
            <form:errors path="password" cssClass="error"/>
            
        </div>
        <div>
            <label for="verifyPassword">Verify Password</label>
            <form:input path="verifyPassword" />
            <form:errors path="passwordMatching" cssClass="error"/>
            
        </div>
        <div>
            <label for="birthDate">BirthDate (mm/dd/yyyy)</label>
            <form:input path="birthDate" />
            <form:errors path="birthDate" cssClass="error"/>
            
        </div>
        <div>
            <label for="numTickets">Number of tickets</label>
           <form:input path="numTickets" />
           <form:errors path="numTickets" cssClass="error"/>
           
        </div>
     
        <div>
            <input type="submit" value="Sign Me Up!"/>
        </div>
        
        
</form:form>
</section>
<%@include file="common/footer.jspf" %>