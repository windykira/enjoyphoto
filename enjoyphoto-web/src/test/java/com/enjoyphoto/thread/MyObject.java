package com.enjoyphoto.thread;

/**
 * Created by Administrator on 2017/12/27.
 */
public class MyObject {

    private String data1;
    private String data2;

    public void methodA() {

        try {
            System.out.println("begin method threadName = " + Thread.currentThread().getName());
            Thread.sleep(3000);
            String privateData1 = "长时间处理1 threadName = " + Thread.currentThread().getName();
            String privateData2 = "长时间处理2 threadName = " + Thread.currentThread().getName();

            synchronized (this) {
                data1 = privateData1;
                data2 = privateData2;
            }
            System.out.println(data1);
            System.out.println(data2);
            System.out.println("end method threadName = " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
