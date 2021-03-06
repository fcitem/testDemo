package com.fc.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fc.bean.ProOrder;
import com.fc.bean.ProOrderExample;
import com.fc.bean.orderInfo;

public interface proOrderService {
	 int countByExample(ProOrderExample example);

	    int deleteByExample(ProOrderExample example);

	    int deleteByPrimaryKey(String orderid);

	    int insert(ProOrder record);

	    int insertSelective(ProOrder record);

	    List<ProOrder> selectByExample(ProOrderExample example);

	    ProOrder selectByPrimaryKey(String orderid);

	    int updateByExampleSelective(@Param("record") ProOrder record, @Param("example") ProOrderExample example);

	    int updateByExample(@Param("record") ProOrder record, @Param("example") ProOrderExample example);

	    int updateByPrimaryKeySelective(ProOrder record);

	    int updateByPrimaryKey(ProOrder record);
	    
	    List<orderInfo> selectOrderInfo(ProOrderExample example);
}
