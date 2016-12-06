$(document).ready(function(){
	$("#newsale").addClass('onli');
	$("#search").click(function(){
		var searchname=$("#carname").val();
		window.location.href="/jspbotstrap/carInfo/HomeShow?carname="+searchname;
	})
})
function selectnew(){
	$("#cutsale").removeClass('onli');
	$("#bestsale").removeClass('onli');
	$("#salePro").css("display","none");
	$("#sale").css("display","none");
	$("#newsale").addClass('onli');
	$("#newPro").css("display","block");
}
function selectcut(){
	$("#newsale").removeClass('onli');
	$("#newPro").css("display","none");
	$("#cutsale").addClass('onli');
	$("#sale").css("display","block");
	$("#bestsale").removeClass('onli');
	$("#salePro").css("display","none");
}
function selectSales(){
	$("#newsale").removeClass('onli');
	$("#newPro").css("display","none");
	$("#cutsale").removeClass('onli');
	$("#sale").css("display","none");
	$("#bestsale").addClass('onli');
	$("#salePro").css("display","block");
}

