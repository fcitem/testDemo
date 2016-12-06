<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ page isELIgnored="false" %>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/js/jquery-2.1.4.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/bootstrap-3.3.5-dist/css/validation.css">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/bootstrap-3.3.5-dist/js/jquery.validate.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/bootstrap-3.3.5-dist/js/messages_cn.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/updateCar.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/Validate-addMethord.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%-- <link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/bootstrap-3.3.5-dist/css/bootstrap.min.css"> --%>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/bootstrap-3.3.5-dist/css/myCss.css">
<link rel="shortcut icon" href="<%=request.getContextPath() %>/bootstrap-3.3.5-dist/photo/titleicon.png">
<title>汽车直卖网</title>
</head>
<body>
<div >
	<div style="height: 50px;color: #22ac38;margin-left: 200px" >
		<span><b>卖好车就上</b></span><span style="font-size: xx-large;margin-right: 600px;"><b>汽车直卖网</b></span><span style="font-style: oblique;">省钱&nbsp&nbsp&nbsp&nbsp省力&nbsp&nbsp&nbsp&nbsp省心</span>
	</div>
	<div class=newcarhead>
		<span style="color: #22ac38;height: 100px;margin-left: 940px;line-height: 130px;"><b>完善车辆信息你就可以更新该车了!</b></span>
	</div>
	<div style="background-color: #f1f1f1">
	<div style="margin-left: 350px">
		<form id="newCar" enctype="multipart/form-data" action="/jspbotstrap/carInfo/updateCar" method="post">
			<div style="margin-top: 50px; margin-bottom: 10px">
				<label
					style="width: 200px; height: 50px; font-size: 30px; line-height: 50px; display: inline-block; letter-spacing: 10px; text-align: center;">车辆名称:</label>
				<input type="text" id="Carname" name="Carname"
					style="width: 400px; height: 52px; font-size: 30px" value="${carInfo.proname}"/>
			</div>
			<div style="margin-bottom: 10px">
			<input type="hidden" id="type" value="${carInfo.protype }">
				<label
					style="width: 200px; height: 50px; font-size: 30px; line-height: 50px; display: inline-block; letter-spacing: 10px; text-align: center;">车辆类型:</label>
				<select id="Cartype" name="Cartype"
					style="width: 200px; height: 42px; font-size: 30px;">
					<option selected="selected" value="0">请选择</option>
					<option value="1">SUV</option>
					<option value="2">MPV</option>
					<option value="3">中型车</option>
					<option value="4">小型车</option>
					<option value="5">运动型车</option>
					<option value="6">新能源车</option>
				</select>
			</div>
			<div style="margin-bottom: 10px">
				<label
					style="width: 200px; height: 50px; font-size: 30px; line-height: 50px; display: inline-block; letter-spacing: 10px; text-align: center;">车辆价格:</label>
				<input type="text" id="Carrmb" name="Carrmb"
					style="width: 400px; height: 52px; font-size: 30px" value="${carInfo.provalue }" />
			</div>
			<div style="margin-bottom: 10px">
				<label
					style="width: 200px; height: 50px; font-size: 30px; line-height: 50px; display: inline-block; letter-spacing: 10px; text-align: center;">上架数量:</label>
				<input type="text" id="Carnumber" name="Carnumber"
					style="width: 400px; height: 52px; font-size: 30px" value="${carInfo.pronumber }"/>
			</div>
			<div style="margin-bottom: 10px">
			<input type="hidden" id="controller" value="${carInfo.procontroller }">
				<label
					style="width: 200px; height: 50px; font-size: 30px; line-height: 50px; display: inline-block; letter-spacing: 10px; text-align: center;">变速箱:</label>
				<select id="ATtype" name="ATtype"
					style="width: 200px; height: 42px; font-size: 30px;">
					<option selected="selected" value="0">请选择</option>
					<option value="手动">手动</option>
					<option value="自动">自动</option>
					<option value="手自一体">手自一体</option>
				</select>
			</div>
			<div style="margin-bottom: 10px">
				<label
					style="width: 200px; height: 50px; font-size: 30px; line-height: 50px; display: inline-block; letter-spacing: 10px; text-align: center;">排量:</label>
				<input type="text" id="ML" name="ML"
					style="width: 400px; height: 52px; font-size: 30px" value="${carInfo.proml }"/>
			</div>
			<div style="margin-bottom: 10px">
				<label
					style="width: 200px; height: 50px; font-size: 30px; line-height: 50px; display: inline-block; letter-spacing: 10px; text-align: center;">车辆图片</label>
				<input type="file" id="Carimg" name="Carimg"
					style="width: 400px; height: 52px; font-size: 30px;" />
			</div>
			<div style="margin-bottom: 10px">
				<label
					style="width: 200px; height: 50px; font-size: 30px; line-height: 50px; display: inline-block; letter-spacing: 10px; text-align: center; float: inherit;">车辆说明：</label>
				<textarea id="Cardescribe" name="Cardescribe"
					style="width: 400px; height: 80px; font-size: 30px" value="">${carInfo.prodesc }</textarea>
			</div>
			<input type="hidden" value="${carInfo.proid }" id="proid" name="proid">
			<div class="newCar">
				<ul>
					<%-- <li><a href="/jspbotstrap/carInfo/deleteCar?proid=${carInfo.proid}">下架</a></li> --%>
					<li id="saveInfo">保存更改</li>
				</ul>
			</div>
		</form>
	</div>
	</div>
	</div>
</body>
</html>