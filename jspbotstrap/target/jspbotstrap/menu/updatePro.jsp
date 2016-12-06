<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page isELIgnored="false"%><!--  必须设置为false，否则被忽略-->
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!--  注意servlet，jstl，jsp，taglib，等版本问题，靠这个问题折磨我一天-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="shortcut icon" href="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/photo/titleicon.png">
<title>汽车直卖网</title>
<%@include file="menuFile.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript"
		src="<%=request.getContextPath()%>/js/updatePro.js"></script>
</head>
<body>
<%-- 	<script type="text/javascript"
		src="<%=request.getContextPath()%>/js/updatePro.js"></script>
</head> --%>
<div
	style="margin-top: 20px; margin-left: 120px; background: #F1F1F1; width: 1100px">
	<div class="orderBy">
		<ul>
			<li><a id="default">默认排序</a></li>
			<li><a id="price">价格<i class="glyphicon glyphicon-arrow-up"></i></a></li>
			<li><a id="time">时间<i class="glyphicon glyphicon-arrow-up"></i></a></li>
			<li><a id="volume">销量<i class="glyphicon glyphicon-arrow-up"></i></a></li>
		</ul>
	</div>
</div>
<div>
	<div class="showCar" style="margin-top: 100px">
	<input type="hidden" id="condition" value="${condition}">
	<input type="hidden" id="conditionByvalue" value="${conditionByvalue}">
	<input type="hidden" id="hiddenlow" value="${low}">
	<input type="hidden" id="hiddenhigh" value="${high}">
	<input type="hidden" id="ordervalue" value="${ordervalue}">
		<ul>
			<c:forEach items="${jsonArray}" var="pro">
				<li><a
					href="/jspbotstrap/carInfo/buycarpage?proid=${pro.proid}"><img
						alt="" src="<%=request.getContextPath() %>${pro.proimg}"></a>
				<p>
						<a href="/jspbotstrap/carInfo/buycarpage?proid=${pro.proid}">${pro.proname} ${pro.proml} ${pro.procontroller} ${pro.prodesc}</a>
				</p>
				<p>${pro.pronowvalue}万 
				<c:if test="${pro.pronowvalue!=pro.provalue}">
						<s style="color:#999">${pro.provalue}万</s>
				</c:if>
				<shiro:hasRole name="saler">
							<a style="cursor: pointer;" href="/jspbotstrap/carInfo/getCarInfo?proid=${pro.proid}" id="off"
								value="${pro.proid}">更新</a>
							<a href="/jspbotstrap/carInfo/deleteCar?proid=${pro.proid}">下架</a>
				</shiro:hasRole>
				</p>
				<p>
					<span>车辆ID:${pro.proid}</span>
				</p>
				</li>
			</c:forEach>
		</ul>
	</div>
	<div>
		<ul>
			<li><a style="text-decoration: none"></a></li>
			
		</ul>
	</div>
</div>
</html>
</body>

</html>