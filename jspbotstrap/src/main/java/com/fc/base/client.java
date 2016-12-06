package com.fc.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

import javax.swing.JOptionPane;

public class client {
	Socket socket;
	InputStream str;
	public client() {
		try {
			socket=new Socket(InetAddress.getLocalHost(),1111);
			str=socket.getInputStream();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String receive() throws Exception{
		BufferedReader buffer=new BufferedReader(new InputStreamReader(str));
		while (buffer.ready()) {
			String s=buffer.readLine(); 
			if (s.equals("有新订单")) {
				return s;
			}
		}
		return null;
	}
}
