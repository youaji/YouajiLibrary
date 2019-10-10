package com.youaji.library.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by youaji on 2019/10/10.
 *
 * @author youaji
 * @version 0.0.1
 * @date 2019/10/10
 */
public class ShaUtil {

    public static String sha1(String strSrc) {
        return shaEncrypt("SHA-1", strSrc);
    }

    public static String sha256(String strSrc) {
        return shaEncrypt("SHA-256", strSrc);
    }

    public static String sha384(String strSrc) {
        return shaEncrypt("SHA-384", strSrc);
    }

    public static String sha512(String strSrc) {
        return shaEncrypt("SHA-512", strSrc);
    }

    /**
     * SHA 加密
     *
     * @param algorithm SHA 类型
     * @param strSrc    明文
     * @return 加密之后的密文「默认：null」
     */
    private static String shaEncrypt(String algorithm, String strSrc) {
        MessageDigest md;
        String strDes;
        byte[] bt = strSrc.getBytes();
        try {
            md = MessageDigest.getInstance(algorithm);
            md.update(bt);
            // to HexString
            strDes = bytes2Hex(md.digest());
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
        return strDes;
    }

    /**
     * byte 数组转换为 16 进制字符串
     *
     * @param bts 数据源
     * @return 16 进制字符串
     */
    private static String bytes2Hex(byte[] bts) {
        StringBuilder des = new StringBuilder();
        String tmp;
        for (byte bt : bts) {
            tmp = (Integer.toHexString(bt & 0xFF));
            if (tmp.length() == 1) {
                des.append("0");
            }
            des.append(tmp);
        }
        return des.toString();
    }
}
