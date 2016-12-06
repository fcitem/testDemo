<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript"
	src="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/js/jquery-2.1.4.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/home.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="shortcut icon" href="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/photo/titleicon.png">
<title>汽车直卖网</title>
<%@include file="menuFile.jsp" %>
</head>
<body>
<div>
	<div class="home">
	<ul>
		<li>
		<i class="home1"></i>
		100%好车
		</li>
		<li>
		<i class="home2"></i>
		259项全面检测
		</li>
		<li>
		<i class="home3"></i>
		14天包退
		</li>
		<li>
		<i class="home4"></i>
		1年5万公里质保
		</li>
	</ul>
	</div>
	<div >
		<div style="width: 1349px; height: 50px;margin-left: 140px;">
			<span style="color: black;font-size: 30px;float: left;margin-right: 60px">热门好车</span>
			<span class="home-car" style="float: left;">
				<ul>
					<li onmouseover="selectnew()" id="newsale">
					最新上架
					</li>
					<li onmouseover="selectcut()" id="cutsale">
					降价促销
					</li>
					<li onmouseover="selectSales()" id="bestsale">
					热销好车
					</li>
				</ul>
			</span>
		</div>
		<div id="newPro"  class="showbestnew" >
			<ul>
				<c:forEach items="${homeCarList}" var="pro">
					<li  class="showbestnew">
					<a href="/jspbotstrap/carInfo/buycarpage?proid=${pro.proid}"><img alt="" src="<%=request.getContextPath() %>${pro.proimg}"></a>
						<p><a href="/jspbotstrap/carInfo/buycarpage?proid=${pro.proid}">${pro.proname} ${pro.proml} ${pro.procontroller} ${pro.prodesc}</a></p>
						<p>${pro.pronowvalue}万 
						<c:if test="${pro.pronowvalue!=pro.provalue}">
								<s style="color:#999">${pro.provalue}万</s>
						</c:if>
						</p>
					</li>
				</c:forEach>
			</ul>
		</div>
		<div id="sale" style="display:none;" class="showbestnew">
		  <ul>
			<c:forEach items="${homeCutCarList}" var="pro">
				<li><a href="/jspbotstrap/carInfo/buycarpage?proid=${pro.proid}"><img alt="" src="<%=request.getContextPath() %>${pro.proimg}"></a>
					<p><a href="/jspbotstrap/carInfo/buycarpage?proid=${pro.proid}">${pro.proname} ${pro.proml} ${pro.procontroller} ${pro.prodesc}</a></p>
					<p>${pro.pronowvalue}万 <s style="color:#999">${pro.provalue}万</s></p>
				</li>
			</c:forEach>
		  </ul>
		</div>
		<div id="salePro"  class="showbestnew" >
			<ul>
				<c:forEach items="${saleBestList}" var="pro">
					<li  class="showbestnew">
					<a href="/jspbotstrap/carInfo/buycarpage?proid=${pro.proid}"><img alt="" src="<%=request.getContextPath() %>${pro.proimg}"></a>
						<p><a href="/jspbotstrap/carInfo/buycarpage?proid=${pro.proid}">${pro.proname} ${pro.proml} ${pro.procontroller} ${pro.prodesc}</a></p>
						<p>${pro.pronowvalue}万 
						<c:if test="${pro.pronowvalue!=pro.provalue}">
								<s style="color:#999">${pro.provalue}万</s>
						</c:if>
						</p>
					</li>
				</c:forEach>
			</ul>
		</div>
	</div>
	<div class="much">
		<a href="<%=request.getContextPath()%>/carInfo/show?value=0&page=1">查看更多</a>
	</div>
</div>
</body>
</html>