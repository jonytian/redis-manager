package com.newegg.ec.redis.client;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.util.Slowlog;

import java.util.List;

/**
 * @author Jay.H.Zou
 * @date 2019/7/22
 */
public class RedisClusterClient implements IRedisClusterClient {

    private RedisURI redisURI;

    public RedisClusterClient(RedisURI redisURI) {
        this.redisURI = redisURI;
    }

    @Override
    public String getRedisClusterClient() {
        return null;
    }

    @Override
    public String getClusterInfo() {
        return null;
    }

    @Override
    public String getNodeList() {
        return null;
    }

    @Override
    public String getMasterList() {
        return null;
    }

    @Override
    public String getSlaveList() {
        return null;
    }

    @Override
    public Jedis getRedisClient() {
        return null;
    }

    @Override
    public boolean ping() {
        return false;
    }

    @Override
    public boolean auth() {
        return false;
    }

    @Override
    public String getConfig() {
        return null;
    }

    @Override
    public String getConfig(String... keys) {
        return null;
    }

    @Override
    public boolean rewriteConfig() {
        return false;
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public String getInfo(String subKey) {
        return null;
    }

    @Override
    public String getMemory() {
        return null;
    }

    @Override
    public String getMemory(String subKey) {
        return null;
    }

    @Override
    public String getVersion() {
        return null;
    }

    @Override
    public String getSlowLog() {
        return null;
    }

    @Override
    public List<String> scan(String key) {
        return null;
    }

    @Override
    public String nodes() {
        return null;
    }

    @Override
    public Object query(String key) {
        return null;
    }

    @Override
    public List<Slowlog> getSlowLog(int size) {
        return null;
    }

    @Override
    public String clusterMeet(String ip, int port) {
        return null;
    }

    @Override
    public String clusterReplicate(String masterId) {
        return null;
    }

    @Override
    public String clusterFailover() {
        return null;
    }

    @Override
    public String close() {
        return null;
    }
}