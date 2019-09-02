package com.hyxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lujing {
//	value="Lujing",method=RequestMethod.GET
	@RequestMapping("Lujing")
	public String lj(String path) {
		System.out.println(path);
		return "WEB-INF/back/"+path;
	}
}
