package com.wanglu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.*;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlApplicationTests {

	@Autowired
	private GirlProperties girlProperties;

	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	public void contextLoads() {
		System.out.println(girlProperties.getAge());
	}

	@Test
	public void testJedis() {
		ValueOperations<String, Object> data = redisTemplate.opsForValue();//操作字符串
		data.set("name", "zhangsan");
		System.out.println(data.get("zhangsan"));
	}

	@Test
	public void string() {
		ValueOperations data = redisTemplate.opsForValue();//操作字符串
		data.set("age", 11);
		System.out.println(data.get("age"));
	}

	@Test
	public void hash() {
		HashOperations data = redisTemplate.opsForHash();//操作hash
	}

	@Test
	public void set() {
		SetOperations data = redisTemplate.opsForSet();//操作set

	}

	@Test
	public void zset() {
		ZSetOperations data = redisTemplate.opsForZSet();//操作有序set

	}

	@Test
	public void list() {
		final ListOperations data = redisTemplate.opsForList();//操作list
	}

}
