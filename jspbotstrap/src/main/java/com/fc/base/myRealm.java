package com.fc.base;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.fc.bean.Users;
import com.fc.bean.UsersExample;
import com.fc.bean.UsersExample.Criteria;
import com.fc.service.userService;

public class myRealm extends JdbcRealm {

	@Autowired
	userService service;
	@SuppressWarnings("unused")
	@Override   //获取身份验证相关信息
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		super.doGetAuthenticationInfo(token);
		String username=(String)token.getPrincipal();
		String password=(String)token.getCredentials();
		UsersExample example=new UsersExample();
		Criteria cia=example.createCriteria();
		cia.andUsernameEqualTo(username);
		Users user=service.selectByExample(example).get(0);
		if(user.getState().equals("2")){
			throw new LockedAccountException(); //帐号锁定 
		}
		if(user == null) {  
            throw new UnknownAccountException(); //没找到帐号  
        } 
		return new SimpleAuthenticationInfo(username, password, this.getName());
	}

}
