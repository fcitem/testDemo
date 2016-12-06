$(document).ready(function(){
	var websocket=new WebSocket("ws://localhost:8080/jspbotstrap/websocket");
	websocket.onopen=function(event){
		alert("连接成功");
	}
	websocket.onMessage=function(event){
		alert(event.data);
	}
	websocket.onerror=function(event){
		alert(event.data);
	}
})