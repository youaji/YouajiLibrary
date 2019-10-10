package com.youaji.library.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by youaji on 2019/10/10.
 *
 * @author youaji
 * @version 0.0.1
 * @date 2019/10/10
 */
public class JsonUtil {

    /**
     * @param json json 字符串
     * @param key  字段名
     * @return value「默认：""」
     */
    public static String getString(String json, String key) {
        String data = null;
        try {
            JSONObject obj = new JSONObject(json);
            if (null != key) {
                data = obj.getString(key);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return data;
    }

    /**
     * @param json         json 字符串
     * @param key          字段名
     * @param defaultValue 默认值
     * @return value
     */
    public static String getString(String json, String key, String defaultValue) {
        String data = defaultValue;
        try {
            JSONObject obj = new JSONObject(json);
            if (null != key) {
                data = obj.getString(key);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return data;
    }

    /**
     * @param json json 字符串
     * @param key  字段名
     * @return value「默认：0」
     */
    public static int getInt(String json, String key) {
        int data = 0;
        try {
            JSONObject obj = new JSONObject(json);
            if (null != key) {
                data = obj.getInt(key);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return data;
    }

    /**
     * @param json         json 字符串
     * @param key          字段名
     * @param defaultValue 默认值
     * @return value
     */
    public static int getInt(String json, String key, int defaultValue) {
        int data = defaultValue;
        try {
            JSONObject obj = new JSONObject(json);
            if (null != key) {
                data = obj.getInt(key);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return data;
    }


    /**
     * @param jsonArray json 数组
     * @param key       数组键
     * @return List<String>「默认：空数组」
     */
    public static List<String> getList(JSONArray jsonArray, String key) {
        List<String> list = new ArrayList<>(jsonArray.length());
        try {
            if (jsonArray.length() > 0) {
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    String string = jsonObject.getString(key);
                    list.add(string);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return list;
    }

}
