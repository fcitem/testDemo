<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page isELIgnored="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <meta name="viewport" content=""> -->
<!-- 导入jqurey包 -->
<script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/js/jquery.validate.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/Validate-addMethord.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/js/messages_cn.js"></script>
<!-- 导入bootstrap的包 -->
<script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/login.js"></script>
<!-- 导入bootstrap css的文件 -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/css/bootstrap.min.css">
<!-- 导入自己的css文件 -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/css/myCss.css">
<!--  导入字体的csss -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/Font-Awesome-3.2.1/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/css/validation.css">
<link rel="shortcut icon" href="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/photo/titleicon.png">
<title>欢迎登陆系统</title>
</head>
	 <%@include file="/login/register.jsp"%>
	 <div style="width: 1340px;height: 100px;">
	 	<span style="float: left;font-size: 40px;margin-top: 60px;color: #22ac38;margin-left: 40px;font-style: oblique;"><b>网上汽车直卖网</b></span>
	 	<!-- <span style="float:right;margin-right: 60px;margin-top: 20px;margin-left: -150px;font-size-adjust: inherit;"><h4>您好，欢迎登录!<h4></span> -->
	 	<span style="float:right;margin-right: 120px;margin-top: 80px;margin-left: -150px;font-size-adjust: inherit;"><h4>您好，欢迎登录!<h4></span>
	 </div>
	 <div class="login-back">
	 <div class="login-centre" style="display:block;"> 
	 	<div style="margin-bottom: 10px">
	 	<span style="width: 230px;display: inline-block;" id="loginSpan">用户登录</span>
	 	<span class="spanClass" onclick="zClick2()">注册新账号</span>
	 	</div>
		<form id="loginfrom" method="post" action="/jspbotstrap/loginValidate">
			<div style="padding-top: 10px;display: block;margin-left: 70px;color: red; font-size: 20px" class="loginFrom" id="warning">
			${msg}
			</div>
			<div style="padding-top: 0px;width: 450px;">
				<label style="font-size: 20px;font-style:normal;" id="userLable">用户名</label>
				<input class="" style="padding-left: 22px;width:250px;height: 40px;font-size: 20px" id="username" name="username" placeholder="请输入用户名" ><i style="margin-left: -248px;font-size:20;color:#3C3C3C;position: inherit;" class="icon-user" id="usericon"></i>
			</div>
			<div style="margin-top: 20px;width: 450px;"> 
				<label label style="font-size: 20px;font-style:normal;" id="passLabel">密码</label>
				<input class="" type="password" id="password" name="password" style="margin-left:20px; font-size: 20px;padding-left: 22px;width:250px;height: 40px" placeholder="请输入密码"><i style="margin-top:100px; margin-left: -248px;font-size: 25;color:#3C3C3C;position: inherit;" class="icon-lock" id="passwordicon"></i>
			</div>
			<div style="margin-top: 20px;margin-left: 60px;width: 450px;">
			<!-- <input style="font-size:20;width: 100px" type="submit" name="login" value="登陆"> -->
			<button id="loginButton" type="submit" style="font-size: 20;width: 100px">登陆</button>
			<input style="margin-left:50px;font-size:20;width: 100px" type="reset" name="rest" value="重置">
			</div>
			</form>
		 </div>
		</div>
</html>