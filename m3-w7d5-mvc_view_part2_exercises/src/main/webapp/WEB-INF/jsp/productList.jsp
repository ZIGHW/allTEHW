<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product List View</title>
    <link rel="stylesheet" href="css/site.css" />
    <link rel="stylesheet" href="css/list.css" />
</head>
<body>
    <header>
        <h1>MVC Exercises - Views Part 2: Models</h1>        
    </header>
    <nav>
        <ul>
            <li><a href="productTable">Product Table</a></li>
            <li><a href="productTiles">Product Titles</a></li>
        </ul>
        
    </nav>
    <section id="main-content">
    <h1 class = "titleList">Toy Department</h1>
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
	    		<p>
	    		by <c:out value="${product.manufacturer}"/>
	    		</p>
	    		
	    		<h2 id="price">
	    		$<c:out value="${product.price}"/>
	    		</h2>
	    		
	    		<h3 class="inline">
	    		Weight
	    		</h3>
	    		<p class="inline">
	    		<c:out value="${product.weightInLbs}"/> lbs
	    		</p>
	    		
	    		<c:set var="rating" value="0"/>
	    		<c:set var="one" value="1"/>
	    		<c:forEach begin = "0" end = "${product.averageRating}" var="stars">
		       		<c:set var="rating" value="${rating + 1}"/>
		       	</c:forEach>
		       	
	    	    <img class="starsList" src = "img/${rating-1}-star.png"/>
	    	</div>
	    	 <hr>
	    </c:forEach>

       

    </section>
</body>
</html>