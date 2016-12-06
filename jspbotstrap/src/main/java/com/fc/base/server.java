package com.fc.base;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ServerSocket serverSocket=new ServerSocket(1111);
			synchronized (serverSocket) {
				Socket socket=serverSocket.accept();
				socket.getOutputStream().write(new String("有新订单").getBytes());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}