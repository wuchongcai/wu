package com.hyxy.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.hyxy.entity.User;
import com.hyxy.service.LoginService;
import com.hyxy.util.JedisClien;
import com.hyxy.util.RedisUtil;

import redis.clients.jedis.Jedis;

@Controller
@RequestMapping("loginController")
public class LoginController {
	@Resource
	private LoginService loginService;

	// 注入缓存工具类
	@Resource
	private RedisUtil redisutil;
 

	/**
	 * 测试所有方法
	 */
	@RequestMapping("test")
	public Object test() {
		System.out.println("---------创建两个实体对象--------------");
		User usera = new User();
		usera.setUsername("张三");
		usera.setPassword("123");
		User userb = new User();
		userb.setUsername("李四");
		userb.setPassword("456");

		System.out.println("---------对象存取--------------");
		// 对象使用，实体必须序列化
		User user = new User();
		user.setUsername("张三");
		user.setPassword("123");
		redisutil.set("user", user);
		User user2 = (User) redisutil.get("user");
		System.out.println(user2.getUsername() + "--" + user2.getPassword());

		System.out.println("---------string字符串--------------");
		// string字符串
		redisutil.set("string", "xt");
		System.out.println(redisutil.get("string"));

		System.out.println("---------list链表List<String>--------------");
		// list链表
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		redisutil.set("list", list);
		List<String> lists = (List<String>) redisutil.get("list");
		System.out.println(lists.size());
		for (String string : lists) {
			System.out.println(string);
		}

		System.out.println("---------list链表List<User>-------------");
		List<User> listUser = new ArrayList<>();
		listUser.add(usera);
		listUser.add(userb);
		redisutil.set("listUser", listUser);
		List<User> listsUser = (List<User>) redisutil.get("listUser");
		for (User user3 : listsUser) {
			System.out.println(user3.getUsername() + "--" + user3.getPassword());
		}

		System.out.println("---------set集合Set<String>-------------");
		// set集合
		Set<String> set = new HashSet<>();
		set.add("张");
		set.add("厅");
		set.add("脸");
		redisutil.set("set", set);
		Set<String> sets = (Set<String>) redisutil.get("set");
		for (String string : sets) {
			System.out.println(string);
		}

		System.out.println("---------set集合Set<User>-------------");
		Set<User> setU = new HashSet<>();
		setU.add(usera);
		setU.add(userb);
		redisutil.set("setu", setU);
		Set<User> setUs = (Set<User>) redisutil.get("setu");
		for (User user3 : setUs) {
			System.out.println(user3.getUsername() + "--" + user3.getPassword());
		}

		System.out.println("---------map集合Map<String, String>-------------");
		// map
		Map<String, String> map = new TreeMap<String, String>();
		map.put("name", "fujianchao");
		map.put("password", "123");
		map.put("age", "12");
		redisutil.set("map", map);
		Map<String, String> maps = (Map<String, String>) redisutil.get("map");
		System.out.println(maps);

		System.out.println("---------map集合Map<String, User>-------------");
		// map
		Map<String, User> mapU = new TreeMap<String, User>();
		mapU.put("usera", usera);
		mapU.put("userb", userb);
		redisutil.set("mapU", mapU);
		Map<String, User> mapUs = (Map<String, User>) redisutil.get("mapU");
		System.out.println(mapUs.get("usera").getUsername());
		System.out.println(mapUs.get("userb").getUsername());

		System.out.println("---------判断缓存中是否存在key-------------");
		// 判断缓存中是否存在key
		// 判断string
		System.out.println(redisutil.exists("string"));
		// 判断list
		System.out.println(redisutil.exists("list"));
		System.out.println(redisutil.exists("listUser"));
		// 判断set
		System.out.println(redisutil.exists("set"));
		System.out.println(redisutil.exists("setu"));
		// 判断map
		System.out.println(redisutil.exists("map"));
		System.out.println(redisutil.exists("mapU"));

		System.out.println("---------设置某个key的过期时间,单位为秒-------------");
		// 设置某个key的过期时间,单位为秒
		redisutil.expire("list", 60L);

		System.out.println("---------删除单个缓存中的key-------------");
		// 删除单个缓存中的key
		// string
		redisutil.remove("string");
		// list
		redisutil.remove("list");
		// set
		redisutil.remove("set");
		// map
		redisutil.remove("map");

		System.out.println("---------批量删除缓存中的key-------------");
		// 批量删除缓存中的key
		redisutil.remove("listUser", "mapU", "setu", "user");
		
		System.out.println("---------使用模糊查询通配符，批量删除多个key-------------");
		// 使用模糊查询通配符，批量删除多个key
		// 匹配删除全部的key
		redisutil.removePattern("*");
		// 匹配删除所有set开头的key
		redisutil.removePattern("set*");
		return "";
	}
}
