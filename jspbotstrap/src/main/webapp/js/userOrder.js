var selecta;
$(document).ready(function(){
	var tr = $("#saleOrder tbody tr");
	var condition=$("#condition").val();
	
	if(condition==""){
		$("#all").addClass('selectli');
	}
	if(condition=="1"){
		$("#success").addClass('selectli');
	}
	if(condition=="2"){
		$("#fail").addClass('selectli');
	}
	if(condition=="3"){
		$("#communicate").addClass('selectli');
	}
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
		if(tdStr=="5"){
			td.innerText="已过期";    //代表任意买方已删除
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(0)').attr("disabled", "disabled");
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(1)').attr("disabled", "disabled");
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(2)').attr("disabled", "disabled");
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(3)').attr("disabled", false);
		}
		if(tdStr=="0"){
			td.innerText="已过期";    ////代表任意卖方已删除
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(0)').attr("disabled", false);
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(1)').attr("disabled","disabled");
		}
		if(tdStr=="1"){
			td.innerText="待沟通";
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(0)').attr("disabled", false);
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(1)').attr("disabled", "disabled");
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(2)').attr("disabled", "disabled");
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(3)').attr("disabled", false);
		    $("#saleOrder tbody tr:eq("+ i +")").find('button[name="cancel"]').attr("disabled",false);
		    $("#saleOrder tbody tr:eq("+ i +")").find('button[name="delete"]').attr("disabled","disabled");
			/*$("button[name='cancel']")[i].attr("disabled",false);*/
		}
		if(tdStr=="2"){
			td.innerText="交易成功";
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(0)').attr("disabled", "disabled");
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(1)').attr("disabled", "disabled");
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(2)').attr("disabled", "disabled");
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(3)').attr("disabled", false);
			$("#saleOrder tbody tr:eq("+ i +")").find('button[name="cancel"]').attr("disabled","disabled");
			$("#saleOrder tbody tr:eq("+ i +")").find('button[name="delete"]').attr("disabled",false);
			/*$("#cancel").attr("disabled","disabled");*/
		}
		if(tdStr=="3"){
			td.innerText="交易失败";
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(0)').attr("disabled", "disabled");
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(1)').attr("disabled", "disabled");
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(2)').attr("disabled", "disabled");
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(3)').attr("disabled", false);
			$("#saleOrder tbody tr:eq("+ i +")").find('button[name="cancel"]').attr("disabled","disabled");
			$("#saleOrder tbody tr:eq("+ i +")").find('button[name="delete"]').attr("disabled",false);
		}
		if(tdStr=="4"){
			td.innerText="已沟通";
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(0)').attr("disabled", "disabled");
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(1)').attr("disabled", false);
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(2)').attr("disabled", false);
			$("#saleOrder tbody tr:eq("+ i +")").find('button:eq(3)').attr("disabled", false);
			$("#saleOrder tbody tr:eq("+ i +")").find('button[name="cancel"]').attr("disabled","disabled")
			$("#saleOrder tbody tr:eq("+ i +")").find('button[name="delete"]').attr("disabled",false);
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
	$(".communicateClass").click(function(){
		$(this).parent().parent().find('button:eq(0)').attr("disabled", "disabled");
		$(this).parent().parent().find('button:eq(1)').attr("disabled", false);
		$(this).parent().parent().find('button:eq(2)').attr("disabled", false);
		$(this).parent().parent().find('button:eq(3)').attr("disabled", "disabled");
		var orderid=$(this).parent().parent().parent().children("td:eq(0)").text();
		_this=$(this);
		$.ajax({
			url:"/jspbotstrap/user/changeOrder",
			type:"post",
			async:false,   //若不设置为false就会不断的返回执行error函数？为什么
			data:{
				orderid:orderid,
				state:4,
			},
			success:function(date){
				alert("操作成功");
				_this.parent().parent().parent().find('td:eq(5)').html("已沟通");
			},
			error:function(){
				alert("失败");
			}
			
		})
		})
		$(".successClass").click(function(){
		$(this).parent().parent().find('button:eq(0)').attr("disabled", "disabled");
		$(this).parent().parent().find('button:eq(1)').attr("disabled", "disabled");
		$(this).parent().parent().find('button:eq(2)').attr("disabled", "disabled");
		$(this).parent().parent().find('button:eq(3)').attr("disabled", false);
		_this=$(this);
		var orderid=$(this).parent().parent().parent().children("td:eq(0)").text();
		$.ajax({
			url:"/jspbotstrap/user/changeOrder",
			type:"post",
			async:false,   //若不设置为false就会不断的返回执行error函数？为什么
			data:{
				orderid:orderid,
				state:2,
			},
			success:function(date){
				alert("操作成功");
				_this.parent().parent().parent().find('td:eq(5)').html("交易成功");
			},
			error:function(){
				alert("失败");
			}
			
		})
		})
		$(".failClass").click(function(){
		$(this).parent().parent().find('button:eq(0)').attr("disabled", "disabled");
		$(this).parent().parent().find('button:eq(1)').attr("disabled", "disabled");
		$(this).parent().parent().find('button:eq(2)').attr("disabled", "disabled");
		$(this).parent().parent().find('button:eq(3)').attr("disabled", false);
		_this=$(this);
		var orderid=$(this).parent().parent().parent().children("td:eq(0)").text();
		$.ajax({
			url:"/jspbotstrap/user/changeOrder",
			type:"post",
			async:false,   //若不设置为false就会不断的返回执行error函数？为什么
			data:{
				orderid:orderid,
				state:3,
			},
			success:function(date){
				alert("操作成功");
				_this.parent().parent().parent().find('td:eq(5)').html("交易失败");
			},
			error:function(){
				alert("失败");
			}
			
		})
		})
		$(".deleteClass").click(function(){
			$(this).parent().parent().find('button:eq(0)').attr("disabled", "disabled");
			$(this).parent().parent().find('button:eq(1)').attr("disabled", "disabled");
			$(this).parent().parent().find('button:eq(2)').attr("disabled", "disabled");
			$(this).parent().parent().find('button:eq(3)').attr("disabled", "disabled");
			var _this = $(this);
			var orderid=$(this).parent().parent().parent().children("td:eq(0)").text();
			$.ajax({
				url:"/jspbotstrap/user/changeOrder",
				type:"post",
				async:false,   //若不设置为false就会不断的返回执行error函数？为什么
				data:{
					orderid:orderid,
					state:0,
				},
				success:function(date){
					_this.parent().parent().parent().remove();
//					console
					alert("操作成功");
				},
				error:function(){
					alert("失败");
				}
				
			})
			})
			
			$(".cancelClass").click(function(){
				$(this).parent().parent().find('button:eq(0)').attr("disabled", "disabled");
				$(this).parent().parent().find('button:eq(1)').attr("disabled", "disabled");
			/*	$(this).parent().parent().find('button:eq(2)').attr("disabled", "disabled");
				$(this).parent().parent().find('button:eq(3)').attr("disabled", "disabled");*/
				var _this = $(this);
				var orderid=$(this).parent().parent().parent().children("td:eq(0)").text();
				$.ajax({
					url:"/jspbotstrap/user/changeOrder",
					type:"post",
					async:false,   //若不设置为false就会不断的返回执行error函数？为什么
					data:{
						orderid:orderid,
						state:5,
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
})