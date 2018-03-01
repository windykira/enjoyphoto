package com.enjoyphoto.designpattern.decorator;

/**
 * Created by windy on 2018/3/1.
 */
public class FourthGradeSchoolReport extends SchoolReport {


    @Override
    public void report() {

        System.out.println("语文成绩是70。");
        System.out.println("数学成绩是65。");
        System.out.println("外语成绩是64。");
    }

    @Override
    public void sign(String name) {

        System.out.println("家长签名：" + name);
    }
}
