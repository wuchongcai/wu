package com.hyxy.dao;

import com.hyxy.entity.Teacher;
import java.util.List;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer teacherNumber);

    int insert(Teacher record);

    Teacher selectByPrimaryKey(Integer teacherNumber);

    List<Teacher> selectAll();

    int updateByPrimaryKey(Teacher record);
    
    List<Teacher> selectTeacherXinxi();
    
    
}