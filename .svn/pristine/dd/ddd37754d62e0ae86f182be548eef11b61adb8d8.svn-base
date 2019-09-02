package com.hyxy.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hyxy.entity.Entity;
import com.hyxy.entity.Score;
import com.hyxy.entity.Student;
import com.hyxy.service.LoginService;
import com.hyxy.util.PageUtils;

@Controller
@RequestMapping("befor")
public class Befor {

	@Resource
	private LoginService loginservice;

	@RequestMapping("classify")
	public String classify(String ty) {
		if ("0".equals(ty)) {
			return "befor/studentview";
			// return "WEB-INF/weblook/show";
		} else if ("1".equals(ty)) {
			return "WEB-INF/weblook/teacherView";
		} else if ("2".equals(ty)) {
			return "behind/show";
		}
		return ty;
	}

	@RequestMapping("studentview")
	public String studentView(HttpServletRequest req, Map<String, Object> map) {
		HttpSession session = req.getSession();
		// Entity entity = new Entity();
		Object se = session.getAttribute("entity");
		int number = ((Entity) session.getAttribute("entity")).getStudentNumber();

		// Integer stu = entity.getStudentNumber();
		Entity entity = loginservice.selectByStudentNumber(number);
		map.put("number", number);
		map.put("student", entity);

		return "WEB-INF/weblook/show.jsp";
	}

	@RequestMapping("studentGrade")
	@ResponseBody
	public Map<String, Object> selectStuGrade(HttpServletRequest req, String year, String term) {
		HttpSession session = req.getSession();
		Integer studentNumber = ((Entity) session.getAttribute("entity")).getStudentNumber();
		List<Score> list = new LinkedList<>();
		Map<String, Object> map = new HashMap<>();
		
		
		if ("全部".equals(year)) {
			if ("全部".equals(term)) {
				int count = loginservice.selectLimit(studentNumber);
				
				/**
				 * currentPage:当前页
				 * count:总记录数
				 * pageSize:每页显示的条数
				 */
				//当前第几页
				String currentPage = req.getParameter("currentPage");
				//每页显示的条数
				String pageSize = req.getParameter("pageSize");

				PageUtils pageUtils = new PageUtils(currentPage, count, pageSize);
				// 开始记录数
				int  begin = pageUtils.getPageRecord();
				//查几条记录
				int number = pageUtils.getPageSize();
				//前台页面分页模型（传入页面使用的html代码）
				String page =  pageUtils.getPage();

				map.put("number", number);
				map.put("page", page);
				map.put("message", "成功");
				list = loginservice.selectGradeBy(studentNumber,begin,number);
			} else {
				int count = loginservice.selectLimetByTerm(studentNumber, term);
				
				/**
				 * currentPage:当前页
				 * count:总记录数
				 * pageSize:每页显示的条数
				 */
				//当前第几页
				String currentPage = req.getParameter("currentPage");
				//每页显示的条数
				String pageSize = req.getParameter("pageSize");

				PageUtils pageUtils = new PageUtils(currentPage, count, pageSize);
				// 开始记录数
				int  begin = pageUtils.getPageRecord();
				//查几条记录
				int number = pageUtils.getPageSize();
				//前台页面分页模型（传入页面使用的html代码）
				String page =  pageUtils.getPage();

				map.put("number", number);
				map.put("page", page);
				map.put("message", "成功");
				list = loginservice.selectGradeByTerm(studentNumber, term,begin,number);
			}
		} else {
			if ("全部".equals(term)) {
				int count = loginservice.selectLimetByYear(studentNumber, year);
				
				/**
				 * currentPage:当前页
				 * count:总记录数
				 * pageSize:每页显示的条数
				 */
				//当前第几页
				String currentPage = req.getParameter("currentPage");
				//每页显示的条数
				String pageSize = req.getParameter("pageSize");

				PageUtils pageUtils = new PageUtils(currentPage, count, pageSize);
				// 开始记录数
				int  begin = pageUtils.getPageRecord();
				//查几条记录
				int number = pageUtils.getPageSize();
				//前台页面分页模型（传入页面使用的html代码）
				String page =  pageUtils.getPage();

				map.put("number", number);
				map.put("page", page);
				map.put("message", "成功");
				list = loginservice.selectGradeByYear(studentNumber, year,begin,number);
			} else {
				int count = loginservice.selectLimetgrade(studentNumber, year, term);
				
				/**
				 * currentPage:当前页
				 * count:总记录数
				 * pageSize:每页显示的条数
				 */
				//当前第几页
				String currentPage = req.getParameter("currentPage");
				//每页显示的条数
				String pageSize = req.getParameter("pageSize");

				PageUtils pageUtils = new PageUtils(currentPage, count, pageSize);
				// 开始记录数
				int  begin = pageUtils.getPageRecord();
				//查几条记录
				int number = pageUtils.getPageSize();
				//前台页面分页模型（传入页面使用的html代码）
				String page =  pageUtils.getPage();

				map.put("number", number);
				map.put("page", page);
				map.put("message", "成功");
				list = loginservice.selectGrade(studentNumber, year, term,begin,number);
			}
		}
		map.put("list", list);
		return map;
	}
	
	@RequestMapping("operation")
	@ResponseBody
	public Map<String, Object> Operation(HttpServletRequest req, String year, String term){
		HttpSession session = req.getSession();
		Integer studentNumber = ((Entity) session.getAttribute("entity")).getStudentNumber();
		List<Score> list = new LinkedList<>();
		Map<String, Object> map = new HashMap<>();
		
		
		if ("全部".equals(year)) {
			if ("全部".equals(term)) {
				int count = loginservice.selectLimit(studentNumber);
				
				/**
				 * currentPage:当前页
				 * count:总记录数
				 * pageSize:每页显示的条数
				 */
				//当前第几页
				String currentPage = req.getParameter("currentPage");
				//每页显示的条数
				String pageSize = req.getParameter("pageSize");

				PageUtils pageUtils = new PageUtils(currentPage, count, pageSize);
				// 开始记录数
				int  begin = pageUtils.getPageRecord();
				//查几条记录
				int number = pageUtils.getPageSize();
				//前台页面分页模型（传入页面使用的html代码）
				String page =  pageUtils.getPage();

				map.put("number", number);
				map.put("page", page);
				map.put("message", "成功");
				list = loginservice.selectGradeBy(studentNumber,begin,number);
				req.setAttribute("number", number);
			} else {
				int count = loginservice.selectLimetByTerm(studentNumber, term);
				
				/**
				 * currentPage:当前页
				 * count:总记录数
				 * pageSize:每页显示的条数
				 */
				//当前第几页
				String currentPage = req.getParameter("currentPage");
				//每页显示的条数
				String pageSize = req.getParameter("pageSize");

				PageUtils pageUtils = new PageUtils(currentPage, count, pageSize);
				// 开始记录数
				int  begin = pageUtils.getPageRecord();
				//查几条记录
				int number = pageUtils.getPageSize();
				//前台页面分页模型（传入页面使用的html代码）
				String page =  pageUtils.getPage();

				map.put("number", number);
				map.put("page", page);
				map.put("message", "成功");
				list = loginservice.selectGradeByTerm(studentNumber, term,begin,number);
				req.setAttribute("number", number);
			}
		} else {
			if ("全部".equals(term)) {
				int count = loginservice.selectLimetByYear(studentNumber, year);
				
				/**
				 * currentPage:当前页
				 * count:总记录数
				 * pageSize:每页显示的条数
				 */
				//当前第几页
				String currentPage = req.getParameter("currentPage");
				//每页显示的条数
				String pageSize = req.getParameter("pageSize");

				PageUtils pageUtils = new PageUtils(currentPage, count, pageSize);
				// 开始记录数
				int  begin = pageUtils.getPageRecord();
				//查几条记录
				int number = pageUtils.getPageSize();
				//前台页面分页模型（传入页面使用的html代码）
				String page =  pageUtils.getPage();

				map.put("number", number);
				map.put("page", page);
				map.put("message", "成功");
				list = loginservice.selectGradeByYear(studentNumber, year,begin,number);
				req.setAttribute("number", number);
			} else {
				int count = loginservice.selectLimetgrade(studentNumber, year, term);
				
				/**
				 * currentPage:当前页
				 * count:总记录数
				 * pageSize:每页显示的条数
				 */
				//当前第几页
				String currentPage = req.getParameter("currentPage");
				//每页显示的条数
				String pageSize = req.getParameter("pageSize");

				PageUtils pageUtils = new PageUtils(currentPage, count, pageSize);
				// 开始记录数
				int  begin = pageUtils.getPageRecord();
				//查几条记录
				int number = pageUtils.getPageSize();
				//前台页面分页模型（传入页面使用的html代码）
				String page =  pageUtils.getPage();

				map.put("number", number);
				map.put("page", page);
				map.put("message", "成功");
				list = loginservice.selectGrade(studentNumber, year, term,begin,number);
				req.setAttribute("number", number);
			}
		}
		map.put("list", list);
		
		return map;
	}
	
	
	
	@RequestMapping("qingchu")
	@ResponseBody
	public Map<String, String> qingchu(HttpServletRequest req) {
		Map<String, String> map = new HashMap<>();
		HttpSession session = req.getSession();
		  session.invalidate();
		  map.put("", "");
		return map;
	}
	
	
	
	
	
	
	

}
