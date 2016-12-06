$(document).ready(function(){
	var con=$("#controller").val();
	var type=$("#type").val();
	console.log(type);
	$("#Cartype option:eq("+type+")").prop("selected", "true");
	$("#ATtype option:eq("+con+")").prop("selected", "true");
//	for
	$("#ATtype").val(con);	
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
		Carnumber:{
			required:true,
			number:true
		},
		Cardescribe:{
			required:true
		},
		Carimg:{
			imgValidate:true,
		},
		ML:{
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
	
	$("#saveInfo").click(function(){
		$("#newCar").submit();
	});
})