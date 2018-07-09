<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product Tiles View</title>
    <link rel="stylesheet" href="css/site.css" />
    <link rel="stylesheet" href="css/detail.css" />
</head>

<body>
   <c:import url="header.jsp"/>
    <section id="main-content">
		    		<img id="listImage" src = "img/${product.imageName}"/>
		    	<div class="padding-left">
		    		<div id="titleAndSeller">
		    			<h2 class = "inline"> 
		    			<c:out value="${product.name}" />
		    			</h2>
	    		<c:if test= "${product.topSeller}">
	    			<p class = "inline red">Best Seller!</p>
	    		</c:if>
	    		</div>
	    		<p class="mfr">
	    		by <c:out value="${product.manufacturer}"/>
	    		</p>
	    		
	    		<c:set var="rating" value="0"/>
	    		<c:set var="one" value="1"/>
	    		<c:forEach begin = "0" end = "${product.averageRating}" var="stars">
		       		<c:set var="rating" value="${rating + 1}"/>
		       	</c:forEach>
		       	
	    	    <img class="starsList" src = "img/${rating-1}-star.png"/>
	    		
	    		<h2 id="price">
	    		Price: $<c:out value="${product.price}"/>
	    		</h2>
	    		
	    		<p>
	    		Weight <c:out value="${product.weightInLbs}"/> lbs
	    		</p>
	    		
	    		<p id="description">
	    		Description <c:out value="${product.description}"/>
	    		</p>
	    	</div>
    
    
    
    </section>
    </body>
    </html>