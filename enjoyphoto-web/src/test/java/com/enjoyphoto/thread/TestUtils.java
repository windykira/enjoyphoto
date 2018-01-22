package com.enjoyphoto.thread;

/**
 * Created by windy on 2018/1/11.
 */
public class TestUtils {

    static Object object;

    static {

        try {
            Thread.sleep(3000);
            int t = 2/0;
            object = new Object();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static int getInt(){

        String t = object.toString();
        int a = 5/2;
        return a;
    }
}
