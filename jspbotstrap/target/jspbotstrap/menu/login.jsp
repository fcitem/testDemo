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
<script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/js/messages_cn.js"></script>
<!-- 导入bootstrap的包 -->
<script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
<!-- 导入bootstrap css的文件 -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/css/bootstrap.min.css">
<!-- 导入自己的css文件 -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/css/myCss.css">
<!--  导入字体的csss -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/Font-Awesome-3.2.1/css/font-awesome.min.css">
<link rel="shortcut icon" href="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/photo/titleicon.png">
</head>
<!-- <body> -->
<!-- 	<div class="loginPhoto">-->
	<div class="login-main" id="innerLogin">
	 <div class="login-centre" > 
	 	<%-- <div  style="margin-left: 250px" id="loginclose">
	 		<img id="closePhoto" onmouseover="mouseinClose()" onmouseout="mouseoutClose" alt="" src="<%=request.getContextPath()%>/bootstrap-3.3.5-dist/photo/close.png" width="20px">
		</div> --%>
		<span style="font-size: 20px;margin-left:80px;"><b>欢迎登陆系统</b></span>
		<span class="glyphicon glyphicon-remove" style="cursor:pointer; float: right;font-size: 20px;" onmouseover="mouseinClose()" onmouseout="mouseoutClose()" id="closePhoto">
		</span>
		<form action="<%=request.getContextPath() %>/show" id="loginfrom" style="padding-top : 40px;" method="get" class="loginFrom">
			<div style="margin-top : -20px;display: none;margin-left: 70px;color: red; font-size: 20px" class="loginFrom" id="warning">
			</div>
			<div style="padding-top: 0px">
				<label style="font-size: 20px;font-style:normal;">用户名</label>
				<input class="" style="padding-left: 22px;width:230px;height: 40px" id="username" name="username" placeholder="请输入用户名"><i style="margin-left: -228px;font-size:20;color:#3C3C3C" class="icon-user" ></i>
			</div>
			<div style="margin-top: 20px"> 
				<label label style="font-size: 20px;font-style:normal;">密码</label>
				<input class="" type="text" id="password" name="password" style="margin-left:20px; padding-left: 22px;width:230px;height: 40px" placeholder="请输入密码"><i style="margin-top:100px; margin-left: -228px;font-size: 25;color:#3C3C3C" class="icon-lock" ></i>
			</div>
			<div style="margin-top: 20px;margin-left: 60px">
			<!-- <input style="font-size:20;width: 100px" type="submit" name="login" value="登陆"> -->
			<button id="loginButton" type="button" style="font-size: 20;width: 100px">登陆</button>
			<input style="margin-left:30px;font-size:20;width: 100px" type="reset" name="rest" value="重置">
			</div>
			</form>
		 </div>
		</div>
		<!-- </div> -->
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/login.js"></script>
<!-- </body> -->
</html>