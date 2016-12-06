<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page isELIgnored="false" %><!--  必须设置为false，否则被忽略-->
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>  <!--  注意servlet，jstl，jsp，taglib，等版本问题，靠这个问题折磨我一天-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="shortcut icon" href="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/photo/titleicon.png">
<title>我的预约</title>
<%@include file="menuFile.jsp" %>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/userOrder.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<div style="margin-left: 80px">
<input type="hidden" id="condition" value="${condition}"/>
	<div class="order-head">
		<ul>
			<li id="all"><a href="/jspbotstrap/user/orderShow">全部订单</a></li>
			<li id="success"><a href="/jspbotstrap/user/orderShow?condition=1">交易成功</a></li>
			<li id="fail"><a href="/jspbotstrap/user/orderShow?condition=2">交易失败</a></li>
			<li id="communicate"><a href="/jspbotstrap/user/orderShow?condition=3">未处理订单</a></li>
		</ul>
	</div>
	<div style="margin-top: 10px;">
	<table id="saleOrder">
		<thead class="tablehead">
			<tr>
				<th>预约号</th>
				<th>预约方</th>
				<th>预约的车系</th>
				<th>下单时间</th>
				<th>预约电话</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody class="tablebody">
			<c:forEach items="${jsonArray}" var="order">
				<tr>
				<td>${order.orderid}</td>
				<td>${order.buyername}</d>
				<td>
					<div class="orderImg">
						<li><a href="/jspbotstrap/carInfo/buycarpage?proid=${order.proid}"><img alt="" src="<%=request.getContextPath() %>${order.proimg}"></a>
						<p><a href="/jspbotstrap/carInfo/buycarpage?proid=${order.proid}">${order.proname}</a></p>
					</div>
				</td>
				<td >${order.ordertime}</td>
				<td >${order.buyerphone}</td>
				<td >${order.orderstate}</td>
				<td>
					<div class="operateClass">
						<shiro:hasRole name="saler">
						<button name="communicate" class="communicateClass">立即沟通</button>
						<button name="success" class="successClass">成交</button>
						<button name="fail" class="failClass">沟通失败</button>
						<button class="deleteClass">删除</button>
						</shiro:hasRole>
						<shiro:hasRole name="buyer">
						<button name="delete" class="cancelClass">删除</button>
						<button name="cancel" class="deleteClass">取消</button>
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