package com.hyxy.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hyxy.entity.Functionaa;
import com.hyxy.entity.Role;
import com.hyxy.entity.Student;
import com.hyxy.service.ShowFunction;
import com.hyxy.util.PageUtils;

@Controller
public class functionSelect {
	
	
	@Resource
	private ShowFunction showFunction;
	
	
	
	

	@RequestMapping("functionSelect")
	public String fun(HttpServletRequest req,Integer role_id, Map<String, Object> map) {
		List<Role> lists = showFunction.slec();
		int roleid = 0;
		map.put("lists", lists);
		if (role_id == null) {
			role_id = 0;
		}
		roleid = role_id;
		int count = showFunction.quanxian(roleid);
		map.put("role_id", roleid);
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
//		map.put("message", "成功");
		List<Functionaa> list = showFunction.fenpei(roleid,begin,number);
		map.put("list", list);
		
		
		return "WEB-INF/back/zhanshi.jsp";
	}
}
