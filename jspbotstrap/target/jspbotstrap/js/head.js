 /*$("#login").click(function(){
//	 alert("sds");
	 $("#innerLogin").fadeIn(100);
//	 $("#menus").slideDown(200);
		  $.ajax({
			url:"/jspbotstrap/login",
			type:"Get",
//			async:false,   //若不设置为false就会不断的返回执行error函数？为什么
			success:function(errMsg){
				//alert("发送成功");
				
				if(errMsg=="成功"){
					$("#loginfrom").submit();
				}
				else{
					$("#warning").text(errMsg);
					$("#loginfrom").css("display","block");
//					window.location.reload();
//				}
//				window.location.reload();
			},
			error:function(){
				alert("失败");
			}});  
//	}
	})*/
/*function aClick(){
	$("#innerLogin").css("display","block");
}*/
/*function oClick(){
	$("#registerLogin").css("display","block");
	 $.ajax({
			url:"/jspbotstrap/orderShow",
			type:"post",
			async:false,   //若不设置为false就会不断的返回执行error函数？为什么
			data:{
				  },
			success:function(errMsg){
				//alert("发送成功");
				if(errMsg=="成功"){
//					$("#loginfrom").submit();
					$("#innerLogin").css("display","none")
				}
				else{
					$("#warning").text(errMsg);
					$("#warning").css("display","block");
//					window.location.reload();
				}
//				window.location.reload();
			},
			error:function(){
				alert("失败");
			}});  
}*/
function orderClick(){
	$.ajax({
		url:"/jspbotstrap/showOrder",
		type:"post",
		async:false,   //若不设置为false就会不断的返回执行error函数？为什么
		data:{
			  },
		success:function(errMsg){
		},
		error:function(){
			alert("失败");
		}});  
}
function logout(){
	$.ajax({
		url:"/jspbotstrap/logOut",
		type:"post",
		async:false,   //若不设置为false就会不断的返回执行error函数？为什么
		data:{
			  },
		success:function(errMsg){
			$("#log").hide();
		},
		error:function(){
			alert("退出失败");
		}});  
}