package com.youaji.library.util;

import java.security.InvalidParameterException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by youaji on 2019/10/10.
 *
 * @author youaji
 * @version 0.0.1
 * @date 2019/10/10
 */
public class CheckUtil {

    /**
     * email 检查规则：
     * -------- @ 前允许字符：「大小写字母」、「数字」、「._%+-」
     * -------- @ 后允许字符：「大小写字母」、「数字」、「.-」
     * -------- @ 后第一个点允许字符：「2 ~ 4 个大小写字母」
     * -------- 其他规则：必须包含「@」、「.」、「. 后必须有 2 ~ 4 位大小写字母」
     */
    private static final String EMAIL_RULE = "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}";
    /**
     * 国内手机号码检查规则：
     * -------- 第一位允许数字：「1」
     * -------- 第二位允许数字：「3 ~ 9」
     * -------- 第三位允许数字：「0 ~ 9」
     * -------- 后八位允许数字：「0 ~ 9」
     * -------- 其他规则：「11 个数字」
     */
    private static final String MOBILE_RULE = "[1](([3][0-9])|([4][0-9])|([5][0-9])|([6][0-9])|([7][0-9])|([8][0-9])|([9][0-9]))[0-9]{8}";

    /**
     * 邮箱检查
     *
     * @param email 邮箱
     * @return true：符合规则；false：不符合规则
     */
    public static boolean email(String email) {

        if (StringUtil.isEmpty(email)) {
            return false;
        }

        Pattern pattern = Pattern.compile(EMAIL_RULE);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    /**
     * 邮箱检查
     *
     * @param email          邮箱
     * @param nullMessage    email 为空的提示语
     * @param invalidMessage email 检查不通过的提示语
     * @return 检查通过后的 email
     * @throws NullPointerException      email 为空
     * @throws InvalidParameterException email 检查不通过
     */
    public static String email(String email, String nullMessage, String invalidMessage) throws NullPointerException, InvalidParameterException {

        if (StringUtil.isEmpty(email)) {
            throw new NullPointerException(nullMessage);
        }

        if (!email(email)) {
            throw new InvalidParameterException(invalidMessage);
        }

        return email;
    }

    /**
     * 国内手机号码检查
     *
     * @param mobile 手机号
     * @return true：符合规则；false：不符合规则
     */
    public static boolean mobile(String mobile) {

        if (StringUtil.isEmpty(mobile)) {
            return false;
        }

        Pattern pattern = Pattern.compile(MOBILE_RULE);
        Matcher matcher = pattern.matcher(mobile);

        return matcher.matches();
    }

    /**
     * 国内手机号码检查
     *
     * @param mobile         手机号
     * @param nullMessage    mobile 为空的提示语
     * @param invalidMessage mobile 检查不通过的提示语
     * @return 检查通过后的 mobile
     * @throws NullPointerException      mobile 为空
     * @throws InvalidParameterException mobile 检查不通过
     */
    public static String mobile(String mobile, String nullMessage, String invalidMessage) throws NullPointerException, InvalidParameterException {

        if (StringUtil.isEmpty(mobile)) {
            throw new NullPointerException(nullMessage);
        }

        if (!mobile(mobile)) {
            throw new InvalidParameterException(invalidMessage);
        }

        return mobile;
    }

    /**
     * String 空检查
     *
     * @param str         string
     * @param nullMessage string 为空的提示语
     * @return 不为空的 string
     * @throws NullPointerException string 为空
     */
    public static String empty(String str, String nullMessage) throws NullPointerException {
        if (StringUtil.isEmpty(str)) {
            throw new NullPointerException(nullMessage);
        }
        return str;
    }

    /**
     * 对象 null 检查
     *
     * @param obj         object
     * @param nullMessage object 为 null 的提示语
     * @return 不为 null 的 object
     * @throws NullPointerException object 为 null
     */
    public static <T> T empty(T obj, String nullMessage) throws NullPointerException {
        if (obj == null) {
            throw new NullPointerException(nullMessage);
        }
        return obj;
    }
}
