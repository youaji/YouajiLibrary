package com.youaji.library.util;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by youaji on 2019/10/10.
 *
 * @author youaji
 * @version 0.0.1
 * @date 2019/10/10
 */
public class AndroidUtil {

    /**
     * 获取 app 版本号「Code」
     * 默认：0
     *
     * @param context 上下文
     * @return 版本号「Code」
     */
    public static int versionCode(Context context) {
        int versionCode = 0;
        try {
            versionCode = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return versionCode;
    }

    /**
     * 获取 app 版本号「Name」
     * 默认：0 或 空字符串
     *
     * @param context 上下文
     * @return 版本号「Name」
     */
    public static String versionName(Context context) {
        String versionName = "";
        try {
            versionName = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return versionName;
    }

    /**
     * 关闭键盘
     *
     * @param activity 当前 Activity
     */
    public static void closeKeyboard(Activity activity) {
        closeKeyboard(activity.getCurrentFocus());
    }

    /**
     * 关闭键盘
     *
     * @param currentFocus 当前焦点 View
     */
    public static void closeKeyboard(View currentFocus) {

        if (currentFocus == null) {
            return;
        }

        InputMethodManager inputMethodManager = (InputMethodManager) currentFocus.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);

        if (inputMethodManager != null) {
            IBinder windowToken = currentFocus.getWindowToken();
            inputMethodManager.hideSoftInputFromWindow(windowToken, InputMethodManager.HIDE_NOT_ALWAYS);
            currentFocus.clearFocus();
        }
    }
}
