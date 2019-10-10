package com.youaji.library.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Build;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by youaji on 2019/10/10.
 *
 * @author youaji
 * @version 0.0.1
 * @date 2019/10/10
 */
public class DateUtil {

    private static final String DATE_yyyyMMdd_HHmmss = "yyyy-MM-dd HH:mm:ss";
    private static final String DATE_yyyyMMdd_HHmm = "yyyy-MM-dd HH:mm";
    private static final String DATE_yyyyMMdd = "yyyy.MM.dd";

    /**
     * @return 系统当前时间戳
     */
    public static long currentTimestamp() {
        return System.currentTimeMillis();
    }

    //<editor-fold desc="日期&时间 选择器">

    /**
     * 系统日期选择器
     *
     * @param context         上下文
     * @param dateSetListener 回调
     */
    @TargetApi(Build.VERSION_CODES.N)
    public static void datePicker(Context context, DatePickerDialog.OnDateSetListener dateSetListener) {
        final Calendar calendar = Calendar.getInstance();
        new DatePickerDialog(
                context,
                dateSetListener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
        ).show();
    }

    /**
     * 系统时间选择器「24小时制」
     *
     * @param context         上下文
     * @param timeSetListener 回调
     */
    @TargetApi(Build.VERSION_CODES.N)
    public static void timePicker(Context context, TimePickerDialog.OnTimeSetListener timeSetListener) {
        timePicker(context, true, timeSetListener);
    }

    /**
     * 系统时间选择器
     *
     * @param context         上下文
     * @param is24HourView    24小时制
     * @param timeSetListener 回调
     */
    @TargetApi(Build.VERSION_CODES.N)
    public static void timePicker(Context context, boolean is24HourView, TimePickerDialog.OnTimeSetListener timeSetListener) {
        Calendar calendar = Calendar.getInstance();
        new TimePickerDialog(context,
                timeSetListener,
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),
                is24HourView
        ).show();
    }
    //</editor-fold>

    //<editor-fold desc="Date 格式化 字符串">

    /**
     * Date 格式化 字符串
     *
     * @param date 格式
     * @return String
     */
    public static String dateFormat(Date date, String pattern) {
        try {
            @SuppressLint("SimpleDateFormat")
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            return sdf.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    //</editor-fold>

    //<editor-fold desc="日期格式字符串 转 时间戳">

    /**
     * 日期格式字符串 转 时间戳
     * 如：2019-10-09 19:09:22 转 1570619362
     * 默认：0
     *
     * @param yyyyMMddHHmmss yyyy-MM-dd HH:mm:ss
     * @return 转换后的时间戳；
     */
    public static long yyyyMMddHHmmss2Long(String yyyyMMddHHmmss) {
        @SuppressLint("SimpleDateFormat")
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_yyyyMMdd_HHmmss);
        try {
            Date dt2 = sdf.parse(yyyyMMddHHmmss);
            assert dt2 != null;
            long timestamp = dt2.getTime();
            return timestamp / 1000;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    //</editor-fold>

    //<editor-fold desc="时间戳 转 格式化后的字符串">

    /**
     * 时间戳 转 格式化后的字符串
     * 如：1570619362 转 2019-10-09 19:09:22
     * 默认：空字符串
     *
     * @param timestamp 时间戳
     * @return yyyy-MM-dd HH:mm:ss 格式字符串
     */
    public static String yyyyMMddHHmmssFormat(String timestamp) {
        try {
            long time = Long.parseLong(timestamp);
            Date date = new Date(time * 1000);
            return dateFormat(date, DATE_yyyyMMdd_HHmmss);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    /**
     * 时间戳 转 格式化后的字符串
     * 如：1570619362 转 2019-10-09 19:09
     * 默认：空字符串
     *
     * @param timestamp 时间戳
     * @return yyyy-MM-dd HH:mm
     */
    public static String yyyyMMddHHmmFormat(String timestamp) {
        try {
            long time = Long.parseLong(timestamp);
            Date date = new Date(time * 1000);
            return dateFormat(date, DATE_yyyyMMdd_HHmm);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 时间戳 转 格式化后的字符串
     * 如：1570619362 转 2019.10.09
     * 默认：空字符串
     *
     * @param timestamp 时间戳
     * @return yyyy.MM.dd
     */
    public static String yyyyMMddFormat(String timestamp) {
        try {
            long time = Long.parseLong(timestamp);
            Date date = new Date(time * 1000);
            return dateFormat(date, DATE_yyyyMMdd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    //</editor-fold>
}
