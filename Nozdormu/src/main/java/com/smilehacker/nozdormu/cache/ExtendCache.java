package com.smilehacker.nozdormu.cache;

import com.smilehacker.nozdormu.rx.CallBack;

/**
 * Created by zhouquan on 16/5/29.
 */
public interface ExtendCache extends Cache {
    <T> void put(String key, T val, long expired);
    <T> void getAsync(String key, CallBack<T> callBack);
    <T> void putAsync(String key, T val, long expired, CallBack<T> callBack);
}
