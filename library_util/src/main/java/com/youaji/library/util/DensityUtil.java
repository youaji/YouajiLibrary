package com.youaji.library.util;

import android.content.res.Resources;

/**
 * Created by youaji on 2019/10/10.
 *
 * @author youaji
 * @version 0.0.1
 * @date 2019/10/10
 */
public class DensityUtil {

    /**
     * 屏幕宽度
     */
    public static int widthPixels() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    /**
     * 屏幕高度
     */
    public static int heightPixels() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    /**
     * dp 转 px「int」
     *
     * @param dpValue dp 值
     * @return px 值
     */
    public static int dp2px(int dpValue) {
        return (int) (0.5f + dpValue * Resources.getSystem().getDisplayMetrics().density);
    }

    /**
     * px 转 dp「int」
     *
     * @param pxValue px 值
     * @return dp 值
     */
    public static int px2dp(int pxValue) {
        return (int) (pxValue / Resources.getSystem().getDisplayMetrics().density);
    }

    /**
     * dp 转 px「float」
     *
     * @param dpValue dp 值
     * @return px 值
     */
    public float dp2px(float dpValue) {
        return 0.5f + dpValue * Resources.getSystem().getDisplayMetrics().density;
    }

    /**
     * px 转 dp「float」
     *
     * @param pxValue px 值
     * @return dp 值
     */
    public float px2dp(float pxValue) {
        return pxValue / Resources.getSystem().getDisplayMetrics().density;
    }

}
