package com.fc.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fc.bean.UserRole;
import com.fc.bean.UserRoleExample;
import com.fc.dao.UserRoleMapper;
import com.fc.dao.UsersMapper;
import com.fc.service.userRoleService;

@Service
public class userRoleServiceIm implements userRoleService {

	@Autowired
	UserRoleMapper mapper;
	@Override
	public int countByExample(UserRoleExample example) {
		// TODO Auto-generated method stub
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(UserRoleExample example) {
		// TODO Auto-generated method stub
		return mapper.deleteByExample(example);
	}

	@Override
	public int insert(UserRole record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(UserRole record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public List<UserRole> selectByExample(UserRoleExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public int updateByExampleSelective(UserRole record, UserRoleExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(UserRole record, UserRoleExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExample(record, example);
	}

}
