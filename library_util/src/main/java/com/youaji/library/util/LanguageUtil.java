package com.youaji.library.util;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

import java.util.Locale;

/**
 * Created by youaji on 2019/10/10.
 *
 * @author youaji
 * @version 0.0.1
 * @date 2019/10/10
 */
public class LanguageUtil {

    /**
     * 设置应用语言为中文
     *
     * @param context 上下文
     */
    public static void setChinese(Context context) {
        setLanguage(context, Locale.CHINESE);
    }

    /**
     * 设置应用语言为英文
     *
     * @param context 上下文
     */
    public static void setEnglish(Context context) {
        setLanguage(context, Locale.ENGLISH);
    }

    /**
     * 设置应用语言
     *
     * @param context 上下文
     * @param locale  语言类型
     * @link https://blog.csdn.net/u012560369/article/details/89141075
     */
    private static void setLanguage(Context context, Locale locale) {
        Resources resources = context.getResources();
        if (!getCurrentLanguage(context).equals(locale.getLanguage())) {
            Configuration config = resources.getConfiguration();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            config.locale = locale;
            resources.updateConfiguration(config, displayMetrics);
        }
    }

    /**
     * 当前语言类型
     *
     * @param context 上下文
     * @return 语言类型
     */
    private static String getCurrentLanguage(Context context) {
        Resources resources = context.getResources();
        return resources.getConfiguration().locale.getLanguage();
    }

    /**
     * 当前语言是否为中文
     *
     * @param context 上下文
     * @return true：中文；false：其他
     */
    public static boolean isChinese(Context context) {
        return getCurrentLanguage(context).contains("zh") || getCurrentLanguage(context).contains("ZH");
    }

}
