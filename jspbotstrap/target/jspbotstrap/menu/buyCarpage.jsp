<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page isELIgnored="false" %><!--  必须设置为false，否则被忽略-->
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>  <!--  注意servlet，jstl，jsp，taglib，等版本问题，靠这个问题折磨我一天-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="shortcut icon" href="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/photo/titleicon.png">
<title>预约看车</title>
<%@include file="menuFile.jsp"%>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/bootstrap-3.3.5-dist/css/validation.css">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/bootstrap-3.3.5-dist/js/jquery.validate.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/bootstrap-3.3.5-dist/js/messages_cn.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/Validate-addMethord.js"></script>
<title>Insert title here</title>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/buyCarpage.js"></script>
<link rel="shortcut icon" href="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/photo/titleicon.png">
</head>
<div class="login-main" id="hid" style="margin-top: -200px;height: 105%">
</div>
<div class="connect" id="form" >
	<div style="background-color: 	#E0E0E0;width: 500px; height: 40px;">
	<span style="font-family:Microsoft Yahei">您即将用以下的号码预约看车!请保持通话畅通</span>
	<span class="glyphicon glyphicon-remove" style="cursor:pointer; float:right;font-size: 20px;" id="closeform">
	</span>
	</div>
	<form action="" style="margin-left: 50px;margin-top: 50px;" id="phonenum" method="post">
		<label style="font-family:Microsoft Yahei;font-size: 15px;color: #666">请输入您的电话号码:</label>
		<input type="text" name="connectphonenum" id="connectphonenum" >
	</form>
	<div>
		<li id="sure">确定预约看车</li>
	</div>
</div>
<div>
	<div class="showoneCar">
	<img alt="" src="<%=request.getContextPath() %>${jsonArray.proimg}">
	<input type="hidden" value="${jsonArray.prosource }" id="saleid">
	<input type="hidden" value="${jsonArray.proid }" id="proid">
	<div style="margin-left: 800px;">
		<h1>${jsonArray.proname} - ${jsonArray.prodesc}</h1>
		<div class="showonecarpage">
			<i >销售价格：</i>
			<c:choose>
				<c:when test="${jsonArray.nowvalue!=null}">
					<span style="font-size: 36px;font-family: Arial;color: #ff7e00"><b>¥${jsonArray.nowvalue}万</b></span>
				</c:when>
				<c:otherwise>
					<span style="font-size: 36px;font-family: Arial;color: #ff7e00">¥${jsonArray.provalue}万</span>
				</c:otherwise>
			</c:choose>
			<i>原价:</i>
			<span>${jsonArray.provalue}万
		</div>
		<div class="showonecarpage">
			<i>服务费:</i><span>${jsonArray.provalue*0.03*10000}元 &nbsp(&nbsp车价X3%&nbsp)&nbsp,&nbsp送1年2万公里质保</span>
		</div>
		<div class="showonecarpage">
			<i>卖家承诺:</i><span>保留字段</span>
		</div>
		<div class="showonecarpage">
			<i>货源数量:</i><span id="num">${jsonArray.pronumber}</span>
			<i style="margin-left: 100px">已销售:</i><span >
			<c:choose>
			<c:when test="${ordernum!=null}">
			${ordernum }
			</c:when>
			<c:otherwise>
			0</c:otherwise>
			</c:choose>
			台</span>
		</div>
		<div class="showCaroff">
			<ul>
				<li><b>${createTime}</b>
				上架时间
				</li>
				<li><b>${jsonArray.procontroller}</b>
				变速箱
				</li>
				<li><b>${jsonArray.proml}</b>
				排量
				</li>
			</ul>
		</div>
		<div class="orderLook">
			<li id="look">预约看车</li>
		</div>
		<div class="touch">
			<p>货源地址:${seller.address}</p>
			<p>联系电话:${seller.phonenumber}</p>
			<p>QQ:${seller.qqnumber}</p>
		</div>
	</div>
	</div>
	<div>
	</div>
</div>
</html>