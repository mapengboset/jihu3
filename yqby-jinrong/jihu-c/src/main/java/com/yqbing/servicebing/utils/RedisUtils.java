package com.yqbing.servicebing.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.CollectionUtils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisUtils {
	private static final Logger logger = LoggerFactory
			.getLogger(RedisUtils.class);
	@Autowired
	private JedisPool jedisPool;

	private static RedisUtils redisUtils;

	@PostConstruct
	public void init() {
		redisUtils = this;
		redisUtils.jedisPool = this.jedisPool;
	}

	/**
	 * 过去时间 两周
	 */
	public final static int EXPIRED_SECONDS_TWO_WEEK = 2 * 7 * 24 * 60 * 60;

	/**
	 * 过期时间 两天
	 */
	public final static int EXPIRED_SECONDS_TWO_DAY = 2 * 24 * 60 * 60;

	/**
	 * 刷新redis缓存
	 *
	 * @param key
	 * @param value
	 * @param timeout
	 *            过期时间秒,如果小于等于0，则永不过期
	 * @return
	 */
	public static void set(String key, String value, Integer timeout) {
		Jedis jedis = null;
		try {
			jedis = redisUtils.jedisPool.getResource();
			jedis.set(key, value);
			if (timeout > 0) {
				jedis.expire(key, timeout);
			}

		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			redisUtils.jedisPool.returnResource(jedis);
		}
	}

	/**
	 * 获取redis缓存的值
	 *
	 * @param key
	 * @return
	 */
	public static String get(String key) {
		String value = null;
		Jedis jedis = null;
		try {
			jedis = redisUtils.jedisPool.getResource();
			value = jedis.get(key);
		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			redisUtils.jedisPool.returnResource(jedis);
		}
		return value;
	}

	/**
	 * 刷新redis缓存
	 *
	 * @param key
	 * @param value
	 * @param timeout
	 *            过期时间秒,如果小于等于0，则永不过期
	 * @return
	 */
	public static void sset(String key, String value, Integer timeout) {
		Jedis jedis = null;
		try {
			jedis = redisUtils.jedisPool.getResource();
			jedis.sadd(key, value);

			if (timeout > 0) {
				jedis.expire(key, timeout);
			}

		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			redisUtils.jedisPool.returnResource(jedis);
		}
	}

	/**
	 * 获取redis缓存的值
	 *
	 * @param key
	 * @return
	 */
	public static Set<String> smembers(String key) {
		Set<String> values = null;
		Jedis jedis = null;
		try {
			jedis = redisUtils.jedisPool.getResource();
			values = jedis.smembers(key);
		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			redisUtils.jedisPool.returnResource(jedis);
		}
		return values;
	}

	/**
	 * 刷新redis缓存
	 *
	 * @param key
	 * @param value
	 * @param timeout
	 *            过期时间秒,如果小于等于0，则永不过期
	 * @return
	 */
	public static void setObject(String key, Object value, Integer timeout) {
		Jedis jedis = null;
		try {
			jedis = redisUtils.jedisPool.getResource();
			jedis.set(key.getBytes(), SerializeUtil.serialize(value));
			if (timeout > 0) {
				jedis.expire(key.getBytes(), timeout);
			}

		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			redisUtils.jedisPool.returnResource(jedis);
		}
	}

	public static void fullAll() {
		Jedis jedis = null;
		try {
			jedis = redisUtils.jedisPool.getResource();
			jedis.flushAll();

		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			redisUtils.jedisPool.returnResource(jedis);
		}
	}

	public static RedisUtils getRedisUtils() {
		return redisUtils;
	}

	public static void setRedisUtils(RedisUtils redisUtils) {
		RedisUtils.redisUtils = redisUtils;
	}

	/**
	 * 获取redis缓存的值
	 *
	 * @param key
	 * @return
	 */
	public static Object getObject(String key) {
		Object value = null;
		Jedis jedis = null;
		try {
			jedis = redisUtils.jedisPool.getResource();
			value = SerializeUtil.unserialize(jedis.get(key.getBytes()));
		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			redisUtils.jedisPool.returnResource(jedis);
		}
		return value;
	}

	/**
	 * 删除redis缓存中的信息；
	 *
	 * @param key
	 */
	public static void del(String key) {
		Jedis jedis = null;

		try {
			jedis = redisUtils.jedisPool.getResource();
			jedis.del(key);
		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			redisUtils.jedisPool.returnResource(jedis);
		}
	}

	/**
	 * 删除一个集合中的一个元素
	 * 
	 * @param key
	 * @param value
	 * @param timeout
	 */
	public static void srem(String key, String value) {
		Jedis jedis = null;
		try {
			jedis = redisUtils.jedisPool.getResource();
			jedis.srem(key, value);
		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			redisUtils.jedisPool.returnResource(jedis);
		}
	}

	public JedisPool getJedisPool() {
		return jedisPool;
	}

	/**
	 * 获取redis缓存的值 【结合】
	 *
	 * @param key
	 * @return
	 */
	public static Set<String> keys(String key) {
		Set<String> value = null;
		Jedis jedis = null;
		try {
			jedis = redisUtils.jedisPool.getResource();
			value = jedis.keys(key);
		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			redisUtils.jedisPool.returnResource(jedis);
		}
		return value;
	}

	/**
	 * key改名
	 *
	 * @param key
	 * @param value
	 * @param timeout
	 *            过期时间秒,如果小于等于0，则永不过期
	 * @return
	 */
	public static void rename(String oldkey, String newkey, Integer timeout) {
		Jedis jedis = null;
		try {
			jedis = redisUtils.jedisPool.getResource();
			jedis.rename(oldkey, newkey);
			if (timeout > 0) {
				jedis.expire(newkey, timeout);
			}

		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			redisUtils.jedisPool.returnResource(jedis);
		}
	}

	public void setJedisPool(JedisPool jedisPool) {
		this.jedisPool = jedisPool;
	}

	// redisTemplate
	// 方式----------------------------------------------------------------------------------------------------------------------------------------

	private RedisTemplate<String, Object> redisTemplate;

	public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	// =============================common============================
	/**
	 * 指定缓存失效时间
	 * 
	 * @param key
	 *            键
	 * @param time
	 *            时间(秒)
	 * @return
	 */
	public boolean expire(String key, long time) {
		try {
			if (time > 0) {
				redisTemplate.expire(key, time, TimeUnit.SECONDS);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 根据key 获取过期时间
	 * 
	 * @param key
	 *            键 不能为null
	 * @return 时间(秒) 返回0代表为永久有效
	 */
	public long getExpire(String key) {
		return redisTemplate.getExpire(key, TimeUnit.SECONDS);
	}

	/**
	 * 判断key是否存在
	 * 
	 * @param key
	 *            键
	 * @return true 存在 false不存在
	 */
	public boolean hasKey(String key) {
		try {
			return redisTemplate.hasKey(key);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 删除缓存
	 * 
	 * @param key
	 *            可以传一个值 或多个
	 */
	@SuppressWarnings("unchecked")
	public void del(String... key) {
		if (key != null && key.length > 0) {
			if (key.length == 1) {
				redisTemplate.delete(key[0]);
			} else {
				redisTemplate.delete(CollectionUtils.arrayToList(key));
			}
		}
	}

	// ============================String=============================
	/**
	 * 普通缓存获取
	 * 
	 * @param key
	 *            键
	 * @return 值
	 */

	public Object get1(String key) {
		return key == null ? null : redisTemplate.opsForValue().get(key);
	}

	/**
	 * 普通缓存放入
	 * 
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @return true成功 false失败
	 */
	public boolean set(String key, Object value) {
		try {
			redisTemplate.opsForValue().set(key, value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	/**
	 * 普通缓存放入并设置时间
	 * 
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @param time
	 *            时间(秒) time要大于0 如果time小于等于0 将设置无限期
	 * @return true成功 false 失败
	 */
	public boolean set(String key, Object value, long time) {
		try {
			if (time > 0) {
				redisTemplate.opsForValue().set(key, value, time,
						TimeUnit.SECONDS);
			} else {
				set(key, value);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 递增
	 * 
	 * @param key
	 *            键
	 * @param by
	 *            要增加几(大于0)
	 * @return
	 */
	public long incr(String key, long delta) {
		if (delta < 0) {
			throw new RuntimeException("递增因子必须大于0");
		}
		return redisTemplate.opsForValue().increment(key, delta);
	}

	/**
	 * 递减
	 * 
	 * @param key
	 *            键
	 * @param by
	 *            要减少几(小于0)
	 * @return
	 */
	public long decr(String key, long delta) {
		if (delta < 0) {
			throw new RuntimeException("递减因子必须大于0");
		}
		return redisTemplate.opsForValue().increment(key, -delta);
	}

	// ================================Map=================================
	/**
	 * HashGet
	 * 
	 * @param key
	 *            键 不能为null
	 * @param item
	 *            项 不能为null
	 * @return 值
	 */
	public Object hget(String key, String item) {
		return redisTemplate.opsForHash().get(key, item);
	}

	/**
	 * 获取hashKey对应的所有键值
	 * 
	 * @param key
	 *            键
	 * @return 对应的多个键值
	 */
	public Map<Object, Object> hmget(String key) {
		return redisTemplate.opsForHash().entries(key);
	}

	/**
	 * HashSet
	 * 
	 * @param key
	 *            键
	 * @param map
	 *            对应多个键值
	 * @return true 成功 false 失败
	 */
	public boolean hmset(String key, Map<String, Object> map) {
		try {
			redisTemplate.opsForHash().putAll(key, map);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * HashSet 并设置时间
	 * 
	 * @param key
	 *            键
	 * @param map
	 *            对应多个键值
	 * @param time
	 *            时间(秒)
	 * @return true成功 false失败
	 */
	public boolean hmset(String key, Map<String, Object> map, long time) {
		try {
			redisTemplate.opsForHash().putAll(key, map);
			if (time > 0) {
				expire(key, time);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 向一张hash表中放入数据,如果不存在将创建
	 * 
	 * @param key
	 *            键
	 * @param item
	 *            项
	 * @param value
	 *            值
	 * @return true 成功 false失败
	 */
	public boolean hset(String key, String item, Object value) {
		try {
			redisTemplate.opsForHash().put(key, item, value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 向一张hash表中放入数据,如果不存在将创建
	 * 
	 * @param key
	 *            键
	 * @param item
	 *            项
	 * @param value
	 *            值
	 * @param time
	 *            时间(秒) 注意:如果已存在的hash表有时间,这里将会替换原有的时间
	 * @return true 成功 false失败
	 */
	public boolean hset(String key, String item, Object value, long time) {
		try {
			redisTemplate.opsForHash().put(key, item, value);
			if (time > 0) {
				expire(key, time);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 删除hash表中的值
	 * 
	 * @param key
	 *            键 不能为null
	 * @param item
	 *            项 可以使多个 不能为null
	 */
	public void hdel(String key, Object... item) {
		redisTemplate.opsForHash().delete(key, item);
	}

	/**
	 * 判断hash表中是否有该项的值
	 * 
	 * @param key
	 *            键 不能为null
	 * @param item
	 *            项 不能为null
	 * @return true 存在 false不存在
	 */
	public boolean hHasKey(String key, String item) {
		return redisTemplate.opsForHash().hasKey(key, item);
	}

	/**
	 * hash递增 如果不存在,就会创建一个 并把新增后的值返回
	 * 
	 * @param key
	 *            键
	 * @param item
	 *            项
	 * @param by
	 *            要增加几(大于0)
	 * @return
	 */
	public double hincr(String key, String item, double by) {
		return redisTemplate.opsForHash().increment(key, item, by);
	}

	/**
	 * hash递减
	 * 
	 * @param key
	 *            键
	 * @param item
	 *            项
	 * @param by
	 *            要减少记(小于0)
	 * @return
	 */
	public double hdecr(String key, String item, double by) {
		return redisTemplate.opsForHash().increment(key, item, -by);
	}

	// ============================set=============================
	/**
	 * 根据key获取Set中的所有值
	 * 
	 * @param key
	 *            键
	 * @return
	 */
	public Set<Object> sGet(String key) {
		try {
			return redisTemplate.opsForSet().members(key);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 根据value从一个set中查询,是否存在
	 * 
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @return true 存在 false不存在
	 */
	public boolean sHasKey(String key, Object value) {
		try {
			return redisTemplate.opsForSet().isMember(key, value);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 将数据放入set缓存
	 * 
	 * @param key
	 *            键
	 * @param values
	 *            值 可以是多个
	 * @return 成功个数
	 */
	public long sSet(String key, Object... values) {
		try {
			return redisTemplate.opsForSet().add(key, values);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	/**
	 * 将set数据放入缓存
	 * 
	 * @param key
	 *            键
	 * @param time
	 *            时间(秒)
	 * @param values
	 *            值 可以是多个
	 * @return 成功个数
	 */
	public long sSetAndTime(String key, long time, Object... values) {
		try {
			Long count = redisTemplate.opsForSet().add(key, values);
			if (time > 0)
				expire(key, time);
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	/**
	 * 获取set缓存的长度
	 * 
	 * @param key
	 *            键
	 * @return
	 */
	public long sGetSetSize(String key) {
		try {
			return redisTemplate.opsForSet().size(key);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	/**
	 * 移除值为value的
	 * 
	 * @param key
	 *            键
	 * @param values
	 *            值 可以是多个
	 * @return 移除的个数
	 */
	public long setRemove(String key, Object... values) {
		try {
			Long count = redisTemplate.opsForSet().remove(key, values);
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	// ===============================list=================================

	/**
	 * 获取list缓存的内容
	 * 
	 * @param key
	 *            键
	 * @param start
	 *            开始
	 * @param end
	 *            结束 0 到 -1代表所有值
	 * @return
	 */
	public List<Object> lGet(String key, long start, long end) {
		try {
			return redisTemplate.opsForList().range(key, start, end);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 获取list缓存的长度
	 * 
	 * @param key
	 *            键
	 * @return
	 */
	public long lGetListSize(String key) {
		try {
			return redisTemplate.opsForList().size(key);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	/**
	 * 通过索引 获取list中的值
	 * 
	 * @param key
	 *            键
	 * @param index
	 *            索引 index>=0时， 0 表头，1 第二个元素，依次类推；index<0时，-1，表尾，-2倒数第二个元素，依次类推
	 * @return
	 */
	public Object lGetIndex(String key, long index) {
		try {
			return redisTemplate.opsForList().index(key, index);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 将list放入缓存
	 * 
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @param time
	 *            时间(秒)
	 * @return
	 */
	public boolean lSet(String key, Object value) {
		try {
			redisTemplate.opsForList().rightPush(key, value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 将list放入缓存
	 * 
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @param time
	 *            时间(秒)
	 * @return
	 */
	public boolean lSet(String key, Object value, long time) {
		try {
			redisTemplate.opsForList().rightPush(key, value);
			if (time > 0)
				expire(key, time);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 将list放入缓存
	 * 
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @param time
	 *            时间(秒)
	 * @return
	 */
	public boolean lSet(String key, List<Object> value) {
		try {
			redisTemplate.opsForList().rightPushAll(key, value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 将list放入缓存
	 * 
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @param time
	 *            时间(秒)
	 * @return
	 */
	public boolean lSet(String key, List<Object> value, long time) {
		try {
			redisTemplate.opsForList().rightPushAll(key, value);
			if (time > 0)
				expire(key, time);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 根据索引修改list中的某条数据
	 * 
	 * @param key
	 *            键
	 * @param index
	 *            索引
	 * @param value
	 *            值
	 * @return
	 */
	public boolean lUpdateIndex(String key, long index, Object value) {
		try {
			redisTemplate.opsForList().set(key, index, value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 移除N个值为value
	 * 
	 * @param key
	 *            键
	 * @param count
	 *            移除多少个
	 * @param value
	 *            值
	 * @return 移除的个数
	 */
	public long lRemove(String key, long count, Object value) {
		try {
			Long remove = redisTemplate.opsForList().remove(key, count, value);
			return remove;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
