package com.hyxy.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hyxy.dao.AdminMapper;
import com.hyxy.dao.CourseMapper;
import com.hyxy.dao.FunctionMapper;
import com.hyxy.dao.JurisdictionMapper;
import com.hyxy.dao.RoleMapper;
import com.hyxy.dao.ScoreMapper;
import com.hyxy.dao.StudentMapper;
import com.hyxy.dao.TeacherMapper;
import com.hyxy.entity.Admin;
import com.hyxy.entity.Course;
import com.hyxy.entity.Functionaa;
import com.hyxy.entity.Role;
import com.hyxy.entity.Student;
import com.hyxy.entity.Teacher;

@Service
public class ShowFunctiones implements ShowFunction {

	@Resource
	private FunctionMapper functionMapper;
	@Resource
	private StudentMapper studentMapper;
	@Resource
	private RoleMapper roleMapper;
	@Resource
	private JurisdictionMapper jurisdictionMapper;
	@Resource
	private AdminMapper adminMapper;
	@Resource
	private TeacherMapper teacherMapper;
	@Resource
	private CourseMapper courseMapper;
	@Resource
	private ScoreMapper scoreMapper;
	

	@Override
	public List<Functionaa> showFunct(int roleid) {
		List<Functionaa> list = functionMapper.functionSelect(roleid);
		return list;
	}

	@Override
	public List<Functionaa> functionTwo(int roleid) {
		List<Functionaa> list = functionMapper.functionTwo(roleid);
		return list;
	}

	@Override
	public List<Student> selectAll() {
		List<Student> list = studentMapper.selectAll();
		return list;
	}

	@Override
	public List<Role> slec() {
		List<Role> list = roleMapper.selectAll();
		return list;
	}

	@Override
	public int quanxian(int roleid) {
		int ro = functionMapper.quanxian(roleid);
		return ro;
	}

	@Override
	public List<Functionaa> fenpei(int roleid,int begin,int number) {
		List<Functionaa> list = functionMapper.fenpei(roleid, begin, number);
		return list;
	}

	@Override
	public int countes(int roleid, int functionid) {
		int count = functionMapper.countes(roleid, functionid);
		return count;
	}

	@Override
	public int updateById(int yes, int functionid, int roleid) {
		int i = jurisdictionMapper.updateById(yes, functionid, roleid);
		return i;
	}

	@Override
	public int insertinto(int roleid, int functionid, int yes) {
		int ok = jurisdictionMapper.insertinto(roleid, functionid, yes);
		return ok;
	}

	@Override
	public List<Admin> selectRole() {
		List<Admin> list = adminMapper.selectRole();
		return list;
	}

	@Override
	public List<Role> selectRoleAll() {
		List<Role> list = roleMapper.selectAll();
		return list;
	}

	@Override
	public void updateRole(Integer id,Integer roleid) {
		adminMapper.updateRole(id,roleid);
		
	}

	@Override
	public List<Teacher> selectTeacherXinxi() {
		List<Teacher> list = teacherMapper.selectTeacherXinxi();
		return list;
	}

	@Override
	public Course selectStu(Integer coursenumber, Integer studentnumber) {
		Course course = courseMapper.selectStu(coursenumber, studentnumber);
		return course;
	}

	@Override
	public void updategrade(int grade, int studentNumber, int coursenumber) {
		scoreMapper.updategrade(grade, studentNumber, coursenumber);
		
	}

	@Override
	public int selectByNumber(int adminnumber) {
		int count =  adminMapper.selectByNumber(adminnumber);
		return count;
	}

	@Override
	public int insert(Admin record) {
		int count = adminMapper.insert(record);
		return count;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		int i = adminMapper.deleteByPrimaryKey(id);
		return i;
	}
	
	
	
	
	
	
	
	
	
}
