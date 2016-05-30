package com.smilehacker.nozdormu;

import android.content.Context;

import com.smilehacker.nozdormu.cache.BasicStore;

/**
 * Created by zhouquan on 16/5/29.
 */
public class Noz {

    private static Noz mInstance;

    private Context mContext;

    private BasicStore mStore;

    private Noz(Context context) {
        mContext = context.getApplicationContext();
        mStore = new BasicStore();
    }

    public static void init(Context context) {
        if (mInstance == null) {
            mInstance = new Noz(context);
        } else {
            throw new IllegalStateException("Already initialized");
        }
    }


}
