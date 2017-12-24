package com.enjoyphoto.junittest;

import com.enjoyphoto.callback.CallBackInterface;

/**
 * Created by Administrator on 2017/12/24.
 */
public class FuncService {

    private static CallBackInterface callBackInterface;


    public static void setCallBackInterface(CallBackInterface callback){
        callBackInterface = callback;
    }

    public static void excute(int i){
        callBackInterface.testClassBack(i);
    }
}
