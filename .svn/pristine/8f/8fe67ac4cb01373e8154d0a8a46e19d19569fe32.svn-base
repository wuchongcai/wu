package com.hyxy.dao;

import com.hyxy.entity.Admin;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    Admin selectByPrimaryKey(Integer id);

    List<Admin> selectAll();

    int updateByPrimaryKey(Admin record);
    
    List<Admin> selectRole();
    
    void updateRole(@Param("id")Integer id,@Param("roleid")Integer roleid);
    
    int  selectByNumber(@Param("adminnumber")int adminnumber);
    
}