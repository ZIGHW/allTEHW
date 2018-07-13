<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Reviews</title>
   
</head>
<body>
    <section id="main-content">
    	<h1 class = "titleList">Reviews</h1>
    	<img src= "imgs/forDummies.png"/>
  	 	<a href="/mvc-controllers-part2-exercises/submitReview"> 
  	 		Post a new review
  	 	</a>
    	<c:forEach var="review" items="${reviews}">
	    	<div class = "item">
	    		<h2 class = "inline"> 
		    			<c:out value="${review.title}" /> 
		    			</h2>  
		    			
		    	<c:out value="${review.username}" />

		    	<p>${review.dateSubmitted.getMonthValue()}/${review.dateSubmitted.getDayOfMonth()}/${review.dateSubmitted.getYear()} </p>
		    	
	    		<c:forEach begin="1" end="${review.rating}">
	    			<img id="star" src = "imgs/star.png"/>
	    		</c:forEach>
	    		
		    	<p>${review.text} </p>
	    		</div>
		       
	    	 <hr>
	    </c:forEach>

  
    </section>
    
</body>
</html>