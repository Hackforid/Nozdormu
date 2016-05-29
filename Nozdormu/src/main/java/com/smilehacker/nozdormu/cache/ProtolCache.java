package com.smilehacker.nozdormu.cache;

/**
 * Created by zhouquan on 16/5/29.
 */
public interface ProtolCache extends Cache {

    String get(String key);

    void put(String key, String value);

}
