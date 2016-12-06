var selecta;
var uuid;
var trnum;
$(document).ready(function(){
	$("#message").validate({
		onsubmit:true,// 是否在提交时验证 
		onfocusout:false,// 是否在获取焦点时验证 
		onkeyup :true,// 是否在敲击键盘时验证 
		rules: {
				msg:{
						required:true,
				},
		},
		onfocusout: function(element){
	        $(element).valid();
	    },
	})
	var condition=$("#condition").val();
	$("#searchInput").hide();
	if(condition=="0"){
		$("#all").addClass('selectli');
	}
	if(condition=="1"){
		$("#saler").addClass('selectli');
	}
	if(condition=="2"){
		$("#buyer").addClass('selectli');
	}
	if(condition=="3"){
		$("#disable").addClass('selectli');
	}
	if(condition=="4"){
		$("#normal").addClass('selectli');
	}
	var tr = $("#saleOrder tbody tr");
	
	$("#saleOrder tbody tr").each(function(i){
		if(i>4){
			$(this).hide(); //只显示5行
		}
		if(i%5==0){
			$("#page").append("<a>"+(Math.floor((i+1)/5)+1)+"</a>");
		}
	});
	$("#page").find('a:eq(0)').addClass('ona');
	selecta=$("#page").find('a:eq(0)').text();
	for(var i=0; i<tr.length; i++){
		var td = tr[i].cells[5],
			tdStr = td.innerText;
		if(tdStr=="1"){
			td.innerText="正常";
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(0)').attr("disabled", "disabled");
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(1)').attr("disabled", false);
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(2)').attr("disabled", false);
		}
		if(tdStr=="2"){
			td.innerText="已禁用";
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(0)').attr("disabled", false);
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(1)').attr("disabled", "disabled");
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(2)').attr("disabled", false);
			/*$("button[name='cancel']")[i].attr("disabled",false);*/
		}
	}
	$("#search").click(function(){
		var carname=$("#carname").val();
		var condition=$("#condition").val();
		window.location.href="/jspbotstrap/user/orderShow?condition="+condition+"&carname="+carname;
	})
	$(".page ul a").click(function() {
		var number=$(this).text();
		selecta=number;
		$(this).addClass('ona');
		$("#saleOrder tbody tr").each(function(i){
			if(i>(number-1)*5-1&&i<number*5){
				$(this).show(); //只显示5行
			}
			else{
				$(this).hide();
			}
		});
	})
	$(".page ul a").mousedown(function(){
		$(this).parent().find('a').each(function(i){
			if($(this).text()==selecta){
				$(this).removeClass('ona');
			}
		});
	})
	$(".normalClass").click(function(){
		$(this).parent().parent().find('button:eq(0)').attr("disabled", "disabled");
		$(this).parent().parent().find('button:eq(1)').attr("disabled", false);
		$(this).parent().parent().find('button:eq(2)').attr("disabled", false);
		$(this).parent().parent().parent().find('td:eq(6)').html("");
		$(this).parent().parent().parent().find('td:eq(5)').html("正常")
		var userid=$(this).parent().parent().parent().children("td:eq(0)").text();
		$.ajax({
			url:"/jspbotstrap/user/changeUser",
			type:"post",
			async:false,   //若不设置为false就会不断的返回执行error函数？为什么
			data:{
				userid:userid,
				state:1,
			},
			success:function(date){
				alert("操作成功");
			},
			error:function(){
				alert("失败");
			}
			
		})
		})
		$(".disableClass").click(function(){
			$("#messageform").show();
			$("#hid").show();
			uuid=$(this).parent().parent().parent().children("td:eq(0)").text();
			trnum=$(this).parent().parent().parent().index();
		})
		$("deleteClass").click(function(){
		var userid=$(this).parent().parent().parent().children("td:eq(0)").text();
		var _this = $(this);
		$.ajax({
			url:"/jspbotstrap/user/changeUser",
			type:"post",
			async:false,   //若不设置为false就会不断的返回执行error函数？为什么
			data:{
				userid:userid,
				state:3,
			},
			success:function(date){
				alert("操作成功");
				_this.parent().parent().parent().remove();
			},
			error:function(){
				alert("失败");
			}
		})
		})
		$("#closeform").click(function(){
			$("#messageform").hide();
			$("#hid").hide();
		})
		$("#sure").click(function(){
			var mes=$("#msg").val();
			if($("#message").valid()==true){
				$("#hid").hide();
				$("#messageform").hide();
				$.ajax({
					url:"/jspbotstrap/user/changeUser",
					type:"post",
					async:false,   //若不设置为false就会不断的返回执行error函数？为什么
					data:{
						userid:uuid,   //禁用用户的userid
						state:2,
						remark:mes,
					},
					success:function(date){
							changestate(mes);
							alert("操作成功");
					},
					error:function(){
						alert("失败");
					}
					
				})
			}
		})
		function changestate(msg) {
		$("#saleOrder tbody tr:eq("+ trnum +")").find('td:eq(6)').html(msg);
		$("#saleOrder tbody tr:eq("+ trnum +")").find('td:eq(5)').html("已禁用");
		$("#saleOrder tbody tr:eq("+ trnum +")").find('button:eq(0)').attr("disabled", false);
		$("#saleOrder tbody tr:eq("+ trnum +")").find('button:eq(1)').attr("disabled", "disabled");
		$("#saleOrder tbody tr:eq("+ trnum +")").find('button:eq(2)').attr("disabled", false);
		}
		$("#searchbt").click(function(){
			var condition=$("#condition").val();
			var username=$("#username").val();
			window.location.href="/jspbotstrap/user/userShow?condition="+condition+"&username="+username;
		})
})