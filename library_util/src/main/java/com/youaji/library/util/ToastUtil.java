package com.youaji.library.util;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.StringRes;

/**
 * Created by youaji on 2019/10/10.
 *
 * @author youaji
 * @version 0.0.1
 * @date 2019/10/10
 */
public class ToastUtil {

    /**
     * @param context 上下文
     * @param resId   资源 id
     */
    public static void show(Context context, @StringRes int resId) {
        show(context, context.getString(resId));
    }

    /**
     * @param context 上下文
     * @param message 文本信息
     */
    public static void show(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
