<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
<script src="http://code.jquery.com/jquery-2.0.0.js"></script>
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="include_top_page.jsp" />
	<script type="text/javascript">
	$("#nav3").addClass("selectedmenu");
	</script>
	<!-- Contant -->
	<div id="content_area">
		<div id=about_text>
			<c:forEach items="${products}" var="product"> 
					${product.name}
            	</c:forEach>
		</div>
	</div>
	<!-- END Contant -->
	<jsp:include page="include_bottom_page.jsp" />
</body>
</html>