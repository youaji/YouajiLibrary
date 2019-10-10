package com.youaji.library.util;

/**
 * Created by youaji on 2019/10/10.
 *
 * @author youaji
 * @version 0.0.1
 * @date 2019/10/10
 */
public class StringUtil {

    /**
     * 是否为空
     *
     * @param str 字符串
     * @return true：空；false：不为空；
     */
    public static boolean isEmpty(String str) {
        return null == str || "".equals(str);
    }

    /**
     * 是否不为空
     *
     * @param str 字符串
     * @return true：不为空；false：空；
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }


}
