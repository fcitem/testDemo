package com.fc.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fc.bean.ProInfo;
import com.fc.bean.ProInfoExample;
import com.fc.bean.productAndInfo;
import com.fc.dao.ProInfoMapper;
import com.fc.service.proInfoService;

@Service
public class proInfoServiceIm implements proInfoService {
	
	@Autowired
	ProInfoMapper mapper;

	@Override
	public int countByExample(ProInfoExample example) {
		// TODO Auto-generated method stub
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ProInfoExample example) {
		// TODO Auto-generated method stub
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String proid) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(proid);
	}

	@Override
	public int insert(ProInfo record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(ProInfo record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public List<ProInfo> selectByExample(ProInfoExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public ProInfo selectByPrimaryKey(String proid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(proid);
	}

	@Override
	public int updateByExampleSelective(ProInfo record, ProInfoExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(ProInfo record, ProInfoExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(ProInfo record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ProInfo record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<productAndInfo> selectProAndInfo(String proId) {
		// TODO Auto-generated method stub
		return mapper.selectProAndInfo(proId);
	}


}
