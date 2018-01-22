package com.enjoyphoto.thread;

/**
 * Created by windy on 2018/1/11.
 */
public class TestException {

    public static String getExceptionValue() {

        String str = "";
        try {
            str = "try";
            int a = 10 / 0;
            return str;
        } catch (Exception e) {
            str = "catch";
            return str;
        } finally {
            str = "finally";
            return str;
        }
    }
}
