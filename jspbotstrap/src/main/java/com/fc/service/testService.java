package com.fc.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fc.bean.Test;
import com.fc.bean.TestExample;

public interface testService {
	int countByExample(TestExample example);

    int deleteByExample(TestExample example);

    int deleteByPrimaryKey(String userid);

    int insert(Test record);

    int insertSelective(Test record);

    List<Test> selectByExample(TestExample example);

    Test selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}
