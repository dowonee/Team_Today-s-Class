<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.util.*"    
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<c:set var = "path" value="${pageContext.request.contextPath}"/>
<fmt:requestEncoding value="utf-8"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet" href="${path}/css/myNavi.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<div id="navi">
		<h2>마이페이지</h2>
		<ul>
			<li>
				회원정보
				<input type="hidden" value="edit_mem_info.jsp">
			</li>
			<li>
				내클래스
				<ul>
					<li>
						운영중인 클래스
						<input type="hidden" value="myclass_gosu.jsp">
					</li>
					<li>수업신청서
						<input type="hidden" value="myclass_app_gosu.jsp">
					</li>
					<li>외주현황
						<input type="hidden" value="myclass_os_gosu.jsp">
					</li>
					<li>
						결제내역
						<input type="hidden" value="paymentHistory.jsp">
					</li>
				</ul>
			</li>
			<li>
				쿠폰
				<ul>
					<li>
						내 쿠폰
						<input type="hidden" value="coupon.do">
					</li>
					<li>
						쿠폰등록
						<input type="hidden" value="couponEnrollment.jsp">
					</li>
				</ul>
			</li>
			<li>
				문의내역
				<input type="hidden" value="question.jsp">
			</li>
		</ul>
	</div>
</body>
<script src="${path}/js/myNavi.js" type="text/javascript"></script>
</html>