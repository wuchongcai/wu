package com.hyxy.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.hyxy.dao.AdminMapper;
import com.hyxy.dao.ScoreMapper;
import com.hyxy.dao.StudentMapper;
import com.hyxy.dao.TeacherMapper;
import com.hyxy.entity.Admin;
import com.hyxy.entity.Entity;
import com.hyxy.entity.Score;
import com.hyxy.entity.Student;
import com.hyxy.entity.Teacher;

@Service
public class LogService implements LoginService {

	@Resource
	private StudentMapper studentmapper;
	@Resource
	private TeacherMapper teachermapper;
	@Resource
	private AdminMapper adminMapper;
	@Resource
	private ScoreMapper scoreMapper;

	
	
	
	@Override
	public List<Student> stuSelect() {
		List<Student> students = studentmapper.selectAll();
		return students;
	}

	@Override
	public List<Teacher> teaSelect() {
		List<Teacher> teachers = teachermapper.selectAll();
		return teachers;
	}

	@Override
	public List<Admin> admSelect() {
		List<Admin> admins = adminMapper.selectAll();
		return admins;
	}

	@Override
	public Entity selectByStudentNumber(int studentNumber) {
		Entity student = studentmapper.selectByStuNumber(studentNumber);
		return student;
	}

	@Override
	public List<Score> selectGrade(int studentNumber,String year,String term,int begin,int number) {
		List<Score> score = scoreMapper.selectGrade(studentNumber, year, term,begin,number);
		return score;
	}

	@Override
	public List<Score> selectGradeByYear(int studentNumber, String year,int begin,int number) {
		List<Score> list = scoreMapper.selectGradeByYear(studentNumber, year,begin,number);
		return list;
	}

	@Override
	public List<Score> selectGradeByTerm(int studentNumber, String term,int begin,int number) {
		List<Score> list = scoreMapper.selectGradeByTerm(studentNumber, term,begin,number);
		return list;
	}

	@Override
	public List<Score> selectGradeBy(int studentNumber,int begin,int number) {
		List<Score> list = scoreMapper.selectGradeBy(studentNumber,begin,number);
		return list;
	}

	@Override
	public Integer selectLimit(int studentNumber) {
		int number = scoreMapper.selectLimit(studentNumber);
		return number;
	}

	@Override
	public Integer selectLimetByTerm(int studentNumber, String term) {
		int number = scoreMapper.selectLimetByTerm(studentNumber, term);
		return number;
	}

	@Override
	public Integer selectLimetByYear(int studentNumber, String year) {
		int number = scoreMapper.selectLimetByYear(studentNumber, year);
		return number;
	}

	@Override
	public Integer selectLimetgrade(int studentNumber, String year, String term) {
		int number = scoreMapper.selectLimetgrade(studentNumber, year, term);
		return number;
	}

}
