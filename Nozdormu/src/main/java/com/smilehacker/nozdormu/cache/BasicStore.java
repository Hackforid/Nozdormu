package com.smilehacker.nozdormu.cache;

import com.smilehacker.nozdormu.rx.CallBack;

/**
 * Created by zhouquan on 16/5/29.
 */
public class BasicStore {

    public <T> T get(String key, Cache cache) {
        return cache.get(key);
    }

    public <T> void getAsync(String key, ExtendCache cache, CallBack callBack) {
        cache.getAsync(key, callBack);
    }

    public <T> void put(String key, T val, Cache cache) {
        cache.put(key, val);
    }

    public <T> void put(String key, T val, long expired, ExtendCache cache) {
        cache.put(key, val, expired);
    }

    public <T> void put(String key, T val, long expired, ExtendCache cache, CallBack callBack) {
        cache.putAsync(key, val, expired, callBack);
    }

}
