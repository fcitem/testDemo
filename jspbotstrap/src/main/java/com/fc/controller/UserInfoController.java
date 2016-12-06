package com.fc.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.credential.PasswordMatcher;
import org.apache.shiro.mgt.RealmSecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fc.bean.OrderNum;
import com.fc.bean.ProInfo;
import com.fc.bean.ProOrder;
import com.fc.bean.ProOrderExample;
import com.fc.bean.ProOrderExample.Criteria;
import com.fc.bean.Product;
import com.fc.bean.ProductExample;
import com.fc.bean.UserRole;
import com.fc.bean.UserRoleExample;
import com.fc.bean.Users;
import com.fc.bean.UsersExample;
import com.fc.bean.orderInfo;
import com.fc.service.orderNumService;
import com.fc.service.proInfoService;
import com.fc.service.proOrderService;
import com.fc.service.productService;
import com.fc.service.userRoleService;
import com.fc.service.userService;

@Controller
@RequestMapping("user")
public class UserInfoController {

	@Autowired
	proOrderService orderservice;

	@Autowired
	userService userservice;
	
	@Autowired 
	orderNumService ordernum;
	
	@Autowired
	proInfoService proinfo;
	
	@Autowired
	productService proService;
	
	@Autowired 
	userRoleService roleService;
	
	@Autowired 
	SessionDAO session;
	@RequestMapping("orderShow")
	public String getUserOrder(HttpServletRequest request,String condition,String carname){
		String username=request.getSession().getAttribute("username").toString();
		List<String> idlist=new ArrayList<>();
		int flag=0;
		ProductExample proexample=new ProductExample();
		com.fc.bean.ProductExample.Criteria procia=proexample.createCriteria();
		ProOrderExample example=new ProOrderExample();
		Criteria cia=example.createCriteria();
		UsersExample userexample=new UsersExample();
		com.fc.bean.UsersExample.Criteria ci=userexample.createCriteria();
		ci.andUsernameEqualTo(username);
		if(carname!=null){
			procia.andPronameEqualTo(carname);
			List<Product> list=proService.selectByExample(proexample);
			if(list.size()>0){
				for (Product product : list) {
					idlist.add(product.getProid());
				}
				cia.andProidInList(idlist);
			}
			else{
				flag=1;
			}
		}
		if(SecurityUtils.getSubject().hasRole("saler")){
			cia.andUseridEqualTo(userservice.selectByExample(userexample).get(0).getUserId());
			cia.andOrderstateNotEqualTo("0");   //卖方已删除订单
		}
		else if(SecurityUtils.getSubject().hasRole("buyer")){
			cia.andBuyeridEqualTo(userservice.selectByExample(userexample).get(0).getUserId());
			cia.andOrderstateNotEqualTo("5");   //买方已删除订单
		}
		if(condition!=null){
			if(condition.equals("1")){
				cia.andOrderstateEqualTo("2");  //交易成功
			}
			else if(condition.equals("2")){
				cia.andOrderstateEqualTo("3");   //交易失败
			}
			else if(condition.equals("3")){
				cia.andOrderstateEqualTo("1");  //未处理（待沟通）
			}
		}
		List<orderInfo> list=orderservice.selectOrderInfo(example);
		example.clear();
		if(flag==1){
			list.clear();
		}
		request.setAttribute("jsonArray", list);
		request.setAttribute("condition", condition);
		return "menu/userOrder";
	}
	@RequestMapping(value="changeOrder",method=RequestMethod.POST)
	public void changestate(String orderid,String state,HttpServletRequest request,HttpServletResponse response){
		ProOrder order=new ProOrder();
		order.setOrderid(orderid);
		order.setOrderstate(state);
		String proid=orderservice.selectByPrimaryKey(orderid).getProid();
		if(state.equals("2")){
			OrderNum neworder=new OrderNum();
			neworder.setProid(proid);
			OrderNum num=ordernum.selectByPrimaryKey(proid);    //订单记录
			if(num!=null){
				neworder.setNumber(num.getNumber()+1);   //沟通成功
				ProInfo info=proinfo.selectByPrimaryKey(proid);
				if(info.getPronumber()>0){
					ProInfo newinfo=new ProInfo();
					newinfo.setProid(proid);
					newinfo.setPronumber(info.getPronumber()-1);    //货源数量-1
					proinfo.updateByPrimaryKeySelective(newinfo);
				}
			}
			else{
				neworder.setNumber(1);
				ordernum.insert(neworder);
			}
			ProInfo info=new ProInfo();
			info.setProid(proid);
			info.setPronumber(proinfo.selectByPrimaryKey(proid).getPronumber()-1);
			proinfo.updateByPrimaryKeySelective(info);
		}
		orderservice.updateByPrimaryKeySelective(order);
	}
	@RequestMapping("userShow")
	public String searchUser(String username,String condition,HttpServletRequest request){
		UsersExample example=new UsersExample();
		List<String> idlist=new ArrayList<>();
		com.fc.bean.UsersExample.Criteria cria=example.createCriteria();
		UserRoleExample roleExample=new UserRoleExample();
		com.fc.bean.UserRoleExample.Criteria rolecia=roleExample.createCriteria();
		if(condition.equals("1")){
			rolecia.andRoleEqualTo("saler");
		}
		else if(condition.equals("2")){
			rolecia.andRoleEqualTo("buyer");
		}
		else if(condition.equals("3")){
			cria.andStateEqualTo("2");
		}
		else if(condition.equals("4")){
			cria.andStateEqualTo("1");
		}
		if(username!=null){
			cria.andUsernameEqualTo(username);
		}
		List<UserRole> rolelist=roleService.selectByExample(roleExample);
		Iterator<UserRole> it=rolelist.iterator();	
		while(it.hasNext()){
			idlist.add(it.next().getUserId());
		}
		List<Users> userlist=new ArrayList<>();
		if(idlist.size()>0){
			cria.andUserIdIn(idlist);
			userlist=userservice.selectByExample(example);
		}
		request.setAttribute("activenumber", session.getActiveSessions().size());
		request.setAttribute("userlist", userlist);
		request.setAttribute("condition", condition);
		return"menu/userInfo";
	}
	@RequestMapping("changeUser")       //改变用户是否禁用
	public void changeState(String userid,String state,String remark,HttpServletResponse response,HttpServletRequest request){
		Users user=new Users();
		Iterator<Session> it=session.getActiveSessions().iterator();
		String username=userservice.selectByPrimaryKey(userid).getUsername();
		if(state.equals("0")){
			while(it.hasNext()){
				Serializable sessionId=it.next().getId();
				Session onesession=session.readSession(sessionId);
				if(onesession.getAttribute("username").equals(username)){
					onesession.setTimeout(0);//设置session立即失效，即将其踢出系统
				}
				break;
			}
			userservice.deleteByPrimaryKey(userid);    //先下线再删除用户
		}
		else if(state.equals("1")){
			user.setState(state);
			user.setUserId(userid);
			user.setRemark("");
			userservice.updateByPrimaryKeySelective(user);
		}
		else if(state.equals("2")){   //禁用用户
			while(it.hasNext()){
				Serializable sessionId=it.next().getId();
				Session onesession=session.readSession(sessionId);
				if(onesession.getAttribute("username").equals(username)){
					onesession.setTimeout(0);//设置session立即失效，即将其踢出系统
				}
			}
			user.setState(state);
			user.setRemark(remark);
			user.setUserId(userid);
			userservice.updateByPrimaryKeySelective(user);
		}
		try {
			response.getWriter().print("成功");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@RequestMapping(value="restPwd",method=RequestMethod.POST)      //修改密码
	public void chagePassword(HttpServletRequest request,HttpServletResponse response,String newPwd){
		response.setCharacterEncoding("utf-8");
		response.setContentType("utf-8");
		String name=request.getSession().getAttribute("username").toString();
		Collection<Realm> real=((RealmSecurityManager)SecurityUtils.getSecurityManager()).getRealms();
		JdbcRealm jb=((JdbcRealm)real.toArray()[0]);
		PasswordMatcher p=(PasswordMatcher) jb.getCredentialsMatcher();
		String password=p.getPasswordService().encryptPassword(newPwd);   //md5加密
		Users user=new Users();
		user.setPassword(password);
		UsersExample example=new UsersExample();
		com.fc.bean.UsersExample.Criteria cri=example.createCriteria();
		cri.andUsernameEqualTo(name);
		user.setUserId(((Users)userservice.selectByExample(example).get(0)).getUserId());
		userservice.updateByPrimaryKeySelective(user);
		try {
			response.getWriter().write("成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
