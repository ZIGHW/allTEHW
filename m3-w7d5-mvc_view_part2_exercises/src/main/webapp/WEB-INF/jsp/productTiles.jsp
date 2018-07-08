<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product Tiles View</title>
    <link rel="stylesheet" href="css/site.css" />
    <link rel="stylesheet" href="css/tile.css" />
</head>
<body>
    <header>
        <h1>MVC Exercises - Views Part 2: Models</h1>        
    </header>
    <nav>
        <ul>
            <li><a href="productList">Product List</a></li>
            <li><a href="productTable">Product Table</a></li>
        </ul>
        
    </nav>
    <section id="main-content">
		 <h1 class = "titleList">Toy Department</h1>
		 <div class="flex-container">
    	<c:forEach var="product" items="${requestScope.productList}">
	    	<div class = "item">
		    		<img id="listImage" src = "img/${product.imageName}"/>
		    		<div id="titleAndSeller">
		    			<h2 class = "inline"> 
		    			<c:out value="${product.name}" />
		    			</h2>
	    		<c:if test= "${product.topSeller}">
	    			<h3 class = "inline red">Best Seller!</h3>
	    		</c:if>
	    		</div>
	    		<p class="mfr">
	    		by <c:out value="${product.manufacturer}"/>
	    		</p>
	    		
	    		<h2 id="price">
	    		$<c:out value="${product.price}"/>
	    		</h2>
	    		
	    		<p>
	    		<c:out value="${product.weightInLbs}"/> lbs
	    		</p>
	    		
	    		<c:set var="rating" value="0"/>
	    		<c:set var="one" value="1"/>
	    		<c:forEach begin = "0" end = "${product.averageRating}" var="stars">
		       		<c:set var="rating" value="${rating + 1}"/>
		       	</c:forEach>
		       	
	    	    <img class="starsList" src = "img/${rating-1}-star.png"/>
	    	</div>
	    </c:forEach>
	   </div>

       
       

    </section>
</body>
</html>