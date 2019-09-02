package com.hyxy.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hyxy.entity.Admin;
import com.hyxy.entity.Entity;
import com.hyxy.entity.Score;
import com.hyxy.entity.Student;
import com.hyxy.entity.Teacher;

public interface LoginService {
	
	
	public List<Student> stuSelect();
	
	public List<Teacher> teaSelect();
	
	public List<Admin> admSelect();

	Entity selectByStudentNumber(int studentNumber);
	
	List<Score> selectGrade(int studentNumber,String year,String term,int begin,int number);
	
	List<Score> selectGradeByYear(int studentNumber,String year,int begin,int number);
	
	List<Score> selectGradeByTerm(int studentNumber,String term,int begin,int number);
	
	List<Score> selectGradeBy(int studentNumber,int begin,int number);
	
	Integer selectLimit(int studentNumber);
	
	Integer selectLimetByTerm(int studentNumber,String term);
    
	Integer selectLimetByYear(int studentNumber,String year);
    
	Integer selectLimetgrade(int studentNumber,String year,String term);
	
	
	
	
}
