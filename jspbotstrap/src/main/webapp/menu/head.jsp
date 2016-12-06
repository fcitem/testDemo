<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/js/jquery.validate.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/Validate-addMethord.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/js/messages_cn.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/head.js"></script>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/css/validation.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<div class="login-main" id="rest">
</div>
<div class="rest-password" id="restpwd">
   <form style="margin-left: 10px;width: 360px;margin-bottom:20px;" id="changePassword">
	<div style="width:360px;padding-top: 10px;">
	 <span style="font-size: 20px">修改密码信息</span>
	 <span class="glyphicon glyphicon-remove" style="cursor:pointer; float: right;font-size: 20px;" id="restPwdClose"></span>
	</div>
	<div style="margin-top: 20px;margin-bottom: 20px;" id="restpwd1">
		<label>输入新密码：</label>
		<input type="password" id="pwd1" name="pwd1" placeholder="请设置新密码，至少6位">
	</div>
	<div style="margin-top: 10px;" id="restpwd2">
		<label>重复新密码：</label>
		<input type="password" id="pwd2" name="pwd2" placeholder="请重复新密码，至少6位">
	</div>
	<div class="pwdSure">
		<li id="surePwd">确定</li>
	</div>
   </form>
</div>
<div style="float: right;" class="ul-login" id="headPart">
	<ul>
		<shiro:guest>
		<li style="width: 110px;"><a href="<%=request.getContextPath()%>/login/login.jsp"
			style="color: #22ac38;">您好，请登陆！</a></li>
		</shiro:guest>
		<li><a href="<%=request.getContextPath()%>/user/orderShow">我的订单</a></li>
		<shiro:authenticated>
		<li><a><shiro:principal /></a></li>
		<li style="width: 40px;"><a style="width: 40px;" onclick="logout()">退出</a></li>
		<li style="width: 80px;"><a id="changePwd">修改密码</a></li>
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
