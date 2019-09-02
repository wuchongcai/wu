package com.hyxy.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hyxy.entity.Admin;
import com.hyxy.entity.Course;
import com.hyxy.entity.Functionaa;
import com.hyxy.entity.Role;
import com.hyxy.entity.Student;
import com.hyxy.entity.Teacher;

public interface ShowFunction {

	public List<Functionaa> showFunct(int roleid);
	
	public List<Functionaa>  functionTwo(int roleid);
		
	public List<Student> selectAll();
	
	public List<Role> slec();
	
	public int quanxian(int roleid);
	
	public List<Functionaa> fenpei(int roleid,int begin,int number);
	
	public int countes(int roleid,int functionid);
	
	public int updateById(int yes,int functionid,int roleid);
	
	public int insertinto(int roleid,int functionid,int yes);
	
	public List<Admin> selectRole();
	
	public List<Role> selectRoleAll();
	
	public void updateRole(Integer id,Integer roleid);
	
	public List<Teacher> selectTeacherXinxi();
	
	Course selectStu( Integer coursenumber,Integer studentnumber);
	
	public void updategrade(int grade,int studentNumber,int coursenumber);
	
	public int selectByNumber(int adminnumber);
	
	public int insert(Admin record);
	
	public  int deleteByPrimaryKey(Integer id);
	
	
	
		
	}
	
	

