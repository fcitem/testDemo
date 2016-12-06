jQuery.validator.addMethod("userNameVal", function(value, element,params) {   
	var user=$("#registername").val();
	var flag=0;
	 $.ajax({
			url:"/jspbotstrap/registerValidate",
			type:"post",
			async:false,   //若不设置为false就会不断的返回执行error函数？为什么
			data:{
				registername:user,
			},
			success:function(errMsg){
				if(errMsg=="成功"){
					flag=1;
				}
				else{
					flag=0;
				}
			},
			error:function(){
				alert("失败");
				flag=0;
			}});  
	 if(flag==1){
		 return true;
	 }
	 else{
		 return false;
	 }
}, "账号已存在");
jQuery.validator.addMethod("imgValidate", function(value, element,params){
	var filepath=$("#Carimg").val();
    //获得上传文件名
	if(filepath!=""){
		var fileArr=filepath.split("\\");
		var fileTArr=fileArr[fileArr.length-1].toLowerCase().split(".");
		var filetype=fileTArr[fileTArr.length-1];
    //切割出后缀文件名
		if(filetype != "jpg"&&filetype!="png"&&filetype!="gif"){
			return false;
		}else{
			return true;
		}
	}
	else{
		return true;
	}
},"请上传正确的文件");
jQuery.validator.addMethod("carType", function(value, element,params){
	if(value=="0"){
		return false;
	}
	else{
		return true;
	}
},"请选择正确的车辆类型");
jQuery.validator.addMethod("valueRange", function(value, element,params){
	if(value<0){
		return false;
	}
	else{
		return true;
	}
},"请输入正确的价格");
jQuery.validator.addMethod("range", function(){
	if($("#low").val()==""&&$("#high").val()!=""){
		$("#low").val(0);
	}
	else if($("#low").val()==""&&$("#high").val()==""){
		
	}
	else if($("#low").val()>$("#high").val()){
		var v=$("#low").val();
		$("#low").val($("#high").val());
		$("#high").val(v);
	}
	return true;
},"请输入正确的价格范围");
jQuery.validator.addMethod("phoneValidate", function(value, element,params){
	return /^(13|15|18)\d{9}$/i.test(value) || /^((\(\d{2,3}\))|(\d{3}\-))?(\(0\d{2,3}\)|0\d{2,3}-)?[1-9]\d{6,7}(\-\d{1,4})?$/i.test(value);
},"联系方式格式错误");
jQuery.validator.addMethod("qqValidate", function(value, element,params){
	var tel=/^[1-9]\d{4,9}$/;
	return this.optional(element)||(tel.test(value));
},"QQ号格式错误");
/*
jQuery.validator.addMethod("tocarName", function(value, element,params){
	if($("#low").val()==""&&$("#high").val()!=""){
		$("#low").val(0);
	}
	else if($("#low").val()==""&&$("#high").val()==""){
		
	}
	else if($("#low").val()>$("#high").val()){
		var v=$("#low").val();
		$("#low").val($("#high").val());
		$("#high").val(v);
	}
	return true;
},"请输入正确的价格范围");*/