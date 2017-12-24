package com.enjoyphoto.junittest;

import com.enjoyphoto.callback.CallBackInterface;

/**
 * Created by Administrator on 2017/12/24.
 */
public class CallBackJuitTest {

    static {
        FuncService.setCallBackInterface(new InnerCallBackInterface());
    }

    public static void test(){
        FuncService.excute(10);
    }

    static class InnerCallBackInterface implements CallBackInterface {

        public void testClassBack(int i) {
            System.out.print("OK,success " + i);
        }
    }
}
