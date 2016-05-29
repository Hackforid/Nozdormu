package com.smilehacker.nozdormu.cache;

import com.smilehacker.nozdormu.rx.CallBack;

/**
 * Created by zhouquan on 16/5/29.
 */
public class BasicStore {

    public String get(String key, Cache cache) {
        return cache.get(key);
    }

    public void put(String key, String val, Cache cache) {
        cache.put(key, val);
    }

    public void put(String key, String val, long expired, Cache cache) {

    }

    public <T> void put(String key, T val, long expired, Cache cache, CallBack callBack) {
        if (cache instanceof AsyncCache) {
            AsyncCache asyncCache = (AsyncCache) cache;
            asyncCache.putAsync(key, val, callBack);
        }
    }
}
