package com.enjoyphoto.utils;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * Created by Administrator on 2017/11/15.
 */
public class MD5Util {

    /**
     * 利用MD5进行加密
     * @param str 待加密的字符串
     * @return 加密后的字符串
     */
    public static String EncoderByMd5(String str, String alt) throws NoSuchAlgorithmException,
            UnsupportedEncodingException {

        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        str += alt;
        //加密后的字符串
        String newStr = base64en.encode(md5.digest(str.getBytes("UTF-8")));
        return newStr;
    }

    /**
     * 判断用户密码是否正确
     * @param newPassword 用户输入的密码
     * @param oldPassword 数据库中存储的密码－－用户密码的摘要
     * @return
     */
    public static boolean checkPassword(String newPassword, String alt, String oldPassword) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        if (EncoderByMd5(newPassword, alt).equals(oldPassword)) {
            return true;
        }
        return false;
    }

    public static String getRandomStr(int nums){

        String str = UUID.randomUUID().toString();
        str = str.substring(0,nums).toUpperCase();
        return str;
    }
}
