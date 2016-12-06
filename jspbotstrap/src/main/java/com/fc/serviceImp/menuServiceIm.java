package com.fc.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fc.bean.Menu;
import com.fc.bean.MenuExample;
import com.fc.dao.MenuMapper;
import com.fc.service.menuService;

@Service
public class menuServiceIm implements menuService {

	@Autowired
	MenuMapper mapper;
	@Override
	public int countByExample(MenuExample example) {
		// TODO Auto-generated method stub
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(MenuExample example) {
		// TODO Auto-generated method stub
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String menuId) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(menuId);
	}

	@Override
	public int insert(Menu record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Menu record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public List<Menu> selectByExample(MenuExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public Menu selectByPrimaryKey(String menuId) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(menuId);
	}

	@Override
	public int updateByExampleSelective(Menu record, MenuExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Menu record, MenuExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Menu record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Menu record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}

}
