package com.enjoyphoto.thread;

/**
 * Created by Administrator on 2017/12/26.
 */
public class ThreadMain {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            String selectKey = "user" + i + "*";
            MyThreadA threadA = new MyThreadA(selectKey);
            threadA.setName("A" + i);
            threadA.start();
        }
    }

}
