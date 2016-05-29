package com.smilehacker.nozdormu;

import android.content.Context;

/**
 * Created by zhouquan on 16/5/29.
 */
public class Noz {

    private static Noz mInstance;

    private Context mContext;

    private Noz(Context context) {
        mContext = context.getApplicationContext();
    }

    public static void init(Context context) {
        if (mInstance == null) {
            mInstance = new Noz(context);
        } else {
            throw new IllegalStateException("Already initialized");
        }
    }

}
