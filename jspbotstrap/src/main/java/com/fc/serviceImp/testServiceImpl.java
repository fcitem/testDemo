package com.fc.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fc.bean.Test;
import com.fc.bean.TestExample;
import com.fc.dao.TestMapper;
import com.fc.service.testService;

@Service
public class testServiceImpl implements testService {

	@Autowired
	TestMapper mapper;
	@Override
	public int countByExample(TestExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(TestExample example) {
		// TODO Auto-generated method stub
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String userid) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(userid);
	}

	@Override
	public int insert(Test record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Test record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public List<Test> selectByExample(TestExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public Test selectByPrimaryKey(String userid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(userid);
	}

	@Override
	public int updateByExampleSelective(Test record, TestExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Test record, TestExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Test record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Test record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
