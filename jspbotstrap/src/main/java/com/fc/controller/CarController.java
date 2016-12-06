package com.fc.controller;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.fc.bean.OrderNum;
import com.fc.bean.OrderNumExample;
import com.fc.bean.ProInfo;
import com.fc.bean.ProInfoExample;
import com.fc.bean.ProOrder;
import com.fc.bean.Product;
import com.fc.bean.ProductExample;
import com.fc.bean.ProductExample.Criteria;
import com.fc.bean.Users;
import com.fc.bean.UsersExample;
import com.fc.bean.productAndInfo;
import com.fc.service.orderNumService;
import com.fc.service.proInfoService;
import com.fc.service.proOrderService;
import com.fc.service.productService;
import com.fc.service.userService;

@Controller
@RequestMapping("carInfo")
public class CarController {

	@Autowired
	productService proService;
	
	@Autowired
	proInfoService proInfo;
	
	@Autowired
	proOrderService orderService;
	
	@Autowired
	userService userServer;
	
	@Autowired
	SessionDAO dao;
	
	@Autowired
	orderNumService ordernum;
	@RequestMapping(value="createCar",method=RequestMethod.POST)
	public String newCar(String Carname,String Cartype,String Carrmb,MultipartFile Carimg,String Cardescribe,String ML,String ATtype,String Carnumber,HttpServletResponse response,HttpServletRequest request){
		String id=UUID.randomUUID().toString().substring(0, 31).replace("-", "");
		String username=request.getSession().getAttribute("username").toString();
		UsersExample userExample=new UsersExample();
		com.fc.bean.UsersExample.Criteria usercia=userExample.createCriteria();
		usercia.andUsernameEqualTo(username);
		Product pro=new Product();
		ProInfo info=new ProInfo();
		info.setCreatetime(new Date());
		info.setProid(id);
		info.setNowvalue(Double.valueOf(Carrmb));
		info.setPronumber(Integer.valueOf(Carnumber));
		info.setProsource(userServer.selectByExample(userExample).get(0).getUserId());
		pro.setProid(id);
		pro.setProname(Carname);
		pro.setProdesc(Cardescribe);
		pro.setProtype(Cartype);
		pro.setProvalue(Double.valueOf(Carrmb));
		pro.setProcontroller(ATtype);
		pro.setProml(Double.valueOf(ML));
		pro.setPronowvalue(Double.valueOf(Carrmb));
		String url=request.getServletContext().getRealPath("/");
		pro.setProimg("/carImg/"+saveFile(url, Carimg));
		proService.insert(pro);
		proInfo.insert(info);
		return "/menu/menuFile";
	}
	@RequestMapping(value="page",method=RequestMethod.GET)
	public String searchBypage(@RequestParam(required=true) String cartype,String value,HttpServletResponse response,HttpServletRequest request,String volume,String low,String high,String pagenum,String carname){
		response.setContentType("utf-8");
		response.setCharacterEncoding("utf-8");
		List<Product> prolist=showCarBycondition(volume, cartype, value, low, high,"",request);
		List<Product> list=new ArrayList<>();
		request.setAttribute("pageCount", prolist.size()/20+1);
		int begin=Integer.valueOf(pagenum);
		if(pagenum.equals("1")){
			if(prolist.size()>20)
			{
				for (int i = 0; i < 20; i++) {
					list.add(prolist.get(i));
				}
			}
			else{
				list=prolist;
			}
		}
		else{
			if(prolist.size()>begin*20){
				for (int i =(begin-1)*20-1 ; i < 20; i++) {
					list.add(prolist.get(i));
				}
			}
			else if(prolist.size()>(begin-1)*20 && prolist.size()<begin*20){
				for (int i =(begin-1)*20-1 ; i < prolist.size(); i++) {
					list.add(prolist.get(i));
				}
			}
		}
		request.setAttribute("page", pagenum);
		request.setAttribute("jsonArray",list);
		request.setAttribute("condition", cartype);
		request.setAttribute("conditionByvalue",value);
		request.setAttribute("ordervalue",volume);
		return "menu/buyCar";
	}
	@RequestMapping(value="searchCar",method=RequestMethod.GET)
	public String searchByType(@RequestParam(required=true) String cartype,String value,HttpServletResponse response,HttpServletRequest request,String volume,String pagenum){
		response.setContentType("utf-8");
		response.setCharacterEncoding("utf-8");
		List<Product> prolist=showCarBycondition(volume, cartype, value, "", "","",request);
		/*double[] range=new double[2];
		range=level(value);
		List<Product> list=new ArrayList<Product>();
		ProductExample example=new ProductExample();
		int pagenum=Integer.valueOf(page);
		if(pagenum==1){
			example.setLimit(0,20);
		}
		else{
			example.setLimit((pagenum-1)*20-1,20);
		}
		Criteria cia=example.createCriteria();
		if(cartype.equals("0")){
			cia.andProvalueBetween(range[0], range[1]);
			list=proService.selectByExample(example);
		}
		else{
			cia.andProtypeEqualTo(cartype);
			cia.andProvalueBetween(range[0], range[1]);
			list=proService.selectByExample(example);
		}
		example.clear();*/
		/*List<Product> list=new ArrayList<>();
		request.setAttribute("pageCount", prolist.size()/20+1);
		int begin=Integer.valueOf(pagenum);
		if(pagenum.equals(1)){
			if(prolist.size()>20)
			{
				for (int i = 0; i < 20; i++) {
					list.add(prolist.get(i));
				}
			}
			else{
				list=prolist;
			}
		}
		else{
			if(prolist.size()>begin*20){
				for (int i =(begin-1)*20-1 ; i < 20; i++) {
					list.add(prolist.get(i));
				}
			}
			else if(prolist.size()>(begin-1)*20 && prolist.size()<begin*20){
				for (int i =(begin-1)*20-1 ; i < prolist.size(); i++) {
					list.add(prolist.get(i));
				}
			}
		}*/
		request.setAttribute("pageCount", prolist.size()/20+1);
		List<Product> list=new ArrayList<Product>();
		if(prolist.size()>20)
		{
			for (int i = 0; i < 20; i++) {
				list.add(prolist.get(i));
			}
		}
		else{
			list=prolist;
		}
		request.setAttribute("page", "1");
		request.setAttribute("jsonArray",list);
		request.setAttribute("condition", cartype);
		request.setAttribute("conditionByvalue",value);
		request.setAttribute("ordervalue",volume);
		return "menu/buyCar";
	}
	@RequestMapping("/show")
	public String show(HttpServletRequest request,String value,String page){
		double[] range=new double[2];
		ProductExample example=new ProductExample();
		Criteria cia=example.createCriteria();
		range=level(value);
		cia.andProvalueBetween(range[0],range[1]);
		List<Product> list= proService.selectProAndInfoBylimit(example);
		request.setAttribute("pageCount", list.size()/20+1);
		example.setLimit(0,20);
		list.clear();
		list=proService.selectProAndInfoBylimit(example);
		example.clear();
		request.setAttribute("page", "1");
		request.setAttribute("jsonArray", list);
		request.setAttribute("condition", "0");
		request.setAttribute("conditionByvalue",value);
		request.setAttribute("ordervalue","0");
		return "menu/buyCar";
	}
	@RequestMapping("searchByvalue")
	public String searchByValue(String cartype,String low,String high,String volume,String pagenum,HttpServletRequest request){
		List<Product> prolist=showCarBycondition(volume, cartype, "", low, high,"",request);
		List<Product> list=new ArrayList<>();
		request.setAttribute("pageCount", prolist.size()/20+1);
		/*if(pagenum.equals(1)){
			if(prolist.size()>20)
			{
				for (int i = 0; i < 20; i++) {
					list.add(prolist.get(i));
				}
			}
			else{
				list=prolist;
			}
		}
		else{
			if(prolist.size()>begin*20){
				for (int i =(begin-1)*20-1 ; i < 20; i++) {
					list.add(prolist.get(i));
				}
			}
			else if(prolist.size()>(begin-1)*20 && prolist.size()<begin*20){
				for (int i =(begin-1)*20-1 ; i < prolist.size(); i++) {
					list.add(prolist.get(i));
				}
			}
		}
		request.setAttribute("page", pagenum);*/
		if(prolist.size()>20)
		{
			for (int i = 0; i < 20; i++) {
				list.add(prolist.get(i));
			}
		}
		else{
			list=prolist;
		}
		request.setAttribute("page", "1");
		request.setAttribute("jsonArray",list);
		request.setAttribute("condition", cartype);
		request.setAttribute("low", low);
		request.setAttribute("high", high);
		request.setAttribute("ordervalue",volume);
		return "menu/buyCar";
	}
	@RequestMapping("deleteCar")   //车辆下架
	public String offlineCar(String proid,HttpServletResponse response,HttpServletRequest request){
		ProductExample example=new ProductExample();
		Criteria cia=example.createCriteria();
		cia.andProidEqualTo(proid);
		if(deleteFile(proService.selectByPrimaryKey(proid).getProimg(),request)==true){
			proService.deleteByExample(example);
			proInfo.deleteByPrimaryKey(proid);
			if(ordernum.selectByPrimaryKey(proid)!=null){
				ordernum.deleteByPrimaryKey(proid);
			}
		}
		try {
			response.getWriter().println("");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return"redirect:/carInfo/show?value=0&page=1";
	}
	@RequestMapping("getCarInfo")
	public String updaeInfo(String proid,HttpServletRequest request){
		List<productAndInfo> list=proInfo.selectProAndInfo(proid);
		if(list.size()>0){
			request.setAttribute("carInfo", list.get(0));
		}
		return "menu/updateCar";
	}
	@RequestMapping("updateCar")
	public String updateInfo(String proid,String Carname,String Cartype,String Carrmb,MultipartFile Carimg,String Cardescribe,String ML,String ATtype,String Carnumber,HttpServletResponse response,HttpServletRequest request){
		Product prod=new Product();
		prod.setProid(proid);
		if(Carimg.isEmpty()){
			prod.setProimg(proService.selectByPrimaryKey(proid).getProimg());
		}
		else{
			prod.setProimg("/carImg/"+saveFile(request.getServletContext().getRealPath("/"),Carimg));
		}
		prod.setProml(Double.valueOf(ML));
		prod.setProname(Carname);
		prod.setProcontroller(ATtype);
		prod.setPronowvalue(Double.valueOf(Carrmb));
		prod.setProdesc(Cardescribe);
		prod.setProtype(Cartype);
		ProInfo info=new ProInfo();
		info.setProid(proid);
		info.setNowvalue(Double.valueOf(Carrmb));
		info.setPronumber(Integer.valueOf(Carnumber));
		proInfo.updateByPrimaryKeySelective(info);
		proService.updateByPrimaryKeySelective(prod);
		return "/menu/menuFile";
	}
	@RequestMapping("HomeShow")
	public String homeshow(HttpServletRequest request,String carname){
		ProductExample proExample=new ProductExample();
		Criteria ci=proExample.createCriteria();
		if(carname.equals("")||carname.equals(".jsp")){
			
		}
		else{
			ci.andPronameEqualTo(carname);
		}
		proExample.setLimit(0, 20);
		ProInfoExample example=new ProInfoExample();
		List<Product> listcar=new ArrayList<>();
		listcar=proService.selectProAndInfoBylimit(proExample);   //先查询出前20条所有
		List<Product> cutCar=new ArrayList<>();
		List<String> idlist=new ArrayList<>();
		Iterator<Product> it=listcar.iterator();
		while(it.hasNext()){
			idlist.add(it.next().getProid());
		}
		example.setOrderByClause("createTime desc");     
		com.fc.bean.ProInfoExample.Criteria infocia=example.createCriteria();
		infocia.andProidIn(idlist);
		List<ProInfo> list=proInfo.selectByExample(example);//然后按照创立时间排序
		listcar.clear();
		for (ProInfo proInfo : list) {
			listcar.add(proService.selectByPrimaryKey(proInfo.getProid()));
			ci.andPronowvalueIsNotNull();
			ci.andProvalueGreaterThan(proInfo.getNowvalue());    //查詢降价产品
			ci.andProidEqualTo(proInfo.getProid());
			if(proService.selectByExample(proExample).size()>0){
				cutCar.add(proService.selectByExample(proExample).get(0));
			}
			ci.getCriteria().clear();
		}
		List<Product> salebest=new ArrayList<>();
		OrderNumExample numexample=new OrderNumExample();
		numexample.setOrderByClause("number desc");
		List<OrderNum> orderlist=ordernum.selectByExample(numexample);
		if(orderlist.size()>20){
			for (int i = 0; i < 20; i++) {
				salebest.add(proService.selectByPrimaryKey(orderlist.get(i).getProid()));
			}
		}
		else{
			for (int i = 0; i < orderlist.size(); i++) {
				salebest.add(proService.selectByPrimaryKey(orderlist.get(i).getProid()));
			}
		}
		request.setAttribute("homeCutCarList", cutCar);
		request.setAttribute("homeCarList", listcar);
		request.setAttribute("saleBestList", salebest);
		return "menu/home";
	}
	@RequestMapping("buycarpage")
	public String showOnecar(String proid,HttpServletRequest request){
		productAndInfo pro= proInfo.selectProAndInfo(proid).get(0);
		Users user=userServer.selectByPrimaryKey(pro.getProsource());
		SimpleDateFormat format=new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy",Locale.US);
		try {
			Date date=format.parse(pro.getCreatetime().toString());
			SimpleDateFormat format2=new SimpleDateFormat("yyyy-MM");
			String d=format2.format(date);
			request.setAttribute("createTime", d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		request.setAttribute("jsonArray", pro);
		request.setAttribute("seller",user);
		OrderNum order= ordernum.selectByPrimaryKey(proid);
		if(order!=null){
			request.setAttribute("ordernum", order.getNumber());   //已销售台数
		}
		return "menu/buyCarpage";
	}
	@RequestMapping("orderBy")
	public String orderby(String volume,String type,String value,String low,String high,String pagenum,HttpServletRequest request){
		List<Product> prolist=showCarBycondition(volume, type, value, low, high,"",request);
		List<Product> list=new ArrayList<>();
		request.setAttribute("pageCount", prolist.size()/20+1);
		request.setAttribute("pageCount", prolist.size()/20+1);
		if(prolist.size()>20)
		{
			for (int i = 0; i < 20; i++) {
				list.add(prolist.get(i));
			}
		}
		else{
			list=prolist;
		}
		request.setAttribute("page", "1");
		request.setAttribute("jsonArray",list);
		request.setAttribute("condition", type);
		request.setAttribute("conditionByvalue",value);
		request.setAttribute("ordervalue",volume);
		return "menu/buyCar";
	}
	@RequestMapping("searchByname")
	public String shearchByname(String volume,String type,String value,String low,String high,String carname,String pagenum,HttpServletRequest request){
		List<Product> prolist=showCarBycondition(volume, type, value, low, high,carname,request);
		List<Product> list=new ArrayList<>();
		request.setAttribute("pageCount", prolist.size()/20+1);
		request.setAttribute("pageCount", prolist.size()/20+1);
		if(prolist.size()>20)
		{
			for (int i = 0; i < 20; i++) {
				list.add(prolist.get(i));
			}
		}
		else{
			list=prolist;
		}
		request.setAttribute("page", "1");
		request.setAttribute("jsonArray",list);
		request.setAttribute("condition", type);
		request.setAttribute("conditionByvalue",value);
		request.setAttribute("ordervalue",volume);
		return "menu/buyCar";
	}
	public List<Product> showCarBycondition(String volume,String type,String value,String low,String high,String carname,HttpServletRequest request){
		ProInfoExample example=new ProInfoExample();
		OrderNumExample numexample=new OrderNumExample();
		List<ProInfo> list=new ArrayList<>();
		List<String> idlist=new ArrayList<>();
		if(volume.equals("0")){
			list=proInfo.selectByExample(example);
			if(list.size()>0){
				for (ProInfo pro : list) {
					idlist.add(pro.getProid());
				}
			}
		}
		else if(volume.equals("1")){
			example.setOrderByClause("nowValue asc");
			list=proInfo.selectByExample(example);
			if(list.size()>0){
				for (ProInfo pro : list) {
					idlist.add(pro.getProid());
				}
			}
		}
		else if(volume.equals("2")){
			example.setOrderByClause("createTime desc");
			list=proInfo.selectByExample(example);
			if(list.size()>0){
				for (ProInfo pro : list) {
					idlist.add(pro.getProid());
				}
			}
		}
		else if(volume.equals("3")){
			numexample.setOrderByClause("number desc");
			List<OrderNum> orderlist=ordernum.selectByExample(numexample);
			if(orderlist.size()>0){
				for (OrderNum order : orderlist) {
					idlist.add(order.getProid());
				}
			}
		}
		ProductExample proexample=new ProductExample();
		Criteria procia=proexample.createCriteria();
//		proexample.setLimit(0, 20);
		if(idlist.size()>0){
			procia.andProidIn(idlist);
		}
		if(type.equals("0")){
		}
		else{
			procia.andProtypeEqualTo(type);
		}
		if(low.equals("")){
			double[] range=level(value);
			procia.andProvalueBetween(range[0],range[1]);
		}
		else{
			procia.andProvalueBetween(Double.valueOf(low), Double.valueOf(high));
		}
		if(carname.equals("")){
		}
		else{
			procia.andPronameEqualTo(carname);
		}
		List<Product> prolist=proService.selectByExample(proexample);
		com.fc.bean.ProInfoExample.Criteria cia=example.createCriteria();
		List<String> infoList=new ArrayList<>();
		if(prolist.size()>0){
			for (Product product : prolist) {
				infoList.add(product.getProid());
			}
		}
		if(volume.equals("3")){
			com.fc.bean.OrderNumExample.Criteria numcia=numexample.createCriteria();
			if(idlist.size()>0){
				numcia.andProidIn(idlist);
				numexample.setOrderByClause("number desc");
				List<OrderNum> orderlist=ordernum.selectByExample(numexample);
				prolist.clear();
				if(orderlist.size()>0){
					for (OrderNum proInfo : orderlist) {
						prolist.add(proService.selectByPrimaryKey(proInfo.getProid()));
					}
				}
			}
			else{
				return new ArrayList<Product>();
			}
		}
		else{
			if(infoList.size()>0){
			cia.andProidIn(infoList);
			}
			else{
			return new ArrayList<Product>();
			}
			prolist.clear();
			List<ProInfo> list2=proInfo.selectByExample(example);
			if(list2.size()>0){
				for (ProInfo proInfo : list2) {
					prolist.add(proService.selectByPrimaryKey(proInfo.getProid()));
				}
			}
		}
		proexample.clear();
		example.clear();
		return prolist;
	}
	@RequestMapping("order")            //下单方法
	public void order(String proid,String connectphonenum,String userid,HttpServletResponse response,HttpServletRequest request){
		ProOrder order=new ProOrder();
		String msg="";
		order.setOrderid(UUID.randomUUID().toString().substring(0, 31).replace("-",""));
		order.setBuyerphone(connectphonenum);
		UsersExample example=new UsersExample();
		com.fc.bean.UsersExample.Criteria ca=example.createCriteria();
		ca.andUsernameEqualTo((String)(SecurityUtils.getSubject().getSession().getAttribute("username")));
		order.setBuyerid(userServer.selectByExample(example).get(0).getUserId());
		order.setUserid(userid);  //卖家的id
		order.setOrdertime((new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")).format(new Date()).toString());
		order.setProid(proid);   //存的是产品链接的地址
		order.setOrderstate("1");  //1状态代表待沟通
		if(userServer.selectByPrimaryKey(userid).getState().equals("1")){
			if(proInfo.selectByPrimaryKey(proid).getPronumber()>0){  //预订数量小于货源数量
				msg="成功";
				orderService.insert(order);
			}
			else{
				msg=proInfo.selectByPrimaryKey(proid).getPronumber().toString();
			}
		}
		else{
			msg="失败";
		}
		response.setCharacterEncoding("utf-8");
		response.setContentType("utf-8");
		try {
			request.getRequestDispatcher("ws://localhost:8080/jspbotstrap/websocket").forward(request, response);
		} catch (ServletException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			response.getWriter().print(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("myCar")
	public String mycar(HttpServletRequest request,String volume,String carname,String page){
		List<String> idlist=new ArrayList<>();   //存放产品id
		int flag=0;
		ProductExample example=new ProductExample();
		Criteria cia=example.createCriteria();
		if(SecurityUtils.getSubject().hasRole("saler")){
			ProInfoExample infoExample=new ProInfoExample();
			String username=request.getSession().getAttribute("username").toString();
			com.fc.bean.ProInfoExample.Criteria infocia=infoExample.createCriteria();
			UsersExample uexample=new UsersExample();
			com.fc.bean.UsersExample.Criteria usercia=uexample.createCriteria();
			usercia.andUsernameEqualTo(username);
			infocia.andProsourceEqualTo(userServer.selectByExample(uexample).get(0).getUserId());
			if(carname!=null){
				cia.andPronameEqualTo(carname);
				List<Product> list=proService.selectByExample(example);
				if(list.size()>0){
					for (Product product : list) {
						idlist.add(product.getProid());
					}
					infocia.andProidIn(idlist);
				}
				else{
					flag=1;
				}
			}
			if(volume.equals("1")){
				infoExample.setOrderByClause("nowValue desc");
			}
			if(volume.equals("2")){
				infoExample.setOrderByClause("createTime desc");
			}
			List<ProInfo> plist=proInfo.selectByExample(infoExample);
			idlist.clear();
			for (int i = 0; i <plist.size(); i++) {
				idlist.add(plist.get(i).getProid());//返回的是属于此用户产品proid的list
			}
			List<Product> prolist=new ArrayList<>();
			for (int i = 0; i < idlist.size(); i++) {
				prolist.add(proService.selectByPrimaryKey(idlist.get(i)));
			}
			if(volume.equals("3")){
				OrderNumExample numExample=new OrderNumExample();
				com.fc.bean.OrderNumExample.Criteria numcia=numExample.createCriteria();
				numcia.andProidIn(idlist);
				numExample.setOrderByClause("number desc");       //将属于本用户的proid按销量排序
				List<OrderNum> numlist=ordernum.selectByExample(numExample);
				idlist.clear();
				Iterator<OrderNum> numit=numlist.iterator();
				while(numit.hasNext()){
					idlist.add(numit.next().getProid());      //如果有属于本用户的销量则将id取出
				}
				prolist.clear();
				if(idlist.size()>0){
					for (String proid : idlist) {
						prolist.add(proService.selectByPrimaryKey(proid));
					}
				}
			}
			infoExample.clear();
			uexample.clear();
			if(flag==1){
				prolist.clear();
			}
			request.setAttribute("jsonArray", prolist);
			request.setAttribute("ordervalue", volume);
		}
		return "menu/updatePro";
	}
	public double[] level(String s){
		double[] range=new double[2];
		switch (s) {
		case "0":
			range[0]=0.0;
			range[1]=100000.0;
			break;
		case "1":
			range[0]=0.0;
			range[1]=10.0;
			break;
		case "2":
			range[0]=10.0;
			range[1]=20.0;
			break;
		case "3":
			range[0]=20.0;
			range[1]=40.0;
			break;
		case "4":
			range[0]=40.0;
			range[1]=60.0;
			break;
		default:
			break;
		}
		return range;
	}
	public String saveFile(String url,MultipartFile img){
		SimpleDateFormat format=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
		String s=format.format(new Date())+"."+img.getOriginalFilename().split("\\.")[1];
		File file2=new File(url+"\\carImg"+"\\"+s);
		try {
			file2.createNewFile();
			img.transferTo(file2);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;
	}
	public boolean deleteFile(String url,HttpServletRequest request){
		String fiex=request.getServletContext().getRealPath("/");
		url=url.replace("/","\\");
		File file=new File(fiex+url);
		if(file.isFile()&&file.exists()){
			file.delete();
			return true;
		}
		else{
			return false;
		}
	}
	@RequestMapping("test")
	public String test2(HttpServletRequest request,String s){
		return "menu/menuFile";
	}
}

/*
public List<Product> showCarBycondition(String volume,String type,String value,String low,String high,HttpServletRequest request){
	ProInfoExample example=new ProInfoExample();
	OrderNumExample numexample=new OrderNumExample();
	List<ProInfo> list=new ArrayList<>();
	List<String> idlist=new ArrayList<>();
	List<String> p=judge(request);  //判断是否为saler角色
	com.fc.bean.ProInfoExample.Criteria examplecia=example.createCriteria();
	if(p.size()>0){
		examplecia.andProidIn(p);
	}
	if(volume.equals("0")){
		list=proInfo.selectByExample(example);
		if(list.size()>0){
			for (ProInfo pro : list) {
				idlist.add(pro.getProid());
			}
		}
		examplecia.getCriteria().clear();
	}
	else if(volume.equals("1")){
		example.setOrderByClause("nowValue asc");
		list=proInfo.selectByExample(example);
		if(list.size()>0){
			for (ProInfo pro : list) {
				idlist.add(pro.getProid());
			}
		}
//		examplecia.getCriteria().clear();
	}
	else if(volume.equals("2")){
		example.setOrderByClause("createTime desc");
		list=proInfo.selectByExample(example);
		if(list.size()>0){
			for (ProInfo pro : list) {
				idlist.add(pro.getProid());
			}
		}
//		examplecia.getCriteria().clear();
	}
	else if(volume.equals("3")){
		numexample.setOrderByClause("number desc");
		List<OrderNum> orderlist=ordernum.selectByExample(numexample);
		if(orderlist.size()>0){
			for (OrderNum order : orderlist) {
				idlist.add(order.getProid());
			}
		}
//		examplecia.getCriteria().clear();
	}
	ProductExample proexample=new ProductExample();
	Criteria procia=proexample.createCriteria();
	proexample.setLimit(0, 20);
	if(idlist.size()>0){
		procia.andProidIn(idlist);
	}
	if(type.equals("0")){
	}
	else{
		procia.andProtypeEqualTo(type);
	}
	if(low.equals("")){
		double[] range=level(value);
		procia.andProvalueBetween(range[0],range[1]);
	}
	else{
		procia.andProvalueBetween(Double.valueOf(low), Double.valueOf(high));
	}
	
	List<Product> prolist=proService.selectByExample(proexample);
	com.fc.bean.ProInfoExample.Criteria cia=example.createCriteria();
	List<String> infoList=new ArrayList<>();
	if(prolist.size()>0){
		for (Product product : prolist) {
			infoList.add(product.getProid());
		}
	}
	if(infoList.size()>0){
		cia.andProidIn(infoList);
	}
	else{
		return new ArrayList<Product>();
	}
	prolist.clear();
	List<ProInfo> list2=proInfo.selectByExample(example);
	if(list2.size()>0){
		for (ProInfo proInfo : list2) {
			prolist.add(proService.selectByPrimaryKey(proInfo.getProid()));
		}
	}
	proexample.clear();
	example.clear();
	return prolist;
}*/



/*@RequestMapping("HomeShow")
public String homeshow(HttpServletRequest request,String carname){
	ProductExample proExample=new ProductExample();
	Criteria ci=proExample.createCriteria();
	if(carname.equals("")){
		
	}
	else{
		ci.andPronameEqualTo(carname);
	}
	ProInfoExample example=new ProInfoExample();
	List<Product> listcar=new ArrayList<>();
	example.setOrderByClause("createTime desc");
	List<ProInfo> list=proInfo.selectByExample(example);
	List<Product> cutCar=new ArrayList<>();
	for (ProInfo proInfo : list) {
		listcar.add(proService.selectByPrimaryKey(proInfo.getProid()));
		ci.andPronowvalueIsNotNull();
		ci.andProvalueGreaterThan(proInfo.getNowvalue());
		ci.andProidEqualTo(proInfo.getProid());
		if(proService.selectByExample(proExample).size()>0){
			cutCar.add(proService.selectByExample(proExample).get(0));
		}
		ci.getCriteria().clear();
	}
	request.setAttribute("homeCutCarList", cutCar);
	request.setAttribute("homeCarList", listcar);
	return "menu/home";
}*/
