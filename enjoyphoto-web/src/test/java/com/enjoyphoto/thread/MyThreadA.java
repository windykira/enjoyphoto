package com.enjoyphoto.thread;

/**
 * Created by Administrator on 2017/12/26.
 */
public class MyThreadA extends Thread{

    private String selectKey = "";

    public MyThreadA(String selectKey){
        this.selectKey = selectKey;
    }

    public void run(){

        RedisCache.getAllKeys(selectKey);
    }

}
