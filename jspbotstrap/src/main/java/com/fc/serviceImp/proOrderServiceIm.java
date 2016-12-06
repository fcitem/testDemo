package com.fc.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fc.bean.ProOrder;
import com.fc.bean.ProOrderExample;
import com.fc.bean.orderInfo;
import com.fc.dao.ProOrderMapper;
import com.fc.service.proOrderService;

@Service
public class proOrderServiceIm implements proOrderService {

	@Autowired
	ProOrderMapper mapper;
	@Override
	public int countByExample(ProOrderExample example) {
		// TODO Auto-generated method stub
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ProOrderExample example) {
		// TODO Auto-generated method stub
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String orderid) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(orderid);
	}

	@Override
	public int insert(ProOrder record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(ProOrder record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public List<ProOrder> selectByExample(ProOrderExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public ProOrder selectByPrimaryKey(String orderid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(orderid);
	}

	@Override
	public int updateByExampleSelective(ProOrder record, ProOrderExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(ProOrder record, ProOrderExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(ProOrder record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ProOrder record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<orderInfo> selectOrderInfo(ProOrderExample example) {
		// TODO Auto-generated method stub
		return mapper.selectOrderInfo(example);
	}

}
