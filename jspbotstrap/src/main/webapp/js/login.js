$(document).ready(function(){
	$("#loginfrom").validate({
		onsubmit:true,// 是否在提交是验证 
		onfocusout:true,// 是否在获取焦点时验证 
		onkeyup :false,// 是否在敲击键盘时验证 
		rules: {
		username:{
			required:true
		},
		password:{
			required:true
		}
		},
		/*messages: {
	      username: "用户名不能为空"
	    },*/
	    errorPlacement:function(error,element) {
	    	if (element.attr("id")=="username"){
	    		error.insertAfter("#usericon");
	    		}
	    	else if(element.attr("id")=="password"){
	    		error.insertAfter("#passwordicon");
	    	}
	    	},
		 onfocusout: function(element){
		        $(element).valid();
	    },
	})
  /*  $("#loginButton").click(function(){
    	var v=$("#loginfrom").valid();
    	if($("#loginfrom").valid()==true){
		  var username=$("#username").val();
		  var password=$("#password").val();
		  $.ajax({
			url:"/jspbotstrap/loginValidate",
			type:"post",
			async:false,   //若不设置为false就会不断的返回执行error函数？为什么
			data:{
				  username:username,
				  password:password,
				  },
			success:function(errMsg){
				//alert("发送成功");
				if(errMsg=="成功"){
					 $.ajax({
						 url:"/jspbotstrap/carInfo/HomeShow",
						 type:"post",
					     async:false,   //若不设置为false就会不断的返回执行error函数？为什么
					     success:function(){
					    	 
					     },
					 	 error:function(){
							alert("失败");
						 }
					 });
				}
				else{
					$("#warning").text(errMsg);
					$("#warning").css("display","block");
				}
			},
			error:function(){
				alert("失败");
			}});
    	}
//	}
	})*/
/*	$("#closePhoto").click(function(){
		$("#innerLogin").hide();
	})
	function mouseinClose(){
    	$("#closePhoto").css("background-color","#BEBEBE");
    }
    function mouseoutClose(){
    	$("#closePhoto").css("background-color","white");
    }*/
})
 function zClick2(){
    	$("#registerLogin").css("display","block");
    	$("#regs").css("display","block");
    }
function required(){
	$("#username").val();
}
