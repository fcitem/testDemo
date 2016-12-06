<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page isELIgnored="false" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript"
	src="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/js/jquery-2.1.4.min.js"></script>
<!-- 导入bootstrap的包 -->
<script type="text/javascript"
	src="<%=request.getContextPath()%>/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/menuFile.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/head.js"></script>
<shiro:hasRole name="saler">
<%-- <%@include file="orderMessage.jsp"%> --%>
<%-- <script type="text/javascript"
	src="<%=request.getContextPath()%>/js/orderMessage.js"></script> --%>
</shiro:hasRole>
<!-- 导入bootstrap css的文件 -->
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/bootstrap-3.3.5-dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/bootstrap-3.3.5-dist/css/myCss.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/Font-Awesome-3.2.1/css/font-awesome.min.css">
<%@include file="head.jsp"%>
</head>
<div class="menu-select" style="margin-top: -10px">
	<div style="margin-left:80px" class="ul-style">
		<ul>
				<li><a href="<%=request.getContextPath()%>/carInfo/HomeShow?carname=">首页</a></li>
			    <li ><a href="<%=request.getContextPath()%>/carInfo/show?value=0&page=1">买车</a></li>
			       		<!--  <ul class="select-hide" id="selectbox" >
				    			<li ><a >SUV</a></li>
				    			<li><a >MPV</a></li>
				    			<li><a >中型车</a></li>
				    			<li><a >小型车</a></li>
				    			<li><a >运动型车</a></li>
				    			<li><a >新能源车</a></li>
				    		</ul> -->
				    <shiro:hasRole name="admin"><li style="width: 120px;"><a href="/jspbotstrap/user/userShow?condition=0">用户管理</a></li></shiro:hasRole>
				    <li style="width: 120px;"><shiro:hasRole name="saler"><a href="<%=request.getContextPath()%>/menu/newCar.jsp">新车上架</a></shiro:hasRole></li>
				    <li style="width: 20px"></li>
				    <li style="width: 120px;">
				    <shiro:hasRole name="saler"><a href="/jspbotstrap/carInfo/myCar?volume=0&page=1">我的产品</a>
				    </shiro:hasRole>
				    </li>
				    <%-- <li style="width: 120px;"><shiro:hasRole name="admin"><a href="<%=request.getContextPath()%>/carInfo/">首页更新</a></shiro:hasRole></li> --%>
		</ul>
	</div>
</div>
</html>