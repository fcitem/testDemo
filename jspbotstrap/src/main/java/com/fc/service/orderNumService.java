package com.fc.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fc.bean.OrderNum;
import com.fc.bean.OrderNumExample;

public interface orderNumService {
	   int countByExample(OrderNumExample example);

	    int deleteByExample(OrderNumExample example);

	    int deleteByPrimaryKey(String proid);

	    int insert(OrderNum record);

	    int insertSelective(OrderNum record);

	    List<OrderNum> selectByExample(OrderNumExample example);

	    OrderNum selectByPrimaryKey(String proid);

	    int updateByExampleSelective(@Param("record") OrderNum record, @Param("example") OrderNumExample example);

	    int updateByExample(@Param("record") OrderNum record, @Param("example") OrderNumExample example);

	    int updateByPrimaryKeySelective(OrderNum record);

	    int updateByPrimaryKey(OrderNum record);
}
