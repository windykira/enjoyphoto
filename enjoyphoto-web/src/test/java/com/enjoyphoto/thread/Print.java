package com.enjoyphoto.thread;

/**
 * Created by windy on 2018/1/10.
 */
public class Print implements Runnable{

    private boolean isContinuePrint = true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setIsContinuePrint(boolean isContinuePrint) {
        this.isContinuePrint = isContinuePrint;
    }

    public void printString() {
        try {

            while (isContinuePrint) {
                System.out.println("ThreadName is " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        printString();
    }
}
