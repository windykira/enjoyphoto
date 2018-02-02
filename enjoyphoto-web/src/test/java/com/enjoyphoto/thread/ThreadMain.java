package com.enjoyphoto.thread;

/**
 * Created by windy on 2018/1/9.
 */
public class ThreadMain {

    public static void main(String[] args) {

        MyThread[] myThreads = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            myThreads[i] = new MyThread();
        }

        for (int i = 0; i < 100; i++) {
            myThreads[i].start();
        }
    }
}
