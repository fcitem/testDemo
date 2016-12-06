package com.fc.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fc.bean.OrderNum;
import com.fc.bean.OrderNumExample;
import com.fc.dao.OrderNumMapper;
import com.fc.service.orderNumService;

@Service
public class orderNumServiceIm implements orderNumService {

	@Autowired
	OrderNumMapper mapper;
	@Override
	public int countByExample(OrderNumExample example) {
		// TODO Auto-generated method stub
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(OrderNumExample example) {
		// TODO Auto-generated method stub
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String proid) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(proid);
	}

	@Override
	public int insert(OrderNum record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(OrderNum record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public List<OrderNum> selectByExample(OrderNumExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public OrderNum selectByPrimaryKey(String proid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(proid);
	}

	@Override
	public int updateByExampleSelective(OrderNum record, OrderNumExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(OrderNum record, OrderNumExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(OrderNum record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(OrderNum record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

}
