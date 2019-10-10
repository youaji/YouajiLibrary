package com.youaji.library.util;

import android.util.Log;

/**
 * Created by youaji on 2019/10/10.
 *
 * @author youaji
 * @version 0.0.1
 * @date 2019/10/10
 */
public class LogUtil {

    private static final String TAG = "YouajiTag";

    public static void debug(String msg) {
        Log.d(TAG, msg);
    }

    public static void info(String msg) { Log.i(TAG, msg); }

    public static void warn(String msg) {
        Log.w(TAG, msg);
    }

    public static void error(String msg) { Log.e(TAG, msg); }

}
