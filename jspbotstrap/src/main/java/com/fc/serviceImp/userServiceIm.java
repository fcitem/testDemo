package com.fc.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fc.bean.Users;
import com.fc.bean.UsersExample;
import com.fc.dao.UsersMapper;
import com.fc.service.userService;
@Service
public class userServiceIm implements userService{

	@Autowired
	UsersMapper userMapper;
	@Override
	public int countByExample(UsersExample example) {
		// TODO Auto-generated method stub
		return userMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(UsersExample example) {
		// TODO Auto-generated method stub
		return userMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String userId) {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public int insert(Users record) {
		// TODO Auto-generated method stub
		return userMapper.insert(record);
	}

	@Override
	public int insertSelective(Users record) {
		// TODO Auto-generated method stub
		return userMapper.insertSelective(record);
	}

	@Override
	public List<Users> selectByExample(UsersExample example) {
		// TODO Auto-generated method stub
		return userMapper.selectByExample(example);
	}

	@Override
	public Users selectByPrimaryKey(String userId) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public int updateByExampleSelective(Users record, UsersExample example) {
		// TODO Auto-generated method stub
		return userMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Users record, UsersExample example) {
		// TODO Auto-generated method stub
		return userMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Users record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Users record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKey(record);
	}

}
