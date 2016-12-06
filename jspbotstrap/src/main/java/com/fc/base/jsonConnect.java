package com.fc.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

//import org.codehaus.jackson.map.JsonSerializable;

import net.sf.json.JSON;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

public class jsonConnect {
	public String url="http://127.0.0.1:8080";
	URL Url;
	HttpURLConnection connect=null;
	OutputStreamWriter out;
	public jsonConnect(String s) {
		url=url+s;
		getconnect();
	}
	public void getconnect(){
		try {
			//鍒涘缓杩炴帴
			Url=new URL(url);
			connect=(HttpURLConnection) Url.openConnection();
			connect.setDoOutput(true);      //鏍囧織璁剧疆涓� true锛屾寚绀� 搴旂敤绋嬪簭瑕佷粠 URL杩炴帴璇诲彇鏁版嵁
			connect.setDoInput(true);
			connect.setRequestMethod("POST");
			connect.setUseCaches(false);
			 //application/x-javascript text/xml->xml鏁版嵁 application/x-javascript->json瀵硅薄 application/x-www-form-urlencoded->琛ㄥ崟鏁版嵁
			connect.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
//			connect.setRequestProperty("Content-Type", "application/json");
			connect.connect();
			out=new OutputStreamWriter(connect.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public <T> void send(Object obj,Class<T> classType){
		Gson gson=new Gson();
		T object = (T) obj;
		String name=classType.getName();
		try {
			//post璇锋眰
			String json=gson.toJson(object);
			try{
				users u=(users) gson.fromJson(json, classType);
				System.out.println(u.getUsername());
			}catch(Exception e){
				e.printStackTrace();
			}
			out.write(json);
			out.flush();
			out.close();
			connect.getInputStream();  //姝ゅ鎵嶆槸鐪熸鐨勫彂閫佹暟鎹�
//			connect.getResponseCode(); //姝ゅ鎵嶆槸鐪熸鐨勫彂閫佹暟鎹�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void sendtest(String s){
		try {
			out.write(s);
			out.flush();
			out.close();
			connect.getInputStream();  //姝ゅ鎵嶆槸鐪熸鐨勫彂閫佹暟鎹�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void read(){
		try {
			BufferedReader reader=new BufferedReader(new InputStreamReader(connect.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
