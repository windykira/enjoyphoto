package com.enjoyphoto.designpattern.factory;

/**
 * Created by Administrator on 2018/1/1.
 */
public interface AbstractHumanFactory {

    <T extends Human> T createHuman(Class<T> clazz);
}
