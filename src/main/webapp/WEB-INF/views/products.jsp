<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<html> 
    <head> 
        <title>Products</title> 
    </head> 

    <body> 
        <div class = "grid" >
            <c:forEach items="${products}" var="product"> 
				${product.name}
            </c:forEach> 
        </div>
    </body> 
</html>