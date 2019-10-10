package com.youaji.library.util;

import android.util.Base64;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * flags:
 * Base64.CRLF          ：Win风格的换行符，意思就是使用CR LF这一对作为一行的结尾而不是Unix风格的LF
 * Base64.DEFAULT       ：使用默认的方法来加密
 * Base64.NO_CLOSE      ：
 * Base64.NO_PADDING    ：略去加密字符串最后的”=”
 * Base64.NO_WRAP       ：略去所有的换行符（设置后CRLF就没用了）输出始终为一整行
 * Base64.URL_SAFE      ：加密时不使用对URL和文件名有特殊意义的字符来作为加密字符，具体就是以-和_取代+和/
 *
 * Created by youaji on 2019/10/10.
 *
 * @author youaji
 * @version 0.0.1
 * @date 2019/10/10
 */
public class Base64Util {

    /**
     * 编码字符串
     *
     * @param str 待编码的字符串
     * @return 编码后的 base64 字符串
     */
    public static String encode(String str) {
        // StandardCharsets.UTF_8 == Charset.forName("UTF-8")
        return new String(Base64.encode(str.getBytes(Charset.forName("UTF-8")), Base64.DEFAULT));
    }

    /**
     * 编码字节
     *
     * @param bytes 待编码的字节
     * @return 编码后的 base64 字符串
     */
    public static String encode(byte[] bytes) {
        return new String(Base64.encode(bytes, Base64.DEFAULT));
    }

    /**
     * 解码字符串
     *
     * @param str 待解码的字符串
     * @return 解码后的 base64 的字符串
     */
    public static String decode(String str) {
        return new String(Base64.decode(str.getBytes(Charset.forName("UTF-8")), Base64.DEFAULT));
    }

    /**
     * 解码字节
     *
     * @param bytes 待解码的字节
     * @return 解码后的 base64 的字符串
     */
    public static String decode(byte[] bytes) {
        return new String(Base64.decode(bytes, Base64.DEFAULT));
    }
}
