package com.fc.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.catalina.valves.rewrite.RewriteCond;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.PasswordMatcher;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.mgt.RealmSecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fc.bean.Menu;
import com.fc.bean.MenuExample;
import com.fc.bean.UserRole;
import com.fc.bean.Users;
import com.fc.bean.UsersExample;
import com.fc.bean.UsersExample.Criteria;
import com.fc.service.menuService;
import com.fc.service.userRoleService;
import com.fc.service.userService;
////////如果controller方法的返回值为空，则响应的视图页面对应为你访问的地址
@Controller
public class loginController {
	Logger logger=Logger.getLogger(Logger.class);
	@Autowired
	menuService service;
	@Autowired
	userService userservice;
	@Autowired
	SessionDAO sessiondao;
	@Autowired
	userRoleService roleservice;
/*	@RequestMapping(value="login", method=RequestMethod.GET)
	public void loginview(HttpServletRequest request){
		logger.debug("hello");
		request.setAttribute("name","hhj");
		return;
	}*/
	@RequestMapping(value="loginValidate",method=RequestMethod.POST)
	//若controller层函数没有返回值,默认返回的是映射进来的地址后面加上.jsp
	public String loginvalidate(HttpServletRequest request,HttpServletResponse response,String username,String password){
		 Subject sub=SecurityUtils.getSubject();
		 String msg="";
		 boolean flag=true;
		 response.setContentType("utf-8");
		 response.setCharacterEncoding("utf-8");
		 UsernamePasswordToken token =new UsernamePasswordToken(username,password);
		 UsersExample example=new UsersExample();
		 Criteria cia=example.createCriteria();
		 cia.andUsernameEqualTo(username);
		 if(sub.getSession()!=null){
			 sub.logout();
		 }
		 try {
			 sub.login(token);
			 try{
				    sub.checkPermission("home:update");
				    System.out.println("权限验证通过");
				 }
				 catch(AuthorizationException e){
					 System.out.println("用户没有相应的权限");
			 }
			 if(userservice.selectByExample(example).get(0).getState().equals("2")){
				 msg="用户名被禁用";
				 flag=false;
			 }
		 } catch (UnknownAccountException e) {
			 	logger.debug("用户名不存在");
				msg="用户名不存在";
				flag=false;
				// TODO: handle exception
			}catch(IncorrectCredentialsException e){
				logger.debug("密码不正确");
				msg="密码错误";
				flag=false;
		}
		 if(flag){
			 Session session=sub.getSession();
			 session.setAttribute("username", username);
			 Serializable s=session.getId();
			 return"redirect:/carInfo/HomeShow?carname=";
		 }
		 else{
			 request.setAttribute("msg", msg);
			 return "login/login";
		 }
	}
	@RequestMapping(value="register",method=RequestMethod.POST)
	public String register(String registername,String registerpassword,HttpServletRequest request,HttpServletResponse response,String address,String phonenumber,String qqnumber,String role){
		Collection<Realm> real=((RealmSecurityManager)SecurityUtils.getSecurityManager()).getRealms();
		JdbcRealm jb=((JdbcRealm)real.toArray()[0]);
		PasswordMatcher p=(PasswordMatcher) jb.getCredentialsMatcher();
		registerpassword=p.getPasswordService().encryptPassword(registerpassword);   //md5加密
		UsersExample example=new UsersExample();
		Criteria cri=example.createCriteria();
		cri.andUsernameEqualTo(registername);
		response.setContentType("utf-8");
		response.setCharacterEncoding("utf-8");
			String uid=UUID.randomUUID().toString().substring(0, 31).replace("-", ""); //生成32位的随机uuid
			Users user=new Users();
			user.setPassword(registerpassword);
			user.setUsername(registername);
			user.setUserId(uid);
			user.setAddress(address);
			user.setPhonenumber(phonenumber);
			user.setQqnumber(qqnumber);
			user.setState("1");   //1代表正常状态
			if(role!="")
			{
				UserRole userRole=new UserRole();
				userRole.setUserId(uid);
				userRole.setRole(role);
				roleservice.insert(userRole);
			}
			userservice.insert(user);
		return "login/login";
	}
	@RequestMapping("showOrder")
	public ModelAndView showOrder(HttpServletRequest request){
		ModelAndView view =new ModelAndView("menu/menuFile");
		List<Menu> list=service.selectByExample(new MenuExample());
		StringBuffer menuList=new StringBuffer();
		for (Menu menu : list) {
			menuList.append("<li>"+"<a href="+request.getContextPath()+menu.getMenuLink()+">"+menu.getMenuName()+"</a> </li>");
		}
		view.addObject("menuList", menuList);
		return view;
	}
	@RequestMapping("logOut")
	public void loginOut(HttpServletResponse response){
		Subject sub= SecurityUtils.getSubject();
		Collection<Session> list=sessiondao.getActiveSessions();
		int num=list.size(); 
//		sub.getSession().setTimeout(0);
		sub.logout();
		try {
			response.getWriter().println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("registerValidate")
	public void registerValidate(String registername,HttpServletResponse response)
	{
		String msg="";
		UsersExample example=new UsersExample();
		Criteria cri=example.createCriteria();
		cri.andUsernameEqualTo(registername);
		int count=userservice.countByExample(example);
		 response.setContentType("utf-8");
		 response.setCharacterEncoding("utf-8");
		if(count>0){
			msg="失败";
		}
		else{
			msg="成功";
		}
		try {
			response.getWriter().write(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
