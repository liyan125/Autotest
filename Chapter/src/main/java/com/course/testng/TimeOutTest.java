package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest {
    @Test(timeOut=3000)//单位为毫秒，实际只有3秒
    public void testsuccess()throws InterruptedException{
        Thread.sleep(2000);
    }

    @Test(timeOut=3000)
    public void testfailed()throws InterruptedException{
        Thread.sleep(4000);
    }
}
