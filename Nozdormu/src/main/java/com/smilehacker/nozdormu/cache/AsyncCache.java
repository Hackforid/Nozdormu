package com.smilehacker.nozdormu.cache;

import com.smilehacker.nozdormu.rx.CallBack;

/**
 * Created by zhouquan on 16/5/29.
 */
public interface AsyncCache extends Cache {
    <T> void getAsync(String key, CallBack<T> callBack);
    <T> void putAsync(String key, T val, CallBack<T> callBack);
}
