package com.enjoyphoto.thread;

/**
 * Created by windy on 2018/1/10.
 */
public class TestFinalClass {

    public static String method(){

        try {

            String str = "test";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            int i = 1;
        }
        return "OK";
    }
}
