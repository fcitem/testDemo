package com.fc.dao;

import com.fc.bean.RolePermision;
import com.fc.bean.RolePermisionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePermisionMapper {
    int countByExample(RolePermisionExample example);

    int deleteByExample(RolePermisionExample example);

    int deleteByPrimaryKey(String roleId);

    int insert(RolePermision record);

    int insertSelective(RolePermision record);

    List<RolePermision> selectByExample(RolePermisionExample example);

    RolePermision selectByPrimaryKey(String roleId);

    int updateByExampleSelective(@Param("record") RolePermision record, @Param("example") RolePermisionExample example);

    int updateByExample(@Param("record") RolePermision record, @Param("example") RolePermisionExample example);

    int updateByPrimaryKeySelective(RolePermision record);

    int updateByPrimaryKey(RolePermision record);
}