<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page isELIgnored="false" %><!--  必须设置为false，否则被忽略-->
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>  <!--  注意servlet，jstl，jsp，taglib，等版本问题，靠这个问题折磨我一天-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="shortcut icon" href="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/photo/titleicon.png">
<title>汽车直卖网</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@include file="menuFile.jsp"%>
<%-- <link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/bootstrap-3.3.5-dist/css/validation.css">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/bootstrap-3.3.5-dist/js/jquery.validate.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/bootstrap-3.3.5-dist/js/messages_cn.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/Validate-addMethord.js"></script> --%>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/buyCar.js"></script>
</head>
<div style="margin-top: 20px; margin-left: 120px;background:  #F1F1F1;width: 1100px">
	<div class="buyCar">
		<span style="font-size: 18px; float: left;">车型:</span>
		<ul>
			<li><a id="all" onclick="onSelectType1()" value="0">不限</a></li>
			<li><a id="suv" onclick="onSelectType2()" value="1">SUV</a></li>
			<li><a id="mpv" onclick="onSelectType3()" value="2">MPV</a></li>
			<li><a id="middle" onclick="onSelectType4()" value="3">中型车</a></li>
			<li><a id="small" onclick="onSelectType5()" value="4">小型车</a></li>
			<li><a id="sport" onclick="onSelectType6()" value="5">运动型车</a></li>
			<li><a id="energy" onclick="onSelectType7()" value="6">新能源车</a></li>
		</ul>
	</div>
	<div class="buyCar-input">
		<span>价格:</span> 
		<a onclick="selectValue()" id="allValue">不限</a> 
		<a onclick="selectValue1()" id="V1">10万以下</a> 
		<a onclick="selectValue2()" id="V2">10-20万</a> 
		<a onclick="selectValue3()" id="V3">20-40万</a> 
		<a onclick="selectValue4()" id="V4">40-60万</a> 
		<input type="text" id="low" name="low"
			onkeyup="value=value.replace(/[^\d{1,}\.\d{1,}|\d{1,}]/g,'')"></input><span>一</span>
		<input type="text" style="margin-left: 0px" id="high" name="high"
			onkeyup="value=value.replace(/[^\d{1,}\.\d{1,}|\d{1,}]/g,'')"></input><span>万</span>
		<a onclick="onselectInput()">筛选</a>
		
	</div>
	<div class="orderBy">
		<ul>
			<li ><a id="default">默认排序</a></li>
			<li><a id="price">价格<i class="glyphicon glyphicon-arrow-up"></i></a></li>
			<li><a id="time">时间<i class="glyphicon glyphicon-arrow-up"></i></a></li>
			<li><a id="volume">销量<i class="glyphicon glyphicon-arrow-up"></i></a></li>
		</ul>
	</div>
</div>
<div>
	<div class="showCar">
	<input type="hidden" id="condition" value="${condition}" >
	<input type="hidden" id="conditionByvalue" value="${conditionByvalue}" >
	<input type="hidden" id="hiddenlow" value="${low}" >
	<input type="hidden" id="hiddenhigh" value="${high}" >
	<input type="hidden" id="ordervalue" value="${ordervalue}" >
	<input type="hidden" id="page" value="${page}" >
	<input type="hidden" id="pageCount" value="${pageCount}" >
		<ul>
			<c:forEach items="${jsonArray}" var="pro">
				<li><a href="/jspbotstrap/carInfo/buycarpage?proid=${pro.proid}"><img alt="" src="<%=request.getContextPath() %>${pro.proimg}"></a>
				<p><a href="/jspbotstrap/carInfo/buycarpage?proid=${pro.proid}">${pro.proname} ${pro.proml} ${pro.procontroller} ${pro.prodesc}</a></p>
				<p>${pro.pronowvalue}万 
				<c:if test="${pro.pronowvalue!=pro.provalue}">
							<s style="color:#999">${pro.provalue}万</s>
				</c:if>
				<shiro:hasRole name="admin">
							<a style="cursor: pointer;" href="/jspbotstrap/carInfo/getCarInfo?proid=${pro.proid}" id="off"
								value="${pro.proid}">更新</a>
				</shiro:hasRole>
				</p>
				</li>
			</c:forEach>
		</ul>
	</div>
	<div class="page">
		<ul id="footer">
			
		</ul>
	</div>
	<div style="clear:both;height:20px;"></div>
</div>
</html>