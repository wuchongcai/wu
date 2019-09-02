package com.hyxy.util;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import redis.clients.jedis.Jedis;

/**
 * redis工具类,手动创建redis连接
 */
public class JedisClien {
	private static Jedis jedis = null;
	private static String host = "localhost";// redis配置的ip地址
	private static String password = "123";// 密码
	private static Integer port = 6379;// redis配置的端口号

	static {
		jedis = new Jedis(host, port);
		jedis.auth(password); // 使用密码登陆redis
		System.out.println("连接成功");
		// 查看服务是否运行
		System.out.println("服务正在运行: " + jedis.ping());
	}

	// ---------------------------string----------------------------
	/**
	 * 向缓存中设置字符串内容
	 */
	public static boolean set(String key, String value) {
		try {
			jedis.set(key, value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return false;
	}

	/**
	 * 向缓存中设置字符串内容 ,设置过期时间
	 */
	public static boolean set(String key, String value, Integer seconds) {
		try {
			jedis.set(key, value);
			jedis.expire(key, seconds);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return false;
	}

	/**
	 * 根据key 获取内容
	 */
	public static String get(String key) {
		try {
			String value = jedis.get(key);
			return value;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return null;
	}

	/**
	 * 根据key 获取对象
	 */
	public static <T> T get(String key, Class<T> clazz) {
		try {
			String value = jedis.get(key);
			return JSON.parseObject(value, clazz);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return null;
	}

	// ---------------------------list----------------------------

	/**
	 * list push-----数据插入前面
	 */
	public static boolean lpush(String key, String value) {
		try {
			jedis.lpush(key, value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return false;
	}

	/**
	 * 返回所有list数据
	 * @param <T>
	
	public static <T> List<T> lrange(String key,Class<T> clazz) {
		try {
			List<String> lists = jedis.lrange(key, 0, -1);
			List<T> list = new ArrayList<>();
			for (String string : lists) {
			T	t =  (T) JSONObject.parseArray(string, clazz);
			list.add(t);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return null;

	} */
	
	public static <T> boolean lpush(String key, List<T> list) {
		try {
//			jedis.lpush(key, value);
			for (T t : list) {
				jedis.set(key, JSONObject.toJSONString(t));
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return false;
	}
	
	/**
	 * list rpush------数据插入后面
	 */
	public static boolean rpush(String key, String value) {
		try {
			jedis.rpush(key, value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return false;
	}

	/**
	 * 返回所有list数据
	 */
	public static List<String> lrange(String key) {
		try {
			List<String> lists = jedis.lrange(key, 0, -1);
			return lists;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return null;

	}

	// ---------------------------set----------------------------
	/**
	 * set sadd------新增数据
	 */
	public static boolean sadd(String key, String value) {
		try {
			jedis.sadd(key, value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return false;
	}

	/**
	 * set smembers------查询数据
	 */
	public static Set<String> smembers(String key) {
		try {
			Set<String> set = jedis.smembers(key);
			return set;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return null;
	}

	// ---------------------------hash----------------------------
	/**
	 * hash添加一个键值对
	 */
	public static boolean hset(String key, String fieldName, String value) {
		try {
			jedis.hset(key, fieldName, value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return false;
	}

	/**
	 * hash添加一个键值对
	 */
	public static String hget(String key, String fieldName) {
		try {
			String value = jedis.hget(key, fieldName);
			return value;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return null;
	}

	/**
	 * hash添加一个map
	 */
	public static boolean hmset(String key, Map<String, String> map) {
		try {
			jedis.hmset(key, map);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return false;
	}

	/**
	 * hash查询出一个map
	 */
	public static Map<String, String> hgetAll(String key) {
		try {
			// 取出一个map
			Map<String, String> map = jedis.hgetAll(key);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return null;
	}

	/**
	 * 判断是否存在key
	 */
	public static Boolean exists(String key) {
		try {
			return jedis.exists(key);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return false;
	}

	/**
	 * 删除缓存中的对象，根据key
	 */
	public static boolean del(String key) {
		try {
			jedis.del(key);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return false;
	}

	/**
	 * 清空缓存中所有数据
	 */
	public static boolean flushDB() {
		try {
			// 清空数据
			jedis.flushDB();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return false;
	}

	/**
	 * 设置key过期时间
	 * expire：设置超时时间（单位/秒），默认是0，表示永不超时。
	 */
	public static boolean expire(String key, int seconds) {
		try {
			jedis.expire(key, seconds);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return false;
	}
}
