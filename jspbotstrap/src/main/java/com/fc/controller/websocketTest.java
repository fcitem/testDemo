package com.fc.controller;

import java.io.IOException;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/websocket")
public class websocketTest {
	@OnMessage
	public void onmessage(Session session,String str){
//		try {
//			session.getBasicRemote().sendText("ok");
//		} catch (IOException e) {
//			e.printStackTrace();
//		};
	}
	@OnOpen
	public void openConnect(){
		System.out.println("has connected");
	}
}
