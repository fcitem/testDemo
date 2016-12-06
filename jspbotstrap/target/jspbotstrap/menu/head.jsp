<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/head.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<div style="float: right;" class="ul-login" id="headPart">
	<ul>
		<li><a href="<%=request.getContextPath()%>/login/login.jsp"
			style="text-decoration: none; color: black;">登陆</a></li>
		<li><a href="<%=request.getContextPath()%>/user/orderShow"
			style="text-decoration: none; color: black;">我的订单</a></li>
		<shiro:authenticated>
		<li style="color: blue;width: 120px;" onclick="logout()" id="log">退出<shiro:principal /></li>
		</shiro:authenticated>
	</ul>
</div>
<div style="width: 900px;height: 105px;margin-bottom: 20px">
	<div class="head-log">
		<span style="float: left;font-size: 50px;color: #22ac38;margin-left: 80px;"><b>汽车直卖网</b></span>
	</div>
	<div style="width:328px;height: 36px;float: right;" id="searchInput">
	<input id="carname" type="text" style="width:265px;height:36px;font-size:18px" placeholder="请输入车型">
	<button class="btnSearch" id="search">搜索</button>
	</div>
</div>
