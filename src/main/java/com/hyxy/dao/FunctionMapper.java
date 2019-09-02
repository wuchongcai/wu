package com.hyxy.dao;

import com.hyxy.entity.Functionaa;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface FunctionMapper {
    int deleteByPrimaryKey(Integer functionid);

    int insert(Functionaa record);

    Functionaa selectByPrimaryKey(Integer functionid);

    List<Functionaa> selectAll();

    int updateByPrimaryKey(Functionaa record);
    
    List<Functionaa> functionSelect(int roleid);
    
    List<Functionaa> functionTwo(int roleid);
    
    int quanxian(@Param("roleid")int roleid);
    
    List<Functionaa> fenpei(@Param("roleid")int roleid,@Param("begin")int begin,@Param("number")int number);
    
    int countes(@Param("roleid")int roleid,@Param("functionid")int functionid);
    
    
}