package com.enjoyphoto.thread;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import sun.dc.pr.PRError;

import java.util.Set;

/**
 * Created by Administrator on 2018/1/10.
 */
public class RedisCache {

    private static String HOST;
    private static int PORT;
    private static int MAX_ACTIVE;
    private static int MAX_IDLE;
    private static int MAX_WAIT;
    private static int TIMEOUT;
    private static boolean TEST_ON_BORROW;
    private static JedisPool jedisPool = null;

    static {

        HOST = "127.0.0.1";
        PORT = 6379;
        MAX_ACTIVE = 1000;
        MAX_IDLE = 200;
        MAX_WAIT = 3000;
        TIMEOUT = 3000;
        TEST_ON_BORROW = true;
    }

    /**
     * redis过期时间,以秒为单位
     */
    public final static int EXRP_HOUR = 60 * 60;//一小时

    /**
     * 初始化Redis连接池
     */
    private static void initialPool() {
        try {
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxTotal(MAX_ACTIVE);
            config.setMaxIdle(MAX_IDLE);
            config.setMaxWaitMillis(MAX_WAIT);
            config.setTestOnBorrow(TEST_ON_BORROW);
            jedisPool = new JedisPool(config, HOST, PORT, TIMEOUT);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 在多线程环境同步初始化
     */
    private static synchronized void poolInit() {
        if (jedisPool == null) {
            initialPool();
        }
    }

    /**
     * 同步获取Jedis实例
     *
     * @return Jedis
     */
    public synchronized static Jedis getJedis() {
        if (jedisPool == null) {
            poolInit();
        }
        Jedis jedis = null;
        try {
            if (jedisPool != null) {
                jedis = jedisPool.getResource();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jedis;
    }

    /**
     * 释放jedis资源
     *
     * @param jedis
     */
    public static void returnResource(final Jedis jedis) {
        if (jedis != null && jedisPool != null) {
            jedis.close();
        }
    }

    public synchronized static void getAllKeys(String selectKey) {

        Jedis jedis = getJedis();
        Set<String> keys = jedis.keys(selectKey);
        returnResource(jedis);
        System.out.println("threadName:" + Thread.currentThread().getName() + " And jedis is connection:" + jedis.isConnected());
        assert keys != null;
    }

}
