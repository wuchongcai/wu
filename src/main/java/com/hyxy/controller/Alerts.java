package com.hyxy.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hyxy.dao.FunctionMapper;
import com.hyxy.dao.JurisdictionMapper;

@Controller
public class Alerts {

	@Resource
	private FunctionMapper functionMapper;
	@Resource
	private JurisdictionMapper jurisdictionMapper;
	
	
	
	@RequestMapping("alerts")
	@ResponseBody
	public String alerts(Integer role_id,Integer functionid, Integer yes) {
		int count =  functionMapper.countes(role_id, functionid);
		if (count>0) {
			int ok = jurisdictionMapper.updateById(yes, functionid, role_id);
			return "成功";
		}else {
			int ok = jurisdictionMapper.insertinto(role_id, functionid, yes);
			return "成功";
		}
	}
}
