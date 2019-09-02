package com.hyxy.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.hyxy.entity.Admin;
import com.hyxy.entity.Course;
import com.hyxy.entity.Entity;
import com.hyxy.entity.Functionaa;
import com.hyxy.entity.Role;
import com.hyxy.entity.Score;
import com.hyxy.entity.Student;
import com.hyxy.entity.Teacher;
import com.hyxy.service.LoginService;
import com.hyxy.service.ShowFunction;
import com.hyxy.util.PageUtils;

import redis.clients.jedis.Jedis;

@Controller
@RequestMapping("behind")
public class Behind {

	@Resource
	private LoginService LoginService;
	@Resource
	private ShowFunction showFunction;
	@Resource
	private LoginService loginservice;

	@RequestMapping("select")
	@ResponseBody
	public Map<String, Object> select(HttpServletRequest request, @RequestParam Map<String, Object> map1)
			throws Exception {

		// String username,String password,String ty
		String username = (String) map1.get("username");
		String password = (String) map1.get("password");
		String ty = (String) map1.get("ty");
		
		Jedis jedis = new Jedis("localhost",6379);
		jedis.auth("123");

		Map<String, Object> map = new HashMap<>();
		Entity entity = new Entity();
		if ("0".equals(ty)) {
			List<Student> students = new ArrayList<>();
			
			String studentjson = jedis.get("behind_select_select");
			students = JSONObject.parseArray(studentjson, Student.class);
			if (students==null) {
				students = LoginService.stuSelect();
				String json = JSONObject.toJSONString(students);
				jedis.set("behind_select_select", json);
			}
			
			for (Student student : students) {
				String name = student.getStudentname();
				String pass = student.getPassword();
				Integer number = student.getStudentNumber();
				String num = String.valueOf(number);
				if (num.equals(username) && pass.equals(password)) {
					entity.setId(student.getId());
					entity.setStudentname(name);
					entity.setPassword(pass);
					entity.setSex(student.getSex());
					entity.setStuclass(student.getStuclass());
					entity.setStudentNumber(number);
					HttpSession session = request.getSession();
					// BeanUtils.populate(entity,map1);
					session.setAttribute("entity", entity);
					session.setAttribute("ok", "ok");
					// System.out.println(entity.getStudentNumber());
					map.put("message", "成功");
					map.put("ty", ty);
					map.put("number", number);
				}
			}
		} else if ("1".equals(ty)) {
			List<Teacher> teachers = LoginService.teaSelect();
			for (Teacher teacher : teachers) {
				String name = teacher.getTeachername();
				String pass = teacher.getPassword();
				Integer number = teacher.getTeacherNumber();
				String num = String.valueOf(number);
				if (num.equals(username) && pass.equals(password)) {
					entity.setTeacherNumber(number);
					entity.setTeachername(name);
					entity.setPassword(pass);
					entity.setStuclass(teacher.getStuclass());
					entity.setSex(teacher.getSex());

					HttpSession session = request.getSession();
					session.setAttribute("entity", entity);
					session.setAttribute("ok", "ok");
					map.put("message", "成功");
					map.put("ty", ty);
					map.put("number", number);
				}
			}
		} else if ("2".equals(ty)) {
			List<Admin> admins = LoginService.admSelect();
			for (Admin admin : admins) {
				String name = admin.getAdminname();
				String pass = admin.getPassword();
				Integer number = admin.getAdminNumber();
				String num = String.valueOf(number);
				if (num.equals(username) && pass.equals(password)) {
					entity.setId(admin.getId());
					entity.setAdminname(name);
					entity.setAdminNumber(number);
					entity.setPassword(pass);
					entity.setRoleid(admin.getRoleid());
					HttpSession session = request.getSession();
					session.setAttribute("entity", entity);
					session.setAttribute("ok", "ok");
					map.put("message", "成功");
					map.put("ty", ty);
					map.put("number", number);
				}
			}
		} else {
			map.put("message", "失败");
			// String json = JSONObject.toJSON(map).toString();
		}
		return map;
	}

	@RequestMapping("show")
	public String show(HttpServletRequest req, Map<String, Object> map) {
		HttpSession session = req.getSession();
		int roleid = ((Entity) session.getAttribute("entity")).getRoleid();
		String username = ((Entity) session.getAttribute("entity")).getAdminname();

		List<Functionaa> list = showFunction.showFunct(roleid);
		List<Functionaa> list2 = showFunction.functionTwo(roleid);
		map.put("list", list);
		map.put("list2", list2);
		map.put("username", username);
		return "WEB-INF/back/index.jsp";
	}

	@RequestMapping("selectgrades")
	@ResponseBody
	public Map<String, Object> selectGrades(HttpServletRequest req, String stuNumber, String year, String term) {

		int studentNumber = 0;
		if (stuNumber != "") {
			studentNumber = Integer.valueOf(stuNumber);
		}
		List<Score> list = new LinkedList<>();
		Map<String, Object> map = new HashMap<>();
		// Map<String, String> map2 = new HashMap<>();
		// map2.put("year", year);
		// map2.put("term", term);

		if ("全部".equals(year)) {
			if ("全部".equals(term)) {
				int count = loginservice.selectLimit(studentNumber);

				/**
				 * currentPage:当前页 count:总记录数 pageSize:每页显示的条数
				 */
				// 当前第几页
				String currentPage = req.getParameter("currentPage");
				// 每页显示的条数
				String pageSize = req.getParameter("pageSize");

				PageUtils pageUtils = new PageUtils(currentPage, count, pageSize);
				// 开始记录数
				int begin = pageUtils.getPageRecord();
				// 查几条记录
				int number = pageUtils.getPageSize();
				// 前台页面分页模型（传入页面使用的html代码）
				String page = pageUtils.getPage();

				map.put("number", number);
				map.put("page", page);
				map.put("message", "成功");
				list = loginservice.selectGradeBy(studentNumber, begin, number);
			} else {
				int count = loginservice.selectLimetByTerm(studentNumber, term);

				/**
				 * currentPage:当前页 count:总记录数 pageSize:每页显示的条数
				 */
				// 当前第几页
				String currentPage = req.getParameter("currentPage");
				// 每页显示的条数
				String pageSize = req.getParameter("pageSize");

				PageUtils pageUtils = new PageUtils(currentPage, count, pageSize);
				// 开始记录数
				int begin = pageUtils.getPageRecord();
				// 查几条记录
				int number = pageUtils.getPageSize();
				// 前台页面分页模型（传入页面使用的html代码）
				String page = pageUtils.getPage();

				map.put("number", number);
				map.put("page", page);
				map.put("message", "成功");
				list = loginservice.selectGradeByTerm(studentNumber, term, begin, number);
			}
		} else {
			if ("全部".equals(term)) {
				int count = loginservice.selectLimetByYear(studentNumber, year);

				/**
				 * currentPage:当前页 count:总记录数 pageSize:每页显示的条数
				 */
				// 当前第几页
				String currentPage = req.getParameter("currentPage");
				// 每页显示的条数
				String pageSize = req.getParameter("pageSize");

				PageUtils pageUtils = new PageUtils(currentPage, count, pageSize);
				// 开始记录数
				int begin = pageUtils.getPageRecord();
				// 查几条记录
				int number = pageUtils.getPageSize();
				// 前台页面分页模型（传入页面使用的html代码）
				String page = pageUtils.getPage();

				map.put("number", number);
				map.put("page", page);
				map.put("message", "成功");
				list = loginservice.selectGradeByYear(studentNumber, year, begin, number);
			} else {
				int count = loginservice.selectLimetgrade(studentNumber, year, term);

				/**
				 * currentPage:当前页 count:总记录数 pageSize:每页显示的条数
				 */
				// 当前第几页
				String currentPage = req.getParameter("currentPage");
				// 每页显示的条数
				String pageSize = req.getParameter("pageSize");

				PageUtils pageUtils = new PageUtils(currentPage, count, pageSize);
				// 开始记录数
				int begin = pageUtils.getPageRecord();
				// 查几条记录
				int number = pageUtils.getPageSize();
				// 前台页面分页模型（传入页面使用的html代码）
				String page = pageUtils.getPage();

				map.put("number", number);
				map.put("page", page);
				map.put("message", "成功");
				list = loginservice.selectGrade(studentNumber, year, term, begin, number);
			}
		}
		// for (Object score : list) {
		// System.out.println(((Score) score).getStudentNumber());
		// }
		// list.add(map2);
		// map.put("year", year);
		// map.put("term", term);
		map.put("list", list);
		return map;
	}

	@RequestMapping("studentXinxi")
	public String studentXinxi(Map<String, List<Student>> map) {
		List<Student> lists = showFunction.selectAll();
		map.put("lists", lists);
		return "WEB-INF/back/studentXinxi.jsp";
	}

	@RequestMapping("user")
	public String user(Map<String, List<Admin>> map) {
		List<Admin> list = showFunction.selectRole();
		map.put("list", list);
		return "WEB-INF/back/User.jsp";
	}

	@RequestMapping("UserUpdate")
	public String UserUpdate(Integer id, String adminname, String rolername, Map<String, Object> map) throws Exception {
		String name = new String(adminname.getBytes("iso-8859-1"), "utf-8");
		List<Role> list = showFunction.selectRoleAll();
		map.put("list", list);
		map.put("id", id);
		map.put("name", name);

		return "WEB-INF/back/userupdate.jsp";
	}

	@RequestMapping("Userup")
	public String Userup(Integer id, String userName, Integer roleName) {
		showFunction.updateRole(id, roleName);
		return "behind/user";
	}

	@RequestMapping("teacherXinxi")
	public String teacherXinxi(Map<String, List<Teacher>> map) {
		List<Teacher> list = showFunction.selectTeacherXinxi();
		map.put("list", list);
		return "WEB-INF/back/teacher.jsp";
	}

	@RequestMapping("studentUpdate")
	public String studentUpdate(Integer id, Integer courseName, Map<String, Object> map) throws Exception {
		// String years = new String(year.getBytes("iso-8859-1"), "utf-8");
		// String terms = new String(term.getBytes("iso-8859-1"), "utf-8");

		// int studentnumber = 0;
		// System.out.println(id);
		// int coursenumber = 0;
		// if (id!=null || id !="") {
		// studentnumber = Integer.valueOf(id);
		// }
		// if (courseName != null || courseName != "") {
		// coursenumber = Integer.valueOf(courseName);
		// }

		Course course = showFunction.selectStu(courseName, id);
		map.put("course", course);
		// map.put("years", years);
		// map.put("terms", terms);

		return "WEB-INF/back/studentUpdate.jsp";

	}

	@RequestMapping("gradeUp")
	public String gradeUp(int grade, int studentNumber, int coursenumber) {
		showFunction.updategrade(grade, studentNumber, coursenumber);
		return "WEB-INF/back/studentGrade.jsp";
	}

	@RequestMapping("userInsert")
	public String userInsert(Admin admin) {

		int count = showFunction.insert(admin);
		
		return "behind/user";
	}

	@RequestMapping("selectbyid")
	@ResponseBody
	public Map<String, Object> selectbyid(Integer adminNumber) {
		int count = showFunction.selectByNumber(adminNumber);
		Map<String, Object> map = new HashMap<>();
		map.put("count", count);
		
		return map;
	}

	
	@RequestMapping("UserDelect")
	public String UserDelect(Integer id) {
		showFunction.deleteByPrimaryKey(id);
		return "behind/user";
	}
	
	
	
	
	
}
