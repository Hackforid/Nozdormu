package com.smilehacker.nozdormu.rx;

/**
 * Created by zhouquan on 16/5/29.
 */
public interface CallBack<T> {
    void onResult(T result);
    void onError(Exception e);
}
