package com.fc.dao;

import com.fc.bean.ProInfo;
import com.fc.bean.ProInfoExample;
import com.fc.bean.productAndInfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProInfoMapper {
    int countByExample(ProInfoExample example);

    int deleteByExample(ProInfoExample example);

    int deleteByPrimaryKey(String proid);

    int insert(ProInfo record);

    int insertSelective(ProInfo record);

    List<ProInfo> selectByExample(ProInfoExample example);

    ProInfo selectByPrimaryKey(String proid);

    int updateByExampleSelective(@Param("record") ProInfo record, @Param("example") ProInfoExample example);

    int updateByExample(@Param("record") ProInfo record, @Param("example") ProInfoExample example);

    int updateByPrimaryKeySelective(ProInfo record);

    int updateByPrimaryKey(ProInfo record);

	List<productAndInfo> selectProAndInfo(String proId);
}