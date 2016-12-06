var low="0";
var height="0";
var type;
var value;
var selecta;
$(document).ready(function(){
	var condition=$("#condition").val();
	var value=$("#conditionByvalue").val();
	var low=$("#hiddenlow").val();
	var high=$("#hiddenhigh").val();
	var volume=$("#ordervalue").val();
	var page=$("#page").val();
	selecta=page;
	var pagecount=$("#pageCount").val();
	if(pagecount>9){
		if(page+3<pagecount&&page-3>0){
			for (var int = page-3; int <=page+3; int++) {
				$("#footer").append("<a>"+int+"</a>");
			}
			$("#footer").append("...");
			$("#footer").append("<a>"+pagecount+"</a>");
		}
		else if(page-3<=0&&page+3<pagecount){
			for (var int = 1; int <=page; int++) {
				$("#footer").append("<a>"+int+"</a>");
			}
			$("#footer").append("...");
			$("#footer").append("<a>"+pagecount+"</a>");
		}
		else if(page+3>=pagecount&&page-3>0){
			for (var int = page-3; int <=page; int++) {
				$("#footer").append("<a>"+int+"</a>");
			}
			for (var int2 = page+1; int2 <=pagecount ; int2++) {
				$("#footer").append("<a>"+int2+"</a>");
			}
		}
		else if(page+3>=pagecount&&page-3<=0){
			for (var int3 = 1; int3 <=pagecount; int3++) {
				$("#footer").append("<a>"+int3+"</a>");
			}
		}
	}
	else{
		for (var int3 = 1; int3 <=pagecount; int3++) {
			$("#footer").append("<a>"+int3+"</a>");
		}
	}
	$("#footer").parent().find('a').each(function(i){
		if($(this).text()==selecta){
			$(this).addClass('ona');
		}
	})
	$(".page ul a").click(function() {
		var number=$(this).text();
		selecta=number;
		$(this).addClass('ona');
		var value=$("#conditionByvalue").val();
		type=$("#condition").val();
		var low=$("#hiddenlow").val();
		var high=$("#hiddenhigh").val();
		var searchname=$("#carname").val();
		var volume=$("#ordervalue").val();
		window.location.href="/jspbotstrap/carInfo/page?volume="+volume+"&low="+low+"&high"+high+"&cartype="+type+"&value="+value+"&carname="+searchname+"&pagenum="+selecta;
	})
	if(low!=""&high!=""){
		$("#low").val(low);
		$("#high").val(high);
	}
	if(condition=="0"){
		$("#all").addClass('newa');
	}
	if(condition=="1"){
		$("#suv").addClass('newa');
	}
	if(condition=="2"){
		$("#mpv").addClass('newa');
	}
	if(condition=="3"){
		$("#middle").addClass('newa');
	}
	if(condition=="4"){
		$("#small").addClass('newa');
	}
	if(condition=="5"){
		$("#sport").addClass('newa');
	}
	if(condition=="6"){
		$("#energy").addClass('newa');
	}
	if(value=="0"){
		$("#allValue").addClass('ona');
	}
	if(value=="1"){
		$("#V1").addClass('ona');
	}
	if(value=="2"){
		$("#V2").addClass('ona');
	}
	if(value=="3"){
		$("#V3").addClass('ona');
	}
	if(value=="4"){
		$("#V4").addClass('ona');
	}
	if(volume=="0"){
		$("#default").addClass('ordera');
	}
	if(volume=="1"){
		$("#price").addClass('ordera');
	}
	if(volume=="2"){
		$("#time").addClass('ordera');
	}
	if(volume=="3"){
		$("#volume").addClass('ordera');
	}
	$("#default").click(function(){
		var volume=0;
		var value=$("#conditionByvalue").val();
		type=$("#condition").val();
		var low=$("#hiddenlow").val();
		var high=$("#hiddenhigh").val();
		var searchname=$("#carname").val();
		/*if(low==""&&high==""){
			
		}*/
		window.location.href="/jspbotstrap/carInfo/orderBy?volume=0"+"&low="+low+"&high"+high+"&type="+type+"&value="+value;
	})
	$("#price").click(function(){
		var volume=1;
		var value=$("#conditionByvalue").val();
		type=$("#condition").val();
		var low=$("#hiddenlow").val();
		var high=$("#hiddenhigh").val();
		var searchname=$("#carname").val();
		/*if(low==""&&high==""){
			
		}*/
		window.location.href="/jspbotstrap/carInfo/orderBy?volume=1"+"&low="+low+"&high"+high+"&type="+type+"&value="+value;
	})
	$("#time").click(function(){
		var volume=2;
		var value=$("#conditionByvalue").val();
		type=$("#condition").val();
		var low=$("#hiddenlow").val();
		var high=$("#hiddenhigh").val();
		var searchname=$("#carname").val();
		/*if(low==""&&high==""){
			
		}*/
		window.location.href="/jspbotstrap/carInfo/orderBy?volume=2"+"&low="+low+"&high"+high+"&type="+type+"&value="+value;
	})
	$("#volume").click(function(){
		var volume=3;
		var value=$("#conditionByvalue").val();
		type=$("#condition").val();
		var low=$("#hiddenlow").val();
		var high=$("#hiddenhigh").val();
		/*if(low==""&&high==""){
			
		}*/
		var searchname=$("#carname").val();
		window.location.href="/jspbotstrap/carInfo/orderBy?volume=3"+"&low="+low+"&high"+high+"&type="+type+"&value="+value;
	})
	$("#search").click(function(){
		var value=$("#conditionByvalue").val();
		type=$("#condition").val();
		var low=$("#hiddenlow").val();
		var high=$("#hiddenhigh").val();
		var volume=$("#ordervalue").val();
		var searchname=$("#carname").val();
		window.location.href="/jspbotstrap/carInfo/searchByname?volume="+volume+"&low="+low+"&high="+high+"&type="+type+"&value="+value+"&carname="+searchname;
	})
})
function onSelectType1() {
	$("#all").addClass('newa');
	type="0";
	var value=$("#conditionByvalue").val();
	var volume=$("#ordervalue").val();
	var searchname=$("#carname").val();
	window.location.href=("/jspbotstrap/carInfo/searchCar?cartype="+type+"&value="+value+"&volume="+volume+"&page=0");
}
function onSelectType2() {
	$("#suv").addClass('newa');
	type="1";
	var value=$("#conditionByvalue").val();
	var volume=$("#ordervalue").val();
	var searchname=$("#carname").val();
	window.location.href=("/jspbotstrap/carInfo/searchCar?cartype="+type+"&value="+value+"&volume="+volume+"&page=0");
}
function onSelectType3() {
	$("#mpv").addClass=('newa');
	type="2";
	var value=$("#conditionByvalue").val();
	var volume=$("#ordervalue").val();
	var searchname=$("#carname").val();
	window.location.href=("/jspbotstrap/carInfo/searchCar?cartype="+type+"&value="+value+"&volume="+volume+"&page=0");
}
function onSelectType4() {
	$("#middle").addClass('newa');
	type="3";
	var value=$("#conditionByvalue").val();
	var volume=$("#ordervalue").val();
	var searchname=$("#carname").val();
	window.location.href=("/jspbotstrap/carInfo/searchCar?cartype="+type+"&value="+value+"&volume="+volume+"&page=0");
}
function onSelectType5() {
	$("#small").addClass('newa');
	type="4";
	var value=$("#conditionByvalue").val();
	var volume=$("#ordervalue").val();
	var searchname=$("#carname").val();
	window.location.href=("/jspbotstrap/carInfo/searchCar?cartype="+type+"&value="+value+"&volume="+volume+"&page=0");
}
function onSelectType6() {
	$("#sport").addClass('newa');
	type="5";
	var value=$("#conditionByvalue").val();
	var volume=$("#ordervalue").val();
	var searchname=$("#carname").val();
	window.location.href=("/jspbotstrap/carInfo/searchCar?cartype="+type+"&value="+value+"&volume="+volume+"&page=0");
}
function onSelectType7() {
	$("#energy").addClass('newa');
	type="6";
	var value=$("#conditionByvalue").val();
	var volume=$("#ordervalue").val();
	var searchname=$("#carname").val();
	window.location.href=("/jspbotstrap/carInfo/searchCar?cartype="+type+"&value="+value+"&volume="+volume+"&page=0");
}
function onselectInput() {
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
	$("#allValue").removeClass('ona');
	type=$("#condition").val();
	var volume=$("#ordervalue").val();
	var searchname=$("#carname").val();
	window.location.href=("/jspbotstrap/carInfo/searchByvalue?cartype="+type+"&low="+$("#low").val()+"&high="+$("#high").val()+"&volume="+volume);
}
function selectValue() {
	$("#allValue").addClass('ona');
	value="0";
	type=$("#condition").val();
	var volume=$("#ordervalue").val();
	var searchname=$("#carname").val();
	window.location.href=("/jspbotstrap/carInfo/searchCar?cartype="+type+"&value="+value+"&volume="+volume);
}
function selectValue1() {
	$("#V1").addClass('ona');
	value="1";
	type=$("#condition").val();
	var volume=$("#ordervalue").val();
	var searchname=$("#carname").val();
	window.location.href=("/jspbotstrap/carInfo/searchCar?cartype="+type+"&value="+value+"&volume="+volume);
}
function selectValue2() {
	$("#V2").addClass('ona');
	value="2";
	type=$("#condition").val();
	var volume=$("#ordervalue").val();
	var searchname=$("#carname").val();
	window.location.href=("/jspbotstrap/carInfo/searchCar?cartype="+type+"&value="+value+"&volume="+volume);
}
function selectValue3() {
	$("#V3").addClass('ona');
	value="3";
	type=$("#condition").val();
	var volume=$("#ordervalue").val();
	var searchname=$("#carname").val();
	window.location.href=("/jspbotstrap/carInfo/searchCar?cartype="+type+"&value="+value+"&volume="+volume);
}
function selectValue4() {
	$("#V4").addClass('ona');
	value="4";
	type=$("#condition").val();
	var volume=$("#ordervalue").val();
	var searchname=$("#carname").val();
	window.location.href=("/jspbotstrap/carInfo/searchCar?cartype="+type+"&value="+value+"&volume="+volume);
}
function updateInfo(){
	var id=$("#off").attr("value");
	window.location.href="/jspbotstrap/carInfo/getCarInfo?proid="+id;
}
/*function seachByType(date){
	 var cartype=date;
	 $.ajax({
			url:"/jspbotstrap/carInfo/searchCar",
			type:"post",
			async:false,   //若不设置为false就会不断的返回执行error函数？为什么
			data:{
				cartype:cartype,
			},
			success:function(date){
				
			},
			error:function(){
				alert("失败");
			}
			});
}*/