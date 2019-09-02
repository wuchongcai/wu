package com.hyxy.dao;

import com.hyxy.entity.Course;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CourseMapper {
    int deleteByPrimaryKey(Integer coursenumber);

    int insert(Course record);

    Course selectByPrimaryKey(Integer coursenumber);

    List<Course> selectAll();

    int updateByPrimaryKey(Course record);
    
    Course selectStu(@Param("coursenumber") Integer coursenumber,@Param("studentnumber") Integer studentnumber);
    
}