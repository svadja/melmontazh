<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
<script src="http://code.jquery.com/jquery-2.0.0.js"></script>
<script type="text/javascript" src="resources/js/jquery.pajinate.js"></script>
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="include_top_page.jsp" />
	<script type="text/javascript">
	$("#nav3").addClass("selectedmenu");
	</script>
 	<!-- Contant -->
<!--	<div id="content_area">
		<div id=about_text>
			<c:forEach items="${products}" var="product"> 
					${product.name}
            	</c:forEach>
		</div>
	</div>
	<!-- END Contant -->
	
			<div id="content_area">
			<div id="category_div">
				<ul id="category">
					<li><a href="">All</a></li>
					<li><a href="">Groupe 1</a></li>
				</ul>
			</div>

			<div id="list_SandP_div">
				<ul id="listitems" class="list_content">
					<li>
						<div id=l_image>
							<img alt="" src="file:///d:/project/website/1.jpeg">
						</div>
						<div id="l_info">
							<div id=l_subj>TEST</div>
							<div id="l_disc">boom</div>
							<div id="l_price"></div>
						</div>
					</li>
					<li>
						<div id=l_image>
							<img alt="" src="file:///d:/project/website/1.jpeg">
						</div>
						<div id="l_info">
							<div id=l_subj>TEST1</div>
							<div id="l_disc">boom</div>
							<div id="l_price"></div>
						</div>
					</li>
					<li>
						<div id=l_image>
							<img alt="" src="file:///d:/project/website/1.jpeg">
						</div>
						<div id="l_info">
							<div id=l_subj>TEST2</div>
							<div id="l_disc">boom</div>
							<div id="l_price"></div>
						</div>
					</li>
					<li>
						<div id=l_image>
							<img alt="" src="file:///d:/project/website/1.jpeg">
						</div>
						<div id="l_info">
							<div id=l_subj>TEST3</div>
							<div id="l_disc">boom</div>
							<div id="l_price"></div>
						</div>
					</li>
					<li>
						<div id=l_image>
							<img alt="" src="file:///d:/project/website/1.jpeg">
						</div>
						<div id="l_info">
							<div id=l_subj>TEST4</div>
							<div id="l_disc">boom</div>
							<div id="l_price"></div>
						</div>
					</li>
					<li>
						<div id=l_image>
							<img alt="" src="file:///d:/project/website/1.jpeg">
						</div>
						<div id="l_info">
							<div id=l_subj>TEST5</div>
							<div id="l_disc">boom</div>
							<div id="l_price"></div>
						</div>
					</li>
				</ul>
				<div class="page_navigation"></div>
			</div>

			<!-- Paginator -->
			<script type="text/javascript">
				$(document).ready(function() {
					$('#list_SandP_div').pajinate({
						items_per_page : 3,
						item_container_id : '.list_content',
						nav_panel_id : '.page_navigation'

					});
				});
			</script>
			<!-- END Paginator -->


		</div>
		<!-- END Contant -->
	<jsp:include page="include_bottom_page.jsp" />
</body>
</html>




