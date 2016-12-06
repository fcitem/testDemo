<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page isELIgnored="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/register.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="login-main" id="registerLogin">
	</div>
	<div class="register-centre" id="regs"> 
	 	<span style="font-size: 20px;margin-left:250px;"><b>请您完善注册信息</b></span>
		<span class="glyphicon glyphicon-remove" style="cursor:pointer; float: right;font-size: 20px;" id="closePhoto2">
		</span>
		<form id="registerfrom" style="padding-top : 40px;margin-left: 180px" method="post" action="/jspbotstrap/register">
			<div style="margin-top : -20px;display: none;margin-left: 70px;color: red; font-size: 20px" class="loginFrom" id="registerwarning">
			</div>
			<div style="padding-top: 0px;width: 500px;">
				<label style="font-size: 20px;font-style:normal;">用户名</label>
				<input class="" style="padding-left: 22px;width:250px;height: 40px" id="registername" name="registername" placeholder="请输入用户名"><i style="margin-left: -248px;font-size:20;color:#3C3C3C" class="icon-user" id="regusericon"></i>
			</div>
			<div style="margin-top: 20px;width: 500px;"> 
				<label label style="font-size: 20px;font-style:normal;">密码</label>
				<input class="" type="password" id="registerpassword" name="registerpassword" style="margin-left:20px; padding-left: 22px;width:250px;height: 40px" placeholder="请输入密码"><i style="margin-top:100px; margin-left: -248px;font-size: 25;color:#3C3C3C" class="icon-lock" id="regpasswordicon"></i>
			</div>
			<div style="margin-top: 20px;width: 500px;" id="repeat"> 
				<label label style="font-size: 20px;font-style:normal;">重复密码</label>
				<input class="" type="password" id="registerpassword2" name="registerpassword2" style="margin-left:10px; padding-left: 18px;width:220px;height: 40px" placeholder="请重复密码"><i style="margin-top:100px; margin-left: -217px;font-size: 25;color:#3C3C3C" class="icon-lock"  id="regpasswordicon2"></i>
			</div>
			<div style="margin-top: 20px;width: 500px;" id="userrole"> 
				<label label style="font-size: 20px;font-style:normal;">您将成为:</label>
				<input type="checkbox" name="role" value="buyer" id="radio2">买方<input type="checkbox" name="role" value="saler" id="radio2">卖方<span id="test"></span>
			</div>
			<div style="margin-top: 20px;width: 500px;" id="phone"> 
				<label label style="font-size: 20px;font-style:normal;">联系电话:</label>
				<input class="" type="text" id="phonenumber" name="phonenumber" style="margin-left:10px;width:210px;height: 40px" placeholder="请输入电话号码">
			</div>
			<div style="margin-top: 20px;width: 500px;" id="qq"> 
				<label label style="font-size: 20px;font-style:normal;">联系QQ:</label>
				<input class="" type="text" id="qqnumber" name="qqnumber" style="margin-left:10px; width:220px;height: 40px" placeholder="请输入QQ号码">
			</div>
			<div style="margin-top: 20px;width: 500px;" id="address"> 
				<label label style="font-size: 20px;font-style:normal;">联系地址</label>
				<input class="" type="text" id="address" name="address" style="margin-left:10px;width:220px;height: 40px" placeholder="输入地址">
			</div>
			<div style="margin-top: 20px;margin-left: 60px">
			<button id="registerButton" type="submit" style="font-size: 20;width: 100px">提交</button>
			<input style="margin-left:30px;font-size:20;width: 100px" type="reset" name="rest" value="重置">
			</div>
			</form>
		 </div>
</body>
</html>