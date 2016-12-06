$(document).ready(function(){
	$("#changePassword").validate({
		onsubmit:true,// 是否在提交是验证 
		onfocusout:true,// 是否在获取焦点时验证 
		onkeyup :false,// 是否在敲击键盘时验证 
		rules: {
			pwd1:{
				required:true,
				minlength:6
			},
			pwd2:{
				required:true,
				equalTo:"#pwd1",
			},
		},
		messages:{
			 pwd1:{
				 minlength:"密码长度不能少于6位",
			 }
		},
		errorPlacement:function(error,element) {
		    	if (element.attr("id")=="pwd1"){
		    		error.insertAfter("#pwd1");
		    		}
		    	else if(element.attr("id")=="pwd2"){
		    		error.insertAfter("#pwd2");
		    	}
		    },
		    onfocusout: function(element){
			        $(element).valid();
		    },
	})
	$("#changePwd").click(function(){
		$("#rest").show();
		$("#restpwd").show();
	});
	$("#restPwdClose").click(function(){
		$("#rest").hide();
		$("#restpwd").hide();
	});
	$("#surePwd").click(function(){
		if($("#changePassword").valid()==true){
			var str=$("#pwd1").val();
			$.ajax({
				url:"/jspbotstrap/user/restPwd",
				type:"post",
				async:false,   //若不设置为false就会不断的返回执行error函数？为什么
				data:{
					newPwd:str,
	    	    },
				success:function(errMsg){
					if(errMsg=="成功"){
						alert("修改成功,请重新登录");
						window.location.href="/jspbotstrap/login/login.jsp"
					}
				},
				error:function(){
					alert("操作失败");
				}
		})
		}
	});
})
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
			/*$("#log").hide();
			$("#welcome").hide();
			$("#welcome").css("display","block");*/
			window.location.href="/jspbotstrap/carInfo/HomeShow?carname=";
		},
		error:function(){
			alert("退出失败");
		}});  
}