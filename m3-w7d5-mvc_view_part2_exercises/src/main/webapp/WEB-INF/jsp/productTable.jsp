<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product Table View</title>
    <link rel="stylesheet" href="css/site.css" />
    <link rel="stylesheet" href="css/table.css" />
</head>
<body>
    <c:import url="header.jsp"/>
    <section id="main-content">
    <h1>Toy Department</h1>
    <table id="headings">
	  	<tr>
	  	</tr>
	    <tr>
		  <td><h4>Name</h4></td>
	    </tr>
	       		
	      <tr>
		     <td><h4>Rating</h4></td>
	      </tr>
	       		
	      <tr>
		   <td><h4>Mfr</h4></td>
	       </tr>
	       		
	       <tr>
		       <td><h4>Price</h4></td>
	       </tr>
	       		
	       <tr>
		     <td><h4>wt. (in lbs)</h4></td>
	       	</tr>
	   </table>
	   
	   <c:forEach var="product" items="${requestScope.productList}">
	   		<div class="item">
	      		<table>
	      			<tr>
	      			  <td>
	      			  	<a href="/mvc-views-part2-exercises/productDetail?productId=${product.productId}">
		      			  <img id="image" src = "img/${product.imageName}"/>
		      			  </a>
		      			  <c:if test= "${product.topSeller}">
		    				<p class = "inline red">Best Seller!</p>
		    			  </c:if>
	    			  </td>
	      			</tr>
	      			
		       		<tr> 
		       			<td> <c:out value="${product.name}" /> </td>
		       		</tr>
		       		
		       		<tr>
		       			<td> <c:set var="rating" value="0"/>
				    		<c:set var="one" value="1"/>
				    		<c:forEach begin = "0" end = "${product.averageRating}" var="stars">
					       		<c:set var="rating" value="${rating + 1}"/>
					       	</c:forEach>
				    	    <img class="starsList" src = "img/${rating-1}-star.png"/> 
	    	  			 </td>
		       		</tr>
		       		
		       		<tr>
		       			<td> <c:out value="${product.manufacturer}" /> </td>
		       		</tr>
		       		
		       		<tr>  
		       			<td id="price"> $<c:out value="${product.price}"/> </td>
		       		</tr>
		       		
		       		<tr>  
		       			<td> 
		       			  <c:out value="${product.weightInLbs}"/>
		       			 </td>
		       		</tr>
	       		</table>
	        </div>
	   	</c:forEach>
	   

       

    </section>
</body>
</html>