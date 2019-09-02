package com.hyxy.dao;

import com.hyxy.entity.Jurisdiction;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface JurisdictionMapper {
    int deleteByPrimaryKey(Integer jurisdictionid);

    int insert(Jurisdiction record);

    Jurisdiction selectByPrimaryKey(Integer jurisdictionid);

    List<Jurisdiction> selectAll();

    int updateByPrimaryKey(Jurisdiction record);
    
    int updateById(@Param("yes")int yes,@Param("functionid")int functionid,@Param("roleid")int roleid);
    
    int insertinto(@Param("roleid")int roleid,@Param("functionid")int functionid,@Param("yes")int yes);
    
    
    
}