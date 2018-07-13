<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="common/header.jspf"%>
<c:url var="formAction" value="/actorList" />
<form method="GET" action="${formAction}">
	
    <div class="formInputGroup">
        <label for="name"> Enter a name :</label> 
        <input type="text" name="name" id="name" />
    </div>
 
    <input class="formSubmitButton" id="search" type="submit" value="Searh" />
</form>
<table class="table">
<tr>
<th>Name</th>
</tr>
<c:forEach items="${actors}" var="actor">
<tr>
	<td> 
   <h5>${actor.firstName} ${actor.lastName}</h5> 
   </td>
</tr>
</c:forEach>
</table>
<%@include file="common/footer.jspf"%>