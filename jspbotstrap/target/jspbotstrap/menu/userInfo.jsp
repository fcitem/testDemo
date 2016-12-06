<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page isELIgnored="false" %><!--  必须设置为false，否则被忽略-->
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>  <!--  注意servlet，jstl，jsp，taglib，等版本问题，靠这个问题折磨我一天-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="shortcut icon" href="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/photo/titleicon.png">
<title>汽车直卖网</title>
<%@include file="menuFile.jsp" %>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/bootstrap-3.3.5-dist/css/validation.css">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/bootstrap-3.3.5-dist/js/jquery.validate.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/bootstrap-3.3.5-dist/js/messages_cn.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/userInfo.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<div class="login-main" id="hid" style="margin-top: -200px;height: 105%">
</div>
<div class="connect" id="messageform" >
	<div style="background-color: 	#E0E0E0;width: 500px; height: 40px;">
	<span style="font-family:Microsoft Yahei">请您必须输入账号的禁用原因</span>
	<span class="glyphicon glyphicon-remove" style="cursor:pointer; float:right;font-size: 20px;" id="closeform">
	</span>
	</div>
	<form action="" style="margin-left: 50px;margin-top: 20px;" id="message" method="post">
		<label style="font-family:Microsoft Yahei;font-size: 15px;color: #666">请在以下位置输入:</label>
		<textarea rows="5" cols="5" style="width: 400px;height: 80px;" name="msg" id="msg"></textarea>
	</form>
	<div>
		<li id="sure">保存</li>
	</div>
</div>
<div style="margin-left: 80px">
<input type="hidden" id="condition" value="${condition}"/>
	<div style="margin-top: 10px">
		<span>当前在线人数：</span>${activenumber }
		<span style="margin-left :300px; ">
		<input id="username" type="text" style="width:265px;height:36px;font-size:18px" placeholder="请输入用户名">
		<button class="btnSearch" id="searchbt" style="float: none;margin-left: -3px">搜索</button>
		</span>
	</div>
	<div class="order-head">
		<ul>
			<li id="all"><a href="/jspbotstrap/user/userShow?condition=0">全部用户</a></li>
			<li id="saler"><a href="/jspbotstrap/user/userShow?condition=1">卖方账户</a></li>
			<li id="buyer"><a href="/jspbotstrap/user/userShow?condition=2">买方账户</a></li>
			<li id="disable"><a href="/jspbotstrap/user/userShow?condition=3">禁用账户</a></li>
			<li id="normal"><a href="/jspbotstrap/user/userShow?condition=4">正常账户</a></li>
		</ul>
	</div>
	<div style="margin-top: 10px;">
	<table id="saleOrder">
		<thead class="tablehead">
			<tr>
				<th>用户ID</th>
				<th>用户名</th>
				<th>用户地址</th>
				<th>联系电话</th>
				<th>QQ号码</th>
				<th>状态</th>
				<th>备注</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody class="tablebody">
			<c:forEach items="${userlist}" var="user">
				<tr>
				<td>${user.userId}</td>
				<td>${user.username}</td>
				<td>${user.address}</td>
				<td >${user.phonenumber}</td>
				<td >${user.qqnumber}</td>
				<td >${user.state}</td>
				<td >${user.remark}</td>
				<td>
					<div class="operateClass">
						<shiro:hasRole name="admin">
						<button name="normal" class="normalClass">启用</button>
						<button name="disable" class="disableClass">禁用</button>
						<button class="deleteClass">删除</button>
						</shiro:hasRole>
					</div>
				</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
	<div class="page" >
		<ul id="page">
		</ul>
	</div>
</div>
</body>
</html>