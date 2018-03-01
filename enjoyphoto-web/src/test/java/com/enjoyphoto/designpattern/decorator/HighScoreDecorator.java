package com.enjoyphoto.designpattern.decorator;

/**
 * Created by windy on 2018/3/1.
 */
public class HighScoreDecorator extends Decorator{


    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportHighSore(){

        System.out.println("这次考试的最高分如下：");
        System.out.println("语文：78");
        System.out.println("数学：72");
        System.out.println("外语：76");
    }

    @Override
    public void report() {
        reportHighSore();
        super.report();
    }
}
