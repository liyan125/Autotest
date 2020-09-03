package com.course.testng;

import org.testng.annotations.Test;

public class expectedexception {

    /**
    * 什么时候用到异常测试
    * 在我们的预期结果为某一个异常的时候
    * 比如，传入了不合法的参数，程序抛出了异常
    * 也就是我们的预期结果是这个异常
     */

    //这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void RunTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void RunTimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }

}
