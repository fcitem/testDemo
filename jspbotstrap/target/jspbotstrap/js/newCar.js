$(document).ready(function(){
	$("#newCar").validate({
		onsubmit:true,// 是否在提交是验证 
		onfocusout:false,// 是否在获取焦点时验证 
		onkeyup :true,// 是否在敲击键盘时验证 
		rules: {
		Carname:{
			required:true,
		},
		Cartype:{
			required:true,
			carType:true
		},
		Carrmb:{
			required:true,
			number:true,
			valueRange:true
		},
		Carimg:{
			imgValidate:true,
			required:true
		},
		Carnumber:{
			required:true,
			number:true
		},
		Cardescribe:{
			required:true
		},
		ML:{
			required:true,
			number:true,
			valueRange:true
		},
		ATtype:{
			required:true,
			carType:true
		}
		},
		onfocusout: function(element){
	        $(element).valid();
	    },
	});
	$("#save").click(function(){
		$("#newCar").submit();
		/*if($("#newCar").valid()=="true"){*/
	/*	var formData = new FormData($("#newCar")[0]);
		$.ajax({
			url:"/jspbotstrap/carInfo/createCar",
			type:"post",
			dataType:"json",
			async:false,   //若不设置为false就会不断的返回执行error函数？为什么
			data:formData,
			processData: false,  
	        contentType: false ,
			success:function(errMsg){
			},
			error:function(){
				alert("失败");
			}});  */
		/*}*/
	});
})
