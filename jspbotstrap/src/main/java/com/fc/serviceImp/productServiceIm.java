package com.fc.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fc.bean.Product;
import com.fc.bean.ProductExample;
import com.fc.dao.ProductMapper;
import com.fc.service.productService;

@Service
public class productServiceIm implements productService {

	@Autowired
	ProductMapper mapper;

	@Override
	public int countByExample(ProductExample example) {
		// TODO Auto-generated method stub
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ProductExample example) {
		// TODO Auto-generated method stub
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String proid) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(proid);
	}

	@Override
	public int insert(Product record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Product record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public List<Product> selectByExample(ProductExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public Product selectByPrimaryKey(String proid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(proid);
	}

	@Override
	public int updateByExampleSelective(Product record, ProductExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Product record, ProductExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Product record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Product record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}
	

	@Override
	public List<Product> selectProAndInfoBylimit(ProductExample example) {
		// TODO Auto-generated method stub
		return mapper.selectProAndInfoBylimit(example);
	}

}
