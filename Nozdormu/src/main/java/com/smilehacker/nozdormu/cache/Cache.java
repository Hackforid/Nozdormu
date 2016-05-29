package com.smilehacker.nozdormu.cache;

/**
 * Created by zhouquan on 16/5/29.
 */
public interface Cache {
    <T> T get(String key);
    <T> void put(String key, T value);
}
