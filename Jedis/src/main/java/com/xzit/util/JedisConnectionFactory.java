package com.xzit.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author Walker
 * @date 2025/10/27
 * @project Jedis
 */
public class JedisConnectionFactory {
    private static final JedisPool jedisPool;

    static {
        //配置连接池
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        //最大连接
        poolConfig.setMaxTotal(8);
        //最大空闲连接
        poolConfig.setMaxIdle(8);
        //最小空闲连接
        poolConfig.setMinIdle(0);
        //最长等待时间 ms
        poolConfig.setMaxWaitMillis(1000);
        //创建连接池对象
        jedisPool=new JedisPool(poolConfig,"192.168.227.128",6379,1000,"123321");
    }

    public static Jedis getJedis(){
        return jedisPool.getResource();
    }
}
