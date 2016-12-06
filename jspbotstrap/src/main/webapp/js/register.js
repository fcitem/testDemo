$(document).ready(function(){
	$("#registerfrom").validate({
		onsubmit:true,// 是否在提交是验证 
		onfocusout:true,// 是否在获取焦点时验证 
		onkeyup :false,// 是否在敲击键盘时验证 
		rules: {
			registername:{
							required:true,
							userNameVal:true
			},
			registerpassword:{
							required:true,
							minlength:6
			},
			registerpassword2:{
							required:true,
							equalTo:"#registerpassword",
			},
			phonenumber:{
				required:true,
				number:true,
				phoneValidate:true,
			},
			qqnumber:{
				number:true,
				required:true,
				qqValidate:true,
			},
			address:{
				required:true,
			},
			role:{
				required:true,
			}
		},
		 messages:{
			 registerpassword:{
				 minlength:"密码长度不能少于6位",
			 }
		 },
	    errorPlacement:function(error,element) {
	    	if (element.attr("id")=="registername"){
	    		error.insertAfter("#regusericon");
	    		}
	    	else if(element.attr("id")=="registerpassword"){
	    		error.insertAfter("#regpasswordicon");
	    	}
	    	else if(element.attr("id")=="registerpassword2"){
	    		error.insertAfter("#regpasswordicon2");
	    	}
	    	else if(element.attr("id")=="radio2"){
	    		error.insertAfter("#test");
	    	}
	    	else{
	    		error.insertAfter(element);
	    	}
	    },
	    onfocusout: function(element){
		        $(element).valid();
	    },
	})
	$("#closePhoto2").click(function(){
		$("#registerLogin").hide();
		$("#regs").hide();
	});
	$("#closePhoto2").mouseover(function(){
    	$("#closePhoto2").css("background-color","#BEBEBE");
	})
	$("#closePhoto2").mouseleave(function() {
	  $("#closePhoto2").css("background-color","white");
	})
})