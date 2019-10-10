package com.youaji.library.util;

import android.content.Context;
import android.content.DialogInterface;
import android.view.Gravity;
import android.view.Window;

import androidx.appcompat.app.AlertDialog;

/**
 * Created by youaji on 2019/10/10.
 *
 * @author youaji
 * @version 0.0.1
 * @date 2019/10/10
 */
public class DialogUtil {

    /**
     * 标题：无
     * 内容：promptMessage
     * 按钮个数：1
     * 按钮事件：dismiss
     * 按钮文字：确定
     *
     * @param context       上下文
     * @param promptMessage 提示内容
     */
    public static void prompt(Context context, String promptMessage) {
        new AlertDialog.Builder(context)
                .setCancelable(true)
                .setMessage(promptMessage)
                .setPositiveButton(R.string.ok, (dialogInterface, i) -> dialogInterface.dismiss())
                .show();
    }

    /**
     * 标题：无
     * 内容：warnMessage
     * 按钮个数：1
     * 按钮事件：dismiss
     * 按钮文字：确定
     *
     * @param context     上下文
     * @param warnMessage 警告内容
     */
    public static void warn(Context context, String warnMessage) {
        new AlertDialog.Builder(context)
                .setCancelable(false)
                .setMessage(warnMessage)
                .setPositiveButton(R.string.ok, (dialogInterface, i) -> dialogInterface.dismiss())
                .show();
    }

    /**
     * 标题：无
     * 内容：items
     * 按钮个数：0
     * 按钮事件：无
     * 按钮文字：无
     *
     * @param context       上下文
     * @param items         列表数组内容
     * @param clickListener item 点击回调
     */
    public static void item(Context context, String[] items, DialogInterface.OnClickListener clickListener) {

        AlertDialog alertDialog =
                new AlertDialog.Builder(context)
                        .setItems(items, clickListener)
                        .create();

        Window window = alertDialog.getWindow();

        if (window != null) {
            window.setGravity(Gravity.CENTER);
        }

        alertDialog.show();
    }

}
