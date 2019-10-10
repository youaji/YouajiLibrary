package com.youaji.library.util;

import java.math.BigDecimal;

/**
 * Created by youaji on 2019/10/10.
 *
 * @author youaji
 * @version 0.0.1
 * @date 2019/10/10
 */
public class NumberUtil {

    /**
     * 两数相加
     *
     * @param d1 数值1
     * @param d2 数值2
     * @return 和
     */
    public static double add(double d1, double d2) {
        BigDecimal b1 = BigDecimal.valueOf(d1);
        BigDecimal b2 = BigDecimal.valueOf(d2);
        return b1.add(b2).doubleValue();
    }

    /**
     * 两数相减
     *
     * @param d1 数值1
     * @param d2 数值2
     * @return 差
     */
    public static double sub(double d1, double d2) {
        BigDecimal b1 = BigDecimal.valueOf(d1);
        BigDecimal b2 = BigDecimal.valueOf(d2);
        return b1.subtract(b2).doubleValue();

    }

    /**
     * 两数相乘法
     *
     * @param d1 数值1
     * @param d2 数值1
     * @return 积
     */
    public static double mult(double d1, double d2) {
        BigDecimal b1 = BigDecimal.valueOf(d1);
        BigDecimal b2 = BigDecimal.valueOf(d2);
        return b1.multiply(b2).doubleValue();
    }


}
