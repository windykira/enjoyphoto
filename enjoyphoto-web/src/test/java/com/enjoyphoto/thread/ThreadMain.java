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
        //String num = TestException.getExceptionValue();
        String str = "abc";
        String s = new String("abc");
        System.out.println(str == s);
        /*Print print = new Print();
        new Thread(print).start();
        System.out.println("Stop it!");
        Thread.sleep(2000);
        print.setIsContinuePrint(false);*/
    }
}
