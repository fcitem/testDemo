package com.fc.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fc.bean.Product;
import com.fc.bean.ProductExample;
import com.fc.bean.productAndInfo;

public interface productService {
	 int countByExample(ProductExample example);

	    int deleteByExample(ProductExample example);

	    int deleteByPrimaryKey(String proid);

	    int insert(Product record);

	    int insertSelective(Product record);

	    List<Product> selectByExample(ProductExample example);

	    Product selectByPrimaryKey(String proid);

	    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

	    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

	    int updateByPrimaryKeySelective(Product record);

	    int updateByPrimaryKey(Product record);
	    
	    public List<Product> selectProAndInfoBylimit(ProductExample example);
}
