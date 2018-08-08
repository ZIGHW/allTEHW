<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp" />

<h2>Latest Messages</h2>
<ol class="message-list">
	<c:forEach items="${messages}" var="message">
		<li class="message">
			<c:url var="messageHref" value="/messages">
				<c:param name="userName" value="${message.fromUsername}" />
			</c:url>
			<span class="username"><a href="${messageHref}"><c:out value="${message.fromUsername}"/></a></span>
			<span class="message-text"><c:out value = "${message.text}" /></span>
			<time class="timeago" datetime="${message.createTime}">${message.createTime}</time>
			<c:if test = "${message.fromUsername.equals(sessionScope.currentUser)}">
				<form action="delete" method="POST">
	   				<input type="hidden" id="message_id" name="message_id" value="${message.id}">
	   				<input type="hidden" id="username" name="username" value="${message.fromUsername}">
	   				<input type="hidden" id="currentUser" name="currentUser" value="${currentUser}">
	   				<button type="submit" id='delete'>Delete Message</button>
				</form>
			</c:if>
		</li>
	</c:forEach>
</ol>
		
<c:import url="/WEB-INF/jsp/footer.jsp" />
		