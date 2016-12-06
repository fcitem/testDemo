var low="0";
var height="0";
var type;
var value;
$(document).ready(function(){
	var condition=$("#condition").val();
	var value=$("#conditionByvalue").val();
	var low=$("#hiddenlow").val();
	var high=$("#hiddenhigh").val();
	var volume=$("#ordervalue").val();
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
	$("#search").click(function(){
		var carname=$("#carname").val();
		window.location.href="/jspbotstrap/carInfo/myCar?volume=0&page=1&carname="+carname;
	})
	$("#default").click(function(){
		var volume=0;
		var value=$("#conditionByvalue").val();
		type=$("#condition").val();
		var low=$("#hiddenlow").val();
		var high=$("#hiddenhigh").val();
		window.location.href="/jspbotstrap/carInfo/myCar?volume=0";
	})
	$("#price").click(function(){
		var volume=1;
		var value=$("#conditionByvalue").val();
		type=$("#condition").val();
		var low=$("#hiddenlow").val();
		var high=$("#hiddenhigh").val();
		window.location.href="/jspbotstrap/carInfo/myCar?volume=1";
	})
	$("#time").click(function(){
		var volume=2;
		var value=$("#conditionByvalue").val();
		type=$("#condition").val();
		var low=$("#hiddenlow").val();
		var high=$("#hiddenhigh").val();
		window.location.href="/jspbotstrap/carInfo/myCar?volume=2";
	})
	$("#volume").click(function(){
		var volume=3;
		var value=$("#conditionByvalue").val();
		type=$("#condition").val();
		var low=$("#hiddenlow").val();
		var high=$("#hiddenhigh").val();
		window.location.href="/jspbotstrap/carInfo/myCar?volume=3";
	})
})
/*function updateInfo(){
	var id=$("#off").attr("value");
	window.location.href="/jspbotstrap/carInfo/getCarInfo?proid="+id;
}*/