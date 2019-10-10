package com.youaji.library.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * commit() 与 apply() 区别：https://www.jianshu.com/p/3b2ac6201b33
 *
 * Created by youaji on 2019/10/10.
 *
 * @author youaji
 * @version 0.0.1
 * @date 2019/10/10
 */
public class SharedUtil {

    private static final String SP_NAME = "YouajiSharedPreferences";
    private static final int SP_MODE = Context.MODE_PRIVATE;

    //<editor-fold desc="存储">

    /**
     * 存储 boolean
     *
     * @param context 上下文
     * @param key     键
     * @param value   值
     */
    public static void save(Context context, String key, boolean value) {
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(SP_NAME, SP_MODE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    /**
     * 存储 String
     *
     * @param context 上下文
     * @param key     键
     * @param value   值
     */
    public static void save(Context context, String key, String value) {
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(SP_NAME, SP_MODE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    /**
     * 存储 int
     *
     * @param context 上下文
     * @param key     键
     * @param value   值
     */
    public static void save(Context context, String key, int value) {
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(SP_NAME, SP_MODE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    //</editor-fold>

    //<editor-fold desc="取值">

    /**
     * @param context 上下文
     * @param key     键
     * @return 值「默认：0」
     */
    public static int getInt(Context context, String key) {
        if (context == null) {
            return 0;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(SP_NAME, SP_MODE);
        return sharedPreferences.getInt(key, 0);
    }

    /**
     * @param context      上下文
     * @param key          键
     * @param defaultValue 默认值
     * @return 值
     */
    public static int getInt(Context context, String key, int defaultValue) {
        if (context == null) {
            return 0;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(SP_NAME, SP_MODE);
        return sharedPreferences.getInt(key, defaultValue);
    }

    /**
     * @param context 上下文
     * @param key     键
     * @return 值「默认：null」
     */
    public static String getString(Context context, String key) {
        if (context == null) {
            return null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(SP_NAME, SP_MODE);
        return sharedPreferences.getString(key, null);
    }

    /**
     * @param context      上下文
     * @param key          键
     * @param defaultValue 默认值
     * @return 值
     */
    public static String getString(Context context, String key, String defaultValue) {
        if (context == null) {
            return defaultValue;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(SP_NAME, SP_MODE);
        return sharedPreferences.getString(key, defaultValue);
    }

    /**
     * @param context 上下文
     * @param key     键
     * @return 值「默认：false」
     */
    public static boolean getBool(Context context, String key) {
        if (context == null) {
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(SP_NAME, SP_MODE);
        return sharedPreferences.getBoolean(key, false);
    }

    /**
     * @param context      上下文
     * @param key          键
     * @param defaultValue 默认值
     * @return 值
     */
    public static boolean getBool(Context context, String key, boolean defaultValue) {
        if (context == null) {
            return defaultValue;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(SP_NAME, SP_MODE);
        return sharedPreferences.getBoolean(key, defaultValue);
    }

    //</editor-fold>

    //<editor-fold desc="移除">

    /**
     * 移除
     *
     * @param context 上下文
     * @param key     键
     */
    public static void remove(Context context, String key) {
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(SP_NAME, SP_MODE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(key);
        editor.apply();
    }

    //</editor-fold>
}
