package com.fc.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fc.bean.Menu;
import com.fc.bean.MenuExample;

public interface menuService {
	 int countByExample(MenuExample example);

	    int deleteByExample(MenuExample example);

	    int deleteByPrimaryKey(String menuId);

	    int insert(Menu record);

	    int insertSelective(Menu record);

	    List<Menu> selectByExample(MenuExample example);

	    Menu selectByPrimaryKey(String menuId);

	    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

	    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

	    int updateByPrimaryKeySelective(Menu record);

	    int updateByPrimaryKey(Menu record);
}
