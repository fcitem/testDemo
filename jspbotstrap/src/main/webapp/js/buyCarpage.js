$(document).ready(function(){
	$("#phonenum").validate({
		onsubmit:true,// 是否在提交是验证 
		onfocusout:false,// 是否在获取焦点时验证 
		onkeyup :true,// 是否在敲击键盘时验证 
		rules: {
				connectphonenum:{
						required:true,
						number:true,
						phoneValidate:true,
				},
		},
		onfocusout: function(element){
	        $(element).valid();
	    },
	})
	$("#look").click(function(){
		$("#hid").css("display","block");
		$("#form").css("display","block");
	})
	$("#closeform").click(function(){
		$("#hid").css("display","none");
		$("#form").css("display","none");
	})
	$("#sure").click(function(){
		if($("#phonenum").valid()==true){
			$("#hid").css("display","none");
			$("#form").css("display","none");
			var connectphonenum=$("#connectphonenum").val();
			var saleid=$("#saleid").val();
			var proid=$("#proid").val();
			$.ajax({
				url:"/jspbotstrap/carInfo/order",
				type:"post",
				async:false,   //若不设置为false就会不断的返回执行error函数？为什么
				data:{
						connectphonenum:connectphonenum,
						userid:saleid,
						proid:proid
					  },
				success:function(errMsg){
					if(errMsg=="成功"){
						alert("预定成功！");
						$("#look").css("disabled","false");
					}
					else if(errMsg=="失败"){
						alert("卖家暂时不能提供服务,预定失败");
					}
					else{
						alert("货源不足");
						$("#num").val(errMsg);
					}
				},
				error:function(){
					alert("失败");
				}
		  });
		}})
})