<%@page contentType="text/html; charset=utf-8" %>
<%@page isELIgnored="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html charset=utf-8">

<!--  导入jqurey包 -->
<script type="text/javascript" src="http://cdn.bootcss.com/jquery/2.1.4/jquery.min.js"></script>
<!--  导入bootstrap的包-->
<script type="text/javascript" src="../bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
<!--  导入bootstrap的css文件-->
<link rel="stylesheet" type="text/css" href="../bootstrap-3.3.5-dist/css/bootstrap.min.css">
<!-- 导入自己的css文件 -->
<link rel="stylesheet" type="text/css" href="../bootstrap-3.3.5-dist/css/myCss.css">
<link rel="stylesheet" type="text/css" href="../Font-Awesome-3.2.1/css/font-awesome.min.css">
<title>Insert title here</title>
</head>
<body>
	<div class="loginPhoto">
		<div class="login-centre">
		<form action="/menu/menuFile.jsp" style="margin-top: 40px">
			<div>
				<label style="font-size: 20px;font-style:normal;">用户名</label>
				<input style="padding-left: 22px;width:230px;height: 40px" name="username" placeholder="请输入用户名"><i style="margin-left: -228px;font-size: 25;color:#3C3C3C" class="icon-user" ></i>
			</div>
			<div style="margin-top: 20px">
				<label label style="font-size: 20px;font-style:normal;">密码</label>
				<input type="text" name="password" style="margin-left:20px; padding-left: 22px;width:230px;height: 40px" placeholder="请输入密码"><i style="margin-top:100px; margin-left: -228px;font-size: 25;color:#3C3C3C" class="icon-lock" ></i>
			</div>
			<div style="margin-top: 20px;margin-left: 60px">
			<input style="font-size:20;width: 100px" type="submit" name="login" value="登陆">
			<input style="margin-left:30px;font-size:20;width: 100px" type="reset" name="rest" value="重置">
			
			</div>
			</form>
		</div>
	</div>
	<script type="text/javascript">
	function test(){
		var a=[{name:"a"},{name:"b"},{name:"c"}]; 
		var b='{"name":"Mike","sex":"女","age":"29"}'; 
		var aToStr=JSON.stringify(a); 
		var bToObj=JSON.parse(b); 
		alert(aToStr);  //string 
		alert(typeof(bToObj));//object
	}
	</script>
	<script type="text/javascript">
			test();</script>
</body>
</html>
