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
		$("#nav1").addClass("selectedmenu");
	</script>
	<!-- Contant -->
	<div id="content_area">
		<div id=about_text>
			<p>Пропонована Росiйською Федерацiєю цiна в 385 доларів за тисячу
				кубометрів газу не є найвигiднiшою на ринку. Про це заявив мiнiстр
				енергетики та вугiльної промисловостi України Юрiй Продан на
				прес-конференцiї у Брюсселi у вiвторок. "Ми маємо багато пропозицiй
				- це пропозицiї щодо реверсних постачань, якi за цiновими
				показниками є значно нижчими за 385 доларів за тисячу кубометрів", -
				заявив Продан. "Якщо врахувати транзит, який здiйснюється через
				територiю України й у зворотному напрямку в європейських країнах, то
				ми можемо говорити, що цiна "Газпрому" може бути ще нижча, нiж
				наразi пропонують європейськi постачальники", - додав вiн. Як
				повiдомлялося, РФ запропонувала Українi вiдновити дiю знижки в 100
				доларів на газ для України.</p>
		</div>
	</div>
	<!-- END Contant -->
	<jsp:include page="include_bottom_page.jsp" />
</body>
</html>